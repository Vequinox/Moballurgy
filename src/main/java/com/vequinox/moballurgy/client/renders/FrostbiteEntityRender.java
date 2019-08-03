package com.vequinox.moballurgy.client.renders;

import com.vequinox.moballurgy.MoballurgyRegistries;
import com.vequinox.moballurgy.client.models.FrostbiteEntityModel;
import com.vequinox.moballurgy.entities.FrostbiteEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class FrostbiteEntityRender extends LivingRenderer<FrostbiteEntity, FrostbiteEntityModel> {//Change to MobRenderer to avoid nametag showing always

    public FrostbiteEntityRender(EntityRendererManager manager){
        super(manager, new FrostbiteEntityModel(0.0F, 0.0F, 64, 64), 0f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(FrostbiteEntity entity) {
        return MoballurgyRegistries.location("textures/entity/samuraizombie.png");
    }

    public static class RenderFactory implements IRenderFactory<FrostbiteEntity>{
        @Override
        public EntityRenderer<? super FrostbiteEntity> createRenderFor(EntityRendererManager manager){
            return new FrostbiteEntityRender(manager);
        }
    }
}
