package com.snaker.azcray.item.anthro;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class AnthropomorphousItem extends Item
{
    public AnthropomorphousItem(Properties properties)
    {
        super(properties);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        if(Screen.hasShiftDown())
        {
            tooltip.add(new TranslationTextComponent("tooltip.azcray.wip"));
            tooltip.add(new TranslationTextComponent("tooltip.azcray.anthro"));
        } else
        {
            tooltip.add(new TranslationTextComponent("tooltip.azcray.wip"));
            tooltip.add(new TranslationTextComponent("tooltip.azcray.press_shift"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
