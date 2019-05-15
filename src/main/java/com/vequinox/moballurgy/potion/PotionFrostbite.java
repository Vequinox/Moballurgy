package com.vequinox.moballurgy.potion;

import com.vequinox.moballurgy.util.Reference;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class PotionFrostbite extends PotionBase {

    public PotionFrostbite(boolean isBadEffect, int liquidColor, String iconName){
        super(isBadEffect, liquidColor, "hypothermia", new ResourceLocation(Reference.MOD_ID, "textures/icons/" + iconName + ".png"));
        this.registerPotionAttributeModifier(SharedMonsterAttributes.ATTACK_SPEED, MathHelper.getRandomUUID().toString(), -0.1D, 2);
        this.registerPotionAttributeModifier(SharedMonsterAttributes.MOVEMENT_SPEED, MathHelper.getRandomUUID().toString(), -0.5D, 2);
        this.registerPotionAttributeModifier(SharedMonsterAttributes.MAX_HEALTH, MathHelper.getRandomUUID().toString(), 4.0D, 0);
    }

    @Override
    public void performEffect(EntityLivingBase entityLivingBase, int amplifier) {
        super.performEffect(entityLivingBase, amplifier);
    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        return true;
    }


}
