package com.vequinox.moballurgy.util.handlers;

import com.vequinox.moballurgy.entity.EntityFrostZombie;
import com.vequinox.moballurgy.entity.render.RenderFrostZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders(){
        RenderingRegistry.registerEntityRenderingHandler(EntityFrostZombie.class, new IRenderFactory<EntityFrostZombie>() {
            @Override
            public Render<? super EntityFrostZombie> createRenderFor(RenderManager manager) {
                return new RenderFrostZombie(manager);
            }
        });
    }
}
