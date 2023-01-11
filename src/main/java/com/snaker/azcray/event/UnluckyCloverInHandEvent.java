package com.snaker.azcray.event;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class UnluckyCloverInHandEvent {
    public static void executeEvent(LivingEntity entity, World world) {
        if (!world.isRemote) {
            entity.addPotionEffect(new EffectInstance(Effects.UNLUCK, 200, 0));
        }
    }
}
