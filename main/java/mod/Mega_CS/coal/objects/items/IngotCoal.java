package mod.Mega_CS.coal.objects.items;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class IngotCoal extends ItemBase{

	public IngotCoal(String name) {
		super(name);
		
	}
	
	@Override
	public int getItemBurnTime(ItemStack itemStack) {
		return 800;
	}
}
