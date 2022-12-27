package com.snaker.azcray.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AwakenedItem extends Item
{
    public AwakenedItem(Properties properties)
    {
        super(properties);
    }

    @Override
    public boolean hasEffect(ItemStack stack) // lol
    {
        return true;
    }
}