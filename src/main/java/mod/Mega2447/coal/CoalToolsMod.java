package mod.Mega2447.coal;

import mod.Mega2447.coal.objects.ModBlocks;
import mod.Mega2447.coal.objects.ModItems;
import mod.Mega2447.coal.registry.FuelRegistry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@Mod(CoalToolsMod.MOD_ID)
public class CoalToolsMod {

    public static final String MOD_ID = "cm";
    
    public static CreativeModeTab itemGroup;

    public CoalToolsMod(){
        MinecraftForge.EVENT_BUS.register(new FuelRegistry()); //custom registry for fuel
        //ModItems.assignItemValues();
        itemGroup = new ModItemGroup(MOD_ID, new ItemStack(ModItems.coalIngot));
        ModItems.assignItemValues();
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        ModBlocks.register(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        ModBlocks.registerItemBlocks(event.getRegistry());
        ModItems.register(event.getRegistry());
    }
}
