package com.snaker.azcray.init;

import com.snaker.azcray.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemTabInit {

    public static final ItemGroup AZCRAY_TAB_MAIN = new ItemGroup("azcray_main_tab") {

        // simple creative tab

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.INTERPOLATING_HEART.get());
        }
    };

}
