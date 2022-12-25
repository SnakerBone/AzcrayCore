package com.snaker.azcray.item.custom;

import com.snaker.azcray.init.ModEffectsInit;
import net.minecraft.item.Food;
import net.minecraft.item.HoneyBottleItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class BottleFoodModItem extends HoneyBottleItem {

    public BottleFoodModItem() {
        super(new Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .effect(() -> new EffectInstance(Effects.SPEED, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.SLOWNESS, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.HASTE, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.MINING_FATIGUE, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.STRENGTH, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.INSTANT_HEALTH, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.INSTANT_DAMAGE, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.JUMP_BOOST, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.NAUSEA, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.REGENERATION, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.RESISTANCE, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.WATER_BREATHING, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.INVISIBILITY, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.BLINDNESS, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.NIGHT_VISION, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.HUNGER, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.WEAKNESS, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.POISON, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.WITHER, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.ABSORPTION, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.SATURATION, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.GLOWING, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.LEVITATION, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.LUCK, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.UNLUCK, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.SLOW_FALLING, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.CONDUIT_POWER, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.DOLPHINS_GRACE, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.BAD_OMEN, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 120, 0), 1)
                        .effect(() -> new EffectInstance(ModEffectsInit.TELEPORT.get(), 120, 0), 1)
                        .build()
                )
        );
    }
}
