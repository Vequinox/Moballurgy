package com.vequinox.moballurgy.potion;

import com.vequinox.moballurgy.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

public abstract class PotionBase extends Potion{
    public static ResourceLocation icon;

    public PotionBase(boolean isBadEffect, int liquidColor, String name, ResourceLocation icon){
        super(isBadEffect, liquidColor);
        this.setPotionName("effect." + name);
        this.icon = icon;

        if(!isBadEffect){
            this.setBeneficial();
        }

        this.setRegistryName(new ResourceLocation(Reference.MOD_ID, "effect." + name));
    }

    @Override
    public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc) {
        mc.getTextureManager().bindTexture(icon);
        Gui.drawModalRectWithCustomSizedTexture(x + 6, y + 7, 0, 0, 18, 18, 18, 18);
    }

    @Override
    public void renderHUDEffect(int x, int y, PotionEffect effect, Minecraft mc, float alpha) {
        mc.getTextureManager().bindTexture(icon);
        Gui.drawModalRectWithCustomSizedTexture(x + 3, y + 3, 0, 0, 18, 18, 18, 18);
    }

}
