package com.vequinox.moballurgy;

import com.vequinox.moballurgy.client.renders.MoballurgyRenderRegistry;
import com.vequinox.moballurgy.init.MoballurgyEntities;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("moballurgy")
public class MoballurgyMain {

    public static MoballurgyMain instance;
    public static final String MOD_ID = "moballurgy";
    private static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    //public static final ItemGroup MOBALLURGY =

    public MoballurgyMain(){
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
        LOGGER.info("Setup method registered for Moballurgy!");
        MoballurgyEntities.removeEntityWorldSpawns();
        MoballurgyEntities.registerEntityWorldSpawns();
    }

    private void clientRegistries(final FMLClientSetupEvent event){
        LOGGER.info("Client Registries method registered for Moballurgy!");
        MoballurgyRenderRegistry.registryEntityRenders();

    }

}
