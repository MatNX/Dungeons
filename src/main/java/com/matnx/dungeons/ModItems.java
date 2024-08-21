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
import static com.matnx.dungeons.ModBlocks.MOSSY_ANDESITE_BRICK_SLAB;

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

    public static final RegistryObject<Item> ANDESITE_TILES_ITEM = ITEMS.register("andesite_tiles", () -> new BlockItem(ANDESITE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_TILE_SLAB_ITEM = ITEMS.register("andesite_tile_slab", () -> new BlockItem(ANDESITE_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_TILE_STAIRS_ITEM = ITEMS.register("andesite_tile_stairs", () -> new BlockItem(ANDESITE_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_TILE_WALL_ITEM = ITEMS.register("andesite_tile_wall", () -> new BlockItem(ANDESITE_TILE_WALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> DIRTY_ANDESITE_CUBES_ITEM = ITEMS.register("dirty_andesite_cubes", () -> new BlockItem(DIRTY_ANDESITE_CUBES.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_ANDESITE_CUBE_SLAB_ITEM = ITEMS.register("dirty_andesite_cube_slab", () -> new BlockItem(DIRTY_ANDESITE_CUBE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_ANDESITE_CUBE_STAIRS_ITEM = ITEMS.register("dirty_andesite_cube_stairs", () -> new BlockItem(DIRTY_ANDESITE_CUBE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_ANDESITE_CUBE_WALL_ITEM = ITEMS.register("dirty_andesite_cube_wall", () -> new BlockItem(DIRTY_ANDESITE_CUBE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_ANDESITE_TILES_ITEM = ITEMS.register("dirty_andesite_tiles", () -> new BlockItem(DIRTY_ANDESITE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_ANDESITE_TILE_SLAB_ITEM = ITEMS.register("dirty_andesite_tile_slab", () -> new BlockItem(DIRTY_ANDESITE_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_ANDESITE_TILE_STAIRS_ITEM = ITEMS.register("dirty_andesite_tile_stairs", () -> new BlockItem(DIRTY_ANDESITE_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_ANDESITE_TILE_WALL_ITEM = ITEMS.register("dirty_andesite_tile_wall", () -> new BlockItem(DIRTY_ANDESITE_TILE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_DIRTY_ANDESITE_CUBES_ITEM = ITEMS.register("very_dirty_andesite_cubes", () -> new BlockItem(VERY_DIRTY_ANDESITE_CUBES.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_DIRTY_ANDESITE_CUBE_SLAB_ITEM = ITEMS.register("very_dirty_andesite_cube_slab", () -> new BlockItem(VERY_DIRTY_ANDESITE_CUBE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_DIRTY_ANDESITE_CUBE_STAIRS_ITEM = ITEMS.register("very_dirty_andesite_cube_stairs", () -> new BlockItem(VERY_DIRTY_ANDESITE_CUBE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_DIRTY_ANDESITE_CUBE_WALL_ITEM = ITEMS.register("very_dirty_andesite_cube_wall", () -> new BlockItem(VERY_DIRTY_ANDESITE_CUBE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_DIRTY_ANDESITE_TILES_ITEM = ITEMS.register("very_dirty_andesite_tiles", () -> new BlockItem(VERY_DIRTY_ANDESITE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_DIRTY_ANDESITE_TILE_SLAB_ITEM = ITEMS.register("very_dirty_andesite_tile_slab", () -> new BlockItem(VERY_DIRTY_ANDESITE_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_DIRTY_ANDESITE_TILE_STAIRS_ITEM = ITEMS.register("very_dirty_andesite_tile_stairs", () -> new BlockItem(VERY_DIRTY_ANDESITE_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_DIRTY_ANDESITE_TILE_WALL_ITEM = ITEMS.register("very_dirty_andesite_tile_wall", () -> new BlockItem(VERY_DIRTY_ANDESITE_TILE_WALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> SILTY_ANDESITE_CUBES_ITEM = ITEMS.register("silty_andesite_cubes", () -> new BlockItem(SILTY_ANDESITE_CUBES.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILTY_ANDESITE_CUBE_SLAB_ITEM = ITEMS.register("silty_andesite_cube_slab", () -> new BlockItem(SILTY_ANDESITE_CUBE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILTY_ANDESITE_CUBE_STAIRS_ITEM = ITEMS.register("silty_andesite_cube_stairs", () -> new BlockItem(SILTY_ANDESITE_CUBE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILTY_ANDESITE_CUBE_WALL_ITEM = ITEMS.register("silty_andesite_cube_wall", () -> new BlockItem(SILTY_ANDESITE_CUBE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILTY_ANDESITE_TILES_ITEM = ITEMS.register("silty_andesite_tiles", () -> new BlockItem(SILTY_ANDESITE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILTY_ANDESITE_TILE_SLAB_ITEM = ITEMS.register("silty_andesite_tile_slab", () -> new BlockItem(SILTY_ANDESITE_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILTY_ANDESITE_TILE_STAIRS_ITEM = ITEMS.register("silty_andesite_tile_stairs", () -> new BlockItem(SILTY_ANDESITE_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILTY_ANDESITE_TILE_WALL_ITEM = ITEMS.register("silty_andesite_tile_wall", () -> new BlockItem(SILTY_ANDESITE_TILE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_SILTY_ANDESITE_CUBES_ITEM = ITEMS.register("very_silty_andesite_cubes", () -> new BlockItem(VERY_SILTY_ANDESITE_CUBES.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_SILTY_ANDESITE_CUBE_SLAB_ITEM = ITEMS.register("very_silty_andesite_cube_slab", () -> new BlockItem(VERY_SILTY_ANDESITE_CUBE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_SILTY_ANDESITE_CUBE_STAIRS_ITEM = ITEMS.register("very_silty_andesite_cube_stairs", () -> new BlockItem(VERY_SILTY_ANDESITE_CUBE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_SILTY_ANDESITE_CUBE_WALL_ITEM = ITEMS.register("very_silty_andesite_cube_wall", () -> new BlockItem(VERY_SILTY_ANDESITE_CUBE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_SILTY_ANDESITE_TILES_ITEM = ITEMS.register("very_silty_andesite_tiles", () -> new BlockItem(VERY_SILTY_ANDESITE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_SILTY_ANDESITE_TILE_SLAB_ITEM = ITEMS.register("very_silty_andesite_tile_slab", () -> new BlockItem(VERY_SILTY_ANDESITE_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_SILTY_ANDESITE_TILE_STAIRS_ITEM = ITEMS.register("very_silty_andesite_tile_stairs", () -> new BlockItem(VERY_SILTY_ANDESITE_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_SILTY_ANDESITE_TILE_WALL_ITEM = ITEMS.register("very_silty_andesite_tile_wall", () -> new BlockItem(VERY_SILTY_ANDESITE_TILE_WALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> MUDDY_ANDESITE_CUBES_ITEM = ITEMS.register("muddy_andesite_cubes", () -> new BlockItem(MUDDY_ANDESITE_CUBES.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUDDY_ANDESITE_CUBE_SLAB_ITEM = ITEMS.register("muddy_andesite_cube_slab", () -> new BlockItem(MUDDY_ANDESITE_CUBE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUDDY_ANDESITE_CUBE_STAIRS_ITEM = ITEMS.register("muddy_andesite_cube_stairs", () -> new BlockItem(MUDDY_ANDESITE_CUBE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUDDY_ANDESITE_CUBE_WALL_ITEM = ITEMS.register("muddy_andesite_cube_wall", () -> new BlockItem(MUDDY_ANDESITE_CUBE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUDDY_ANDESITE_TILES_ITEM = ITEMS.register("muddy_andesite_tiles", () -> new BlockItem(MUDDY_ANDESITE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUDDY_ANDESITE_TILE_SLAB_ITEM = ITEMS.register("muddy_andesite_tile_slab", () -> new BlockItem(MUDDY_ANDESITE_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUDDY_ANDESITE_TILE_STAIRS_ITEM = ITEMS.register("muddy_andesite_tile_stairs", () -> new BlockItem(MUDDY_ANDESITE_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUDDY_ANDESITE_TILE_WALL_ITEM = ITEMS.register("muddy_andesite_tile_wall", () -> new BlockItem(MUDDY_ANDESITE_TILE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_MUDDY_ANDESITE_CUBES_ITEM = ITEMS.register("very_muddy_andesite_cubes", () -> new BlockItem(VERY_MUDDY_ANDESITE_CUBES.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_MUDDY_ANDESITE_CUBE_SLAB_ITEM = ITEMS.register("very_muddy_andesite_cube_slab", () -> new BlockItem(VERY_MUDDY_ANDESITE_CUBE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_MUDDY_ANDESITE_CUBE_STAIRS_ITEM = ITEMS.register("very_muddy_andesite_cube_stairs", () -> new BlockItem(VERY_MUDDY_ANDESITE_CUBE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_MUDDY_ANDESITE_CUBE_WALL_ITEM = ITEMS.register("very_muddy_andesite_cube_wall", () -> new BlockItem(VERY_MUDDY_ANDESITE_CUBE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_MUDDY_ANDESITE_TILES_ITEM = ITEMS.register("very_muddy_andesite_tiles", () -> new BlockItem(VERY_MUDDY_ANDESITE_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_MUDDY_ANDESITE_TILE_SLAB_ITEM = ITEMS.register("very_muddy_andesite_tile_slab", () -> new BlockItem(VERY_MUDDY_ANDESITE_TILE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_MUDDY_ANDESITE_TILE_STAIRS_ITEM = ITEMS.register("very_muddy_andesite_tile_stairs", () -> new BlockItem(VERY_MUDDY_ANDESITE_TILE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_MUDDY_ANDESITE_TILE_WALL_ITEM = ITEMS.register("very_muddy_andesite_tile_wall", () -> new BlockItem(VERY_MUDDY_ANDESITE_TILE_WALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> DIRT_ANDESITE_CUBES_ITEM = ITEMS.register("dirt_andesite_cubes", () -> new BlockItem(DIRT_ANDESITE_CUBES.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRT_ANDESITE_CUBE_SLAB_ITEM = ITEMS.register("dirt_andesite_cube_slab", () -> new BlockItem(DIRT_ANDESITE_CUBE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRT_ANDESITE_CUBE_STAIRS_ITEM = ITEMS.register("dirt_andesite_cube_stairs", () -> new BlockItem(DIRT_ANDESITE_CUBE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRT_ANDESITE_CUBE_WALL_ITEM = ITEMS.register("dirt_andesite_cube_wall", () -> new BlockItem(DIRT_ANDESITE_CUBE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILT_ANDESITE_CUBES_ITEM = ITEMS.register("silt_andesite_cubes", () -> new BlockItem(SILT_ANDESITE_CUBES.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILT_ANDESITE_CUBE_SLAB_ITEM = ITEMS.register("silt_andesite_cube_slab", () -> new BlockItem(SILT_ANDESITE_CUBE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILT_ANDESITE_CUBE_STAIRS_ITEM = ITEMS.register("silt_andesite_cube_stairs", () -> new BlockItem(SILT_ANDESITE_CUBE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILT_ANDESITE_CUBE_WALL_ITEM = ITEMS.register("silt_andesite_cube_wall", () -> new BlockItem(SILT_ANDESITE_CUBE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUD_ANDESITE_CUBES_ITEM = ITEMS.register("mud_andesite_cubes", () -> new BlockItem(MUD_ANDESITE_CUBES.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUD_ANDESITE_CUBE_SLAB_ITEM = ITEMS.register("mud_andesite_cube_slab", () -> new BlockItem(MUD_ANDESITE_CUBE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUD_ANDESITE_CUBE_STAIRS_ITEM = ITEMS.register("mud_andesite_cube_stairs", () -> new BlockItem(MUD_ANDESITE_CUBE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUD_ANDESITE_CUBE_WALL_ITEM = ITEMS.register("mud_andesite_cube_wall", () -> new BlockItem(MUD_ANDESITE_CUBE_WALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> DIRT_ANDESITE_RUBBLE_ITEM = ITEMS.register("dirt_andesite_rubble", () -> new BlockItem(DIRT_ANDESITE_RUBBLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRT_ANDESITE_RUBBLE_SLAB_ITEM = ITEMS.register("dirt_andesite_rubble_slab", () -> new BlockItem(DIRT_ANDESITE_RUBBLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRT_ANDESITE_RUBBLE_STAIRS_ITEM = ITEMS.register("dirt_andesite_rubble_stairs", () -> new BlockItem(DIRT_ANDESITE_RUBBLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRT_ANDESITE_RUBBLE_WALL_ITEM = ITEMS.register("dirt_andesite_rubble_wall", () -> new BlockItem(DIRT_ANDESITE_RUBBLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILT_ANDESITE_RUBBLE_ITEM = ITEMS.register("silt_andesite_rubble", () -> new BlockItem(SILT_ANDESITE_RUBBLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILT_ANDESITE_RUBBLE_SLAB_ITEM = ITEMS.register("silt_andesite_rubble_slab", () -> new BlockItem(SILT_ANDESITE_RUBBLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILT_ANDESITE_RUBBLE_STAIRS_ITEM = ITEMS.register("silt_andesite_rubble_stairs", () -> new BlockItem(SILT_ANDESITE_RUBBLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILT_ANDESITE_RUBBLE_WALL_ITEM = ITEMS.register("silt_andesite_rubble_wall", () -> new BlockItem(SILT_ANDESITE_RUBBLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUD_ANDESITE_RUBBLE_ITEM = ITEMS.register("mud_andesite_rubble", () -> new BlockItem(MUD_ANDESITE_RUBBLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUD_ANDESITE_RUBBLE_SLAB_ITEM = ITEMS.register("mud_andesite_rubble_slab", () -> new BlockItem(MUD_ANDESITE_RUBBLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUD_ANDESITE_RUBBLE_STAIRS_ITEM = ITEMS.register("mud_andesite_rubble_stairs", () -> new BlockItem(MUD_ANDESITE_RUBBLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUD_ANDESITE_RUBBLE_WALL_ITEM = ITEMS.register("mud_andesite_rubble_wall", () -> new BlockItem(MUD_ANDESITE_RUBBLE_WALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> DIRTY_ANDESITE_RUBBLE_ITEM = ITEMS.register("dirty_andesite_rubble", () -> new BlockItem(DIRTY_ANDESITE_RUBBLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_ANDESITE_RUBBLE_SLAB_ITEM = ITEMS.register("dirty_andesite_rubble_slab", () -> new BlockItem(DIRTY_ANDESITE_RUBBLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_ANDESITE_RUBBLE_STAIRS_ITEM = ITEMS.register("dirty_andesite_rubble_stairs", () -> new BlockItem(DIRTY_ANDESITE_RUBBLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_ANDESITE_RUBBLE_WALL_ITEM = ITEMS.register("dirty_andesite_rubble_wall", () -> new BlockItem(DIRTY_ANDESITE_RUBBLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILTY_ANDESITE_RUBBLE_ITEM = ITEMS.register("silty_andesite_rubble", () -> new BlockItem(SILTY_ANDESITE_RUBBLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILTY_ANDESITE_RUBBLE_SLAB_ITEM = ITEMS.register("silty_andesite_rubble_slab", () -> new BlockItem(SILTY_ANDESITE_RUBBLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILTY_ANDESITE_RUBBLE_STAIRS_ITEM = ITEMS.register("silty_andesite_rubble_stairs", () -> new BlockItem(SILTY_ANDESITE_RUBBLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILTY_ANDESITE_RUBBLE_WALL_ITEM = ITEMS.register("silty_andesite_rubble_wall", () -> new BlockItem(SILTY_ANDESITE_RUBBLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUDDY_ANDESITE_RUBBLE_ITEM = ITEMS.register("muddy_andesite_rubble", () -> new BlockItem(MUDDY_ANDESITE_RUBBLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUDDY_ANDESITE_RUBBLE_SLAB_ITEM = ITEMS.register("muddy_andesite_rubble_slab", () -> new BlockItem(MUDDY_ANDESITE_RUBBLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUDDY_ANDESITE_RUBBLE_STAIRS_ITEM = ITEMS.register("muddy_andesite_rubble_stairs", () -> new BlockItem(MUDDY_ANDESITE_RUBBLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MUDDY_ANDESITE_RUBBLE_WALL_ITEM = ITEMS.register("muddy_andesite_rubble_wall", () -> new BlockItem(MUDDY_ANDESITE_RUBBLE_WALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> VERY_DIRTY_ANDESITE_RUBBLE_ITEM = ITEMS.register("very_dirty_andesite_rubble", () -> new BlockItem(VERY_DIRTY_ANDESITE_RUBBLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_DIRTY_ANDESITE_RUBBLE_SLAB_ITEM = ITEMS.register("very_dirty_andesite_rubble_slab", () -> new BlockItem(VERY_DIRTY_ANDESITE_RUBBLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_DIRTY_ANDESITE_RUBBLE_STAIRS_ITEM = ITEMS.register("very_dirty_andesite_rubble_stairs", () -> new BlockItem(VERY_DIRTY_ANDESITE_RUBBLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_DIRTY_ANDESITE_RUBBLE_WALL_ITEM = ITEMS.register("very_dirty_andesite_rubble_wall", () -> new BlockItem(VERY_DIRTY_ANDESITE_RUBBLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_SILTY_ANDESITE_RUBBLE_ITEM = ITEMS.register("very_silty_andesite_rubble", () -> new BlockItem(VERY_SILTY_ANDESITE_RUBBLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_SILTY_ANDESITE_RUBBLE_SLAB_ITEM = ITEMS.register("very_silty_andesite_rubble_slab", () -> new BlockItem(VERY_SILTY_ANDESITE_RUBBLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_SILTY_ANDESITE_RUBBLE_STAIRS_ITEM = ITEMS.register("very_silty_andesite_rubble_stairs", () -> new BlockItem(VERY_SILTY_ANDESITE_RUBBLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_SILTY_ANDESITE_RUBBLE_WALL_ITEM = ITEMS.register("very_silty_andesite_rubble_wall", () -> new BlockItem(VERY_SILTY_ANDESITE_RUBBLE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_MUDDY_ANDESITE_RUBBLE_ITEM = ITEMS.register("very_muddy_andesite_rubble", () -> new BlockItem(VERY_MUDDY_ANDESITE_RUBBLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_MUDDY_ANDESITE_RUBBLE_SLAB_ITEM = ITEMS.register("very_muddy_andesite_rubble_slab", () -> new BlockItem(VERY_MUDDY_ANDESITE_RUBBLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_MUDDY_ANDESITE_RUBBLE_STAIRS_ITEM = ITEMS.register("very_muddy_andesite_rubble_stairs", () -> new BlockItem(VERY_MUDDY_ANDESITE_RUBBLE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> VERY_MUDDY_ANDESITE_RUBBLE_WALL_ITEM = ITEMS.register("very_muddy_andesite_rubble_wall", () -> new BlockItem(VERY_MUDDY_ANDESITE_RUBBLE_WALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> MOSSY_ANDESITE_BRICKS_ITEM = ITEMS.register("mossy_andesite_bricks", () -> new BlockItem(MOSSY_ANDESITE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_ANDESITE_BRICK_SLAB_ITEM = ITEMS.register("mossy_andesite_brick_slab", () -> new BlockItem(MOSSY_ANDESITE_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_ANDESITE_BRICK_STAIRS_ITEM = ITEMS.register("mossy_andesite_brick_stairs", () -> new BlockItem(MOSSY_ANDESITE_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_ANDESITE_BRICK_WALL_ITEM = ITEMS.register("mossy_andesite_brick_wall", () -> new BlockItem(MOSSY_ANDESITE_BRICK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHARRED_ANDESITE_BRICKS_ITEM = ITEMS.register("charred_andesite_bricks", () -> new BlockItem(CHARRED_ANDESITE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHARRED_ANDESITE_BRICK_SLAB_ITEM = ITEMS.register("charred_andesite_brick_slab", () -> new BlockItem(CHARRED_ANDESITE_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHARRED_ANDESITE_BRICK_STAIRS_ITEM = ITEMS.register("charred_andesite_brick_stairs", () -> new BlockItem(CHARRED_ANDESITE_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHARRED_ANDESITE_BRICK_WALL_ITEM = ITEMS.register("charred_andesite_brick_wall", () -> new BlockItem(CHARRED_ANDESITE_BRICK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHARRED_MOSSY_ANDESITE_BRICKS_ITEM = ITEMS.register("charred_mossy_andesite_bricks", () -> new BlockItem(CHARRED_MOSSY_ANDESITE_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHARRED_MOSSY_ANDESITE_BRICK_SLAB_ITEM = ITEMS.register("charred_mossy_andesite_brick_slab", () -> new BlockItem(CHARRED_MOSSY_ANDESITE_BRICK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHARRED_MOSSY_ANDESITE_BRICK_STAIRS_ITEM = ITEMS.register("charred_mossy_andesite_brick_stairs", () -> new BlockItem(CHARRED_MOSSY_ANDESITE_BRICK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHARRED_MOSSY_ANDESITE_BRICK_WALL_ITEM = ITEMS.register("charred_mossy_andesite_brick_wall", () -> new BlockItem(CHARRED_MOSSY_ANDESITE_BRICK_WALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> TUMBLESTONE_ITEM = ITEMS.register("tumblestone", () -> new BlockItem(TUMBLESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TUMBLESTONE_SLAB_ITEM = ITEMS.register("tumblestone_slab", () -> new BlockItem(TUMBLESTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> TUMBLESTONE_STAIRS_ITEM = ITEMS.register("tumblestone_stairs", () -> new BlockItem(TUMBLESTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> TUMBLESTONE_WALL_ITEM = ITEMS.register("tumblestone_wall", () -> new BlockItem(TUMBLESTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_TUMBLESTONE_ITEM = ITEMS.register("mossy_tumblestone", () -> new BlockItem(MOSSY_TUMBLESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_TUMBLESTONE_SLAB_ITEM = ITEMS.register("mossy_tumblestone_slab", () -> new BlockItem(MOSSY_TUMBLESTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_TUMBLESTONE_STAIRS_ITEM = ITEMS.register("mossy_tumblestone_stairs", () -> new BlockItem(MOSSY_TUMBLESTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_TUMBLESTONE_WALL_ITEM = ITEMS.register("mossy_tumblestone_wall", () -> new BlockItem(MOSSY_TUMBLESTONE_WALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> ROCKY_SOIL_ITEM = ITEMS.register("rocky_soil", () -> new BlockItem(ROCKY_SOIL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SNOWY_SOIL_ITEM = ITEMS.register("snowy_soil", () -> new BlockItem(SNOWY_SOIL.get(), new Item.Properties()));
}
