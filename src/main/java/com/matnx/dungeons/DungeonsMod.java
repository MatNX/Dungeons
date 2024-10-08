package com.matnx.dungeons;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

import static com.matnx.dungeons.ModBlocks.*;
import static com.matnx.dungeons.ModItems.*;
import static com.matnx.dungeons.ModItems.MOSSY_ANDESITE_BRICK_SLAB_ITEM;
import static net.minecraft.world.level.block.Blocks.GRASS_BLOCK;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DungeonsMod.MODID)
public class DungeonsMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "dungeons";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public DungeonsMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(SILT_ITEM);
            event.accept(TURF_ITEM);
            event.accept(PRAIRIE_BLOCK_ITEM);
            event.accept(SILT_GRASS_BLOCK_ITEM);
            event.accept(MEADOW_BLOCK_ITEM);
            event.accept(FULL_PRAIRIE_BLOCK_ITEM);
            event.accept(FULL_GRASS_BLOCK_ITEM);
            event.accept(FULL_MEADOW_BLOCK_ITEM);
            event.accept(SILT_MEADOW_BLOCK_ITEM);
            event.accept(SPROUTING_GRASS_BLOCK_ITEM);
            event.accept(SPROUTING_MEADOW_BLOCK_ITEM);
            event.accept(SPROUTING_PRAIRIE_BLOCK_ITEM);
            event.accept(SPROUTING_SILT_GRASS_BLOCK_ITEM);
            event.accept(SPROUTING_SILT_MEADOW_BLOCK_ITEM);
            event.accept(FULL_SPROUTING_GRASS_BLOCK_ITEM);
            event.accept(FULL_SPROUTING_MEADOW_BLOCK_ITEM);
            event.accept(FULL_SPROUTING_PRAIRIE_BLOCK_ITEM);
            event.accept(FULL_SPROUTING_SILT_GRASS_BLOCK_ITEM);
            event.accept(FULL_SPROUTING_SILT_MEADOW_BLOCK_ITEM);
            event.accept(PATCHY_GRASS_BLOCK_ITEM);
            event.accept(PATCHY_MEADOW_BLOCK_ITEM);
            event.accept(PATCHY_PRAIRIE_BLOCK_ITEM);
            event.accept(PATCHY_SILT_GRASS_BLOCK_ITEM);
            event.accept(PATCHY_SILT_MEADOW_BLOCK_ITEM);
            event.accept(FULL_PATCHY_GRASS_BLOCK_ITEM);
            event.accept(FULL_PATCHY_MEADOW_BLOCK_ITEM);
            event.accept(FULL_PATCHY_PRAIRIE_BLOCK_ITEM);
            event.accept(FULL_PATCHY_SILT_GRASS_BLOCK_ITEM);
            event.accept(FULL_PATCHY_SILT_MEADOW_BLOCK_ITEM);
            event.accept(DRY_SPROUTING_GRASS_BLOCK_ITEM);
            event.accept(DRY_PATCHY_GRASS_BLOCK_ITEM);
            event.accept(ROCKY_SOIL_ITEM);
            event.accept(SNOWY_SOIL_ITEM);
        }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(TUMBLESTONE_ITEM);
            event.accept(TUMBLESTONE_SLAB_ITEM);
            event.accept(TUMBLESTONE_STAIRS_ITEM);
            event.accept(TUMBLESTONE_WALL_ITEM);
            event.accept(MOSSY_TUMBLESTONE_ITEM);
            event.accept(MOSSY_TUMBLESTONE_SLAB_ITEM);
            event.accept(MOSSY_TUMBLESTONE_STAIRS_ITEM);
            event.accept(MOSSY_TUMBLESTONE_WALL_ITEM);
            event.accept(ANDESITE_BRICKS_ITEM);
            event.accept(ANDESITE_BRICK_SLAB_ITEM);
            event.accept(ANDESITE_BRICK_STAIRS_ITEM);
            event.accept(ANDESITE_BRICK_WALL_ITEM);
            event.accept(ANDESITE_CUBES_ITEM);
            event.accept(ANDESITE_CUBE_SLAB_ITEM);
            event.accept(ANDESITE_CUBE_STAIRS_ITEM);
            event.accept(ANDESITE_CUBE_WALL_ITEM);
            event.accept(ANDESITE_TILES_ITEM);
            event.accept(ANDESITE_TILE_SLAB_ITEM);
            event.accept(ANDESITE_TILE_STAIRS_ITEM);
            event.accept(ANDESITE_TILE_WALL_ITEM);
            event.accept(DIRTY_ANDESITE_CUBES_ITEM);
            event.accept(DIRTY_ANDESITE_CUBE_SLAB_ITEM);
            event.accept(DIRTY_ANDESITE_CUBE_STAIRS_ITEM);
            event.accept(DIRTY_ANDESITE_CUBE_WALL_ITEM);
            event.accept(DIRTY_ANDESITE_TILES_ITEM);
            event.accept(DIRTY_ANDESITE_TILE_SLAB_ITEM);
            event.accept(DIRTY_ANDESITE_TILE_STAIRS_ITEM);
            event.accept(DIRTY_ANDESITE_TILE_WALL_ITEM);
            event.accept(VERY_DIRTY_ANDESITE_CUBES_ITEM);
            event.accept(VERY_DIRTY_ANDESITE_CUBE_SLAB_ITEM);
            event.accept(VERY_DIRTY_ANDESITE_CUBE_STAIRS_ITEM);
            event.accept(VERY_DIRTY_ANDESITE_CUBE_WALL_ITEM);
            event.accept(VERY_DIRTY_ANDESITE_TILES_ITEM);
            event.accept(VERY_DIRTY_ANDESITE_TILE_SLAB_ITEM);
            event.accept(VERY_DIRTY_ANDESITE_TILE_STAIRS_ITEM);
            event.accept(VERY_DIRTY_ANDESITE_TILE_WALL_ITEM);
            event.accept(SILTY_ANDESITE_CUBES_ITEM);
            event.accept(SILTY_ANDESITE_CUBE_SLAB_ITEM);
            event.accept(SILTY_ANDESITE_CUBE_STAIRS_ITEM);
            event.accept(SILTY_ANDESITE_CUBE_WALL_ITEM);
            event.accept(SILTY_ANDESITE_TILES_ITEM);
            event.accept(SILTY_ANDESITE_TILE_SLAB_ITEM);
            event.accept(SILTY_ANDESITE_TILE_STAIRS_ITEM);
            event.accept(SILTY_ANDESITE_TILE_WALL_ITEM);
            event.accept(VERY_SILTY_ANDESITE_CUBES_ITEM);
            event.accept(VERY_SILTY_ANDESITE_CUBE_SLAB_ITEM);
            event.accept(VERY_SILTY_ANDESITE_CUBE_STAIRS_ITEM);
            event.accept(VERY_SILTY_ANDESITE_CUBE_WALL_ITEM);
            event.accept(VERY_SILTY_ANDESITE_TILES_ITEM);
            event.accept(VERY_SILTY_ANDESITE_TILE_SLAB_ITEM);
            event.accept(VERY_SILTY_ANDESITE_TILE_STAIRS_ITEM);
            event.accept(VERY_SILTY_ANDESITE_TILE_WALL_ITEM);
            event.accept(MUDDY_ANDESITE_CUBES_ITEM);
            event.accept(MUDDY_ANDESITE_CUBE_SLAB_ITEM);
            event.accept(MUDDY_ANDESITE_CUBE_STAIRS_ITEM);
            event.accept(MUDDY_ANDESITE_CUBE_WALL_ITEM);
            event.accept(MUDDY_ANDESITE_TILES_ITEM);
            event.accept(MUDDY_ANDESITE_TILE_SLAB_ITEM);
            event.accept(MUDDY_ANDESITE_TILE_STAIRS_ITEM);
            event.accept(MUDDY_ANDESITE_TILE_WALL_ITEM);
            event.accept(VERY_MUDDY_ANDESITE_CUBES_ITEM);
            event.accept(VERY_MUDDY_ANDESITE_CUBE_SLAB_ITEM);
            event.accept(VERY_MUDDY_ANDESITE_CUBE_STAIRS_ITEM);
            event.accept(VERY_MUDDY_ANDESITE_CUBE_WALL_ITEM);
            event.accept(VERY_MUDDY_ANDESITE_TILES_ITEM);
            event.accept(VERY_MUDDY_ANDESITE_TILE_SLAB_ITEM);
            event.accept(VERY_MUDDY_ANDESITE_TILE_STAIRS_ITEM);
            event.accept(VERY_MUDDY_ANDESITE_TILE_WALL_ITEM);
            event.accept(MUD_ANDESITE_CUBES_ITEM);
            event.accept(MUD_ANDESITE_CUBE_SLAB_ITEM);
            event.accept(MUD_ANDESITE_CUBE_STAIRS_ITEM);
            event.accept(MUD_ANDESITE_CUBE_WALL_ITEM);
            event.accept(SILT_ANDESITE_CUBES_ITEM);
            event.accept(SILT_ANDESITE_CUBE_SLAB_ITEM);
            event.accept(SILT_ANDESITE_CUBE_STAIRS_ITEM);
            event.accept(SILT_ANDESITE_CUBE_WALL_ITEM);
            event.accept(DIRT_ANDESITE_CUBES_ITEM);
            event.accept(DIRT_ANDESITE_CUBE_SLAB_ITEM);
            event.accept(DIRT_ANDESITE_CUBE_STAIRS_ITEM);
            event.accept(DIRT_ANDESITE_CUBE_WALL_ITEM);
            event.accept(MUDDY_ANDESITE_RUBBLE_ITEM);
            event.accept(MUDDY_ANDESITE_RUBBLE_SLAB_ITEM);
            event.accept(MUDDY_ANDESITE_RUBBLE_STAIRS_ITEM);
            event.accept(MUDDY_ANDESITE_RUBBLE_WALL_ITEM);
            event.accept(SILTY_ANDESITE_RUBBLE_ITEM);
            event.accept(SILTY_ANDESITE_RUBBLE_SLAB_ITEM);
            event.accept(SILTY_ANDESITE_RUBBLE_STAIRS_ITEM);
            event.accept(SILTY_ANDESITE_RUBBLE_WALL_ITEM);
            event.accept(DIRTY_ANDESITE_RUBBLE_ITEM);
            event.accept(DIRTY_ANDESITE_RUBBLE_SLAB_ITEM);
            event.accept(DIRTY_ANDESITE_RUBBLE_STAIRS_ITEM);
            event.accept(DIRTY_ANDESITE_RUBBLE_WALL_ITEM);
            event.accept(MUD_ANDESITE_RUBBLE_ITEM);
            event.accept(MUD_ANDESITE_RUBBLE_SLAB_ITEM);
            event.accept(MUD_ANDESITE_RUBBLE_STAIRS_ITEM);
            event.accept(MUD_ANDESITE_RUBBLE_WALL_ITEM);
            event.accept(SILT_ANDESITE_RUBBLE_ITEM);
            event.accept(SILT_ANDESITE_RUBBLE_SLAB_ITEM);
            event.accept(SILT_ANDESITE_RUBBLE_STAIRS_ITEM);
            event.accept(SILT_ANDESITE_RUBBLE_WALL_ITEM);
            event.accept(DIRT_ANDESITE_RUBBLE_ITEM);
            event.accept(DIRT_ANDESITE_RUBBLE_SLAB_ITEM);
            event.accept(DIRT_ANDESITE_RUBBLE_STAIRS_ITEM);
            event.accept(DIRT_ANDESITE_RUBBLE_WALL_ITEM);
            event.accept(VERY_MUDDY_ANDESITE_RUBBLE_ITEM);
            event.accept(VERY_MUDDY_ANDESITE_RUBBLE_SLAB_ITEM);
            event.accept(VERY_MUDDY_ANDESITE_RUBBLE_STAIRS_ITEM);
            event.accept(VERY_MUDDY_ANDESITE_RUBBLE_WALL_ITEM);
            event.accept(VERY_SILTY_ANDESITE_RUBBLE_ITEM);
            event.accept(VERY_SILTY_ANDESITE_RUBBLE_SLAB_ITEM);
            event.accept(VERY_SILTY_ANDESITE_RUBBLE_STAIRS_ITEM);
            event.accept(VERY_SILTY_ANDESITE_RUBBLE_WALL_ITEM);
            event.accept(VERY_DIRTY_ANDESITE_RUBBLE_ITEM);
            event.accept(VERY_DIRTY_ANDESITE_RUBBLE_SLAB_ITEM);
            event.accept(VERY_DIRTY_ANDESITE_RUBBLE_STAIRS_ITEM);
            event.accept(VERY_DIRTY_ANDESITE_RUBBLE_WALL_ITEM);
            event.accept(MOSSY_ANDESITE_BRICKS_ITEM);
            event.accept(MOSSY_ANDESITE_BRICK_SLAB_ITEM);
            event.accept(MOSSY_ANDESITE_BRICK_STAIRS_ITEM);
            event.accept(MOSSY_ANDESITE_BRICK_WALL_ITEM);
            event.accept(CHARRED_ANDESITE_BRICKS_ITEM);
            event.accept(CHARRED_ANDESITE_BRICK_SLAB_ITEM);
            event.accept(CHARRED_ANDESITE_BRICK_STAIRS_ITEM);
            event.accept(CHARRED_ANDESITE_BRICK_WALL_ITEM);
            event.accept(CHARRED_MOSSY_ANDESITE_BRICKS_ITEM);
            event.accept(CHARRED_MOSSY_ANDESITE_BRICK_SLAB_ITEM);
            event.accept(CHARRED_MOSSY_ANDESITE_BRICK_STAIRS_ITEM);
            event.accept(CHARRED_MOSSY_ANDESITE_BRICK_WALL_ITEM);
        }
    }
    @Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ColorRegisterHandler {
        @SubscribeEvent
        public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
            event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> {
                return p_276238_ != null && p_276239_ != null ? BiomeColors.getAverageGrassColor(p_276238_, p_276239_) : GrassColor.getDefaultColor();
            }, PRAIRIE_BLOCK.get(), MEADOW_BLOCK.get(), SILT_GRASS_BLOCK.get(), SILT_MEADOW_BLOCK.get(),
                    FULL_PRAIRIE_BLOCK.get(), FULL_MEADOW_BLOCK.get(), FULL_GRASS_BLOCK.get(),
                    SPROUTING_GRASS_BLOCK.get(), SPROUTING_MEADOW_BLOCK.get(), SPROUTING_PRAIRIE_BLOCK.get(), SPROUTING_SILT_GRASS_BLOCK.get(), SPROUTING_SILT_MEADOW_BLOCK.get(),
                    FULL_SPROUTING_GRASS_BLOCK.get(), FULL_SPROUTING_MEADOW_BLOCK.get(), FULL_SPROUTING_PRAIRIE_BLOCK.get(), FULL_SPROUTING_SILT_GRASS_BLOCK.get(), FULL_SPROUTING_SILT_MEADOW_BLOCK.get(),
                    PATCHY_GRASS_BLOCK.get(), PATCHY_MEADOW_BLOCK.get(), PATCHY_PRAIRIE_BLOCK.get(), PATCHY_SILT_GRASS_BLOCK.get(), PATCHY_SILT_MEADOW_BLOCK.get(),
                    FULL_PATCHY_GRASS_BLOCK.get(), FULL_PATCHY_MEADOW_BLOCK.get(), FULL_PATCHY_PRAIRIE_BLOCK.get(), FULL_PATCHY_SILT_GRASS_BLOCK.get(), FULL_PATCHY_SILT_MEADOW_BLOCK.get(),
                    DRY_PATCHY_GRASS_BLOCK.get(), DRY_SPROUTING_GRASS_BLOCK.get());
        }

        @SubscribeEvent
        public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
            event.register((p_92687_, p_92688_) -> {
                return GrassColor.getDefaultColor();
            }, PRAIRIE_BLOCK_ITEM.get(), MEADOW_BLOCK_ITEM.get(), SILT_GRASS_BLOCK_ITEM.get(), SILT_MEADOW_BLOCK_ITEM.get(),
                    FULL_PRAIRIE_BLOCK_ITEM.get(), FULL_MEADOW_BLOCK_ITEM.get(), FULL_GRASS_BLOCK_ITEM.get(),
                    SPROUTING_GRASS_BLOCK_ITEM.get(), SPROUTING_MEADOW_BLOCK_ITEM.get(), SPROUTING_PRAIRIE_BLOCK_ITEM.get(), SPROUTING_SILT_GRASS_BLOCK_ITEM.get(), SPROUTING_SILT_MEADOW_BLOCK_ITEM.get(),
                    FULL_SPROUTING_GRASS_BLOCK_ITEM.get(), FULL_SPROUTING_MEADOW_BLOCK_ITEM.get(), FULL_SPROUTING_PRAIRIE_BLOCK_ITEM.get(), FULL_SPROUTING_SILT_GRASS_BLOCK_ITEM.get(), FULL_SPROUTING_SILT_MEADOW_BLOCK_ITEM.get(),
                    PATCHY_GRASS_BLOCK.get(), PATCHY_MEADOW_BLOCK.get(), PATCHY_PRAIRIE_BLOCK.get(), PATCHY_SILT_GRASS_BLOCK.get(), PATCHY_SILT_MEADOW_BLOCK.get(),
                    FULL_PATCHY_GRASS_BLOCK.get(), FULL_PATCHY_MEADOW_BLOCK.get(), FULL_PATCHY_PRAIRIE_BLOCK.get(), FULL_PATCHY_SILT_GRASS_BLOCK.get(), FULL_PATCHY_SILT_MEADOW_BLOCK.get(),
                    DRY_PATCHY_GRASS_BLOCK_ITEM.get(), DRY_SPROUTING_GRASS_BLOCK_ITEM.get());
        }
    }
    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }
}
