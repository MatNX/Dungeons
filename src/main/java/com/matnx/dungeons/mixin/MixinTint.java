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
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ModelBlockRenderer.class)
public class MixinTint {
    @Inject(at = @At("HEAD"), method = "putQuadData", cancellable = true)
    private void putQuadData(BlockAndTintGetter p_111024_, BlockState p_111025_, BlockPos p_111026_, VertexConsumer p_111027_, PoseStack.Pose p_111028_, BakedQuad p_111029_, float p_111030_, float p_111031_, float p_111032_, float p_111033_, int p_111034_, int p_111035_, int p_111036_, int p_111037_, int p_111038_, CallbackInfo ci) {

        ColorCapability colorCapability = Minecraft.getInstance().level.getChunkAt(p_111026_).getCapability(ColorCapabilityProvider.COLOR_CAPABILITY).orElse(null);
            float f;
            float f1;
            float f2;
            if (colorCapability.containsPos(p_111026_) != -1) {
                int i = colorCapability.getColor(p_111026_);
                f = (float) (i >> 16 & 255) / 255.0F;
                f1 = (float) (i >> 8 & 255) / 255.0F;
                f2 = (float) (i & 255) / 255.0F;
                p_111027_.putBulkData(p_111028_, p_111029_, new float[]{p_111030_, p_111031_, p_111032_, p_111033_}, f, f1, f2, 1.0F,  new int[]{p_111034_, p_111035_, p_111036_, p_111037_}, p_111038_, true);
                ci.cancel();
            }
        }
    }
