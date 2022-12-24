package com.willnate.diversitymod.block;

import com.willnate.diversitymod.DiversityMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
