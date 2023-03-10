package au.com.snaker.azcraycore.item.override;

import au.com.snaker.azcraycore.event.VanillaFoodConsumedEvent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;

public class EnchantedGoldenAppleOverride extends EnchantedGoldenAppleItem
{
    public EnchantedGoldenAppleOverride()
    {
        super(new Properties().group(ItemGroup.FOOD).food(new Food.Builder().setAlwaysEdible().build()));
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity livingEntity)
    {
        ItemStack itemstack = super.onItemUseFinish(itemStack, world, livingEntity);
        if(!world.isRemote)
        {
            VanillaFoodConsumedEvent.executeEvent(livingEntity);
        }
        return itemstack;
    }
}
