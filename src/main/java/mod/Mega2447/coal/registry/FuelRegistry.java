package mod.Mega2447.coal.registry;

import mod.Mega2447.coal.objects.ModBlocks;
import mod.Mega2447.coal.objects.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Arrays;
import java.util.List;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class FuelRegistry {

    //needed for MinecraftForge.EVENT_BUS.register() in CoalToolsMod
    public FuelRegistry(){

    }

    @SubscribeEvent
    public void onFurnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event){
        ItemStack items = event.getItemStack();
        Item item = items.getItem();

        //Create Lists to use #contain
        List<Item> armorList = Arrays.asList(ModItems.coalHelmet, ModItems.coalChestplate, ModItems.coalLeggings, ModItems.coalBoots);
        List<Item> toolList = Arrays.asList(ModItems.coalAxe, ModItems.coalHoe, ModItems.coalSword, ModItems.coalShovel, ModItems.coalPickaxe);

        if(armorList.contains(item)) event.setBurnTime(10000);
        else if(toolList.contains(item)) event.setBurnTime(8000);
        else if(item == ModItems.coalIngot) event.setBurnTime(16000);
        else if(item == ModBlocks.coalStairs.asItem()) event.setBurnTime(16000);
    }
}
