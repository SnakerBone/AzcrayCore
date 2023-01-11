package com.snaker.azcray.item.clover;

import com.snaker.azcray.event.UnluckyCloverInHandEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class UnluckyCloverItem extends Item {
    public UnluckyCloverItem(Properties properties) {
        super(properties);
    }

    @Override
    public void inventoryTick(ItemStack item, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(item, world, entity, slot, selected);
        if (selected) {
            UnluckyCloverInHandEvent.executeEvent((LivingEntity) entity, world);
        }
    }
}
