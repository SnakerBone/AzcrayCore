package com.snaker.azcray.item.override;

import com.snaker.azcray.events.VanillaFoodConsumedEvent;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.*;
import net.minecraft.stats.Stats;
import net.minecraft.world.World;

public class HoneyBottleOverride extends HoneyBottleItem
{
    public HoneyBottleOverride()
    {
        super(new Properties().group(ItemGroup.FOOD).maxStackSize(16).food(new Food.Builder().build()));
    }

    public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity livingEntity)
    {
        super.onItemUseFinish(itemStack, world, livingEntity);
        if(livingEntity instanceof ServerPlayerEntity)
        {
            VanillaFoodConsumedEvent.executeEvent(livingEntity);
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity) livingEntity;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, itemStack);
            serverplayerentity.addStat(Stats.ITEM_USED.get(this));
        }
        if(itemStack.isEmpty())
        {
            return new ItemStack(Items.GLASS_BOTTLE);
        } else
        {
            if(livingEntity instanceof PlayerEntity && !((PlayerEntity) livingEntity).abilities.isCreativeMode)
            {
                ItemStack stack = new ItemStack(Items.GLASS_BOTTLE);
                PlayerEntity playerentity = (PlayerEntity) livingEntity;
                if(!playerentity.inventory.addItemStackToInventory(stack))
                {
                    playerentity.dropItem(stack, false);
                }
            }
            return itemStack;
        }
    }
}
