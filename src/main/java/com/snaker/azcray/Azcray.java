package com.snaker.azcray;

import com.snaker.azcray.init.ModEffectsInit;
import com.snaker.azcray.init.ModOverrideInit;
import com.snaker.azcray.item.ModItems;
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

    public Azcray() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(eventBus);

        ModOverrideInit.MINECRAFT_WRITTEN_BOOK_OVERRIDE.register(eventBus); // register book overrides
        ModOverrideInit.MINECRAFT_FOOD_OVERRIDE.register(eventBus); // register funny food overrides
        ModEffectsInit.EFFECTS.register(eventBus); // register mod effects

        MinecraftForge.EVENT_BUS.register(this);
    }
}
