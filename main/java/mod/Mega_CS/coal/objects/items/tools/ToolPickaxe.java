package mod.Mega_CS.coal.objects.items.tools;


import mod.Mega_CS.coal.Main;
import mod.Mega_CS.coal.init.ItemInit;
import mod.Mega_CS.coal.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ToolPickaxe extends ItemPickaxe implements IHasModel{
	public ToolPickaxe(String name, ToolMaterial material) {
		super(material);
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
		return 400;
	}
}
