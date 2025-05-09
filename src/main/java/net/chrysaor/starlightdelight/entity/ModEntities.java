package net.chrysaor.starlightdelight.entity;

import net.chrysaor.starlightdelight.StarlightDelight;
import net.chrysaor.starlightdelight.entity.custom.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MantisEntity> MANTIS = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(StarlightDelight.MOD_ID, "mantis"),
            EntityType.Builder.create(MantisEntity::new, SpawnGroup.CREATURE)
                    .dimensions(2, 2.5f).build());

    public static final EntityType<StarlightSwordProjectileEntity> STARLIGHT_SWORD = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(StarlightDelight.MOD_ID, "starlight_sword"),
            EntityType.Builder.<StarlightSwordProjectileEntity>create(StarlightSwordProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(1.0f, 1.0f).build());

    public static final EntityType<IronTomahawkProjectileEntity> IRON_TOMAHAWK = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(StarlightDelight.MOD_ID, "iron_tomahawk"),
            EntityType.Builder.<IronTomahawkProjectileEntity>create(IronTomahawkProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 1.15f).build());

    public static final EntityType<GoldTomahawkProjectileEntity> GOLD_TOMAHAWK = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(StarlightDelight.MOD_ID, "gold_tomahawk"),
            EntityType.Builder.<GoldTomahawkProjectileEntity>create(GoldTomahawkProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 1.15f).build());

    public static final EntityType<DiamondTomahawkProjectileEntity> DIAMOND_TOMAHAWK = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(StarlightDelight.MOD_ID, "diamond_tomahawk"),
            EntityType.Builder.<DiamondTomahawkProjectileEntity>create(DiamondTomahawkProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 1.15f).build());

    public static final EntityType<PinkGarnetTomahawkProjectileEntity> PINK_GARNET_TOMAHAWK = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(StarlightDelight.MOD_ID, "pink_garnet_tomahawk"),
            EntityType.Builder.<PinkGarnetTomahawkProjectileEntity>create(PinkGarnetTomahawkProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 1.15f).build());

    public static void registerModEntities() {
        StarlightDelight.LOGGER.info("Registering Mod Entities for " + StarlightDelight.MOD_ID);
    }
}
