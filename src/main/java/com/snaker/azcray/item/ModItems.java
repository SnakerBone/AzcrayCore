package com.snaker.azcray.item;

import com.snaker.azcray.AzcrayMod;
import com.snaker.azcray.init.ModItemTabInit;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AzcrayMod.MOD_ID);

    public static final RegistryObject<Item> INTERPOLATING_HEART = ITEMS.register("interpolating_heart",
            () -> new Item(new Item.Properties().tab(ModItemTabInit.AZCRAY_TAB_MAIN)));
    public static final RegistryObject<Item> AZCRAY_HEART = ITEMS.register("azcray_heart",
            () -> new Item(new Item.Properties().tab(ModItemTabInit.AZCRAY_TAB_MAIN)));
}
