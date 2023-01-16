package au.com.snaker.azcraycore;

import au.com.snaker.azcraycore.data.Const;
import au.com.snaker.azcraycore.init.AzcrayCoreEffectInit;
import au.com.snaker.azcraycore.init.AzcrayCoreVanillaOverrideInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Const.MOD_ID)
public class AzcrayCore
{
    public static final Logger LOGGER = LogManager.getLogger();

    public AzcrayCore()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        AzcrayCoreVanillaOverrideInit.MINECRAFT_ITEM.register(eventBus);
        AzcrayCoreEffectInit.EFFECTS.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}