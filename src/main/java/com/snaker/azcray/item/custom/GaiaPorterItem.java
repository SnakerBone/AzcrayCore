package com.snaker.azcray.item.custom;

import com.snaker.azcray.init.SoundEventsInit;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.datafix.fixes.ChunkPaletteFormat;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EntityTeleportEvent;

import javax.annotation.Nullable;
import java.util.List;

public class GaiaPorterItem extends Item {
    public GaiaPorterItem(Properties properties) {
        super(properties);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        if(Screen.hasShiftDown())
        {
            tooltip.add(new TranslationTextComponent("tooltip.azcray.gaia_porter"));
            tooltip.add(new TranslationTextComponent("tooltip.azcray.porter_warning"));
        } else
        {
            tooltip.add(new TranslationTextComponent("tooltip.azcray.press_shift"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
        ITextComponent wrongDim = new TranslationTextComponent("warn.azcray.porter_overworld");
        if(!world.isRemote) {
            int xzRadialBound = 10000;
            int yLowerBound = 64;
            int yUpperBound = 70;

            double posX = world.getRandom().nextInt(xzRadialBound);
            double posY = world.getRandom().nextInt((yUpperBound-yLowerBound)+1)+yLowerBound;
            double posZ = world.getRandom().nextInt(xzRadialBound);

            if (world.getDimensionKey() == World.OVERWORLD) {
                ITextComponent teleportStart = new StringTextComponent("Teleport started!");
                ITextComponent teleportSuccess = new StringTextComponent("Successfully teleported to "+(int)posX+", "+(int)posY+", "+(int)posZ);

                player.sendMessage(teleportStart, Util.DUMMY_UUID);

                world.removeBlock(new BlockPos(posX, posY, posZ), false);
                world.removeBlock(new BlockPos(posX, posY+1, posZ), false);

                player.teleportKeepLoaded(posX, posY, posZ);
                player.sendStatusMessage(teleportSuccess, true);

                world.playSound(null, new BlockPos(posX, posY, posZ), SoundEventsInit.PORTER_TELEPORT.get(), SoundCategory.BLOCKS, 1, 1);
            } else {
                player.sendStatusMessage(wrongDim, true);
            }
        }
        return super.onItemRightClick(world, player, hand);
    }
}
