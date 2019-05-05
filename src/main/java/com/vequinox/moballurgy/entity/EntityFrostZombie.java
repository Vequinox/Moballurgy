package com.vequinox.moballurgy.entity;

import com.vequinox.moballurgy.util.Reference;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityFrostZombie extends EntityZombie {
    public EntityFrostZombie(World world){
        super(world);
        this.setSize(0.6F, 1.95F);
    }

    @SideOnly(Side.CLIENT)
    public String getTexture(){
        return String.valueOf(new ResourceLocation(Reference.MOD_ID, "textures/entity/frost_zombie.png"));
    }
}
