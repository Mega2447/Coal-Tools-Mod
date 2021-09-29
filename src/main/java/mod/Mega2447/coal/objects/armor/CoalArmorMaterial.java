package mod.Mega2447.coal.objects.armor;

import mod.Mega2447.coal.objects.ModItems;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

public class CoalArmorMaterial implements ArmorMaterial {

    private int durability;
    private int damageReductionAmount[];
    private int enchantability;
    private String name;
    private float toughness;

    public CoalArmorMaterial(String nameIn){
        durability = 9;
        damageReductionAmount = new int[]{1,3,5,2};
        enchantability = 7;
        toughness = 0;
        name = nameIn;
    }
    @Override
    public int getDurabilityForSlot(EquipmentSlot slotIn) {
        return durability;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slotIn) {
        return damageReductionAmount[slotIn.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(ModItems.coalIngot);
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
