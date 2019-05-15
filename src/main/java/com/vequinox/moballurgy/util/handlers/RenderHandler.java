package com.vequinox.moballurgy.util.handlers;

import com.vequinox.moballurgy.entity.EntityFrostbite;
import com.vequinox.moballurgy.entity.render.RenderFrostbite;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders(){
        RenderingRegistry.registerEntityRenderingHandler(EntityFrostbite.class, new IRenderFactory<EntityFrostbite>() {
            @Override
            public Render<? super EntityFrostbite> createRenderFor(RenderManager manager) {
                return new RenderFrostbite(manager);
            }
        });
    }
}
