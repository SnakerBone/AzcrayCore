package com.snaker.azcray.item.weapon;

import com.snaker.azcray.util.AttackTypeUtil;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CatalysticSwordItem extends SwordItem {

    public CatalysticSwordItem(IItemTier tier, int damage, float speed, Properties properties) {
        super(tier, damage, speed, properties);
    }

    @Override
    public boolean hitEntity(ItemStack item, LivingEntity target, LivingEntity attacker) {
        AttackTypeUtil.attackAOE(item, target, attacker);
        target.addPotionEffect(new EffectInstance(Effects.WITHER, 200));
        return super.hitEntity(item, target, attacker);
    }
}
