package com.matnx.dungeons.mixin;

import com.matnx.dungeons.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.SpreadingSnowyDirtBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.lighting.LightEngine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SpreadingSnowyDirtBlock.class)
public class GrassBlockMixin {
    @Inject(at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/core/BlockPos;offset(III)Lnet/minecraft/core/BlockPos;"), method = "randomTick", cancellable = true)
    private void setBlockState(BlockState p_222508_, ServerLevel p_222509_, BlockPos p_222510_, RandomSource p_222511_, CallbackInfo ci) {
        if (p_222508_.is(Blocks.GRASS_BLOCK)) {
            BlockPos blockpos = p_222510_.offset(p_222511_.nextInt(3) - 1, p_222511_.nextInt(5) - 3, p_222511_.nextInt(3) - 1);
            if (p_222509_.getBlockState(blockpos).is(Blocks.DIRT) && canPropagate(p_222508_, p_222509_, blockpos)) {
                p_222509_.setBlockAndUpdate(blockpos, (BlockState) ModBlocks.SPROUTING_GRASS_BLOCK.get().defaultBlockState());
            }
            if (p_222509_.getBlockState(blockpos).is(ModBlocks.SILT.get()) && canPropagate(p_222508_, p_222509_, blockpos)) {
                p_222509_.setBlockAndUpdate(blockpos, (BlockState) ModBlocks.SPROUTING_SILT_GRASS_BLOCK.get().defaultBlockState());
            }
            if (p_222509_.getBlockState(blockpos).is(ModBlocks.TURF.get()) && canPropagate(p_222508_, p_222509_, blockpos)) {
                p_222509_.setBlockAndUpdate(blockpos, (BlockState) ModBlocks.SPROUTING_MEADOW_BLOCK.get().defaultBlockState());
            }
            ci.cancel();
        }
    }

    private static boolean canPropagate(BlockState p_56828_, LevelReader p_56829_, BlockPos p_56830_) {
        BlockPos blockpos = p_56830_.above();
        return canBeGrass(p_56828_, p_56829_, p_56830_) && !p_56829_.getFluidState(blockpos).is(FluidTags.WATER);
    }

    private static boolean canBeGrass(BlockState p_56824_, LevelReader p_56825_, BlockPos p_56826_) {
        BlockPos blockpos = p_56826_.above();
        BlockState blockstate = p_56825_.getBlockState(blockpos);
        if (blockstate.is(Blocks.SNOW) && (Integer)blockstate.getValue(SnowLayerBlock.LAYERS) == 1) {
            return true;
        } else if (blockstate.getFluidState().getAmount() == 8) {
            return false;
        } else {
            int i = LightEngine.getLightBlockInto(p_56825_, p_56824_, p_56826_, blockstate, blockpos, Direction.UP, blockstate.getLightBlock(p_56825_, blockpos));
            return i < p_56825_.getMaxLightLevel();
        }
    }
}
