package com.wadoo.bloomanddoom.common.registry;

import com.wadoo.bloomanddoom.BloomAndDoom;
import com.wadoo.bloomanddoom.common.entity.PotatoMiner;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import software.bernie.example.entity.LEEntity;

public class BaDEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, BloomAndDoom.MOD_ID);

    public static final RegistryObject<EntityType<PotatoMiner>> POTATOMINER = create("potato_miner", EntityType.Builder.of(PotatoMiner::new, MobCategory.MISC).sized(0.35f, 0.2f));

    private static <T extends Entity> RegistryObject<EntityType<T>> create(String name, EntityType.Builder<T> builder) {
        return ENTITIES.register(name, () -> builder.build(BloomAndDoom.MOD_ID + "." + name));
    }

}
