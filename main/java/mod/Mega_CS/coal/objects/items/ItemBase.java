package mod.Mega_CS.coal.objects.items;


import mod.Mega_CS.coal.Main;
import mod.Mega_CS.coal.init.ItemInit;
import mod.Mega_CS.coal.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	public ItemBase(String name) {
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
}
