package mod.Mega_CS.coal.objects.items.tools;


import mod.Mega_CS.coal.Main;
import mod.Mega_CS.coal.init.ItemInit;
import mod.Mega_CS.coal.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSpade extends ItemSpade implements IHasModel{
	public ToolSpade(String name, ToolMaterial material) {
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
