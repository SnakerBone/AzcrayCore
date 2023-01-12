package au.com.snaker.azcray.event;

import au.com.snaker.azcray.init.AzcrayEffectInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class VanillaFoodConsumedEvent {
    public static void executeEvent(LivingEntity entity) {
        if(entity instanceof PlayerEntity) {
            ITextComponent vanillaFoodConsumedStatus = new TranslationTextComponent("status.azcray.vanilla_food_consumed");

            ((PlayerEntity) entity).sendStatusMessage(vanillaFoodConsumedStatus, true);
            
            entity.addPotionEffect(new EffectInstance(Effects.BLINDNESS, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.SPEED, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.HASTE, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.STRENGTH, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.INSTANT_DAMAGE, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.NAUSEA, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.REGENERATION, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.HUNGER, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.POISON, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.WITHER, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.SATURATION, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.GLOWING, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.LEVITATION, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.LUCK, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.UNLUCK, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.CONDUIT_POWER, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.BAD_OMEN, 250, 1));
            entity.addPotionEffect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 250, 1));
            entity.addPotionEffect(new EffectInstance(AzcrayEffectInit.TELEPORT.get(), 250, 1));
        }
    }
}
