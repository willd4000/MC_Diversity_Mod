package com.willnate.diversitymod.block;

import com.willnate.diversitymod.DiversityMod;
import com.willnate.diversitymod.fluid.ModFluids;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
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
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
