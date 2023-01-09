package com.snaker.azcray.item.override;

import com.snaker.azcray.event.VanillaFoodConsumedEvent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ChorusFruitItem;
import net.minecraft.item.Food;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ChorusFruitOverride extends ChorusFruitItem
{
    public ChorusFruitOverride()
    {
        super(new Properties().group(ItemGroup.FOOD).food(new Food.Builder().setAlwaysEdible().build()));
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity livingEntity)
    {
        ItemStack itemstack = super.onItemUseFinish(itemStack, world, livingEntity);
        if(!world.isRemote)
        {
            VanillaFoodConsumedEvent.executeEvent(livingEntity);
        }
        return itemstack;
    }
}
