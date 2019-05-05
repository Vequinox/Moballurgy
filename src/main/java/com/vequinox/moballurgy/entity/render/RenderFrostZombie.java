package com.vequinox.moballurgy.entity.render;

import com.vequinox.moballurgy.entity.EntityFrostZombie;
import com.vequinox.moballurgy.entity.model.ModelFrostZombie;
import com.vequinox.moballurgy.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFrostZombie extends RenderLiving<EntityFrostZombie> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/frost_zombie.png");

    public RenderFrostZombie(RenderManager manager){
        super(manager, new ModelFrostZombie(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityFrostZombie entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityFrostZombie entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
