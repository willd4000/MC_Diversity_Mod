package com.willnate.diversitymod.villager;

import com.google.common.collect.ImmutableSet;
import com.willnate.diversitymod.DiversityMod;
import com.willnate.diversitymod.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, DiversityMod.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, DiversityMod.MOD_ID);

    public static final RegistryObject<PoiType> JEWELRY_TABLE_POI = POI_TYPES.register("jewelry_table_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.JEWELRY_TABLE_BLOCK.get().getStateDefinition().getPossibleStates()
            ), 1, 1));
    public static final RegistryObject<VillagerProfession> JEWELER = VILLAGER_PROFESSIONS.register("jeweler",
            () -> new VillagerProfession("jeweler", x -> x.get() == JEWELRY_TABLE_POI.get(),
                    x -> x.get() == JEWELRY_TABLE_POI.get(),ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));
    public static void registerPOIs(){
        try{
            ObfuscationReflectionHelper.findMethod(PoiType.class, "registerBlockStates",
                    PoiType.class).invoke(null, JEWELRY_TABLE_POI.get());
        }
        catch (InvocationTargetException | IllegalAccessException exception){
            exception.printStackTrace();
        }
    }
    public static void register(IEventBus eventBus){
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
