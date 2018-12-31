package mod.Mega_CS.coal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import mod.Mega_CS.coal.init.RecipesInit;
import mod.Mega_CS.coal.proxy.CommonProxy;
import mod.Mega_CS.coal.tabs.CoalToolsTab;
import mod.Mega_CS.coal.util.Reference;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;
	
	public static final CreativeTabs modTab = new CoalToolsTab("modtab");
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		RecipesInit.init();
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}
