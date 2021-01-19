package mod.Mega2447.coal.registry.tools;

import mod.Mega2447.coal.registry.ModItems;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CoalToolMaterial implements ToolMaterial {

    private int miningLevel;
    private float miningSpeedMultiplier;
    private int durability;
    private float damage;
    private int enchantability;

    public CoalToolMaterial(){
        miningLevel = 1;
        miningSpeedMultiplier = 4.0f;
        durability = 152;
        damage = 1.0f;
        enchantability = 7;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return damage;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.INGOT_COAL);
    }
}
