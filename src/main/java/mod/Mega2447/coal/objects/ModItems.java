package mod.Mega2447.coal.objects;

import mod.Mega2447.coal.CoalToolsMod;
import mod.Mega2447.coal.objects.armor.CoalArmorMaterial;
import mod.Mega2447.coal.objects.tools.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    //Material
    public static final CoalArmorMaterial COAL_ARMOR_MATERIAL = new CoalArmorMaterial("coal_armor_material");

    //Items
    public static Item coalIngot;

    //Tools
    public static Item coalAxe;
    public static Item coalPickaxe;
    public static Item coalSword;
    public static Item coalShovel;
    public static Item coalHoe;

    //Armor
    public static Item coalHelmet;
    public static Item coalChestplate;
    public static Item coalLeggings;
    public static Item coalBoots;

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
            coalIngot = new Item(new Item.Properties().group(CoalToolsMod.itemGroup)).setRegistryName("ingot_coal"),

            coalAxe = new CoalAxeItem(9.0f, 0.8f, new Item.Properties().group(CoalToolsMod.itemGroup)).setRegistryName("axe_coal"),
            coalPickaxe = new CoalPickaxeItem(3, 1.0f, new Item.Properties().group(CoalToolsMod.itemGroup)).setRegistryName("pickaxe_coal"),
            coalSword = new CoalSwordItem(5, 1.6f, new Item.Properties().group(CoalToolsMod.itemGroup)).setRegistryName("sword_coal"),
            coalShovel = new CoalShovelItem(2.5f, 1.0f, new Item.Properties().group(CoalToolsMod.itemGroup)).setRegistryName("spade_coal"),
            coalHoe = new CoalHoeItem(1, 2.5f, new Item.Properties().group(CoalToolsMod.itemGroup)).setRegistryName("hoe_coal"),

            coalHelmet = new ArmorItem(COAL_ARMOR_MATERIAL, EquipmentSlotType.HEAD, new Item.Properties().group(CoalToolsMod.itemGroup)).setRegistryName("helmet_coal"),
            coalChestplate = new ArmorItem(COAL_ARMOR_MATERIAL, EquipmentSlotType.CHEST, new Item.Properties().group(CoalToolsMod.itemGroup)).setRegistryName("chestplate_coal"),
            coalLeggings = new ArmorItem(COAL_ARMOR_MATERIAL, EquipmentSlotType.LEGS, new Item.Properties().group(CoalToolsMod.itemGroup)).setRegistryName("leggings_coal"),
            coalBoots = new ArmorItem(COAL_ARMOR_MATERIAL, EquipmentSlotType.FEET, new Item.Properties().group(CoalToolsMod.itemGroup)).setRegistryName("boots_coal")
        );
    }
}
