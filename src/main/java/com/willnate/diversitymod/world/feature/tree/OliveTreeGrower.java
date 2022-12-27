package com.willnate.diversitymod.world.feature.tree;

import com.willnate.diversitymod.world.feature.ModConfiguredFeatures;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;


public class OliveTreeGrower extends AbstractTreeGrower {
   @Override
   protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource p_222910_, boolean p_222911_) {
      return ModConfiguredFeatures.OLIVE_TREE;
      //ModConfiguredFeatures.OLIVE_TREE.get()
   }
}