package com.vequinox.moballurgy;

import com.vequinox.moballurgy.client.renders.MoballurgyRenderRegistry;
import com.vequinox.moballurgy.init.MoballurgyEntities;
import com.vequinox.moballurgy.init.MoballurgyItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;


@Mod("moballurgy")
public class MoballurgyMain {
    public static final String MOD_ID = "moballurgy";
    private static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public static final ItemGroup GROUP = new ItemGroup(MOD_ID) {
        @Override
        @Nonnull
        public ItemStack createIcon() {
            return new ItemStack(MoballurgyItems.frostbiteMaleEgg);
        }
    };

    public MoballurgyMain() {
        final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(this::setup);
        modBus.addListener(this::clientRegistries);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Setup method registered for Moballurgy!");
        MoballurgyEntities.removeEntityWorldSpawns();
        MoballurgyEntities.registerEntityWorldSpawns();
    }

    private void clientRegistries(final FMLClientSetupEvent event) {
        LOGGER.info("Client Registries method registered for Moballurgy!");
        MoballurgyRenderRegistry.registryEntityRenders();

    }
}