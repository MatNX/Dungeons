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

    public PaintPacket(CompoundTag nbt) {
        this.nbt = nbt;
    }

    public void encode(FriendlyByteBuf buffer) {
        buffer.writeNbt(nbt);
    }

    public PaintPacket(FriendlyByteBuf buffer) {
        this(buffer.readNbt());
    }

    public void handle(CustomPayloadEvent.Context context) {
        ArrayList<BlockPos> posList;

        byte[] byteArray = nbt.getByteArray("pos");
        String restoredString = new String(byteArray, StandardCharsets.UTF_8);
        String[] restoredArray = restoredString.split(";");

        posList = (ArrayList<BlockPos>) Arrays.stream(restoredArray).map(s -> {
            String[] parts = s.split(", ");
            return new BlockPos(Integer.valueOf(parts[0]), Integer.valueOf(parts[1]), Integer.valueOf(parts[2]));
        }).collect(Collectors.toList());

        Level level = Minecraft.getInstance().level;
        LevelChunk chunk = level.getChunkAt(posList.get(0));
        ColorCapability cap = chunk.getCapability(ColorCapabilityProvider.COLOR_CAPABILITY).orElse(null);
        cap.loadNBTData(nbt);
        context.setPacketHandled(true);
    }
}
