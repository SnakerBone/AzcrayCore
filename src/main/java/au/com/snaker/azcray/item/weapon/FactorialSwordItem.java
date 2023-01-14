package au.com.snaker.azcray.item.weapon;

import au.com.snaker.azcray.util.AttackTypeUtil;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class FactorialSwordItem extends SwordItem {

    public FactorialSwordItem(IItemTier tier, int damage, float speed, Properties properties) {
        super(tier, damage, speed, properties);
    }

    @Override
    public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {
        AttackTypeUtil.attackAOE((PlayerEntity) entity);
        return super.onEntitySwing(stack, entity);
    }
}
