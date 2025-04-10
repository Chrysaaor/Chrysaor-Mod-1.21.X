package net.chrysaor.chrysaormod.item;

import net.chrysaor.chrysaormod.ChrysaorMod;
import net.chrysaor.chrysaormod.block.ModBlocks;
import net.chrysaor.chrysaormod.entity.ModEntities;
import net.chrysaor.chrysaormod.item.custom.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.List;


public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));


    //Foods
    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings()
            .food(ModFoodComponents.CAULIFLOWER)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.chrysaormod.cauliflower.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item SWEET_BERRIES_PIE = registerItem("sweet_berries_pie", new Item(new Item.Settings()
            .food(ModFoodComponents.SWEET_BERRIES_PIE)));
    public static final Item CHEESE = registerItem("cheese", new Item(new Item.Settings()
            .food(ModFoodComponents.CHEESE)));

    //
    public static final Item STARLIGHT_ASHES = registerItem("starlight_ashes", new Item(new Item.Settings().fireproof()));
    public static final Item STARLIGHT_FRAGMENT = registerItem("starlight_fragment", new Item(new Item.Settings().fireproof()));

    public static final Item STARLIGHT_UPGRADE_SMITHING_TEMPLATE = registerItem("starlight_upgrade_smithing_template", ModTemplateItem.createStarlightUpgrade());

    //Starlight Armor
    public static final Item STARLIGHT_HELMET = registerItem("starlight_helmet",
            new ModArmorItem(ModArmorMaterials.STARLIGHT_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(20)).fireproof()));
    public static final Item STARLIGHT_CHESTPLATE = registerItem("starlight_chestplate",
            new ArmorItem(ModArmorMaterials.STARLIGHT_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(20)).fireproof()));
    public static final Item STARLIGHT_LEGGINGS = registerItem("starlight_leggings",
            new ArmorItem(ModArmorMaterials.STARLIGHT_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(20)).fireproof()));
    public static final Item STARLIGHT_BOOTS = registerItem("starlight_boots",
            new ArmorItem(ModArmorMaterials.STARLIGHT_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(20)).fireproof()));

    //Starlight Tools
    public static final Item STARLIGHT_PICKAXE = registerItem("starlight_pickaxe",
            new PickaxeItem(ModToolMaterials.STARLIGHT_FRAGMENT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STARLIGHT_FRAGMENT, 1, -2.8f)).fireproof()));
    public static final Item STARLIGHT_AXE = registerItem("starlight_axe",
            new AxeItem(ModToolMaterials.STARLIGHT_FRAGMENT, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STARLIGHT_FRAGMENT, 6, -3.2f)).fireproof()));
    public static final Item STARLIGHT_SHOVEL = registerItem("starlight_shovel",
            new ShovelItem(ModToolMaterials.STARLIGHT_FRAGMENT, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STARLIGHT_FRAGMENT, 1.5F, -3.0f)).fireproof()));
    public static final Item STARLIGHT_BOW = registerItem("starlight_bow",
            new BowItem(new Item.Settings().maxDamage(600).fireproof()));

    //Pink Garnet Tools
    public static final Item PINK_GARNET_SWORD = registerItem("pink_garnet_sword",
            new SwordItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 2, -2.4f))));
    public static final Item PINK_GARNET_PICKAXE = registerItem("pink_garnet_pickaxe",
            new PickaxeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 1, -2.8f))));
    public static final Item PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel",
            new ShovelItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 1.5f, -3.0f))));
    public static final Item PINK_GARNET_AXE = registerItem("pink_garnet_axe",
            new AxeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 6, -3.2f))));
    public static final Item PINK_GARNET_HOE = registerItem("pink_garnet_hoe",
            new HoeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 0, -3f))));

    //Hammers
    public static final Item PINK_GARNET_HAMMER = registerItem("pink_garnet_hammer",
            new HammerItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 3, -3.4f))));
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new HammerItem(ToolMaterials.DIAMOND, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.DIAMOND, 3, -3.4f))));
    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new HammerItem(ToolMaterials.NETHERITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -3.4f))));
    public static final Item STARLIGHT_HAMMER = registerItem("starlight_hammer",
            new HammerItem(ModToolMaterials.STARLIGHT_FRAGMENT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STARLIGHT_FRAGMENT, 3, -3.4f))));

    //Hoely Beheader
    public static final Item HOELY_BEHEADER = registerItem("hoely_beheader",
            new HoelyBeheaderItem(ToolMaterials.NETHERITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 2, -2f))
                    .fireproof()
                    .rarity(Rarity.EPIC)) {
        @Override
        public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.chrysaormod.hoely_beheader.tooltip"));
            tooltip.add(Text.translatable("tooltip.chrysaormod.hoely_beheader.tooltip1"));
            tooltip.add(Text.translatable("tooltip.chrysaormod.hoely_beheader.tooltip2"));
            tooltip.add(Text.translatable("tooltip.chrysaormod.hoely_beheader.tooltip3"));
            tooltip.add(Text.translatable("tooltip.chrysaormod.hoely_beheader.tooltip4"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    //Pink Garnet Armor
    public static final Item PINK_GARNET_HELMET = registerItem("pink_garnet_helmet",
        new ModArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(20))));
    public static final Item PINK_GARNET_CHESTPLATE = registerItem("pink_garnet_chestplate",
        new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(20))));
    public static final Item PINK_GARNET_LEGGINGS = registerItem("pink_garnet_leggings",
        new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(20))));
    public static final Item PINK_GARNET_BOOTS = registerItem("pink_garnet_boots",
        new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(20))));

    public static final Item PINK_GARNET_HORSE_ARMOR = registerItem("pink_garnet_horse_armor",
        new AnimalArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

    public static final Item IRON_TOMAHAWK = registerItem("iron_tomahawk",
            new TomahawkItem(new Item.Settings().maxCount(16)));
    public static final Item GOLD_TOMAHAWK = registerItem("gold_tomahawk",
            new TomahawkItem(new Item.Settings().maxCount(32)));
    public static final Item PINK_GARNET_TOMAHAWK = registerItem("pink_garnet_tomahawk",
            new TomahawkItem(new Item.Settings().maxCount(16)));
    public static final Item DIAMOND_TOMAHAWK = registerItem("diamond_tomahawk",
            new TomahawkItem(new Item.Settings().maxCount(16)));

    public static final Item CAULIFLOWER_SEEDS = registerItem("cauliflower_seeds",
        new AliasedBlockItem(ModBlocks.CAULIFLOWER_CROP, new Item.Settings()));

    public static final Item MANTIS_SPAWN_EGG = registerItem("mantis_spawn_egg",
            new SpawnEggItem(ModEntities.MANTIS, 0x9dc783, 0xbfaf5f, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ChrysaorMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ChrysaorMod.LOGGER.info("Registering Mod Items for " + ChrysaorMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(PINK_GARNET);
           entries.add(RAW_PINK_GARNET);
        });
    }
}
