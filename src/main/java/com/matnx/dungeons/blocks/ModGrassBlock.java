package com.matnx.dungeons.blocks;

import com.matnx.dungeons.ModBlocks;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.lighting.LightEngine;

import static com.matnx.dungeons.ModBlocks.*;
import static net.minecraft.world.level.block.Blocks.DIRT;
import static net.minecraft.world.level.block.Blocks.GRASS_BLOCK;
import static net.minecraft.world.level.block.SnowyDirtBlock.SNOWY;

public class ModGrassBlock extends Block {


    public ModGrassBlock(Properties p_49795_) {
        super(p_49795_);
    }

    private static boolean canBeGrass(BlockState p_56824_, LevelReader p_56825_, BlockPos p_56826_) {
        BlockPos blockpos = p_56826_.above();
        BlockState blockstate = p_56825_.getBlockState(blockpos);
        if (blockstate.is(Blocks.SNOW) && blockstate.getValue(SnowLayerBlock.LAYERS) == 1) {
            return true;
        } else if (blockstate.getFluidState().getAmount() == 8) {
            return false;
        } else {
            int i = LightEngine.getLightBlockInto(p_56825_, p_56824_, p_56826_, blockstate, blockpos, Direction.UP, blockstate.getLightBlock(p_56825_, blockpos));
            return i < p_56825_.getMaxLightLevel();
        }
    }

    private static boolean canPropagate(BlockState p_56828_, LevelReader p_56829_, BlockPos p_56830_) {
        BlockPos blockpos = p_56830_.above();
        return canBeGrass(p_56828_, p_56829_, p_56830_) && !p_56829_.getFluidState(blockpos).is(FluidTags.WATER);
    }

    public void randomTick(BlockState p_222508_, ServerLevel p_222509_, BlockPos p_222510_, RandomSource p_222511_) {
        if (!canBeGrass(p_222508_, p_222509_, p_222510_)) {
            if (!p_222509_.isAreaLoaded(p_222510_, 1)) {
                return;
            }

            p_222509_.setBlockAndUpdate(p_222510_, getDirt());
        } else {
            if (!p_222509_.isAreaLoaded(p_222510_, 3)) {
                return;
            }

            if (p_222509_.getMaxLocalRawBrightness(p_222510_.above()) >= 9) {
                if (p_222511_.nextBoolean() || getNext().getBlock() == this) {
                    for (int i = 0; i < 4; ++i) {
                        BlockPos blockpos = p_222510_.offset(p_222511_.nextInt(3) - 1, p_222511_.nextInt(5) - 3, p_222511_.nextInt(3) - 1);
                        if (p_222509_.getBlockState(blockpos).is(Blocks.DIRT) && canPropagate(GRASS_BLOCK.defaultBlockState(), p_222509_, blockpos)) {
                            p_222509_.setBlockAndUpdate(blockpos, SPROUTING_GRASS_BLOCK.get().defaultBlockState());
                        } else if (p_222509_.getBlockState(blockpos).is(ModBlocks.TURF.get()) && canPropagate(MEADOW_BLOCK.get().defaultBlockState(), p_222509_, blockpos)) {
                            p_222509_.setBlockAndUpdate(blockpos, SPROUTING_MEADOW_BLOCK.get().defaultBlockState());
                        } else if (p_222509_.getBlockState(blockpos).is(ModBlocks.SILT.get()) && canPropagate(getSprout(), p_222509_, blockpos)) {
                            p_222509_.setBlockAndUpdate(blockpos, getSprout());
                        }
                    }
                } else {
                    p_222509_.setBlockAndUpdate(p_222510_, getNext());
                }
            }
        }
    }

    private BlockState getDirt() {
        if (this == MEADOW_BLOCK.get() || this == SPROUTING_MEADOW_BLOCK.get() || this == PATCHY_MEADOW_BLOCK.get()) {
            return TURF.get().defaultBlockState();
        }
        if (this == SPROUTING_GRASS_BLOCK.get() || this == PATCHY_GRASS_BLOCK.get()) {
            return DIRT.defaultBlockState();
        }
        return SILT.get().defaultBlockState();
    }

    private BlockState getSprout() {
        if (this == MEADOW_BLOCK.get() || this == PATCHY_MEADOW_BLOCK.get() || this == SPROUTING_MEADOW_BLOCK.get() || this == SPROUTING_SILT_MEADOW_BLOCK.get() || this == PATCHY_SILT_MEADOW_BLOCK.get() || this == SILT_MEADOW_BLOCK.get()) {
            return SPROUTING_SILT_MEADOW_BLOCK.get().defaultBlockState();
        }
        if (this == SPROUTING_GRASS_BLOCK.get() || this == PATCHY_GRASS_BLOCK.get() || this == SILT_GRASS_BLOCK.get() || this == PATCHY_SILT_GRASS_BLOCK.get() || this == SPROUTING_SILT_GRASS_BLOCK.get()) {
            return SPROUTING_SILT_GRASS_BLOCK.get().defaultBlockState();
        }
        if (this == SPROUTING_PRAIRIE_BLOCK.get() || this == PATCHY_PRAIRIE_BLOCK.get() || this == PRAIRIE_BLOCK.get()) {
            return SPROUTING_PRAIRIE_BLOCK.get().defaultBlockState();
        }
        return this.defaultBlockState();
    }

    private BlockState getNext() {
        if (this == SPROUTING_MEADOW_BLOCK.get()) {
            return PATCHY_MEADOW_BLOCK.get().defaultBlockState();
        }
        if (this == SPROUTING_GRASS_BLOCK.get()) {
            return PATCHY_GRASS_BLOCK.get().defaultBlockState();
        }
        if (this == SPROUTING_SILT_MEADOW_BLOCK.get()) {
            return PATCHY_SILT_MEADOW_BLOCK.get().defaultBlockState();
        }
        if (this == SPROUTING_SILT_GRASS_BLOCK.get()) {
            return PATCHY_SILT_GRASS_BLOCK.get().defaultBlockState();
        }
        if (this == SPROUTING_PRAIRIE_BLOCK.get()) {
            return PATCHY_PRAIRIE_BLOCK.get().defaultBlockState();
        }
        if (this == PATCHY_MEADOW_BLOCK.get()) {
            return MEADOW_BLOCK.get().defaultBlockState();
        }
        if (this == PATCHY_GRASS_BLOCK.get()) {
            return GRASS_BLOCK.defaultBlockState();
        }
        if (this == PATCHY_SILT_MEADOW_BLOCK.get()) {
            return SILT_MEADOW_BLOCK.get().defaultBlockState();
        }
        if (this == PATCHY_SILT_GRASS_BLOCK.get()) {
            return SILT_GRASS_BLOCK.get().defaultBlockState();
        }
        if (this == PATCHY_PRAIRIE_BLOCK.get()) {
            return PRAIRIE_BLOCK.get().defaultBlockState();
        }
        return this.defaultBlockState();
    }
}
