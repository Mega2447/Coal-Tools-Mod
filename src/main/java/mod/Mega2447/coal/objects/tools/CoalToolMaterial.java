package mod.Mega2447.coal.objects.tools;

import mod.Mega2447.coal.objects.ModItems;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class CoalToolMaterial implements Tier {

    private int maxUses;
    private float speed;
    private float attackDamage;
    private int harvestLevel;
    private int enchantability;

    public CoalToolMaterial(){
        maxUses = 152;
        speed = 4.0f;
        attackDamage = 1.0f;
        harvestLevel = 1;
        enchantability = 7;
    }
    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(ModItems.coalIngot);
    }
}
