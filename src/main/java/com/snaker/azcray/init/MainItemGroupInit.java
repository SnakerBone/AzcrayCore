package com.snaker.azcray.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class MainItemGroupInit extends ItemGroup
{
    public MainItemGroupInit(String string) {
        super(string);
    }

    public static final ItemGroup AZCRAY_MAIN = new MainItemGroupInit("azcray_main");

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ItemInit.DIMENSIONAL_SHIFTER.get());
    }

    @Override
    public void fill(NonNullList<ItemStack> items) {
        super.fill(items);
    }
}
