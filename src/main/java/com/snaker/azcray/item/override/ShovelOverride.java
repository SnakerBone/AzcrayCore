package com.snaker.azcray.item.override;

import com.snaker.azcray.event.LowTierVanillaToolUsedEvent;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ShovelOverride extends ShovelItem
{
    public ShovelOverride() {
        super(ItemTierOverride.ALL, 1.5f, -3f, new Properties().group(ItemGroup.TOOLS));
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        for (int i = 0; i < 20; i++) {
            LowTierVanillaToolUsedEvent.executeEvent(context.getPlayer(), context.getWorld());
        }
        return super.onItemUse(context);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack item, World world, BlockState blockState, BlockPos blockPos, LivingEntity entity) {
        if (entity instanceof PlayerEntity) {
            for (int i = 0; i < 20; i++) {
                LowTierVanillaToolUsedEvent.executeEvent((PlayerEntity) entity, world);
            }
        }
        return super.onBlockDestroyed(item, world, blockState, blockPos, entity);
    }

    @Override
    public boolean hitEntity(ItemStack item, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity) {
            for (int i = 0; i < 20; i++) {
                LowTierVanillaToolUsedEvent.executeEvent((PlayerEntity) attacker, attacker.world);
            }
        }
        return true;
    }
}

