package com.snaker.azcray.item;

import com.snaker.azcray.init.ModEffectsInit;
import net.minecraft.item.Food;
import net.minecraft.item.HoneyBottleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class BottleFoodItem extends HoneyBottleItem {
    public BottleFoodItem(Properties pProperties) {
        super(pProperties);
    }

    // bottled food overrides

    public BottleFoodItem() {
        super(new Item.Properties()
                .tab(ItemGroup.TAB_FOOD)
                .food(new Food.Builder()
                        .effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.DIG_SPEED, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.DIG_SLOWDOWN, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.DAMAGE_BOOST, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.HEAL, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.HARM, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.JUMP, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.CONFUSION, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.REGENERATION, 120, 0), 1)
                        .effect(() -> new EffectInstance(Effects.DAMAGE_RESISTANCE, 120, 0), 1)
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
                        .effect(() -> new EffectInstance(ModEffectsInit.TP_SICKNESS.get(), 120, 0), 1)
                        .build()
                )
        );
    }
}
