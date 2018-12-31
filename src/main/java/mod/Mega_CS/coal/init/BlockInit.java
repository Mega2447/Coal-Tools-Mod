package mod.Mega_CS.coal.init;

import java.util.ArrayList;
import java.util.List;

import mod.Mega_CS.coal.objects.blocks.CoalBlockStairs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.init.Blocks;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block STAIRS_COAL = new CoalBlockStairs("stairs_coal", Blocks.COAL_BLOCK.getDefaultState());
}
