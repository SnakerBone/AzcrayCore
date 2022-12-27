package com.snaker.azcray.item;

import com.snaker.azcray.Azcray;
import com.snaker.azcray.item.custom.AnthropomorphousItem;
import com.snaker.azcray.item.custom.AwakenedItem;
import com.snaker.azcray.material.ItemTiers;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AzcrayItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Azcray.MOD_ID);
    public static final RegistryObject<Item> INTERPOLATING_HEART = ITEMS.register("interpolating_heart", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> AZCRAY_HEART = ITEMS.register("azcray_heart", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> ABYSSAL_FLESH = ITEMS.register("abyssal_flesh", () ->
            new Item(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN)));
    public static final RegistryObject<Item> DEMONIC_FLESH = ITEMS.register("demonic_flesh", () ->
            new Item(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN)));
    public static final RegistryObject<Item> ENDERGATIC_FLESH = ITEMS.register("endergatic_flesh", () ->
            new Item(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN)));
    public static final RegistryObject<Item> ANTHROPOMORPHOUS_FLESH = ITEMS.register("anthropomorphous_flesh", () ->
            new AnthropomorphousItem(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN)));
    public static final RegistryObject<Item> ANTHROPOMORPHOUS_BRAIN = ITEMS.register("anthropomorphous_brain", () ->
            new AnthropomorphousItem(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN)));
    public static final RegistryObject<Item> ANTHROPOMORPHOUS_EYEBALL = ITEMS.register("anthropomorphous_eyeball", () ->
            new AnthropomorphousItem(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN)));
    public static final RegistryObject<Item> ANTHROPOMORPHOUS_HEART = ITEMS.register("anthropomorphous_heart", () ->
            new AnthropomorphousItem(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN)));
    public static final RegistryObject<Item> AWAKENED_ATM_STAR = ITEMS.register("awakened_atm_star", () ->
            new AwakenedItem(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> AWAKENED_ATM_STAR_SHARD = ITEMS.register("awakened_atm_star_shard", () ->
            new AwakenedItem(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> AWAKENED_FRECKLES = ITEMS.register("awakened_freckles", () ->
            new AwakenedItem(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> FRECKLES = ITEMS.register("freckles", () ->
            new Item(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN)));
    public static final RegistryObject<Item> RAW_CATALYSTIC_BLEND = ITEMS.register("raw_catalystic_blend", () ->
            new Item(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> CATALYSTIC_LATTICE = ITEMS.register("catalystic_lattice", () ->
            new Item(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN)));
    public static final RegistryObject<Item> CATALYSTIC_INGOT = ITEMS.register("catalystic_ingot", () ->
            new AwakenedItem(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> CATALYSTIC_AXE = ITEMS.register("catalystic_axe", () ->
            new AxeItem(ItemTiers.CATALYSTIC, 120, -3.2f,
                    new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> CATALYSTIC_PICKAXE = ITEMS.register("catalystic_pickaxe", () ->
            new PickaxeItem(ItemTiers.CATALYSTIC, 60, -2.8f,
                    new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> CATALYSTIC_SHOVEL = ITEMS.register("catalystic_shovel", () ->
            new ShovelItem(ItemTiers.CATALYSTIC, 40, -3f,
                    new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> CATALYSTIC_SWORD = ITEMS.register("catalystic_sword", () ->
            new SwordItem(ItemTiers.CATALYSTIC, 100, -2.4f,
                    new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> CATALYSTIC_WEEDER = ITEMS.register("catalystic_weeder", () ->
            new HoeItem(ItemTiers.CATALYSTIC, 40, -2f,
                    new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> CATALYSTIC_SHEARS = ITEMS.register("catalystic_shears", () ->
            new ShearsItem(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> EREBUS_PORTER = ITEMS.register("erebus_porter", () ->
            new Item(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN)));
    public static final RegistryObject<Item> GAIA_PORTER = ITEMS.register("gaia_porter", () ->
            new Item(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN)));
    public static final RegistryObject<Item> HADES_PORTER = ITEMS.register("hades_porter", () ->
            new Item(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN)));
    public static final RegistryObject<Item> DIMENSIONAL_SHIFTER = ITEMS.register("dimensional_shifter", () ->
            new AwakenedItem(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> LUCKY_CLOVER = ITEMS.register("lucky_clover", () ->
            new Item(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN)));
    public static final RegistryObject<Item> UNLUCKY_CLOVER = ITEMS.register("unlucky_clover", () ->
            new Item(new Item.Properties().group(AzcrayItemGroup.AZCRAY_TAB_MAIN)));
}