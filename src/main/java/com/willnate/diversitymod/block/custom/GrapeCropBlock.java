package com.willnate.diversitymod.block.custom;

import com.willnate.diversitymod.block.ModBlocks;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class GrapeCropBlock extends CropBlock {
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 3);

    public GrapeCropBlock(Properties p_52247_) {
        super(p_52247_);
    }
    @Override
    public ItemLike getBaseSeedId(){
        return ModBlocks.SLIMEY_BERRY.get();
    }
    public IntegerProperty getAgeProperty(){
        return AGE;
    }
    public int getMaxAge(){
        return 3;
    }
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder){
        builder.add(AGE);
    }
}
