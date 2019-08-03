package com.vequinox.moballurgy.client.models;

import com.vequinox.moballurgy.entities.FrostbiteEntity;
import net.minecraft.client.renderer.entity.model.ZombieModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FrostbiteEntityModel extends ZombieWithArmorModel<FrostbiteEntity> {
    public FrostbiteEntityModel(float p_i51070_1_, float p_i51070_2_, int p_i51070_3_, int p_i51070_4_) {
        super(p_i51070_1_, p_i51070_2_, p_i51070_3_, p_i51070_4_);
    }
}
