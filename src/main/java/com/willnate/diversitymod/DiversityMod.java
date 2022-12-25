package com.willnate.diversitymod;

import com.mojang.logging.LogUtils;
import com.willnate.diversitymod.block.ModBlocks;
import com.willnate.diversitymod.fluid.ModFluidTypes;
import com.willnate.diversitymod.fluid.ModFluids;
import com.willnate.diversitymod.item.ModItems;
import com.willnate.diversitymod.villager.ModVillagers;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DiversityMod.MOD_ID)
public class DiversityMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "diversitymod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public DiversityMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModVillagers.register(modEventBus);
        ModFluids.register((modEventBus));
        ModFluidTypes.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the addCreative method for modloading
        modEventBus.addListener(this::addCreative);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);



    }
    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.BANKNOTE);
            event.accept(ModItems.RUBY);
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModItems.TOPAZ);
            event.accept(ModItems.AMBER_SHARD);
            event.accept(ModItems.JADE_SHARD);
            event.accept(ModBlocks.BLOCK_OF_RUBY_BLOCK);
            event.accept(ModBlocks.BLOCK_OF_RUBY_ITEM);
            event.accept(ModBlocks.BLOCK_OF_SAPPHIRE_BLOCK);
            event.accept(ModBlocks.BLOCK_OF_SAPPHIRE_ITEM);
            event.accept(ModBlocks.BLOCK_OF_TOPAZ_BLOCK);
            event.accept(ModBlocks.BLOCK_OF_TOPAZ_ITEM);
            event.accept(ModBlocks.BLOCK_OF_AMBER_BLOCK);
            event.accept(ModBlocks.BLOCK_OF_AMBER_ITEM);
            event.accept(ModBlocks.BLOCK_OF_JADE_BLOCK);
            event.accept(ModBlocks.BLOCK_OF_JADE_ITEM);
            event.accept(ModBlocks.JEWELRY_TABLE_BLOCK);
            event.accept(ModBlocks.JEWELRY_TABLE_ITEM);
            event.accept(ModItems.CROWN);
            event.accept(ModItems.MERCURY_BUCKET);
        }

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            ModVillagers.registerPOIs();;
        });
    }




    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
//            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_MERCURY.get(), RenderType.translucent());
//            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_MERCURY.get(), RenderType.translucent());
        }
    }
}
