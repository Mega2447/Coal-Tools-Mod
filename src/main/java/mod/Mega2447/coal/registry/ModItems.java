package mod.Mega2447.coal.registry;

import mod.Mega2447.coal.CoalToolsMod;
import mod.Mega2447.coal.registry.armor.CoalArmorMaterial;
import mod.Mega2447.coal.registry.tools.CoalAxeItem;
import mod.Mega2447.coal.registry.tools.CoalHoeItem;
import mod.Mega2447.coal.registry.tools.CoalPickaxeItem;
import mod.Mega2447.coal.registry.tools.CoalToolMaterial;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Materials
    public static final CoalArmorMaterial COAL_ARMOR_MATERIAL = new CoalArmorMaterial("coal_armor_material");
    public static final CoalToolMaterial COAL_TOOL_MATERIAL = new CoalToolMaterial();

    //Items
    public static final Item INGOT_COAL = new Item(new Item.Settings().group(CoalToolsMod.ITEM_GROUP));

    public static final Item COAL_HELMET = new ArmorItem(COAL_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(CoalToolsMod.ITEM_GROUP));
    public static final Item COAL_CHESTPLATE = new ArmorItem(COAL_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(CoalToolsMod.ITEM_GROUP));
    public static final Item COAL_LEGGINGS = new ArmorItem(COAL_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(CoalToolsMod.ITEM_GROUP));
    public static final Item COAL_BOOTS = new ArmorItem(COAL_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(CoalToolsMod.ITEM_GROUP));

    public static final ToolItem COAL_SHOVEL = new ShovelItem(COAL_TOOL_MATERIAL, 2.5f, 1.0f, new Item.Settings().group(CoalToolsMod.ITEM_GROUP));
    public static final ToolItem COAL_SWORD = new SwordItem(COAL_TOOL_MATERIAL, 5, 1.6f, new Item.Settings().group(CoalToolsMod.ITEM_GROUP));
    public static final ToolItem COAL_PICKAXE = new CoalPickaxeItem(COAL_TOOL_MATERIAL, 3, 1.0f, new Item.Settings().group(CoalToolsMod.ITEM_GROUP));
    public static final ToolItem COAL_HOE = new CoalHoeItem(COAL_TOOL_MATERIAL, 1, 2.5f, new Item.Settings().group(CoalToolsMod.ITEM_GROUP));
    public static final ToolItem COAL_AXE = new CoalAxeItem(COAL_TOOL_MATERIAL, 9.0f, 0.8f, new Item.Settings().group(CoalToolsMod.ITEM_GROUP));

    //BlockItems
    public static final BlockItem STAIRS_COAL = new BlockItem(ModBlocks.STAIRS_COAL, new Item.Settings().group(CoalToolsMod.ITEM_GROUP));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(CoalToolsMod.MOD_ID, "ingot_coal"), INGOT_COAL);
        Registry.register(Registry.ITEM, new Identifier(CoalToolsMod.MOD_ID, "stairs_coal"), STAIRS_COAL);
        Registry.register(Registry.ITEM, new Identifier(CoalToolsMod.MOD_ID, "helmet_coal"), COAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier(CoalToolsMod.MOD_ID, "chestplate_coal"), COAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(CoalToolsMod.MOD_ID, "leggings_coal"), COAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(CoalToolsMod.MOD_ID, "boots_coal"), COAL_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(CoalToolsMod.MOD_ID, "spade_coal"), COAL_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(CoalToolsMod.MOD_ID, "sword_coal"), COAL_SWORD);
        Registry.register(Registry.ITEM, new Identifier(CoalToolsMod.MOD_ID, "pickaxe_coal"), COAL_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(CoalToolsMod.MOD_ID, "hoe_coal"), COAL_HOE);
        Registry.register(Registry.ITEM, new Identifier(CoalToolsMod.MOD_ID, "axe_coal"), COAL_AXE);

        fuelRegistryInit();
    }

    private static void fuelRegistryInit(){
        FuelRegistry.INSTANCE.add(INGOT_COAL, 16000);

        FuelRegistry.INSTANCE.add(COAL_PICKAXE, 8000);
        FuelRegistry.INSTANCE.add(COAL_AXE, 8000);
        FuelRegistry.INSTANCE.add(COAL_SHOVEL, 8000);
        FuelRegistry.INSTANCE.add(COAL_SWORD, 8000);
        FuelRegistry.INSTANCE.add(COAL_HOE, 8000);

        FuelRegistry.INSTANCE.add(COAL_HELMET, 10000);
        FuelRegistry.INSTANCE.add(COAL_CHESTPLATE, 10000);
        FuelRegistry.INSTANCE.add(COAL_LEGGINGS, 10000);
        FuelRegistry.INSTANCE.add(COAL_BOOTS, 10000);

        FuelRegistry.INSTANCE.add(STAIRS_COAL, 16000);
    }
}
