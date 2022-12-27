package com.snaker.azcray.effect;

import com.snaker.azcray.Azcray;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AzcrayEffects
{
    public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, Azcray.MOD_ID);
    public static final RegistryObject<Effect> TELEPORT = EFFECTS.register("teleport", () -> new TeleportEffect(EffectType.NEUTRAL, 1));
}

