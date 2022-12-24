package com.snaker.azcray.init;

import com.snaker.azcray.item.other.*;
import net.minecraft.item.Item;
import net.minecraft.item.WritableBookItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModOverrideInit extends Item {
    public ModOverrideInit(Properties properties) {
        super(properties);
    }

    // register

    public static final DeferredRegister<Item> MINECRAFT_FOOD_OVERRIDE = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static final DeferredRegister<Item> MINECRAFT_WRITTEN_BOOK_OVERRIDE = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    // normal food items

    public static final RegistryObject<Item> APPLE = MINECRAFT_FOOD_OVERRIDE.register("apple", NormalFoodItem::new);
    public static final RegistryObject<Item> BREAD = MINECRAFT_FOOD_OVERRIDE.register("bread", NormalFoodItem::new);
    public static final RegistryObject<Item> RAW_PORKCHOP = MINECRAFT_FOOD_OVERRIDE.register("porkchop", NormalFoodItem::new);
    public static final RegistryObject<Item> COOKED_PORKCHOP = MINECRAFT_FOOD_OVERRIDE.register("cooked_porkchop", NormalFoodItem::new);
    public static final RegistryObject<Item> GOLDEN_APPLE = MINECRAFT_FOOD_OVERRIDE.register("golden_apple", NormalFoodItem::new);
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_APPLE = MINECRAFT_FOOD_OVERRIDE.register("enchanted_golden_apple", NormalFoodItem::new);
    public static final RegistryObject<Item> RAW_COD = MINECRAFT_FOOD_OVERRIDE.register("cod", NormalFoodItem::new);
    public static final RegistryObject<Item> RAW_SALMON = MINECRAFT_FOOD_OVERRIDE.register("salmon", NormalFoodItem::new);
    public static final RegistryObject<Item> TROPICAL_FISH = MINECRAFT_FOOD_OVERRIDE.register("tropical_fish", NormalFoodItem::new);
    public static final RegistryObject<Item> PUFFERFISH = MINECRAFT_FOOD_OVERRIDE.register("pufferfish", NormalFoodItem::new);
    public static final RegistryObject<Item> COOKED_COD = MINECRAFT_FOOD_OVERRIDE.register("cooked_cod", NormalFoodItem::new);
    public static final RegistryObject<Item> COOKED_SALMON = MINECRAFT_FOOD_OVERRIDE.register("cooked_salmon", NormalFoodItem::new);
    public static final RegistryObject<Item> COOKIE = MINECRAFT_FOOD_OVERRIDE.register("cookie", NormalFoodItem::new);
    public static final RegistryObject<Item> MELON_SLICE = MINECRAFT_FOOD_OVERRIDE.register("melon_slice", NormalFoodItem::new);
    public static final RegistryObject<Item> DRIED_KELP = MINECRAFT_FOOD_OVERRIDE.register("dried_kelp", NormalFoodItem::new);
    public static final RegistryObject<Item> RAW_BEEF = MINECRAFT_FOOD_OVERRIDE.register("beef", NormalFoodItem::new);
    public static final RegistryObject<Item> STEAK = MINECRAFT_FOOD_OVERRIDE.register("cooked_beef", NormalFoodItem::new);
    public static final RegistryObject<Item> RAW_CHICKEN = MINECRAFT_FOOD_OVERRIDE.register("chicken", NormalFoodItem::new);
    public static final RegistryObject<Item> COOKED_CHICKEN = MINECRAFT_FOOD_OVERRIDE.register("cooked_chicken", NormalFoodItem::new);
    public static final RegistryObject<Item> ROTTEN_FLESH = MINECRAFT_FOOD_OVERRIDE.register("rotten_flesh", NormalFoodItem::new);
    public static final RegistryObject<Item> CARROT = MINECRAFT_FOOD_OVERRIDE.register("carrot", NormalFoodItem::new);
    public static final RegistryObject<Item> POTATO = MINECRAFT_FOOD_OVERRIDE.register("potato", NormalFoodItem::new);
    public static final RegistryObject<Item> BAKED_POTATO = MINECRAFT_FOOD_OVERRIDE.register("baked_potato", NormalFoodItem::new);
    public static final RegistryObject<Item> POISONOUS_POTATO = MINECRAFT_FOOD_OVERRIDE.register("poisonous_potato", NormalFoodItem::new);
    public static final RegistryObject<Item> GOLDEN_CARROT = MINECRAFT_FOOD_OVERRIDE.register("golden_carrot", NormalFoodItem::new);
    public static final RegistryObject<Item> PUMPKIN_PIE = MINECRAFT_FOOD_OVERRIDE.register("pumpkin_pie", NormalFoodItem::new);
    public static final RegistryObject<Item> RAW_RABBIT = MINECRAFT_FOOD_OVERRIDE.register("rabbit", NormalFoodItem::new);
    public static final RegistryObject<Item> COOKED_RABBIT = MINECRAFT_FOOD_OVERRIDE.register("cooked_rabbit", NormalFoodItem::new);
    public static final RegistryObject<Item> RAW_MUTTON = MINECRAFT_FOOD_OVERRIDE.register("mutton", NormalFoodItem::new);
    public static final RegistryObject<Item> COOKED_MUTTON = MINECRAFT_FOOD_OVERRIDE.register("cooked_mutton", NormalFoodItem::new);
    public static final RegistryObject<Item> CHORUS_FRUIT = MINECRAFT_FOOD_OVERRIDE.register("chorus_fruit", NormalFoodItem::new);
    public static final RegistryObject<Item> BEETROOT = MINECRAFT_FOOD_OVERRIDE.register("beetroot", NormalFoodItem::new);
    public static final RegistryObject<Item> SWEET_BERRIES = MINECRAFT_FOOD_OVERRIDE.register("sweet_berries", NormalFoodItem::new);

    // bottled food items

    public static final RegistryObject<Item> HONEY_BOTTLE = MINECRAFT_FOOD_OVERRIDE.register("honey_bottle", BottleFoodItem::new);

    // soup food items

    public static final RegistryObject<Item> BEETROOT_SOUP = MINECRAFT_FOOD_OVERRIDE.register("beetroot_soup", SoupFoodItem::new);
    public static final RegistryObject<Item> MUSHROOM_STEW = MINECRAFT_FOOD_OVERRIDE.register("mushroom_stew", SoupFoodItem::new);
    public static final RegistryObject<Item> RABBIT_STEW = MINECRAFT_FOOD_OVERRIDE.register("rabbit_stew", SoupFoodItem::new);
    public static final RegistryObject<Item> SUSPICIOUS_STEW = MINECRAFT_FOOD_OVERRIDE.register("suspicious_stew", SoupFoodItem::new);

    // written book items

    public static final RegistryObject<Item> WRITTEN_BOOK = MINECRAFT_WRITTEN_BOOK_OVERRIDE.register("written_book", WrittenBookModItem::new);
    public static final RegistryObject<Item> WRITABLE_BOOK = MINECRAFT_WRITTEN_BOOK_OVERRIDE.register("writable_book", WritableBookModItem::new);
}
