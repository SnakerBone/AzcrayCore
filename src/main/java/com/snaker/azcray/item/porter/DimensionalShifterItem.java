package com.snaker.azcray.item.porter;

import com.snaker.azcray.data.Const;
import com.snaker.azcray.init.AzcrayItemInit;
import com.snaker.azcray.init.AzcraySoundEventsInit;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class DimensionalShifterItem extends Item {
    public DimensionalShifterItem(Properties properties) {
        super(properties);
    }
    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        if(Screen.hasShiftDown())
        {
            tooltip.add(new TranslationTextComponent("tooltip.azcray.dimensional_shifter"));
            tooltip.add(new TranslationTextComponent("tooltip.azcray.porter_warning"));
        } else
        {
            tooltip.add(new TranslationTextComponent("tooltip.azcray.press_shift"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {

        if (!world.isRemote) {
            double posX = world.getRandom().nextInt(Const.LARGE_RADIAL_BOUND);
            double posY = world.getRandom().nextInt((Const.UPPER_BOUND-Const.LOWER_BOUND)+1)+Const.LOWER_BOUND;
            double posZ = world.getRandom().nextInt(Const.LARGE_RADIAL_BOUND);

            ITextComponent teleportStart = new StringTextComponent("Teleport started!");
            ITextComponent teleportSuccess = new StringTextComponent("Successfully teleported to "+(int)posX+", "+(int)posY+", "+(int)posZ);

            player.getCooldownTracker().setCooldown(AzcrayItemInit.DIMENSIONAL_SHIFTER.get(), 200);
            player.sendMessage(teleportStart, Util.DUMMY_UUID);

            world.removeBlock(new BlockPos(posX, posY, posZ), false);
            world.removeBlock(new BlockPos(posX, posY+1, posZ), false);

            player.teleportKeepLoaded(posX, posY, posZ);
            player.sendStatusMessage(teleportSuccess, true);

            world.playSound(null, new BlockPos(posX, posY, posZ), AzcraySoundEventsInit.PORTER_TELEPORT.get(), SoundCategory.BLOCKS, 1, 0.5f);
        }

        return super.onItemRightClick(world, player, hand);
    }
}
