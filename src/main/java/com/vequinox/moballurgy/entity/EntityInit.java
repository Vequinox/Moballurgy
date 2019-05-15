package com.vequinox.moballurgy.entity;

import com.vequinox.moballurgy.Main;
import com.vequinox.moballurgy.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
    public static void regsiterEntities(){
        registerEntity("frost_zombie", EntityFrostbite.class, Reference.ENTITY_FROST_ZOMBIE, 50, 3103394, 437752);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2){
        EntityRegistry.registerModEntity(
            new ResourceLocation(Reference.MOD_ID + ":" + name),
            entity,
            name,
            id,
            Main.instance,
            range,
            1,
            true,
            color1,
            color2
        );
    }
}
