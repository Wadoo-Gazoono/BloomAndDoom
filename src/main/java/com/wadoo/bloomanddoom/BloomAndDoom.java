package com.wadoo.bloomanddoom;

import com.mojang.logging.LogUtils;
import com.wadoo.bloomanddoom.common.registry.BaDEntities;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

@Mod("bloomanddoom")
public class BloomAndDoom
{
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "bloomanddoom";
    public BloomAndDoom()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BaDEntities.ENTITIES.register(bus);

    }
}
