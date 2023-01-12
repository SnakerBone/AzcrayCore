package au.com.snaker.azcray.init;

import au.com.snaker.azcray.data.Const;
import au.com.snaker.azcray.effect.TeleportEffect;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AzcrayEffectInit
{
    public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, Const.MOD_ID);
    public static final RegistryObject<Effect> TELEPORT = EFFECTS.register("teleport", () -> new TeleportEffect(EffectType.NEUTRAL, 1));
}

