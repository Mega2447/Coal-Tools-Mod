package mod.Mega_CS.coal.init;

import java.util.ArrayList;
import java.util.List;

import mod.Mega_CS.coal.objects.items.IngotCoal;
import mod.Mega_CS.coal.objects.items.ItemBase;
import mod.Mega_CS.coal.objects.items.armor.ArmorBase;
import mod.Mega_CS.coal.objects.items.tools.ToolAxe;
import mod.Mega_CS.coal.objects.items.tools.ToolHoe;
import mod.Mega_CS.coal.objects.items.tools.ToolPickaxe;
import mod.Mega_CS.coal.objects.items.tools.ToolSpade;
import mod.Mega_CS.coal.objects.items.tools.ToolSword;
import mod.Mega_CS.coal.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_COAL = EnumHelper.addToolMaterial("material_coal", 1, 152, 4.0F, 1.0F, 7);
	public static final ArmorMaterial ARMOR_MATERIAL_COAL = EnumHelper.addArmorMaterial("armor_material_coal", Reference.MODID + ":coal", 9, new int[] {1, 3, 5, 2}, 7, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	
	//Items
	public static final Item INGOT_COAL = new IngotCoal("ingot_coal");
	
	//Tools
	public static final ItemSword SWORD_COAL = new ToolSword("sword_coal", MATERIAL_COAL);
	public static final ItemSpade SPADE_COAL = new ToolSpade("spade_coal", MATERIAL_COAL);
	public static final ItemPickaxe PICKAXE_COAL = new ToolPickaxe("pickaxe_coal", MATERIAL_COAL);
	public static final ItemAxe AXE_COAL = new ToolAxe("axe_coal", MATERIAL_COAL);
	public static final ItemHoe HOE_COAL = new ToolHoe("hoe_coal", MATERIAL_COAL);
	
	//Armor
	public static final Item HELMET_COAL = new ArmorBase("helmet_coal", ARMOR_MATERIAL_COAL, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_COAL = new ArmorBase("chestplate_coal", ARMOR_MATERIAL_COAL, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_COAL = new ArmorBase("leggings_coal", ARMOR_MATERIAL_COAL, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_COAL = new ArmorBase("boots_coal", ARMOR_MATERIAL_COAL, 1, EntityEquipmentSlot.FEET);
}
