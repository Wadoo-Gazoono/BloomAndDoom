package com.wadoo.bloomanddoom.client.renderer;

import com.wadoo.bloomanddoom.client.model.PotatoMinerModel;
import com.wadoo.bloomanddoom.common.entity.PotatoMiner;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PotatoMinerRenderer extends GeoEntityRenderer<PotatoMiner> {
    public PotatoMinerRenderer(EntityRendererProvider.Context renderManager, AnimatedGeoModel<PotatoMiner> modelProvider) {
        super(renderManager, new PotatoMinerModel());
    }
}
