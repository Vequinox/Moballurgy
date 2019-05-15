package com.vequinox.moballurgy.util.handlers;

import com.vequinox.moballurgy.entity.EntityFrostbite;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class SpawnHandler {

    public static void addAndRemoveSpawns(){
        EntityRegistry.removeSpawn(EntityZombie.class, EnumCreatureType.MONSTER,
            Biome.getBiome(12), //Snowy Tundra
            Biome.getBiome(13), //Ice Mountains
            Biome.getBiome(140), //Ice Spikes
            Biome.getBiome(30), //Snowy Taiga
            Biome.getBiome(31), //Snowy Taiga Hills
            Biome.getBiome(158), //Snowy Taiga Mountains
            Biome.getBiome(11), //Frozen River
            Biome.getBiome(26) //Snowy Beach
        );

        EntityRegistry.addSpawn(EntityFrostbite.class, 95, 4, 4, EnumCreatureType.MONSTER,
            Biome.getBiome(12), //Snowy Tundra
            Biome.getBiome(13), //Ice Mountains
            Biome.getBiome(140), //Ice Spikes
            Biome.getBiome(30), //Snowy Taiga
            Biome.getBiome(31), //Snowy Taiga Hills
            Biome.getBiome(158), //Snowy Taiga Mountains
            Biome.getBiome(11), //Frozen River
            Biome.getBiome(26) //Snowy Beach
        );
    }
}
