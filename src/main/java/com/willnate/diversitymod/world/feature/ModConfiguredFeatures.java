package com.willnate.diversitymod.world.feature;

import com.willnate.diversitymod.DiversityMod;
import com.willnate.diversitymod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registries.CONFIGURED_FEATURE, DiversityMod.MOD_ID);

    public static final ResourceKey<ConfiguredFeature<?, ?>> OLIVE_TREE = createKey("olive_tree");
//    public static final RegistryObject<ConfiguredFeature<TreeConfiguration, Feature<TreeConfiguration>>> OLIVE_TREE =
//            CONFIGURED_FEATURES.register("olive", () ->
//            new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
//                    BlockStateProvider.simple(ModBlocks.OLIVE_LOG.get()),
//                    new StraightTrunkPlacer(5, 6, 3),
//                    BlockStateProvider.simple(ModBlocks.OLIVE_LEAVES.get()),
//                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
//                    new TwoLayersFeatureSize(1, 0, 2)).build()));


    public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(CONFIGURED_FEATURES.getRegistryKey(), new ResourceLocation(DiversityMod.MOD_ID, name));
    }
    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
