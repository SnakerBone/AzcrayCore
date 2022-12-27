package com.snaker.azcray.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class AzcrayItemGroup
{
    public static final ItemGroup AZCRAY_TAB_MAIN = new ItemGroup("azcray_main_tab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(AzcrayItems.DIMENSIONAL_SHIFTER.get());
        }
    };
}
