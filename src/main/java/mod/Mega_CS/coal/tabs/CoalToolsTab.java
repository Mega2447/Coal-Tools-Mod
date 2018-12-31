package mod.Mega_CS.coal.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CoalToolsTab extends CreativeTabs{
	public CoalToolsTab(String label) {
		super(label);
		//this.setBackgroundImageName("modtab.png"); //Add if wanted, kept here as a note
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.COAL);
	}
}
