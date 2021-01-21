package mod.Mega2447.coal;

import mod.Mega2447.coal.objects.ModBlocks;
import mod.Mega2447.coal.objects.ModItems;
import mod.Mega2447.coal.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@Mod(CoalToolsMod.MOD_ID)
public class CoalToolsMod {

    public static final String MOD_ID = "cm";

    public static final ItemGroup itemGroup = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.coalIngot);
        }
    };

    public CoalToolsMod(){
        MinecraftForge.EVENT_BUS.register(new FuelRegistry()); //custom registry for fuel
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
