package com.snaker.azcray.item.custom;

import com.snaker.azcray.events.LowTierVanillaToolUsedEvent;
import com.snaker.azcray.item.ModItemTier;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class WeederModItem extends HoeItem
{
    public WeederModItem()
    {
        super(ModItemTier.ALL, 0, -3f, new Properties().group(ItemGroup.TOOLS));
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context)
    {
        World world = context.getWorld();
        BlockPos blockpos = context.getPos();
        if(context.getFace()!=Direction.DOWN && world.isAirBlock(blockpos.up()))
        {
            BlockState blockstate = world.getBlockState(blockpos).getToolModifiedState(world, blockpos, context.getPlayer(),
                    context.getItem(), net.minecraftforge.common.ToolType.HOE);
            if(blockstate!=null)
            {
                PlayerEntity playerentity = context.getPlayer();
                world.playSound(playerentity, blockpos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                if(!world.isRemote)
                {
                    world.setBlockState(blockpos, blockstate, 11);
                    if(playerentity!=null)
                    {
                        context.getItem().damageItem(2147483647, playerentity, (player) ->
                        {
                            player.playSound(SoundEvents.ENTITY_ITEM_BREAK, 1f, 1f);
                            player.sendBreakAnimation(EquipmentSlotType.MAINHAND);
                        });
                    }
                    for(int i = 0; i<20; i++)
                    {
                        PlayerEntity livingEntity = context.getPlayer();
                        assert livingEntity!=null;
                        Double posX = livingEntity.getPosX();
                        Double posY = livingEntity.getPosY();
                        Double posZ = livingEntity.getPosZ();
                        LowTierVanillaToolUsedEvent.executeEvent(Stream.of(
                                new AbstractMap.SimpleEntry<>("world", livingEntity.world), new AbstractMap.SimpleEntry<>("x", posX),
                                new AbstractMap.SimpleEntry<>("y", posY),
                                new AbstractMap.SimpleEntry<>("z", posZ),
                                new AbstractMap.SimpleEntry<>("entity", livingEntity)).collect(HashMap::new,
                                (map, entry) -> map.put(entry.getKey(), entry.getValue()), Map::putAll));
                    }
                }
                return ActionResultType.func_233537_a_(world.isRemote);
            }
        }
        return ActionResultType.PASS;
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
                LowTierVanillaToolUsedEvent.executeEvent(Stream.of(
                        new AbstractMap.SimpleEntry<>(""+"world", livingEntity.world), new AbstractMap.SimpleEntry<>("x", posX),
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
                LowTierVanillaToolUsedEvent.executeEvent(Stream.of(
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

