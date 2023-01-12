package au.com.snaker.azcray.item.override;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ItemTierOverride implements IItemTier
{
    ALL(0, 1, 12f, 0f, 0, null);

    public final int uses;
    public final float efficiency;
    public final float attackDamage;
    public final int harvestLevel;
    public final int enchantability;
    public final LazyValue<Ingredient> repairMaterial;

    ItemTierOverride(int harvestLevel, int maxUses, float efficiency,
                     float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
    {
        this.harvestLevel = harvestLevel;
        this.uses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getMaxUses()
    {
        return uses;
    }

    @Override
    public float getEfficiency()
    {
        return efficiency;
    }

    @Override
    public float getAttackDamage()
    {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel()
    {
        return harvestLevel;
    }

    @Override
    public int getEnchantability()
    {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return repairMaterial.getValue();
    }
}