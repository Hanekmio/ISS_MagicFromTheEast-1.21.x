package net.warphan.iss_magicfromtheeast.registries;

import io.redspace.ironsspellbooks.registries.EntityRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.warphan.iss_magicfromtheeast.ISS_MagicFromTheEast;
import net.warphan.iss_magicfromtheeast.entity.spells.force_sword.SummonedSword;

public class MFTEEntityRegistries extends EntityRegistry {
    private static final DeferredRegister<EntityType<?>> MFTE_ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, ISS_MagicFromTheEast.MOD_ID);

    public static void register(IEventBus eventBus) {
        MFTE_ENTITIES.register(eventBus);
    }

    public  static final DeferredHolder<EntityType<?>, EntityType<SummonedSword>> FORCE_SWORD =
            MFTE_ENTITIES.register("summoned_sword", () -> EntityType.Builder.<SummonedSword>of(SummonedSword::new, MobCategory.MISC)
                    .sized(1.3f, 0.5f)
                    .clientTrackingRange(64)
                    .build(new ResourceLocation(ISS_MagicFromTheEast.MOD_ID, "summoned_sword").toString()));
}
