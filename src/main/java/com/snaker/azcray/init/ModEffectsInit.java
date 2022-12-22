package com.snaker.azcray.init;

import com.snaker.azcray.AzcrayMod;
import com.snaker.azcray.effect.TeleportSicknessEffect;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEffectsInit {

    public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, AzcrayMod.MOD_ID);

    public static final RegistryObject<Effect> TP_SICKNESS = EFFECTS.register("tp_sickness", () -> new TeleportSicknessEffect(EffectType.NEUTRAL, 1));
}
