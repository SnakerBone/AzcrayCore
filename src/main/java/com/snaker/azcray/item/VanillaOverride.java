package com.snaker.azcray.item;

import com.snaker.azcray.item.override.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class VanillaOverride extends Item
{
    public static final DeferredRegister<Item> MINECRAFT_ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");
    // normal food items
    public static final RegistryObject<Item> APPLE = MINECRAFT_ITEM.register("apple", FoodOverride::new);
    public static final RegistryObject<Item> BREAD = MINECRAFT_ITEM.register("bread", FoodOverride::new);
    public static final RegistryObject<Item> RAW_PORKCHOP = MINECRAFT_ITEM.register("porkchop", FoodOverride::new);
    public static final RegistryObject<Item> COOKED_PORKCHOP = MINECRAFT_ITEM.register("cooked_porkchop", FoodOverride::new);
    public static final RegistryObject<Item> RAW_COD = MINECRAFT_ITEM.register("cod", FoodOverride::new);
    public static final RegistryObject<Item> RAW_SALMON = MINECRAFT_ITEM.register("salmon", FoodOverride::new);
    public static final RegistryObject<Item> TROPICAL_FISH = MINECRAFT_ITEM.register("tropical_fish", FoodOverride::new);
    public static final RegistryObject<Item> PUFFERFISH = MINECRAFT_ITEM.register("pufferfish", FoodOverride::new);
    public static final RegistryObject<Item> COOKED_COD = MINECRAFT_ITEM.register("cooked_cod", FoodOverride::new);
    public static final RegistryObject<Item> COOKED_SALMON = MINECRAFT_ITEM.register("cooked_salmon", FoodOverride::new);
    public static final RegistryObject<Item> COOKIE = MINECRAFT_ITEM.register("cookie", FoodOverride::new);
    public static final RegistryObject<Item> MELON_SLICE = MINECRAFT_ITEM.register("melon_slice", FoodOverride::new);
    public static final RegistryObject<Item> RAW_BEEF = MINECRAFT_ITEM.register("beef", FoodOverride::new);
    public static final RegistryObject<Item> STEAK = MINECRAFT_ITEM.register("cooked_beef", FoodOverride::new);
    public static final RegistryObject<Item> RAW_CHICKEN = MINECRAFT_ITEM.register("chicken", FoodOverride::new);
    public static final RegistryObject<Item> COOKED_CHICKEN = MINECRAFT_ITEM.register("cooked_chicken", FoodOverride::new);
    public static final RegistryObject<Item> ROTTEN_FLESH = MINECRAFT_ITEM.register("rotten_flesh", FoodOverride::new);
    public static final RegistryObject<Item> CARROT = MINECRAFT_ITEM.register("carrot", FoodOverride::new);
    public static final RegistryObject<Item> POTATO = MINECRAFT_ITEM.register("potato", FoodOverride::new);
    public static final RegistryObject<Item> BAKED_POTATO = MINECRAFT_ITEM.register("baked_potato", FoodOverride::new);
    public static final RegistryObject<Item> POISONOUS_POTATO = MINECRAFT_ITEM.register("poisonous_potato", FoodOverride::new);
    public static final RegistryObject<Item> GOLDEN_CARROT = MINECRAFT_ITEM.register("golden_carrot", FoodOverride::new);
    public static final RegistryObject<Item> PUMPKIN_PIE = MINECRAFT_ITEM.register("pumpkin_pie", FoodOverride::new);
    public static final RegistryObject<Item> RAW_RABBIT = MINECRAFT_ITEM.register("rabbit", FoodOverride::new);
    public static final RegistryObject<Item> COOKED_RABBIT = MINECRAFT_ITEM.register("cooked_rabbit", FoodOverride::new);
    public static final RegistryObject<Item> RAW_MUTTON = MINECRAFT_ITEM.register("mutton", FoodOverride::new);
    public static final RegistryObject<Item> COOKED_MUTTON = MINECRAFT_ITEM.register("cooked_mutton", FoodOverride::new);
    public static final RegistryObject<Item> BEETROOT = MINECRAFT_ITEM.register("beetroot", FoodOverride::new);
    public static final RegistryObject<Item> SWEET_BERRIES = MINECRAFT_ITEM.register("sweet_berries", FoodOverride::new);
    // dried kelp food items
    public static final RegistryObject<Item> DRIED_KELP = MINECRAFT_ITEM.register("dried_kelp", DriedKelpOverride::new);
    // chorus fruit food items
    public static final RegistryObject<Item> CHORUS_FRUIT = MINECRAFT_ITEM.register("chorus_fruit", ChorusFruitOverride::new);
    // golden apple food items
    public static final RegistryObject<Item> GOLDEN_APPLE = MINECRAFT_ITEM.register("golden_apple", GoldenAppleOverride::new);
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_APPLE = MINECRAFT_ITEM.register("enchanted_golden_apple", EnchantedGoldenAppleOverride::new);
    // bottled food items
    public static final RegistryObject<Item> HONEY_BOTTLE = MINECRAFT_ITEM.register("honey_bottle", HoneyBottleOverride::new);
    // soup food items
    public static final RegistryObject<Item> BEETROOT_SOUP = MINECRAFT_ITEM.register("beetroot_soup", SoupOverride::new);
    public static final RegistryObject<Item> MUSHROOM_STEW = MINECRAFT_ITEM.register("mushroom_stew", SoupOverride::new);
    public static final RegistryObject<Item> RABBIT_STEW = MINECRAFT_ITEM.register("rabbit_stew", SoupOverride::new);
    public static final RegistryObject<Item> SUSPICIOUS_STEW = MINECRAFT_ITEM.register("suspicious_stew", SoupOverride::new);
    // written, writable book items
    public static final RegistryObject<Item> WRITTEN_BOOK = MINECRAFT_ITEM.register("written_book", WrittenBookOverride::new);
    public static final RegistryObject<Item> WRITABLE_BOOK = MINECRAFT_ITEM.register("writable_book", WritableBookOverride::new);
    // sword items (excluding diamond and netherite)
    public static final RegistryObject<Item> WOODEN_SWORD = MINECRAFT_ITEM.register("wooden_sword", SwordOverride::new);
    public static final RegistryObject<Item> STONE_SWORD = MINECRAFT_ITEM.register("stone_sword", SwordOverride::new);
    public static final RegistryObject<Item> IRON_SWORD = MINECRAFT_ITEM.register("iron_sword", SwordOverride::new);
    public static final RegistryObject<Item> GOLDEN_SWORD = MINECRAFT_ITEM.register("golden_sword", SwordOverride::new);
    // pickaxe items (excluding diamond and netherite)
    public static final RegistryObject<Item> WOODEN_PICKAXE = MINECRAFT_ITEM.register("wooden_pickaxe", PickaxeOverride::new);
    public static final RegistryObject<Item> STONE_PICKAXE = MINECRAFT_ITEM.register("stone_pickaxe", PickaxeOverride::new);
    public static final RegistryObject<Item> IRON_PICKAXE = MINECRAFT_ITEM.register("iron_pickaxe", PickaxeOverride::new);
    public static final RegistryObject<Item> GOLDEN_PICKAXE = MINECRAFT_ITEM.register("golden_pickaxe", PickaxeOverride::new);
    // axe items (excluding diamond and netherite)
    public static final RegistryObject<Item> WOODEN_AXE = MINECRAFT_ITEM.register("wooden_axe", AxeOverride::new);
    public static final RegistryObject<Item> STONE_AXE = MINECRAFT_ITEM.register("stone_axe", AxeOverride::new);
    public static final RegistryObject<Item> IRON_AXE = MINECRAFT_ITEM.register("iron_axe", AxeOverride::new);
    public static final RegistryObject<Item> GOLDEN_AXE = MINECRAFT_ITEM.register("golden_axe", AxeOverride::new);
    // shovel items (excluding diamond and netherite)
    public static final RegistryObject<Item> WOODEN_SHOVEL = MINECRAFT_ITEM.register("wooden_shovel", ShovelOverride::new);
    public static final RegistryObject<Item> STONE_SHOVEL = MINECRAFT_ITEM.register("stone_shovel", ShovelOverride::new);
    public static final RegistryObject<Item> IRON_SHOVEL = MINECRAFT_ITEM.register("iron_shovel", ShovelOverride::new);
    public static final RegistryObject<Item> GOLDEN_SHOVEL = MINECRAFT_ITEM.register("golden_shovel", ShovelOverride::new);
    // weeder items (excluding diamond and netherite)
    public static final RegistryObject<Item> WOODEN_HOE = MINECRAFT_ITEM.register("wooden_hoe", WeederOverride::new);
    public static final RegistryObject<Item> STONE_HOE = MINECRAFT_ITEM.register("stone_hoe", WeederOverride::new);
    public static final RegistryObject<Item> IRON_HOE = MINECRAFT_ITEM.register("iron_hoe", WeederOverride::new);
    public static final RegistryObject<Item> GOLDEN_HOE = MINECRAFT_ITEM.register("golden_hoe", WeederOverride::new);

    public VanillaOverride(Properties properties)
    {
        super(properties);
    }
}
