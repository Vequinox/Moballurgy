package com.vequinox.moballurgy.util;

import com.vequinox.moballurgy.potion.PotionInit;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class EventListener {

    @SubscribeEvent
    public static void onRegisterPotion(RegistryEvent.Register<Potion> event){
        PotionInit.registerPotion("hypothermia", PotionInit.HYPOTHERMIA, event);
    }

    @SubscribeEvent
    public static void onBlockStartBreak(PlayerEvent.BreakSpeed event){
        if(event.getEntityPlayer().isPotionActive(PotionInit.HYPOTHERMIA)){
            event.setNewSpeed(event.getOriginalSpeed() * .5F);
        }
    }
}
