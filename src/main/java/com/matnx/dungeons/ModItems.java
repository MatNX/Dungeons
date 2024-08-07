package com.matnx.dungeons;

import com.matnx.dungeons.blocks.ModGrassBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.matnx.dungeons.DungeonsMod.MODID;
import static com.matnx.dungeons.ModBlocks.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> SILT_ITEM = ITEMS.register("silt", () -> new BlockItem(SILT.get(), new Item.Properties()));
    public static final RegistryObject<Item> TURF_ITEM = ITEMS.register("turf", () -> new BlockItem(TURF.get(), new Item.Properties()));

    public static final RegistryObject<Item> SPROUTING_PRAIRIE_BLOCK_ITEM = ITEMS.register("sprouting_prairie_block", () -> new BlockItem(SPROUTING_PRAIRIE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPROUTING_MEADOW_BLOCK_ITEM = ITEMS.register("sprouting_meadow_block", () -> new BlockItem(SPROUTING_MEADOW_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPROUTING_GRASS_BLOCK_ITEM = ITEMS.register("sprouting_grass_block", () -> new BlockItem(SPROUTING_GRASS_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPROUTING_SILT_MEADOW_BLOCK_ITEM = ITEMS.register("sprouting_silt_meadow_block", () -> new BlockItem(SPROUTING_SILT_MEADOW_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPROUTING_SILT_GRASS_BLOCK_ITEM = ITEMS.register("sprouting_silt_grass_block", () -> new BlockItem(SPROUTING_SILT_GRASS_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FULL_SPROUTING_PRAIRIE_BLOCK_ITEM = ITEMS.register("full_sprouting_prairie_block", () -> new BlockItem(FULL_SPROUTING_PRAIRIE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FULL_SPROUTING_MEADOW_BLOCK_ITEM = ITEMS.register("full_sprouting_meadow_block", () -> new BlockItem(FULL_SPROUTING_MEADOW_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FULL_SPROUTING_GRASS_BLOCK_ITEM = ITEMS.register("full_sprouting_grass_block", () -> new BlockItem(FULL_SPROUTING_GRASS_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FULL_SPROUTING_SILT_MEADOW_BLOCK_ITEM = ITEMS.register("full_sprouting_silt_meadow_block", () -> new BlockItem(FULL_SPROUTING_SILT_MEADOW_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FULL_SPROUTING_SILT_GRASS_BLOCK_ITEM = ITEMS.register("full_sprouting_silt_grass_block", () -> new BlockItem(FULL_SPROUTING_SILT_GRASS_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> PATCHY_PRAIRIE_BLOCK_ITEM = ITEMS.register("patchy_prairie_block", () -> new BlockItem(PATCHY_PRAIRIE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PATCHY_MEADOW_BLOCK_ITEM = ITEMS.register("patchy_meadow_block", () -> new BlockItem(PATCHY_MEADOW_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PATCHY_GRASS_BLOCK_ITEM = ITEMS.register("patchy_grass_block", () -> new BlockItem(PATCHY_GRASS_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PATCHY_SILT_MEADOW_BLOCK_ITEM = ITEMS.register("patchy_silt_meadow_block", () -> new BlockItem(PATCHY_SILT_MEADOW_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PATCHY_SILT_GRASS_BLOCK_ITEM = ITEMS.register("patchy_silt_grass_block", () -> new BlockItem(PATCHY_SILT_GRASS_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FULL_PATCHY_PRAIRIE_BLOCK_ITEM = ITEMS.register("full_patchy_prairie_block", () -> new BlockItem(FULL_PATCHY_PRAIRIE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FULL_PATCHY_MEADOW_BLOCK_ITEM = ITEMS.register("full_patchy_meadow_block", () -> new BlockItem(FULL_PATCHY_MEADOW_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FULL_PATCHY_GRASS_BLOCK_ITEM = ITEMS.register("full_patchy_grass_block", () -> new BlockItem(FULL_PATCHY_GRASS_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FULL_PATCHY_SILT_MEADOW_BLOCK_ITEM = ITEMS.register("full_patchy_silt_meadow_block", () -> new BlockItem(FULL_PATCHY_SILT_MEADOW_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FULL_PATCHY_SILT_GRASS_BLOCK_ITEM = ITEMS.register("full_patchy_silt_grass_block", () -> new BlockItem(FULL_PATCHY_SILT_GRASS_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> PRAIRIE_BLOCK_ITEM = ITEMS.register("prairie_block", () -> new BlockItem(PRAIRIE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MEADOW_BLOCK_ITEM = ITEMS.register("meadow_block", () -> new BlockItem(MEADOW_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILT_GRASS_BLOCK_ITEM = ITEMS.register("silt_grass_block", () -> new BlockItem(SILT_GRASS_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILT_MEADOW_BLOCK_ITEM = ITEMS.register("silt_meadow_block", () -> new BlockItem(SILT_MEADOW_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FULL_PRAIRIE_BLOCK_ITEM = ITEMS.register("full_prairie_block", () -> new BlockItem(FULL_PRAIRIE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FULL_MEADOW_BLOCK_ITEM = ITEMS.register("full_meadow_block", () -> new BlockItem(FULL_MEADOW_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FULL_GRASS_BLOCK_ITEM = ITEMS.register("full_grass_block", () -> new BlockItem(FULL_GRASS_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> DRY_PATCHY_GRASS_BLOCK_ITEM = ITEMS.register("dry_patchy_grass_block", () -> new BlockItem(DRY_PATCHY_GRASS_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRY_SPROUTING_GRASS_BLOCK_ITEM = ITEMS.register("dry_sprouting_grass_block", () -> new BlockItem(DRY_SPROUTING_GRASS_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> ANDESITE_BRICKS_ITEM = ITEMS.register("andesite_bricks", () -> new BlockItem(ANDESITE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_BRICK_SLAB_ITEM = ITEMS.register("andesite_brick_slab", () -> new BlockItem(ANDESITE_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_BRICK_STAIRS_ITEM = ITEMS.register("andesite_brick_stairs", () -> new BlockItem(ANDESITE_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_BRICK_WALL_ITEM = ITEMS.register("andesite_brick_wall", () -> new BlockItem(ANDESITE_BRICK_WALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> ANDESITE_CUBES_ITEM = ITEMS.register("andesite_cubes", () -> new BlockItem(ANDESITE_CUBES.get(), new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_CUBE_SLAB_ITEM = ITEMS.register("andesite_cube_slab", () -> new BlockItem(ANDESITE_CUBE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_CUBE_STAIRS_ITEM = ITEMS.register("andesite_cube_stairs", () -> new BlockItem(ANDESITE_CUBE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_CUBE_WALL_ITEM = ITEMS.register("andesite_cube_wall", () -> new BlockItem(ANDESITE_CUBE_WALL.get(), new Item.Properties()));
}
