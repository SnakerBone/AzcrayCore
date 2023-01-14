package au.com.snaker.azcray.init;

import au.com.snaker.azcray.data.Const;
import au.com.snaker.azcray.item.anthro.AnthropomorphousItem;
import au.com.snaker.azcray.item.awakened.AwakenedItem;
import au.com.snaker.azcray.item.clover.LuckyCloverItem;
import au.com.snaker.azcray.item.clover.UnluckyCloverItem;
import au.com.snaker.azcray.item.weapon.FactorialSwordItem;
import au.com.snaker.azcray.tier.AzcrayToolTiers;
import au.com.snaker.azcray.item.porter.ChaosPorterItem;
import au.com.snaker.azcray.item.porter.DimensionalShifterItem;
import au.com.snaker.azcray.item.porter.GaiaPorterItem;
import au.com.snaker.azcray.item.porter.HadesPorterItem;
import au.com.snaker.azcray.item.wip.WipItem;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AzcrayItemInit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Const.MOD_ID);
    public static final RegistryObject<Item> INTERPOLATING_HEART = ITEMS.register("interpolating_heart", () ->
            new WipItem(new Item.Properties()));
    public static final RegistryObject<Item> AZCRAY_HEART = ITEMS.register("azcray_heart", () ->
            new WipItem(new Item.Properties()));
    public static final RegistryObject<Item> DIMENSIONAL_SHIFTER = ITEMS.register("dimensional_shifter", () ->
            new DimensionalShifterItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN).rarity(Rarity.EPIC).maxStackSize(1)));
    public static final RegistryObject<Item> LUCKY_CLOVER = ITEMS.register("lucky_clover", () ->
            new LuckyCloverItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN).maxStackSize(1)));
    public static final RegistryObject<Item> UNLUCKY_CLOVER = ITEMS.register("unlucky_clover", () ->
            new UnluckyCloverItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN).maxStackSize(1)));
    public static final RegistryObject<Item> FINAL_STAR = ITEMS.register("final_star", () ->
            new WipItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> FINAL_STAR_SHARD = ITEMS.register("final_star_shard", () ->
            new WipItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> FRECKLES = ITEMS.register("freckles", () ->
            new WipItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> AWAKENED_FRECKLES = ITEMS.register("awakened_freckles", () ->
            new AwakenedItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> GAIA_PORTER = ITEMS.register("gaia_porter", () ->
            new GaiaPorterItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN).maxStackSize(1)));
    public static final RegistryObject<Item> HADES_PORTER = ITEMS.register("hades_porter", () ->
            new HadesPorterItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN).maxStackSize(1)));
    public static final RegistryObject<Item> CHAOS_PORTER = ITEMS.register("chaos_porter", () ->
            new ChaosPorterItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN).maxStackSize(1)));
    public static final RegistryObject<Item> ABYSSAL_FLESH = ITEMS.register("abyssal_flesh", () ->
            new WipItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> DEMONIC_FLESH = ITEMS.register("demonic_flesh", () ->
            new WipItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> ENDERGATIC_FLESH = ITEMS.register("endergatic_flesh", () ->
            new WipItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> ANTHROPOMORPHOUS_FLESH = ITEMS.register("anthropomorphous_flesh", () ->
            new AnthropomorphousItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> ANTHROPOMORPHOUS_BRAIN = ITEMS.register("anthropomorphous_brain", () ->
            new AnthropomorphousItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> ANTHROPOMORPHOUS_EYEBALL = ITEMS.register("anthropomorphous_eyeball", () ->
            new AnthropomorphousItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> ANTHROPOMORPHOUS_HEART = ITEMS.register("anthropomorphous_heart", () ->
            new AnthropomorphousItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> RAW_CATALYSTIC_BLEND = ITEMS.register("raw_catalystic_blend", () ->
            new WipItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> CATALYSTIC_LATTICE = ITEMS.register("catalystic_lattice", () ->
            new WipItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> CATALYSTIC_INGOT = ITEMS.register("catalystic_ingot", () ->
            new WipItem(new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> FACTORIAL_SWORD = ITEMS.register("factorial_sword", () ->
            new FactorialSwordItem(AzcrayToolTiers.CATALYSTIC, 3, -2.4f,
                    new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> CATALYSTIC_SHOVEL = ITEMS.register("catalystic_shovel", () ->
            new ShovelItem(AzcrayToolTiers.CATALYSTIC, 1.5f, -3f,
                    new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> CATALYSTIC_PICKAXE = ITEMS.register("catalystic_pickaxe", () ->
            new PickaxeItem(AzcrayToolTiers.CATALYSTIC, 1, -2.8f,
                    new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> CATALYSTIC_AXE = ITEMS.register("catalystic_axe", () ->
            new AxeItem(AzcrayToolTiers.CATALYSTIC, 5f, -3f,
                    new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
    public static final RegistryObject<Item> CATALYSTIC_WEEDER = ITEMS.register("catalystic_weeder", () ->
            new HoeItem(AzcrayToolTiers.CATALYSTIC, -4, 0f,
                    new Item.Properties().group(AzcrayMainItemGroupInit.AZCRAY_MAIN)));
}