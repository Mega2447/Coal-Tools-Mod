package mod.Mega2447.coal.objects;

import mod.Mega2447.coal.CoalToolsMod;
import mod.Mega2447.coal.objects.armor.CoalArmorMaterial;
import mod.Mega2447.coal.objects.tools.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    //Material
    public static final CoalArmorMaterial COAL_ARMOR_MATERIAL = new CoalArmorMaterial("coal_armor_material");

    //Items
    public static Item coalIngot = new Item(new Item.Properties().tab(CoalToolsMod.itemGroup)).setRegistryName("ingot_coal");

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
    
    public static void assignItemValues() {

        coalAxe = new CoalAxeItem(9.0f, 0.8f, new Item.Properties().tab(CoalToolsMod.itemGroup)).setRegistryName("axe_coal");    
        coalPickaxe = new CoalPickaxeItem(3, 1.0f, new Item.Properties().tab(CoalToolsMod.itemGroup)).setRegistryName("pickaxe_coal");                
        coalSword = new CoalSwordItem(5, 1.6f, new Item.Properties().tab(CoalToolsMod.itemGroup)).setRegistryName("sword_coal");                
        coalShovel = new CoalShovelItem(2.5f, 1.0f, new Item.Properties().tab(CoalToolsMod.itemGroup)).setRegistryName("spade_coal");                
        coalHoe = new CoalHoeItem(1, 2.5f, new Item.Properties().tab(CoalToolsMod.itemGroup)).setRegistryName("hoe_coal");
        
        coalHelmet = new ArmorItem(COAL_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(CoalToolsMod.itemGroup)).setRegistryName("helmet_coal");                
        coalChestplate = new ArmorItem(COAL_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(CoalToolsMod.itemGroup)).setRegistryName("chestplate_coal");                
        coalLeggings = new ArmorItem(COAL_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(CoalToolsMod.itemGroup)).setRegistryName("leggings_coal");     
        coalBoots = new ArmorItem(COAL_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(CoalToolsMod.itemGroup)).setRegistryName("boots_coal");
    }

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
            coalIngot,

            coalAxe,
            coalPickaxe,
            coalSword,
            coalShovel,
            coalHoe,

            coalHelmet,
            coalChestplate,
            coalLeggings,
            coalBoots
        );
    }
    
}
