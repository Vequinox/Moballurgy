package com.vequinox.moballurgy.client.renders;

import com.vequinox.moballurgy.entities.FrostbiteEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class MoballurgyRenderRegistry {
    public static void registryEntityRenders(){
        RenderingRegistry.registerEntityRenderingHandler(FrostbiteEntity.class, new FrostbiteEntityRender.RenderFactory());
    }
}
