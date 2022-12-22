package com.snaker.azcray.init;

import com.snaker.azcray.item.BottleFoodItem;
import com.snaker.azcray.item.NormalFoodItem;
import com.snaker.azcray.item.SoupFoodItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class VanillaOverrideInit {

    // register

    public static final DeferredRegister<Item> VANILLA_FOOD_OVERRIDE = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    // normal food items

    public static final RegistryObject<Item> APPLE = VANILLA_FOOD_OVERRIDE.register("apple", NormalFoodItem::new);
    public static final RegistryObject<Item> BREAD = VANILLA_FOOD_OVERRIDE.register("bread", NormalFoodItem::new);
    public static final RegistryObject<Item> RAW_PORKCHOP = VANILLA_FOOD_OVERRIDE.register("porkchop", NormalFoodItem::new);
    public static final RegistryObject<Item> COOKED_PORKCHOP = VANILLA_FOOD_OVERRIDE.register("cooked_porkchop", NormalFoodItem::new);
    public static final RegistryObject<Item> GOLDEN_APPLE = VANILLA_FOOD_OVERRIDE.register("golden_apple", NormalFoodItem::new);
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_APPLE = VANILLA_FOOD_OVERRIDE.register("enchanted_golden_apple", NormalFoodItem::new);
    public static final RegistryObject<Item> RAW_COD = VANILLA_FOOD_OVERRIDE.register("cod", NormalFoodItem::new);
    public static final RegistryObject<Item> RAW_SALMON = VANILLA_FOOD_OVERRIDE.register("salmon", NormalFoodItem::new);
    public static final RegistryObject<Item> TROPICAL_FISH = VANILLA_FOOD_OVERRIDE.register("tropical_fish", NormalFoodItem::new);
    public static final RegistryObject<Item> PUFFERFISH = VANILLA_FOOD_OVERRIDE.register("pufferfish", NormalFoodItem::new);
    public static final RegistryObject<Item> COOKED_COD = VANILLA_FOOD_OVERRIDE.register("cooked_cod", NormalFoodItem::new);
    public static final RegistryObject<Item> COOKED_SALMON = VANILLA_FOOD_OVERRIDE.register("cooked_salmon", NormalFoodItem::new);
    public static final RegistryObject<Item> COOKIE = VANILLA_FOOD_OVERRIDE.register("cookie", NormalFoodItem::new);
    public static final RegistryObject<Item> MELON_SLICE = VANILLA_FOOD_OVERRIDE.register("melon_slice", NormalFoodItem::new);
    public static final RegistryObject<Item> DRIED_KELP = VANILLA_FOOD_OVERRIDE.register("dried_kelp", NormalFoodItem::new);
    public static final RegistryObject<Item> RAW_BEEF = VANILLA_FOOD_OVERRIDE.register("beef", NormalFoodItem::new);
    public static final RegistryObject<Item> STEAK = VANILLA_FOOD_OVERRIDE.register("cooked_beef", NormalFoodItem::new);
    public static final RegistryObject<Item> RAW_CHICKEN = VANILLA_FOOD_OVERRIDE.register("chicken", NormalFoodItem::new);
    public static final RegistryObject<Item> COOKED_CHICKEN = VANILLA_FOOD_OVERRIDE.register("cooked_chicken", NormalFoodItem::new);
    public static final RegistryObject<Item> ROTTEN_FLESH = VANILLA_FOOD_OVERRIDE.register("rotten_flesh", NormalFoodItem::new);
    public static final RegistryObject<Item> CARROT = VANILLA_FOOD_OVERRIDE.register("carrot", NormalFoodItem::new);
    public static final RegistryObject<Item> POTATO = VANILLA_FOOD_OVERRIDE.register("potato", NormalFoodItem::new);
    public static final RegistryObject<Item> BAKED_POTATO = VANILLA_FOOD_OVERRIDE.register("baked_potato", NormalFoodItem::new);
    public static final RegistryObject<Item> POISONOUS_POTATO = VANILLA_FOOD_OVERRIDE.register("poisonous_potato", NormalFoodItem::new);
    public static final RegistryObject<Item> GOLDEN_CARROT = VANILLA_FOOD_OVERRIDE.register("golden_carrot", NormalFoodItem::new);
    public static final RegistryObject<Item> PUMPKIN_PIE = VANILLA_FOOD_OVERRIDE.register("pumpkin_pie", NormalFoodItem::new);
    public static final RegistryObject<Item> RAW_RABBIT = VANILLA_FOOD_OVERRIDE.register("rabbit", NormalFoodItem::new);
    public static final RegistryObject<Item> COOKED_RABBIT = VANILLA_FOOD_OVERRIDE.register("cooked_rabbit", NormalFoodItem::new);
    public static final RegistryObject<Item> RAW_MUTTON = VANILLA_FOOD_OVERRIDE.register("mutton", NormalFoodItem::new);
    public static final RegistryObject<Item> COOKED_MUTTON = VANILLA_FOOD_OVERRIDE.register("cooked_mutton", NormalFoodItem::new);
    public static final RegistryObject<Item> CHORUS_FRUIT = VANILLA_FOOD_OVERRIDE.register("chorus_fruit", NormalFoodItem::new);
    public static final RegistryObject<Item> BEETROOT = VANILLA_FOOD_OVERRIDE.register("beetroot", NormalFoodItem::new);
    public static final RegistryObject<Item> SWEET_BERRIES = VANILLA_FOOD_OVERRIDE.register("sweet_berries", NormalFoodItem::new);

    // bottled food items

    public static final RegistryObject<Item> HONEY_BOTTLE = VANILLA_FOOD_OVERRIDE.register("honey_bottle", BottleFoodItem::new);

    // soup food items

    public static final RegistryObject<Item> BEETROOT_SOUP = VANILLA_FOOD_OVERRIDE.register("beetroot_soup", SoupFoodItem::new);
    public static final RegistryObject<Item> MUSHROOM_STEW = VANILLA_FOOD_OVERRIDE.register("mushroom_stew", SoupFoodItem::new);
    public static final RegistryObject<Item> RABBIT_STEW = VANILLA_FOOD_OVERRIDE.register("rabbit_stew", SoupFoodItem::new);
    public static final RegistryObject<Item> SUSPICIOUS_STEW = VANILLA_FOOD_OVERRIDE.register("suspicious_stew", SoupFoodItem::new);

}
