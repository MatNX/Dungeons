package com.matnx.dungeons.capability;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.Block;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ColorCapability {
    public ArrayList<BlockPos> posList = new ArrayList<>();
    public ArrayList<Integer> colorList = new ArrayList<>();

    public void addColor(int color, BlockPos pos) {
        posList.add(pos);
        colorList.add(color);
    }

    public int containsPos(BlockPos pos) {
        if (posList.contains(pos)) {
            return getColor(pos);
        }
        return -1;
    }

    public void removeColor(BlockPos pos) {
        if (posList.contains(pos)) {
            int index = posList.indexOf(pos);
            posList.remove(index);
            colorList.remove(index);
        }
    }

    public void setColor(int color, BlockPos pos) {
        if (posList.contains(pos)) {
            int index = posList.indexOf(pos);
            colorList.set(index, color);
        } else {
            addColor(color, pos);
        }
    }

    public int getColor(BlockPos pos) {
        if (posList.contains(pos)) {
            int index = posList.indexOf(pos);
            return colorList.get(index);
        } else {
            return -1;
        }
    }

    public void saveNBTData(CompoundTag nbt) {
        String[] stringArray = posList.stream()
                .map(BlockPos::toShortString)
                .toArray(String[]::new);
        String concatenatedString = String.join(";", stringArray);
        byte[] byteArray = concatenatedString.getBytes(StandardCharsets.UTF_8);
        nbt.putByteArray("pos", byteArray);
        nbt.putIntArray("color", colorList);
    }

    public void loadNBTData(CompoundTag nbt) {
        byte[] byteArray = nbt.getByteArray("pos");
        String restoredString = new String(byteArray, StandardCharsets.UTF_8);
        String[] restoredArray = restoredString.split(";");

        posList = (ArrayList<BlockPos>) Arrays.stream(restoredArray).map(s -> {
            String[] parts = s.split(", ");
            return new BlockPos(Integer.valueOf(parts[0]), Integer.valueOf(parts[1]), Integer.valueOf(parts[2]));
        }).collect(Collectors.toList());
        colorList = (ArrayList<Integer>) Arrays.stream(nbt.getIntArray("color"))
                .boxed()
                .collect(Collectors.toList());
    }
}
