package com.snaker.azcray.init;

import com.snaker.azcray.AzcrayMod;
import com.snaker.azcray.effect.TeleportEffect;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEffectsInit {

    public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, AzcrayMod.MOD_ID);

    public static final RegistryObject<Effect> TELEPORT = EFFECTS.register("teleport", () -> new TeleportEffect(EffectType.NEUTRAL, 1));
}
