package com.wadoo.bloomanddoom.client;

import com.wadoo.bloomanddoom.BloomAndDoom;
import com.wadoo.bloomanddoom.client.renderer.PotatoMinerRenderer;
import com.wadoo.bloomanddoom.common.registry.BaDEntities;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.example.client.renderer.entity.ExampleGeoRenderer;
import software.bernie.example.registry.EntityRegistry;

@Mod.EventBusSubscriber(modid = BloomAndDoom.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        EntityRenderers.register(BaDEntities.POTATOMINER.get(), PotatoMinerRenderer::new);
    }
}
