package au.com.snaker.azcraycore;

import au.com.snaker.azcraycore.data.Const;
import au.com.snaker.azcraycore.init.AzcrayCoreEffectInit;
import au.com.snaker.azcraycore.init.AzcrayCoreVanillaOverrideInit;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

@Mod(Const.MOD_ID)
public class AzcrayCore {
    public static final Logger LOGGER = LogManager.getLogger();

    public AzcrayCore()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        AzcrayCoreVanillaOverrideInit.MINECRAFT_ITEM.register(eventBus);
        AzcrayCoreEffectInit.EFFECTS.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);

        eventBus.addListener(this::doClientStuff);
    }

    public void doClientStuff(final FMLClientSetupEvent event) {
        try {
            InputStream icon16 = Minecraft.getInstance().getResourceManager().getResource(new ResourceLocation(Const.MOD_ID, "icons/icon16.png")).getInputStream();
            InputStream icon32 = Minecraft.getInstance().getResourceManager().getResource(new ResourceLocation(Const.MOD_ID, "icons/icon32.png")).getInputStream();
            Minecraft.getInstance().getMainWindow().setWindowIcon(icon16, icon32);
        } catch (IOException ioException) {
            LOGGER.error("failed");
        }
    }
}