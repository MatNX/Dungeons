package com.matnx.dungeons.mixin;

import com.matnx.dungeons.capability.ColorCapability;
import com.matnx.dungeons.capability.ColorCapabilityProvider;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.ModelBlockRenderer;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Level.class)
public class MixinBreak {
    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;II)Z")
    private void setBlockState(BlockPos p_46598_, BlockState p_46599_, int i, int i2, CallbackInfoReturnable<Boolean> cir) {
        Level level = (Level) (Object) this;
        Block old = level.getBlockState(p_46598_).getBlock();
        if (!old.equals(p_46599_.getBlock())) {
            ColorCapability colorCapability = level.getChunkAt(p_46598_).getCapability(ColorCapabilityProvider.COLOR_CAPABILITY).orElse(null);
            if(colorCapability.containsPos(p_46598_) != -1) {
                colorCapability.removeColor(p_46598_);
            }
        }
    }
}