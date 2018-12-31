package mod.Mega_CS.coal.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesInit {
	public static void init() {
		GameRegistry.addSmelting(Blocks.COAL_BLOCK, new ItemStack(ItemInit.INGOT_COAL, 1), 0.3f);
	}
}
