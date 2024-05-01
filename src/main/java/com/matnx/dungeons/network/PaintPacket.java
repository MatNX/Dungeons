package com.matnx.dungeons.network;

import com.matnx.dungeons.capability.ColorCapability;
import com.matnx.dungeons.capability.ColorCapabilityProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraftforge.event.network.CustomPayloadEvent;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PaintPacket {
    public CompoundTag nbt;
    public BlockPos pos;
    public PaintPacket(CompoundTag nbt, BlockPos pos) {
        this.nbt = nbt;
        this.pos = pos;
    }

    public void encode(FriendlyByteBuf buffer) {
        buffer.writeNbt(nbt);
        buffer.writeBlockPos(pos);
    }

    public PaintPacket(FriendlyByteBuf buffer) {
        this(buffer.readNbt(), buffer.readBlockPos());
    }

    public void handle(CustomPayloadEvent.Context context) {
        Level level = Minecraft.getInstance().level;
        LevelChunk chunk = level.getChunkAt(pos);
        ColorCapability cap = chunk.getCapability(ColorCapabilityProvider.COLOR_CAPABILITY).orElse(null);
        cap.loadNBTData(nbt);
        context.setPacketHandled(true);
    }
}
