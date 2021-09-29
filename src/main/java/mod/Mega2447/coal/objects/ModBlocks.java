package mod.Mega2447.coal.objects;

import mod.Mega2447.coal.CoalToolsMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    @SuppressWarnings("deprecation")
    public static Block coalStairs = new StairBlock(Blocks.COAL_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.COAL_BLOCK));

	public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                coalStairs.setRegistryName("stairs_coal")
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                new BlockItem(coalStairs, createItemProperties()).setRegistryName(coalStairs.getRegistryName())
        );
    }

    private static Item.Properties createItemProperties(){
        return new Item.Properties().tab(CoalToolsMod.itemGroup);
    }
}