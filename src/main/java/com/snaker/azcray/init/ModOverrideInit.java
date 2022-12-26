package com.snaker.azcray.init;

import com.snaker.azcray.item.custom.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModOverrideInit extends Item
{
    public static final DeferredRegister<Item> MINECRAFT_ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");
    // normal food items
    public static final RegistryObject<Item> APPLE = MINECRAFT_ITEM.register("apple", NormalFoodModItem::new);
    public static final RegistryObject<Item> BREAD = MINECRAFT_ITEM.register("bread", NormalFoodModItem::new);
    public static final RegistryObject<Item> RAW_PORKCHOP = MINECRAFT_ITEM.register("porkchop", NormalFoodModItem::new);
    public static final RegistryObject<Item> COOKED_PORKCHOP = MINECRAFT_ITEM.register("cooked_porkchop", NormalFoodModItem::new);
    public static final RegistryObject<Item> RAW_COD = MINECRAFT_ITEM.register("cod", NormalFoodModItem::new);
    public static final RegistryObject<Item> RAW_SALMON = MINECRAFT_ITEM.register("salmon", NormalFoodModItem::new);
    public static final RegistryObject<Item> TROPICAL_FISH = MINECRAFT_ITEM.register("tropical_fish", NormalFoodModItem::new);
    public static final RegistryObject<Item> PUFFERFISH = MINECRAFT_ITEM.register("pufferfish", NormalFoodModItem::new);
    public static final RegistryObject<Item> COOKED_COD = MINECRAFT_ITEM.register("cooked_cod", NormalFoodModItem::new);
    public static final RegistryObject<Item> COOKED_SALMON = MINECRAFT_ITEM.register("cooked_salmon", NormalFoodModItem::new);
    public static final RegistryObject<Item> COOKIE = MINECRAFT_ITEM.register("cookie", NormalFoodModItem::new);
    public static final RegistryObject<Item> MELON_SLICE = MINECRAFT_ITEM.register("melon_slice", NormalFoodModItem::new);
    public static final RegistryObject<Item> RAW_BEEF = MINECRAFT_ITEM.register("beef", NormalFoodModItem::new);
    public static final RegistryObject<Item> STEAK = MINECRAFT_ITEM.register("cooked_beef", NormalFoodModItem::new);
    public static final RegistryObject<Item> RAW_CHICKEN = MINECRAFT_ITEM.register("chicken", NormalFoodModItem::new);
    public static final RegistryObject<Item> COOKED_CHICKEN = MINECRAFT_ITEM.register("cooked_chicken", NormalFoodModItem::new);
    public static final RegistryObject<Item> ROTTEN_FLESH = MINECRAFT_ITEM.register("rotten_flesh", NormalFoodModItem::new);
    public static final RegistryObject<Item> CARROT = MINECRAFT_ITEM.register("carrot", NormalFoodModItem::new);
    public static final RegistryObject<Item> POTATO = MINECRAFT_ITEM.register("potato", NormalFoodModItem::new);
    public static final RegistryObject<Item> BAKED_POTATO = MINECRAFT_ITEM.register("baked_potato", NormalFoodModItem::new);
    public static final RegistryObject<Item> POISONOUS_POTATO = MINECRAFT_ITEM.register("poisonous_potato", NormalFoodModItem::new);
    public static final RegistryObject<Item> GOLDEN_CARROT = MINECRAFT_ITEM.register("golden_carrot", NormalFoodModItem::new);
    public static final RegistryObject<Item> PUMPKIN_PIE = MINECRAFT_ITEM.register("pumpkin_pie", NormalFoodModItem::new);
    public static final RegistryObject<Item> RAW_RABBIT = MINECRAFT_ITEM.register("rabbit", NormalFoodModItem::new);
    public static final RegistryObject<Item> COOKED_RABBIT = MINECRAFT_ITEM.register("cooked_rabbit", NormalFoodModItem::new);
    public static final RegistryObject<Item> RAW_MUTTON = MINECRAFT_ITEM.register("mutton", NormalFoodModItem::new);
    public static final RegistryObject<Item> COOKED_MUTTON = MINECRAFT_ITEM.register("cooked_mutton", NormalFoodModItem::new);
    public static final RegistryObject<Item> BEETROOT = MINECRAFT_ITEM.register("beetroot", NormalFoodModItem::new);
    public static final RegistryObject<Item> SWEET_BERRIES = MINECRAFT_ITEM.register("sweet_berries", NormalFoodModItem::new);
    // dried kelp food items
    public static final RegistryObject<Item> DRIED_KELP = MINECRAFT_ITEM.register("dried_kelp", DriedKelpFoodModItem::new);
    // chorus fruit food items
    public static final RegistryObject<Item> CHORUS_FRUIT = MINECRAFT_ITEM.register("chorus_fruit", ChorusFruitModItem::new);
    // golden apple food items
    public static final RegistryObject<Item> GOLDEN_APPLE = MINECRAFT_ITEM.register("golden_apple", GoldenAppleModItem::new);
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_APPLE = MINECRAFT_ITEM.register("enchanted_golden_apple", EnchantedGoldenAppleModItem::new);
    // bottled food items
    public static final RegistryObject<Item> HONEY_BOTTLE = MINECRAFT_ITEM.register("honey_bottle", BottleFoodModItem::new);
    // soup food items
    public static final RegistryObject<Item> BEETROOT_SOUP = MINECRAFT_ITEM.register("beetroot_soup", SoupFoodModItem::new);
    public static final RegistryObject<Item> MUSHROOM_STEW = MINECRAFT_ITEM.register("mushroom_stew", SoupFoodModItem::new);
    public static final RegistryObject<Item> RABBIT_STEW = MINECRAFT_ITEM.register("rabbit_stew", SoupFoodModItem::new);
    public static final RegistryObject<Item> SUSPICIOUS_STEW = MINECRAFT_ITEM.register("suspicious_stew", SoupFoodModItem::new);
    // written, writable book items
    public static final RegistryObject<Item> WRITTEN_BOOK = MINECRAFT_ITEM.register("written_book", WrittenBookModItem::new);
    public static final RegistryObject<Item> WRITABLE_BOOK = MINECRAFT_ITEM.register("writable_book", WritableBookModItem::new);
    // sword items (excluding diamond and netherite)
    public static final RegistryObject<Item> WOODEN_SWORD = MINECRAFT_ITEM.register("wooden_sword", SwordModItem::new);
    public static final RegistryObject<Item> STONE_SWORD = MINECRAFT_ITEM.register("stone_sword", SwordModItem::new);
    public static final RegistryObject<Item> IRON_SWORD = MINECRAFT_ITEM.register("iron_sword", SwordModItem::new);
    public static final RegistryObject<Item> GOLDEN_SWORD = MINECRAFT_ITEM.register("golden_sword", SwordModItem::new);
    // pickaxe items (excluding diamond and netherite)
    public static final RegistryObject<Item> WOODEN_PICKAXE = MINECRAFT_ITEM.register("wooden_pickaxe", PickaxeModItem::new);
    public static final RegistryObject<Item> STONE_PICKAXE = MINECRAFT_ITEM.register("stone_pickaxe", PickaxeModItem::new);
    public static final RegistryObject<Item> IRON_PICKAXE = MINECRAFT_ITEM.register("iron_pickaxe", PickaxeModItem::new);
    public static final RegistryObject<Item> GOLDEN_PICKAXE = MINECRAFT_ITEM.register("golden_pickaxe", PickaxeModItem::new);
    // axe items (excluding diamond and netherite)
    public static final RegistryObject<Item> WOODEN_AXE = MINECRAFT_ITEM.register("wooden_axe", AxeModItem::new);
    public static final RegistryObject<Item> STONE_AXE = MINECRAFT_ITEM.register("stone_axe", AxeModItem::new);
    public static final RegistryObject<Item> IRON_AXE = MINECRAFT_ITEM.register("iron_axe", AxeModItem::new);
    public static final RegistryObject<Item> GOLDEN_AXE = MINECRAFT_ITEM.register("golden_axe", AxeModItem::new);
    // shovel items (excluding diamond and netherite)
    public static final RegistryObject<Item> WOODEN_SHOVEL = MINECRAFT_ITEM.register("wooden_shovel", ShovelModItem::new);
    public static final RegistryObject<Item> STONE_SHOVEL = MINECRAFT_ITEM.register("stone_shovel", ShovelModItem::new);
    public static final RegistryObject<Item> IRON_SHOVEL = MINECRAFT_ITEM.register("iron_shovel", ShovelModItem::new);
    public static final RegistryObject<Item> GOLDEN_SHOVEL = MINECRAFT_ITEM.register("golden_shovel", ShovelModItem::new);
    // weeder items (excluding diamond and netherite)
    public static final RegistryObject<Item> WOODEN_HOE = MINECRAFT_ITEM.register("wooden_hoe", WeederModItem::new);
    public static final RegistryObject<Item> STONE_HOE = MINECRAFT_ITEM.register("stone_hoe", WeederModItem::new);
    public static final RegistryObject<Item> IRON_HOE = MINECRAFT_ITEM.register("iron_hoe", WeederModItem::new);
    public static final RegistryObject<Item> GOLDEN_HOE = MINECRAFT_ITEM.register("golden_hoe", WeederModItem::new);

    public ModOverrideInit(Properties properties)
    {
        super(properties);
    }
}
