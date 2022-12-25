package com.snaker.azcray.item.custom;

import com.snaker.azcray.events.LightningBoltEvent;
import com.snaker.azcray.item.ModItemTier;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class SwordModItem extends SwordItem {
    public SwordModItem() {
        super(ModItemTier.ALL, 0, -3f, new Properties().group(ItemGroup.COMBAT));
    }

    // sword overrides

    @Override
    public float getDestroySpeed(ItemStack itemStack, BlockState blockState) {
        return 0.000000001F;
    }

    @Override
    public boolean canHarvestBlock(BlockState blockState) {
        return false;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack itemStack, World world, BlockState blockState, BlockPos blockPos, LivingEntity livingEntity) {
        return false;
    }

    public boolean isDamageable(DamageSource damageSource) {
        return true;
    }

    @Override
    public boolean hitEntity(ItemStack itemStack, LivingEntity livingEntityTarget, LivingEntity livingEntityAttacker) {
        if(!livingEntityAttacker.world.isRemote) {

            // instantly break ItemStack

            itemStack.damageItem(2147483647, livingEntityAttacker, (entity) -> {
                livingEntityAttacker.playSound(SoundEvents.ENTITY_ITEM_BREAK, 1f, 1f);
                entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
            });

            for (int i = 0; i < 20; i++) {

                Double posX = livingEntityAttacker.getPosX();
                Double posY = livingEntityAttacker.getPosY();
                Double posZ = livingEntityAttacker.getPosZ();

                // yes this is real, you are not seeing things

                LightningBoltEvent.executeEvent(Stream.of(
                        new AbstractMap.SimpleEntry<>("world", livingEntityAttacker.world), new AbstractMap.SimpleEntry<>("x", posX),
                        new AbstractMap.SimpleEntry<>("y", posY),
                        new AbstractMap.SimpleEntry<>("z", posZ),
                        new AbstractMap.SimpleEntry<>("entity", livingEntityAttacker)).collect(HashMap::new,
                (map, entry) -> map.put(entry.getKey(), entry.getValue()), Map::putAll));
            }
        }

        return true;
    }
}
