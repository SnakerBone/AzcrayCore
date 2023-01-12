package au.com.snaker.azcray.item.clover;

import au.com.snaker.azcray.event.LuckyCloverInHandEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LuckyCloverItem extends Item {
    public LuckyCloverItem(Properties properties) {
        super(properties);
    }

    @Override
    public void inventoryTick(ItemStack item, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(item, world, entity, slot, selected);
        if (selected) {
            LuckyCloverInHandEvent.executeEvent((LivingEntity) entity, world);
        }
    }
}
