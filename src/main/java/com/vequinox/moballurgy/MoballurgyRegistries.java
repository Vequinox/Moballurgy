package com.vequinox.moballurgy;

import com.vequinox.moballurgy.entities.FrostbiteEntity;
import com.vequinox.moballurgy.init.MoballurgyEntities;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class MoballurgyRegistries {

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event){
        MoballurgyEntities.registerEntitySpawnEggs(event);
    }

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event){
        event.getRegistry().registerAll(
                MoballurgyEntities.FROSTBITE_ENTITY
        );

        EntitySpawnPlacementRegistry.register(MoballurgyEntities.FROSTBITE_ENTITY, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::func_223325_c);
    }

    public static ResourceLocation location(String name){
        return new ResourceLocation(MoballurgyMain.MOD_ID, name);
    }
}
