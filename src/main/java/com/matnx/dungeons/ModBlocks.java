package com.matnx.dungeons;

import com.matnx.dungeons.blocks.ModGrassBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.matnx.dungeons.DungeonsMod.MODID;
import static com.matnx.dungeons.ModItems.ITEMS;
import static net.minecraft.world.level.block.state.BlockBehaviour.*;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<Block> SILT = BLOCKS.register("silt", () -> new Block(Properties.ofFullCopy(Blocks.DIRT)));
    public static final RegistryObject<Block> TURF = BLOCKS.register("turf", () -> new Block(Properties.ofFullCopy(Blocks.DIRT)));

    public static final RegistryObject<Block> SPROUTING_PRAIRIE_BLOCK = BLOCKS.register("sprouting_prairie_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> SPROUTING_SILT_GRASS_BLOCK = BLOCKS.register("sprouting_silt_grass_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> SPROUTING_SILT_MEADOW_BLOCK = BLOCKS.register("sprouting_silt_meadow_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> SPROUTING_MEADOW_BLOCK = BLOCKS.register("sprouting_meadow_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> SPROUTING_GRASS_BLOCK = BLOCKS.register("sprouting_grass_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));

    public static final RegistryObject<Block> PATCHY_PRAIRIE_BLOCK = BLOCKS.register("patchy_prairie_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> PATCHY_SILT_GRASS_BLOCK = BLOCKS.register("patchy_silt_grass_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> PATCHY_SILT_MEADOW_BLOCK = BLOCKS.register("patchy_silt_meadow_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> PATCHY_MEADOW_BLOCK = BLOCKS.register("patchy_meadow_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> PATCHY_GRASS_BLOCK = BLOCKS.register("patchy_grass_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));

    public static final RegistryObject<Block> PRAIRIE_BLOCK = BLOCKS.register("prairie_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> MEADOW_BLOCK = BLOCKS.register("meadow_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> SILT_GRASS_BLOCK = BLOCKS.register("silt_grass_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> SILT_MEADOW_BLOCK = BLOCKS.register("silt_meadow_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
}
