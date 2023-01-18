package au.com.snaker.azcraycore.data.tags;

import au.com.snaker.azcraycore.data.Const;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class AzcrayCoreTags {
    public static class Blocks {
        public static Tags.IOptionalNamedTag<Block> createBlockTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(Const.MOD_ID, name));
        }
    }

    public static class Items {
        public static Tags.IOptionalNamedTag<Item> createItemTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(Const.MOD_ID, name));
        }
    }
}
