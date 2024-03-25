package hyperdefined.dgr2.proxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import hyperdefined.dgr2.LoggerStrings;
import hyperdefined.dgr2.dgr2;
import hyperdefined.dgr2.config.ConfigHandler;
import hyperdefined.dgr2.init.AddCrafting;
import hyperdefined.dgr2.init.AddNames;
import hyperdefined.dgr2.init.ArmorNames;
import hyperdefined.dgr2.init.BlockRegistry;
import hyperdefined.dgr2.init.ItemRegistry;
import hyperdefined.dgr2.init.SetCreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;

public class CommonProxy {
		
    public void preInit(FMLPreInitializationEvent e) {
    	dgr2.LOGGER.info(LoggerStrings.DGR2_VERSION);
    	BlockRegistry.init();
		BlockRegistry.register();
		ItemRegistry.init();
		ItemRegistry.register();
		if (ConfigHandler.darkOreC == true) {
			dgr2.LOGGER.warn(LoggerStrings.DGR2_DARK_ORE_ON);
		} else {
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.dark_gem), "XYX", "YCY", "XYX", 'X', Blocks.obsidian, 'Y', Blocks.mossy_cobblestone, 'C', Items.quartz);
			dgr2.LOGGER.warn(LoggerStrings.DGR2_DARK_ORE_OFF);
		}
		if (ConfigHandler.startMsg == true) {
			FMLCommonHandler.instance().bus().register(dgr2.startmsg);
		}
    }
    
    public void init(FMLInitializationEvent e) {
    	GameRegistry.registerWorldGenerator(dgr2.dgr2OreGeneration, 1);
		SetCreativeTabs.addCreativeTabNames();;
		ArmorNames.setArmorName();
		AddNames.addItemNames();
		AddCrafting.Crafting();
    }
    public void postInit(FMLPostInitializationEvent e) {
    	dgr2.LOGGER.info(LoggerStrings.DGR2_DONE_LOADING);
    	dgr2.LOGGER.info(LoggerStrings.DGR2_MORE_INFO);
    }
}