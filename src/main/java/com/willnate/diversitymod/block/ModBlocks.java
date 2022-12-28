package com.willnate.diversitymod.block;

import com.willnate.diversitymod.DiversityMod;
import com.willnate.diversitymod.block.custom.GrapeCropBlock;
import com.willnate.diversitymod.block.custom.ModFlammableRotatedPillarBlock;
import com.willnate.diversitymod.block.custom.RiceCropBlock;
import com.willnate.diversitymod.block.custom.SlimeyBerryCropBlock;
import com.willnate.diversitymod.fluid.ModFluids;
import com.willnate.diversitymod.world.feature.tree.OliveTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.OakTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    // registering blocks and dropped item (when mined)
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DiversityMod.MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DiversityMod.MOD_ID);


    public static final RegistryObject<Block> BLOCK_OF_RUBY_BLOCK = BLOCKS.register("block_of_ruby",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> BLOCK_OF_RUBY_ITEM = ITEMS.register("block_of_ruby",
            () -> new BlockItem(BLOCK_OF_RUBY_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Block> BLOCK_OF_SAPPHIRE_BLOCK = BLOCKS.register("block_of_sapphire",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> BLOCK_OF_SAPPHIRE_ITEM = ITEMS.register("block_of_sapphire",
            () -> new BlockItem(BLOCK_OF_SAPPHIRE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Block> BLOCK_OF_TOPAZ_BLOCK = BLOCKS.register("block_of_topaz",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> BLOCK_OF_TOPAZ_ITEM = ITEMS.register("block_of_topaz",
            () -> new BlockItem(BLOCK_OF_TOPAZ_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Block> BLOCK_OF_AMBER_BLOCK = BLOCKS.register("block_of_amber",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> BLOCK_OF_AMBER_ITEM = ITEMS.register("block_of_amber",
            () -> new BlockItem(BLOCK_OF_AMBER_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Block> BLOCK_OF_JADE_BLOCK = BLOCKS.register("block_of_jade",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> BLOCK_OF_JADE_ITEM = ITEMS.register("block_of_jade",
            () -> new BlockItem(BLOCK_OF_JADE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Block> JEWELRY_TABLE_BLOCK = BLOCKS.register("jewelry_table",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(6f)));
    public static final RegistryObject<Item> JEWELRY_TABLE_ITEM = ITEMS.register("jewelry_table",
            () -> new BlockItem(JEWELRY_TABLE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<LiquidBlock> MERCURY_BLOCK = BLOCKS.register("mercury_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MERCURY, BlockBehaviour.Properties.copy(Blocks.WATER)));
    public static final RegistryObject<Block> SLIMEY_BERRY_CROP_BLOCK = BLOCKS.register("slimey_berry_crop",
            () -> new SlimeyBerryCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)));
    public static final RegistryObject<Item> SLIMEY_BERRY = ITEMS.register("slimey_berry",
            () -> new BlockItem(SLIMEY_BERRY_CROP_BLOCK.get(), new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(2f)
                    .build())));
    public static final RegistryObject<Block> OLIVE_LOG = BLOCKS.register("olive_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> OLIVE_WOOD = BLOCKS.register("olive_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_OLIVE_LOG = BLOCKS.register("stripped_olive_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_OLIVE_WOOD = BLOCKS.register("stripped_olive_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> OLIVE_PLANKS = BLOCKS.register("olive_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> OLIVE_LEAVES = BLOCKS.register("olive_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            });
    public static final RegistryObject<Block> OLIVE_LOG_SAPLING = BLOCKS.register("olive_sapling",
            () -> new SaplingBlock(new OliveTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Item> OLIVE_LOG_ITEM = ITEMS.register("olive_log",
            () -> new BlockItem(OLIVE_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_WOOD_ITEM = ITEMS.register("olive_wood",
            () -> new BlockItem(OLIVE_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OLIVE_LOG_ITEM = ITEMS.register("stripped_olive_log",
            () -> new BlockItem(STRIPPED_OLIVE_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OLIVE_WOOD_ITEM = ITEMS.register("stripped_olive_wood",
            () -> new BlockItem(STRIPPED_OLIVE_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_PLANKS_ITEM = ITEMS.register("olive_planks",
            () -> new BlockItem(OLIVE_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_LEAVES_ITEM = ITEMS.register("olive_leaves",
            () -> new BlockItem(OLIVE_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> OLIVE_LOG_SAPLING_ITEM = ITEMS.register("olive_sapling",
            () -> new BlockItem(OLIVE_LOG_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Block> GRAPE_CROP_BLOCK = BLOCKS.register("grape_crop",
            () -> new GrapeCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)));
    public static final RegistryObject<Item> GRAPES = ITEMS.register("grapes",
            () -> new BlockItem(GRAPE_CROP_BLOCK.get(), new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(2f)
                    .build())));
    public static final RegistryObject<Block> RICE_CROP_BLOCK = BLOCKS.register("rice_crop",
            () -> new RiceCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)));
    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new BlockItem(RICE_CROP_BLOCK.get(), new Item.Properties()));


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
