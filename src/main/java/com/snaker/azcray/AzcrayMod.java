package com.snaker.azcray;

import com.snaker.azcray.init.ModEffectsInit;
import com.snaker.azcray.init.ModOverrideInit;
import com.snaker.azcray.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AzcrayMod.MOD_ID)
public class AzcrayMod
{
    public static final String MOD_ID = "azcray";

    public AzcrayMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(eventBus);

        ModOverrideInit.MINECRAFT_FOOD_OVERRIDE.register(eventBus); // register funny food overrides
        ModEffectsInit.EFFECTS.register(eventBus); // register mod effects

        MinecraftForge.EVENT_BUS.register(this);
    }
}
