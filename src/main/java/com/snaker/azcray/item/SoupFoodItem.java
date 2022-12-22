package com.snaker.azcray.item;

import com.snaker.azcray.init.ModEffectsInit;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SoupItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SoupFoodItem extends SoupItem {
    public SoupFoodItem(Properties pProperties) {
        super(pProperties);
    }

    // soup food overrides

    public SoupFoodItem() {
        super(new Item.Properties()
                .tab(ItemGroup.TAB_FOOD)
                .food(new Food.Builder()
                        .effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.DIG_SPEED, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.DIG_SLOWDOWN, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.DAMAGE_BOOST, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.HEAL, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.HARM, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.JUMP, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.CONFUSION, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.REGENERATION, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.DAMAGE_RESISTANCE, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.WATER_BREATHING, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.INVISIBILITY, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.BLINDNESS, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.NIGHT_VISION, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.HUNGER, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.WEAKNESS, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.POISON, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.WITHER, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.ABSORPTION, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.SATURATION, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.GLOWING, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.LEVITATION, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.LUCK, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.UNLUCK, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.SLOW_FALLING, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.CONDUIT_POWER, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.DOLPHINS_GRACE, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.BAD_OMEN, 250, 0), 1)
                        .effect(() -> new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 250, 0), 1)
                        .effect(() -> new EffectInstance(ModEffectsInit.TP_SICKNESS.get(), 250, 0), 1)
                        .build()
                )
        );
    }
}
