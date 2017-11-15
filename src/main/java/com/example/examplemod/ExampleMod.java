package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "duck";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        /*
        ModelResourceLocation parachuteResource = new ModelResourceLocation(Parachute.MODID + ":" + ParachuteCommonProxy.parachuteName);
        ModelResourceLocation packResource = new ModelResourceLocation(Parachute.MODID + ":" + ParachuteCommonProxy.packName);
        RenderingRegistry.registerEntityRenderingHandler(EntityParachute.class, RenderParachute::new); // java 8
        ModelLoader.setCustomModelResourceLocation(ParachuteCommonProxy.parachuteItem, 0, parachuteResource);
        ModelLoader.setCustomModelResourceLocation(ParachuteCommonProxy.packItem, 0, packResource);
    */
        System.out.println("preInit - registering duck event handler...");
        MinecraftForge.EVENT_BUS.register(new DuckForgeEventHandler());
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}
