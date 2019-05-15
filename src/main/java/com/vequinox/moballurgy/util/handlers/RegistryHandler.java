package com.vequinox.moballurgy.util.handlers;

import com.vequinox.moballurgy.entity.EntityInit;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        RenderHandler.registerEntityRenders();
    }

    public static void initRegistries(FMLInitializationEvent event) {
        EntityInit.regsiterEntities();
        SpawnHandler.addAndRemoveSpawns();
    }
}
