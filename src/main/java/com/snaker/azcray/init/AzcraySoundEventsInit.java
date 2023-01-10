package com.snaker.azcray.init;

import com.snaker.azcray.data.Const;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AzcraySoundEventsInit {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Const.MOD_ID);

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Const.MOD_ID, name)));
    }
    public static final RegistryObject<SoundEvent> PORTER_TELEPORT = registerSoundEvent("porter_teleport");

}
