package com.wadoo.bloomanddoom.client.model;

import com.wadoo.bloomanddoom.BloomAndDoom;
import com.wadoo.bloomanddoom.common.entity.PotatoMiner;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class PotatoMinerModel extends AnimatedTickingGeoModel<PotatoMiner> {

    public ResourceLocation getAnimationFileLocation(PotatoMiner entity) {
        return new ResourceLocation(BloomAndDoom.MOD_ID, "animations/potato_miner.animation.json");
    }

    public ResourceLocation getModelLocation(PotatoMiner entity) {
        return new ResourceLocation(BloomAndDoom.MOD_ID, "geo/potato_miner.geo.json");
    }

    public ResourceLocation getTextureLocation(PotatoMiner entity) {
        return new ResourceLocation(BloomAndDoom.MOD_ID, "textures/potato/potato_miner.png");
    }
}
