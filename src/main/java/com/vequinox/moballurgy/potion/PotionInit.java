package com.vequinox.moballurgy.potion;

import com.vequinox.moballurgy.util.Reference;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class PotionInit {

    public static final PotionBase HYPOTHERMIA = new PotionFrostbite(true, 13823217, "hypothermia");

    public static void registerPotion(String name, Potion potion, RegistryEvent.Register<Potion> event){
        event.getRegistry().register(potion);
    }

}
