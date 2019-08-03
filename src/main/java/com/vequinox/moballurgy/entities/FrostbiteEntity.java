package com.vequinox.moballurgy.entities;

import com.vequinox.moballurgy.init.MoballurgyEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.world.World;

public class FrostbiteEntity extends ZombieEntity {

    @SuppressWarnings("unchecked")
    public FrostbiteEntity(EntityType<? extends ZombieEntity> type, World worldIn) {
        super(MoballurgyEntities.FROSTBITE_ENTITY, worldIn);
    }
}
