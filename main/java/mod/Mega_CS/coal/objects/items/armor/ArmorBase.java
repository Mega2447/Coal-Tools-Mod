package mod.Mega_CS.coal.objects.items.armor;


import mod.Mega_CS.coal.Main;
import mod.Mega_CS.coal.init.ItemInit;
import mod.Mega_CS.coal.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorBase extends ItemArmor implements IHasModel{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.modTab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public int getItemBurnTime(ItemStack itemStack) {
		return 500;
	}
}
