package com.snaker.azcray.init;

import com.snaker.azcray.AzcrayMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class ModTagsInit {

    // Item tags init

    public static class Items {

        public static Tags.IOptionalNamedTag<Item> initTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(AzcrayMod.MOD_ID, name));
        }

        public static Tags.IOptionalNamedTag<Item> initForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }

    }

    // block tags init

    public static class Blocks {

        public static Tags.IOptionalNamedTag<Block> initTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(AzcrayMod.MOD_ID, name));
        }

        public static Tags.IOptionalNamedTag<Block> initForgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }

    }

}
