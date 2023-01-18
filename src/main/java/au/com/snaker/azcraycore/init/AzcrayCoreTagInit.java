package au.com.snaker.azcraycore.init;

import au.com.snaker.azcraycore.data.tags.AzcrayCoreTags;
import net.minecraft.item.Item;
import net.minecraftforge.common.Tags;

public class AzcrayCoreTagInit {
    public static final Tags.IOptionalNamedTag<Item> CONTAINER_LOOT = AzcrayCoreTags.Items.createItemTag("container_loot");
}
