package au.com.snaker.azcray;

import au.com.snaker.azcray.data.Const;
import au.com.snaker.azcray.init.AzcrayEffectInit;
import au.com.snaker.azcray.init.AzcrayVanillaOverrideInit;
import au.com.snaker.azcray.init.AzcrayItemInit;
import au.com.snaker.azcray.init.AzcraySoundEventsInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Const.MOD_ID)
public class Azcray
{
    public static final Logger LOGGER = LogManager.getLogger();

    public Azcray()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        AzcrayItemInit.ITEMS.register(eventBus);
        AzcrayVanillaOverrideInit.MINECRAFT_ITEM.register(eventBus);
        AzcrayEffectInit.EFFECTS.register(eventBus);
        AzcraySoundEventsInit.SOUND_EVENTS.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}