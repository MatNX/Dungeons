package com.matnx.dungeons.capability;

import com.matnx.dungeons.DungeonsMod;
import com.matnx.dungeons.network.Channel;
import com.matnx.dungeons.network.PaintPacket;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ClientboundLevelChunkWithLightPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.level.ChunkWatchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.BitSet;

@Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.FORGE, modid=DungeonsMod.MODID)
public class RegisterCapability {
    @SubscribeEvent
    public static void AttachCapabilities(AttachCapabilitiesEvent<LevelChunk> event) {
        event.addCapability(new ResourceLocation(DungeonsMod.MODID, "color"), new ColorCapabilityProvider());
    }
    @SubscribeEvent
    public static void DetectChunk(ChunkWatchEvent.Watch event) {
        ColorCapability colorCapability = event.getChunk().getCapability(ColorCapabilityProvider.COLOR_CAPABILITY).orElse(null);
        if (!colorCapability.posList.isEmpty()) {
            CompoundTag nbt = new CompoundTag();
            colorCapability.saveNBTData(nbt);
            Channel.sendToClient(new PaintPacket(nbt), event.getPlayer());
            System.out.println(colorCapability);
        }
    }
    @SubscribeEvent
    public static void rightClickEvent(PlayerInteractEvent.RightClickBlock event) {
        ItemStack stack = event.getItemStack();
        if (!(stack.getItem() instanceof DyeItem) && !(stack.getItem() instanceof PotionItem && PotionUtils.getPotion(stack) == Potions.WATER)) {
            return;
        }
        ColorCapability colorCapability = event.getLevel().getChunkAt(event.getPos()).getCapability(ColorCapabilityProvider.COLOR_CAPABILITY).orElse(null);
        if(stack.getItem() instanceof DyeItem item) {

            int colorint = item.getDyeColor().getTextColor();
            if (colorCapability.containsPos(event.getPos()) != colorint) {
                colorCapability.setColor(colorint, event.getPos());
                event.getLevel().playSound((Player) null, event.getPos(), SoundEvents.DYE_USE, SoundSource.BLOCKS, 1.0F, 1.0F);
                event.getEntity().awardStat(Stats.ITEM_USED.get(stack.getItem()));
                if (!event.getEntity().getAbilities().instabuild) {
                    stack.shrink(1);
                }
            }
        }
        else if (stack.getItem() instanceof PotionItem potion && PotionUtils.getPotion(stack) == Potions.WATER) {
            if (colorCapability.containsPos(event.getPos()) != -1) {

                event.getLevel().playSound(null, event.getPos(), SoundEvents.GENERIC_SPLASH, SoundSource.BLOCKS, 1.0F, 1.0F);
                event.getEntity().setItemInHand(event.getHand(), ItemUtils.createFilledResult(stack, event.getEntity(), new ItemStack(Items.GLASS_BOTTLE)));
                event.getEntity().awardStat(Stats.ITEM_USED.get(stack.getItem()));
                if (!event.getLevel().isClientSide) {
                    ServerLevel $$6 = (ServerLevel) event.getLevel();

                    for (int $$7 = 0; $$7 < 5; ++$$7) {
                        $$6.sendParticles(ParticleTypes.SPLASH, (double) event.getPos().getX() + event.getLevel().random.nextDouble(), (event.getPos().getY() + 1), (double) event.getPos().getZ() + event.getLevel().random.nextDouble(), 1, 0.0, 0.0, 0.0, 1.0);
                    }
                }

                event.getLevel().playSound(null, event.getPos(), SoundEvents.BOTTLE_EMPTY, SoundSource.BLOCKS, 1.0F, 1.0F);
                event.getLevel().gameEvent(null, GameEvent.FLUID_PLACE, event.getPos());

                colorCapability.removeColor(event.getPos());
            }
        }
        if (event.getEntity() instanceof ServerPlayer sPlayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(sPlayer, stack);
            sPlayer.connection.send(new ClientboundLevelChunkWithLightPacket(event.getLevel().getChunkAt(event.getPos()), event.getLevel().getLightEngine(), new BitSet(), new BitSet()));
        }
        event.getLevel().getChunkAt(event.getPos()).setUnsaved(true);
    }
}
