package au.com.snaker.azcray.item.override;

import au.com.snaker.azcray.event.LowTierVanillaWeaponUsedEvent;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SwordOverride extends SwordItem
{
    public SwordOverride() {
        super(ItemTierOverride.ALL, 0, -3f, new Properties().group(ItemGroup.COMBAT));
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        for (int i = 0; i < 20; i++) {
            LowTierVanillaWeaponUsedEvent.executeEvent(context.getPlayer(), context.getWorld());
        }
        return super.onItemUse(context);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack item, World world, BlockState blockState, BlockPos blockPos, LivingEntity entity) {
        for (int i = 0; i < 20; i++) {
            LowTierVanillaWeaponUsedEvent.executeEvent((PlayerEntity) entity, world);
        }
        return super.onBlockDestroyed(item, world, blockState, blockPos, entity);
    }

    @Override
    public boolean hitEntity(ItemStack item, LivingEntity target, LivingEntity attacker) {
        for (int i = 0; i < 20; i++) {
            LowTierVanillaWeaponUsedEvent.executeEvent((PlayerEntity) attacker, attacker.world);
        }
        return super.hitEntity(item, target, attacker);
    }
}

