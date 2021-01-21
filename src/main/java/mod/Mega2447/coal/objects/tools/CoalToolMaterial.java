package mod.Mega2447.coal.objects.tools;

import mod.Mega2447.coal.objects.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class CoalToolMaterial implements IItemTier {

    private int maxUses;
    private float efficiency;
    private float attackDamage;
    private int harvestLevel;
    private int enchantability;

    public CoalToolMaterial(){
        maxUses = 152;
        efficiency = 4.0f;
        attackDamage = 1.0f;
        harvestLevel = 1;
        enchantability = 7;
    }
    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(ModItems.coalIngot);
    }
}
