package mod.Mega2447.coal;

import javax.annotation.Nonnull;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup extends CreativeModeTab{
	
	private ItemStack icon;

	public ModItemGroup(String label, ItemStack iconIn) {
		super(label);
		this.icon = iconIn;
	}

	@Override
	@Nonnull
	public ItemStack makeIcon() {
		return icon;
	}
}
