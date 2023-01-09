package com.snaker.azcray.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
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
            tooltip.add(new TranslationTextComponent("tooltip.azcray.wip"));
            tooltip.add(new TranslationTextComponent("tooltip.azcray.dimensional_shifterr"));
        } else
        {
            tooltip.add(new TranslationTextComponent("tooltip.azcray.wip"));
            tooltip.add(new TranslationTextComponent("tooltip.azcray.press_shift"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
