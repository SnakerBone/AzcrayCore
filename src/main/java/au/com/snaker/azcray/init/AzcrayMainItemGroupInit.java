package au.com.snaker.azcray.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class AzcrayMainItemGroupInit extends ItemGroup
{
    public AzcrayMainItemGroupInit(String string) {
        super(string);
    }

    public static final ItemGroup AZCRAY_MAIN = new AzcrayMainItemGroupInit("azcray_main");

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(AzcrayItemInit.DIMENSIONAL_SHIFTER.get());
    }

    @Override
    public void fill(NonNullList<ItemStack> items) {
        super.fill(items);
    }
}
