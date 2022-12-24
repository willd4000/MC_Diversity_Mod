package com.willnate.diversitymod.item;

import com.willnate.diversitymod.DiversityMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // registers items
    private static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DiversityMod.MOD_ID);
    public static final RegistryObject<Item> X = ITEMS.register("banknote",
            () -> new Item(new Item.Properties()));
    // register method for items
    public static void register(IEventBus eventBus){
        ITEMS.register((eventBus));
    }
}
