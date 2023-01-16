package au.com.snaker.azcray.init;

import au.com.snaker.azcray.data.Const;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AzcrayItemInit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Const.MOD_ID);
    public static final RegistryObject<Item> INTERPOLATING_HEART = ITEMS.register("interpolating_heart", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> AZCRAY_HEART = ITEMS.register("azcray_heart", () ->
            new Item(new Item.Properties()));
}