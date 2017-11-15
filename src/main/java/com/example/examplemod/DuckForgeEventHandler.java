package com.example.examplemod;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;


public class DuckForgeEventHandler {
    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<EntityEntry> event) {
        System.out.println("Register EntityEntry called!");
        EntityEntry entry = EntityEntryBuilder.create()
                .entity(EntityDuck.class)
                .id(new ResourceLocation("duck"), 1)
                .name("duck")
                .egg(0xFFFFFF, 0xAAAAAA)
                .tracker(64, 20, false)
                .build();
        event.getRegistry().register(entry);

        if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
            RenderingRegistry.registerEntityRenderingHandler(EntityDuck.class, new EntityDuckFactory());
        }
    }
}
