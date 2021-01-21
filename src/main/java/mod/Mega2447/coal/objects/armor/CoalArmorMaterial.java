package mod.Mega2447.coal.objects.armor;

import mod.Mega2447.coal.objects.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class CoalArmorMaterial implements IArmorMaterial {

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
    public int getDurability(EquipmentSlotType slotIn) {
        return durability;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return damageReductionAmount[slotIn.getSlotIndex() - 1];
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(ModItems.coalIngot);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
