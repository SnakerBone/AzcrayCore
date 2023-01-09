package com.snaker.azcray.item.override;

import com.snaker.azcray.event.LowTierVanillaWeaponUsedEvent;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class SwordOverride extends SwordItem
{
    public SwordOverride()
    {
        super(ItemTierOverride.ALL, 0, -3f, new Properties().group(ItemGroup.COMBAT));
    }

    @Override
    public boolean onBlockDestroyed(ItemStack itemStack, World world, BlockState blockState, BlockPos blockPos, LivingEntity livingEntity)
    {
        if(!livingEntity.world.isRemote)
        {
            itemStack.damageItem(2147483647, livingEntity, (entity) ->
            {
                entity.playSound(SoundEvents.ENTITY_ITEM_BREAK, 1f, 1f);
                entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
            });
            for(int i = 0; i<20; i++)
            {
                Double posX = livingEntity.getPosX();
                Double posY = livingEntity.getPosY();
                Double posZ = livingEntity.getPosZ();
                LowTierVanillaWeaponUsedEvent.executeEvent(Stream.of(
                        new AbstractMap.SimpleEntry<>("world", livingEntity.world), new AbstractMap.SimpleEntry<>("x", posX),
                        new AbstractMap.SimpleEntry<>("y", posY),
                        new AbstractMap.SimpleEntry<>("z", posZ),
                        new AbstractMap.SimpleEntry<>("entity", livingEntity)).collect(HashMap::new,
                        (map, entry) -> map.put(entry.getKey(), entry.getValue()), Map::putAll));
            }
        }
        return true;
    }

    @Override
    public boolean hitEntity(ItemStack itemStack, LivingEntity livingEntityTarget, LivingEntity livingEntityAttacker)
    {
        if(!livingEntityAttacker.world.isRemote)
        {
            itemStack.damageItem(2147483647, livingEntityAttacker, (entity) ->
            {
                entity.playSound(SoundEvents.ENTITY_ITEM_BREAK, 1f, 1f);
                entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
            });
            for(int i = 0; i<20; i++)
            {
                Double posX = livingEntityAttacker.getPosX();
                Double posY = livingEntityAttacker.getPosY();
                Double posZ = livingEntityAttacker.getPosZ();
                LowTierVanillaWeaponUsedEvent.executeEvent(Stream.of(
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

