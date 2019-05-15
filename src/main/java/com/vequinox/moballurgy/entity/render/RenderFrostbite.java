package com.vequinox.moballurgy.entity.render;

import com.vequinox.moballurgy.entity.EntityFrostbite;
import com.vequinox.moballurgy.entity.model.ModelFrostbite;
import com.vequinox.moballurgy.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFrostbite extends RenderLiving<EntityFrostbite> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/frost_zombie.png");

    public RenderFrostbite(RenderManager manager){
        super(manager, new ModelFrostbite(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityFrostbite entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityFrostbite entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
