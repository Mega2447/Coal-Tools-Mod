package mod.Mega2447.coal.objects;

import mod.Mega2447.coal.CoalToolsMod;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static Block coalStairs;

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                coalStairs = new StairsBlock(() -> Blocks.COAL_BLOCK.getDefaultState(), AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLACK)).setRegistryName("stairs_coal")
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                new BlockItem(coalStairs, createItemProperties()).setRegistryName(coalStairs.getRegistryName())
        );
    }

    private static Item.Properties createItemProperties(){
        return new Item.Properties().group(CoalToolsMod.itemGroup);
    }
}