package com.vequinox.moballurgy.init;

import com.vequinox.moballurgy.MoballurgyMain;
import com.vequinox.moballurgy.MoballurgyRegistries;
import com.vequinox.moballurgy.entities.FrostbiteEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

public class MoballurgyEntities {

    public static EntityType<?> FROSTBITE_ENTITY = EntityType.Builder.create(FrostbiteEntity::new, EntityClassification.MONSTER).build(MoballurgyMain.MOD_ID + ":frostbite_entity").setRegistryName(MoballurgyRegistries.location("frostbite_entity"));

    public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
            MoballurgyItems.frostbiteMaleEgg = registerEntitySpawnEgg(FROSTBITE_ENTITY, 0x000000, 0xFFFFFF, "frostbite_male_entity_egg")
        );
    }

    public static Item registerEntitySpawnEgg(EntityType<?> type, int mainColor, int dotColor, String name){
        SpawnEggItem egg = new SpawnEggItem(type, mainColor, dotColor, new Item.Properties().group(ItemGroup.MISC));
        egg.setRegistryName(MoballurgyRegistries.location(name));
        return egg;
    }

    public static void removeEntityWorldSpawns(){
        removeEntityWorldSpawn(EntityType.ZOMBIE, Biomes.PLAINS);
    }

    public static void removeEntityWorldSpawn(EntityType<?> entity, Biome... biomes){
        for(Biome biome : biomes){
            if(biome != null){
                biome.getSpawns(entity.getClassification()).removeAll(biome.getSpawns(entity.getClassification()));
            }
        }
    }

    public static void registerEntityWorldSpawns(){
        registerEntityWorldSpawn(FROSTBITE_ENTITY, 80, 4, 4, Biomes.PLAINS);
        registerEntityWorldSpawn(EntityType.ZOMBIE, 20, 4, 4, Biomes.PLAINS);
    }

    public static void registerEntityWorldSpawn(EntityType<?> entity, int weight, int min, int max, Biome... biomes){
        for(Biome biome : biomes){
            if(biome != null){
                biome.getSpawns(entity.getClassification()).add(new Biome.SpawnListEntry(entity, weight, min, max));
            }
        }
    }
}