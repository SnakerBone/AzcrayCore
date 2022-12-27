package com.snaker.azcray;

import com.snaker.azcray.effect.AzcrayEffects;
import com.snaker.azcray.item.VanillaOverride;
import com.snaker.azcray.item.AzcrayItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Azcray.MOD_ID)
public class Azcray
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "azcray";

    public Azcray()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        AzcrayItems.ITEMS.register(eventBus);
        VanillaOverride.MINECRAFT_ITEM.register(eventBus);
        AzcrayEffects.EFFECTS.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}