package au.com.snaker.azcraycore;

import au.com.snaker.azcraycore.data.Const;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartedEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.server.FMLServerStoppingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = Const.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AzcrayCoreSubscriptions {

    public static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public void onCommonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Hello from common setup");
        System.out.print("Hello from common setup");
    }

    @SubscribeEvent
    public void onClientSetup(FMLClientSetupEvent event) {
        LOGGER.info("Hello from client setup");
        System.out.print("Hello from client setup");
    }

    @SubscribeEvent
    public void onServerStarted(FMLServerStartedEvent event) {
        LOGGER.info("Hello from server started");
        System.out.print("Hello from sever started");
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        LOGGER.info("Hello from server starting");
        System.out.print("Hello from sever starting");
    }

    @SubscribeEvent
    public void onServerStopped(FMLServerStartedEvent event) {
        LOGGER.info("Hello from server stopped");
        System.out.print("Hello from server stopped");
    }

    @SubscribeEvent
    public void onServerStopping(FMLServerStoppingEvent event) {
        LOGGER.info("Hello from server stopping");
        System.out.print("Hello from server stopping");
    }
}
