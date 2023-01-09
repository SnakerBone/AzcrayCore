package com.snaker.azcray.item.override;

import com.snaker.azcray.event.VanillaFoodConsumedEvent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;

public class SoupOverride extends SoupItem
{
    public SoupOverride()
    {
        super(new Properties().group(ItemGroup.FOOD).maxStackSize(1).food(new Food.Builder().build()));
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity livingEntity)
    {
        ItemStack itemstack = super.onItemUseFinish(itemStack, world, livingEntity);
        if(livingEntity instanceof PlayerEntity)
        {
            VanillaFoodConsumedEvent.executeEvent(livingEntity);
        }
        return livingEntity instanceof PlayerEntity && ((PlayerEntity) livingEntity).abilities.isCreativeMode ? itemstack:new ItemStack(Items.BOWL);
    }
}
