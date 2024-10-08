package com.matnx.dungeons;

import com.matnx.dungeons.blocks.ModGrassBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
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
    public static final RegistryObject<Block> FULL_SPROUTING_PRAIRIE_BLOCK = BLOCKS.register("full_sprouting_prairie_block", () -> new Block(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> FULL_SPROUTING_SILT_GRASS_BLOCK = BLOCKS.register("full_sprouting_silt_grass_block", () -> new Block(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> FULL_SPROUTING_SILT_MEADOW_BLOCK = BLOCKS.register("full_sprouting_silt_meadow_block", () -> new Block(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> FULL_SPROUTING_MEADOW_BLOCK = BLOCKS.register("full_sprouting_meadow_block", () -> new Block(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> FULL_SPROUTING_GRASS_BLOCK = BLOCKS.register("full_sprouting_grass_block", () -> new Block(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));

    public static final RegistryObject<Block> PATCHY_PRAIRIE_BLOCK = BLOCKS.register("patchy_prairie_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> PATCHY_SILT_GRASS_BLOCK = BLOCKS.register("patchy_silt_grass_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> PATCHY_SILT_MEADOW_BLOCK = BLOCKS.register("patchy_silt_meadow_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> PATCHY_MEADOW_BLOCK = BLOCKS.register("patchy_meadow_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> PATCHY_GRASS_BLOCK = BLOCKS.register("patchy_grass_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> FULL_PATCHY_PRAIRIE_BLOCK = BLOCKS.register("full_patchy_prairie_block", () -> new Block(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> FULL_PATCHY_SILT_GRASS_BLOCK = BLOCKS.register("full_patchy_silt_grass_block", () -> new Block(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> FULL_PATCHY_SILT_MEADOW_BLOCK = BLOCKS.register("full_patchy_silt_meadow_block", () -> new Block(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> FULL_PATCHY_MEADOW_BLOCK = BLOCKS.register("full_patchy_meadow_block", () -> new Block(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> FULL_PATCHY_GRASS_BLOCK = BLOCKS.register("full_patchy_grass_block", () -> new Block(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));

    public static final RegistryObject<Block> PRAIRIE_BLOCK = BLOCKS.register("prairie_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> MEADOW_BLOCK = BLOCKS.register("meadow_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> SILT_GRASS_BLOCK = BLOCKS.register("silt_grass_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> SILT_MEADOW_BLOCK = BLOCKS.register("silt_meadow_block", () -> new ModGrassBlock(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> FULL_PRAIRIE_BLOCK = BLOCKS.register("full_prairie_block", () -> new Block(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> FULL_MEADOW_BLOCK = BLOCKS.register("full_meadow_block", () -> new Block(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> FULL_GRASS_BLOCK = BLOCKS.register("full_grass_block", () -> new Block(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));

    public static final RegistryObject<Block> DRY_SPROUTING_GRASS_BLOCK = BLOCKS.register("dry_sprouting_grass_block", () -> new Block(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> DRY_PATCHY_GRASS_BLOCK = BLOCKS.register("dry_patchy_grass_block", () -> new Block(Properties.ofFullCopy(Blocks.GRASS_BLOCK)));

    public static final RegistryObject<Block> ANDESITE_BRICKS = BLOCKS.register("andesite_bricks", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> ANDESITE_BRICK_SLAB = BLOCKS.register("andesite_brick_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> ANDESITE_BRICK_STAIRS = BLOCKS.register("andesite_brick_stairs", () -> new StairBlock(ANDESITE_BRICKS.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> ANDESITE_BRICK_WALL = BLOCKS.register("andesite_brick_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> ANDESITE_CUBES = BLOCKS.register("andesite_cubes", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> ANDESITE_CUBE_SLAB = BLOCKS.register("andesite_cube_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> ANDESITE_CUBE_STAIRS = BLOCKS.register("andesite_cube_stairs", () -> new StairBlock(ANDESITE_CUBES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> ANDESITE_CUBE_WALL = BLOCKS.register("andesite_cube_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> ANDESITE_TILES = BLOCKS.register("andesite_tiles", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> ANDESITE_TILE_SLAB = BLOCKS.register("andesite_tile_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> ANDESITE_TILE_STAIRS = BLOCKS.register("andesite_tile_stairs", () -> new StairBlock(ANDESITE_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> ANDESITE_TILE_WALL = BLOCKS.register("andesite_tile_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> DIRTY_ANDESITE_CUBES = BLOCKS.register("dirty_andesite_cubes", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> DIRTY_ANDESITE_CUBE_SLAB = BLOCKS.register("dirty_andesite_cube_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> DIRTY_ANDESITE_CUBE_STAIRS = BLOCKS.register("dirty_andesite_cube_stairs", () -> new StairBlock(DIRTY_ANDESITE_CUBES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> DIRTY_ANDESITE_CUBE_WALL = BLOCKS.register("dirty_andesite_cube_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> DIRTY_ANDESITE_TILES = BLOCKS.register("dirty_andesite_tiles", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> DIRTY_ANDESITE_TILE_SLAB = BLOCKS.register("dirty_andesite_tile_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> DIRTY_ANDESITE_TILE_STAIRS = BLOCKS.register("dirty_andesite_tile_stairs", () -> new StairBlock(DIRTY_ANDESITE_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> DIRTY_ANDESITE_TILE_WALL = BLOCKS.register("dirty_andesite_tile_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> VERY_DIRTY_ANDESITE_CUBES = BLOCKS.register("very_dirty_andesite_cubes", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> VERY_DIRTY_ANDESITE_CUBE_SLAB = BLOCKS.register("very_dirty_andesite_cube_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> VERY_DIRTY_ANDESITE_CUBE_STAIRS = BLOCKS.register("very_dirty_andesite_cube_stairs", () -> new StairBlock(VERY_DIRTY_ANDESITE_CUBES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> VERY_DIRTY_ANDESITE_CUBE_WALL = BLOCKS.register("very_dirty_andesite_cube_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> VERY_DIRTY_ANDESITE_TILES = BLOCKS.register("very_dirty_andesite_tiles", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> VERY_DIRTY_ANDESITE_TILE_SLAB = BLOCKS.register("very_dirty_andesite_tile_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> VERY_DIRTY_ANDESITE_TILE_STAIRS = BLOCKS.register("very_dirty_andesite_tile_stairs", () -> new StairBlock(VERY_DIRTY_ANDESITE_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> VERY_DIRTY_ANDESITE_TILE_WALL = BLOCKS.register("very_dirty_andesite_tile_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> MUDDY_ANDESITE_CUBES = BLOCKS.register("muddy_andesite_cubes", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> MUDDY_ANDESITE_CUBE_SLAB = BLOCKS.register("muddy_andesite_cube_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> MUDDY_ANDESITE_CUBE_STAIRS = BLOCKS.register("muddy_andesite_cube_stairs", () -> new StairBlock(MUDDY_ANDESITE_CUBES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> MUDDY_ANDESITE_CUBE_WALL = BLOCKS.register("muddy_andesite_cube_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> MUDDY_ANDESITE_TILES = BLOCKS.register("muddy_andesite_tiles", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> MUDDY_ANDESITE_TILE_SLAB = BLOCKS.register("muddy_andesite_tile_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> MUDDY_ANDESITE_TILE_STAIRS = BLOCKS.register("muddy_andesite_tile_stairs", () -> new StairBlock(MUDDY_ANDESITE_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> MUDDY_ANDESITE_TILE_WALL = BLOCKS.register("muddy_andesite_tile_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> VERY_MUDDY_ANDESITE_CUBES = BLOCKS.register("very_muddy_andesite_cubes", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> VERY_MUDDY_ANDESITE_CUBE_SLAB = BLOCKS.register("very_muddy_andesite_cube_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> VERY_MUDDY_ANDESITE_CUBE_STAIRS = BLOCKS.register("very_muddy_andesite_cube_stairs", () -> new StairBlock(VERY_MUDDY_ANDESITE_CUBES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> VERY_MUDDY_ANDESITE_CUBE_WALL = BLOCKS.register("very_muddy_andesite_cube_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> VERY_MUDDY_ANDESITE_TILES = BLOCKS.register("very_muddy_andesite_tiles", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> VERY_MUDDY_ANDESITE_TILE_SLAB = BLOCKS.register("very_muddy_andesite_tile_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> VERY_MUDDY_ANDESITE_TILE_STAIRS = BLOCKS.register("very_muddy_andesite_tile_stairs", () -> new StairBlock(VERY_MUDDY_ANDESITE_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> VERY_MUDDY_ANDESITE_TILE_WALL = BLOCKS.register("very_muddy_andesite_tile_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> SILTY_ANDESITE_CUBES = BLOCKS.register("silty_andesite_cubes", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> SILTY_ANDESITE_CUBE_SLAB = BLOCKS.register("silty_andesite_cube_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> SILTY_ANDESITE_CUBE_STAIRS = BLOCKS.register("silty_andesite_cube_stairs", () -> new StairBlock(SILTY_ANDESITE_CUBES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> SILTY_ANDESITE_CUBE_WALL = BLOCKS.register("silty_andesite_cube_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> SILTY_ANDESITE_TILES = BLOCKS.register("silty_andesite_tiles", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> SILTY_ANDESITE_TILE_SLAB = BLOCKS.register("silty_andesite_tile_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> SILTY_ANDESITE_TILE_STAIRS = BLOCKS.register("silty_andesite_tile_stairs", () -> new StairBlock(SILTY_ANDESITE_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> SILTY_ANDESITE_TILE_WALL = BLOCKS.register("silty_andesite_tile_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> VERY_SILTY_ANDESITE_CUBES = BLOCKS.register("very_silty_andesite_cubes", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> VERY_SILTY_ANDESITE_CUBE_SLAB = BLOCKS.register("very_silty_andesite_cube_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> VERY_SILTY_ANDESITE_CUBE_STAIRS = BLOCKS.register("very_silty_andesite_cube_stairs", () -> new StairBlock(VERY_SILTY_ANDESITE_CUBES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> VERY_SILTY_ANDESITE_CUBE_WALL = BLOCKS.register("very_silty_andesite_cube_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> VERY_SILTY_ANDESITE_TILES = BLOCKS.register("very_silty_andesite_tiles", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> VERY_SILTY_ANDESITE_TILE_SLAB = BLOCKS.register("very_silty_andesite_tile_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> VERY_SILTY_ANDESITE_TILE_STAIRS = BLOCKS.register("very_silty_andesite_tile_stairs", () -> new StairBlock(VERY_SILTY_ANDESITE_TILES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> VERY_SILTY_ANDESITE_TILE_WALL = BLOCKS.register("very_silty_andesite_tile_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> DIRT_ANDESITE_CUBES = BLOCKS.register("dirt_andesite_cubes", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> DIRT_ANDESITE_CUBE_SLAB = BLOCKS.register("dirt_andesite_cube_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> DIRT_ANDESITE_CUBE_STAIRS = BLOCKS.register("dirt_andesite_cube_stairs", () -> new StairBlock(DIRT_ANDESITE_CUBES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> DIRT_ANDESITE_CUBE_WALL = BLOCKS.register("dirt_andesite_cube_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> MUD_ANDESITE_CUBES = BLOCKS.register("mud_andesite_cubes", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> MUD_ANDESITE_CUBE_SLAB = BLOCKS.register("mud_andesite_cube_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> MUD_ANDESITE_CUBE_STAIRS = BLOCKS.register("mud_andesite_cube_stairs", () -> new StairBlock(MUD_ANDESITE_CUBES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> MUD_ANDESITE_CUBE_WALL = BLOCKS.register("mud_andesite_cube_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> SILT_ANDESITE_CUBES = BLOCKS.register("silt_andesite_cubes", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> SILT_ANDESITE_CUBE_SLAB = BLOCKS.register("silt_andesite_cube_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> SILT_ANDESITE_CUBE_STAIRS = BLOCKS.register("silt_andesite_cube_stairs", () -> new StairBlock(SILT_ANDESITE_CUBES.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> SILT_ANDESITE_CUBE_WALL = BLOCKS.register("silt_andesite_cube_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> DIRT_ANDESITE_RUBBLE = BLOCKS.register("dirt_andesite_rubble", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> DIRT_ANDESITE_RUBBLE_SLAB = BLOCKS.register("dirt_andesite_rubble_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> DIRT_ANDESITE_RUBBLE_STAIRS = BLOCKS.register("dirt_andesite_rubble_stairs", () -> new StairBlock(DIRT_ANDESITE_RUBBLE.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> DIRT_ANDESITE_RUBBLE_WALL = BLOCKS.register("dirt_andesite_rubble_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> MUD_ANDESITE_RUBBLE = BLOCKS.register("mud_andesite_rubble", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> MUD_ANDESITE_RUBBLE_SLAB = BLOCKS.register("mud_andesite_rubble_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> MUD_ANDESITE_RUBBLE_STAIRS = BLOCKS.register("mud_andesite_rubble_stairs", () -> new StairBlock(MUD_ANDESITE_RUBBLE.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> MUD_ANDESITE_RUBBLE_WALL = BLOCKS.register("mud_andesite_rubble_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> SILT_ANDESITE_RUBBLE = BLOCKS.register("silt_andesite_rubble", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> SILT_ANDESITE_RUBBLE_SLAB = BLOCKS.register("silt_andesite_rubble_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> SILT_ANDESITE_RUBBLE_STAIRS = BLOCKS.register("silt_andesite_rubble_stairs", () -> new StairBlock(SILT_ANDESITE_RUBBLE.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> SILT_ANDESITE_RUBBLE_WALL = BLOCKS.register("silt_andesite_rubble_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> DIRTY_ANDESITE_RUBBLE = BLOCKS.register("dirty_andesite_rubble", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> DIRTY_ANDESITE_RUBBLE_SLAB = BLOCKS.register("dirty_andesite_rubble_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> DIRTY_ANDESITE_RUBBLE_STAIRS = BLOCKS.register("dirty_andesite_rubble_stairs", () -> new StairBlock(DIRTY_ANDESITE_RUBBLE.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> DIRTY_ANDESITE_RUBBLE_WALL = BLOCKS.register("dirty_andesite_rubble_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> MUDDY_ANDESITE_RUBBLE = BLOCKS.register("muddy_andesite_rubble", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> MUDDY_ANDESITE_RUBBLE_SLAB = BLOCKS.register("muddy_andesite_rubble_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> MUDDY_ANDESITE_RUBBLE_STAIRS = BLOCKS.register("muddy_andesite_rubble_stairs", () -> new StairBlock(MUDDY_ANDESITE_RUBBLE.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> MUDDY_ANDESITE_RUBBLE_WALL = BLOCKS.register("muddy_andesite_rubble_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> SILTY_ANDESITE_RUBBLE = BLOCKS.register("silty_andesite_rubble", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> SILTY_ANDESITE_RUBBLE_SLAB = BLOCKS.register("silty_andesite_rubble_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> SILTY_ANDESITE_RUBBLE_STAIRS = BLOCKS.register("silty_andesite_rubble_stairs", () -> new StairBlock(SILTY_ANDESITE_RUBBLE.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> SILTY_ANDESITE_RUBBLE_WALL = BLOCKS.register("silty_andesite_rubble_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> VERY_DIRTY_ANDESITE_RUBBLE = BLOCKS.register("very_dirty_andesite_rubble", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> VERY_DIRTY_ANDESITE_RUBBLE_SLAB = BLOCKS.register("very_dirty_andesite_rubble_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> VERY_DIRTY_ANDESITE_RUBBLE_STAIRS = BLOCKS.register("very_dirty_andesite_rubble_stairs", () -> new StairBlock(VERY_DIRTY_ANDESITE_RUBBLE.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> VERY_DIRTY_ANDESITE_RUBBLE_WALL = BLOCKS.register("very_dirty_andesite_rubble_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> VERY_MUDDY_ANDESITE_RUBBLE = BLOCKS.register("very_muddy_andesite_rubble", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> VERY_MUDDY_ANDESITE_RUBBLE_SLAB = BLOCKS.register("very_muddy_andesite_rubble_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> VERY_MUDDY_ANDESITE_RUBBLE_STAIRS = BLOCKS.register("very_muddy_andesite_rubble_stairs", () -> new StairBlock(VERY_MUDDY_ANDESITE_RUBBLE.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> VERY_MUDDY_ANDESITE_RUBBLE_WALL = BLOCKS.register("very_muddy_andesite_rubble_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> VERY_SILTY_ANDESITE_RUBBLE = BLOCKS.register("very_silty_andesite_rubble", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> VERY_SILTY_ANDESITE_RUBBLE_SLAB = BLOCKS.register("very_silty_andesite_rubble_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> VERY_SILTY_ANDESITE_RUBBLE_STAIRS = BLOCKS.register("very_silty_andesite_rubble_stairs", () -> new StairBlock(VERY_SILTY_ANDESITE_RUBBLE.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> VERY_SILTY_ANDESITE_RUBBLE_WALL = BLOCKS.register("very_silty_andesite_rubble_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> MOSSY_ANDESITE_BRICKS = BLOCKS.register("mossy_andesite_bricks", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> MOSSY_ANDESITE_BRICK_SLAB = BLOCKS.register("mossy_andesite_brick_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> MOSSY_ANDESITE_BRICK_STAIRS = BLOCKS.register("mossy_andesite_brick_stairs", () -> new StairBlock(MOSSY_ANDESITE_BRICKS.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> MOSSY_ANDESITE_BRICK_WALL = BLOCKS.register("mossy_andesite_brick_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> CHARRED_ANDESITE_BRICKS = BLOCKS.register("charred_andesite_bricks", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CHARRED_ANDESITE_BRICK_SLAB = BLOCKS.register("charred_andesite_brick_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> CHARRED_ANDESITE_BRICK_STAIRS = BLOCKS.register("charred_andesite_brick_stairs", () -> new StairBlock(CHARRED_ANDESITE_BRICKS.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> CHARRED_ANDESITE_BRICK_WALL = BLOCKS.register("charred_andesite_brick_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> CHARRED_MOSSY_ANDESITE_BRICKS = BLOCKS.register("charred_mossy_andesite_bricks", () -> new Block(Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CHARRED_MOSSY_ANDESITE_BRICK_SLAB = BLOCKS.register("charred_mossy_andesite_brick_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> CHARRED_MOSSY_ANDESITE_BRICK_STAIRS = BLOCKS.register("charred_mossy_andesite_brick_stairs", () -> new StairBlock(CHARRED_MOSSY_ANDESITE_BRICKS.get().defaultBlockState(), Properties.ofFullCopy(Blocks.STONE_BRICK_STAIRS)));
    public static final RegistryObject<Block> CHARRED_MOSSY_ANDESITE_BRICK_WALL = BLOCKS.register("charred_mossy_andesite_brick_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> TUMBLESTONE = BLOCKS.register("tumblestone", () -> new Block(Properties.ofFullCopy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> TUMBLESTONE_SLAB = BLOCKS.register("tumblestone_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB)));
    public static final RegistryObject<Block> TUMBLESTONE_STAIRS = BLOCKS.register("tumblestone_stairs", () -> new StairBlock(TUMBLESTONE.get().defaultBlockState(), Properties.ofFullCopy(Blocks.COBBLESTONE_STAIRS)));
    public static final RegistryObject<Block> TUMBLESTONE_WALL = BLOCKS.register("tumblestone_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.COBBLESTONE_WALL)));
    public static final RegistryObject<Block> MOSSY_TUMBLESTONE = BLOCKS.register("mossy_tumblestone", () -> new Block(Properties.ofFullCopy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> MOSSY_TUMBLESTONE_SLAB = BLOCKS.register("mossy_tumblestone_slab", () -> new SlabBlock(Properties.ofFullCopy(Blocks.COBBLESTONE_SLAB)));
    public static final RegistryObject<Block> MOSSY_TUMBLESTONE_STAIRS = BLOCKS.register("mossy_tumblestone_stairs", () -> new StairBlock(MOSSY_TUMBLESTONE.get().defaultBlockState(), Properties.ofFullCopy(Blocks.COBBLESTONE_STAIRS)));
    public static final RegistryObject<Block> MOSSY_TUMBLESTONE_WALL = BLOCKS.register("mossy_tumblestone_wall", () -> new WallBlock(Properties.ofFullCopy(Blocks.COBBLESTONE_WALL)));

    public static final RegistryObject<Block> ROCKY_SOIL = BLOCKS.register("rocky_soil", () -> new Block(Properties.ofFullCopy(Blocks.DIRT)));
    public static final RegistryObject<Block> SNOWY_SOIL = BLOCKS.register("snowy_soil", () -> new Block(Properties.ofFullCopy(Blocks.DIRT)));
}
