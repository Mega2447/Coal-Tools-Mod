package mod.Mega2447.coal.registry;

import mod.Mega2447.coal.CoalToolsMod;
import mod.Mega2447.coal.registry.blocks.CoalStairsBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final StairsBlock STAIRS_COAL = new CoalStairsBlock(Blocks.COAL_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).hardness(5.0f));

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(CoalToolsMod.MOD_ID, "stairs_coal"), STAIRS_COAL);
    }
}
