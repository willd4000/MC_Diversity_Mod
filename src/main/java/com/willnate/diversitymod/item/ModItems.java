package com.willnate.diversitymod.item;

import com.willnate.diversitymod.DiversityMod;
import com.willnate.diversitymod.fluid.ModFluids;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // registers items
    private static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DiversityMod.MOD_ID);

    // Block to add new items
    public static final RegistryObject<Item> BANKNOTE = ITEMS.register("banknote",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMBER_SHARD = ITEMS.register("amber_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE_SHARD = ITEMS.register("jade_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<ArmorItem> CROWN = ITEMS.register("crown",
            () -> new ArmorItem(ModArmorMaterials.CROWN, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> MERCURY_BUCKET = ITEMS.register("mercury_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MERCURY,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> OLIVES = ITEMS.register("olives",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(2f)
                    .build())));
    public static final RegistryObject<Item> BOWL_OF_OLIVE_OIL = ITEMS.register("olive_oil",
            () -> new BowlFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(2).saturationMod(2f)
                    .build())));
    public static final RegistryObject<Item> BOWL_OF_GRAPE_JUICE = ITEMS.register("grape_juice",
            () -> new BowlFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(2).saturationMod(2f)
                    .build())));
    public static final RegistryObject<Item> BOWL_OF_WINE = ITEMS.register("wine",
            () -> new BowlFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(2).saturationMod(2f)
                    .effect( () -> new MobEffectInstance(MobEffects.CONFUSION, 600, 0), .5f)
                    .effect( () -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 1).build())));
    public static final RegistryObject<Item> BOWL_OF_STEAMED_RICE = ITEMS.register("steamed_rice",
            () -> new BowlFoodItem(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(6).saturationMod(6f)
                    .build())));

//    public static class Foods {
//        public static final FoodProperties FOOD = new FoodProperties.Builder()
//                .nutrition(1)
//                .saturationMod(1)
//                // other effects
//                .build();
//    }


    // register method for items
    public static void register(IEventBus eventBus){
        ITEMS.register((eventBus));

    }


}
