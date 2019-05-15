package com.vequinox.moballurgy.entity;

import com.vequinox.moballurgy.potion.PotionInit;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EntityFrostbite extends EntityZombie {
    public EntityFrostbite(World world){
        super(world);
        this.setSize(0.6F, 1.95F);
    }

    @Override
    public boolean attackEntityAsMob(Entity entity) {
        boolean flag = super.attackEntityAsMob(entity);

        if(flag){
            if(entity instanceof EntityLivingBase){
                EntityLivingBase attackedEntity = (EntityLivingBase) entity;
                attackedEntity.addPotionEffect(new PotionEffect(PotionInit.HYPOTHERMIA, 200, 0));
            }
        }

        return flag;
    }
}
