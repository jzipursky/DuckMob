package com.example.examplemod;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class EntityDuckFactory implements IRenderFactory<EntityDuck> {
    @Override
    public Render<EntityDuck> createRenderFor(RenderManager manager) {
        return new RenderDuck(manager);
    }
}