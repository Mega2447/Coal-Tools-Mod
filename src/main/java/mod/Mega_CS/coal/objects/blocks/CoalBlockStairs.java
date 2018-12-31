package mod.Mega_CS.coal.objects.blocks;

import mod.Mega_CS.coal.Main;
import mod.Mega_CS.coal.init.BlockInit;
import mod.Mega_CS.coal.init.ItemInit;
import mod.Mega_CS.coal.util.IHasModel;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class CoalBlockStairs extends BlockStairs implements IHasModel{

	public CoalBlockStairs(String name, IBlockState modelState) {
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.modTab);
		this.useNeighborBrightness = true;
		
		BlockInit.BLOCKS.add(this);
		Item item = new ItemBlock(this){
			@Override
			public int getItemBurnTime(ItemStack stack) {
				return 800;
			}
		};
		item.setRegistryName(this.getRegistryName());
		ItemInit.ITEMS.add(item);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
