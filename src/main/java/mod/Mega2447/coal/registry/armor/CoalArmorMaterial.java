package mod.Mega2447.coal.registry.armor;

import mod.Mega2447.coal.registry.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CoalArmorMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[]{9, 9, 9, 9}; //All values equal
    private static final int[] PROTECTION_VALUES = new int[]{1, 3, 5, 2}; //Feet, Legs, Chest, Head

    private int enchantability;
    private String name;
    private float toughness;

    public CoalArmorMaterial(String inputName){
        enchantability = 7;
        name = inputName;
        toughness = 0.0f;
    }
    @Override
    public int getDurability(EquipmentSlot slot) {
        return 9;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getArmorStandSlotId() - 1]; //Returns protection value of specified armor slot
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.INGOT_COAL);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
