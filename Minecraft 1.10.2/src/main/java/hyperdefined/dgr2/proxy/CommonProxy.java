package hyperdefined.dgr2.proxy;

import hyperdefined.dgr2.LoggerStrings;
import hyperdefined.dgr2.dgr2;
import hyperdefined.dgr2.config.ConfigHandler;
import hyperdefined.dgr2.init.AddCrafting;
import hyperdefined.dgr2.init.ArmorNames;
import hyperdefined.dgr2.init.BlockRegistry;
import hyperdefined.dgr2.init.ItemRegistry;
import hyperdefined.dgr2.init.SetCreativeTabs;
import hyperdefined.dgr2.worldgeneration.OreGeneration;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
		
    public void preInit(FMLPreInitializationEvent e) {
    	dgr2.LOGGER.info(LoggerStrings.DGR2_VERSION);
    	BlockRegistry.init();
		BlockRegistry.register();
		ItemRegistry.init();
		ItemRegistry.register();
		 ConfigHandler.init(e);
		if (ConfigHandler.darkOreC) {
			dgr2.LOGGER.warn(LoggerStrings.DGR2_DARK_ORE_ON);
		} else {
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.dark_gem), "XYX", "YCY", "XYX", 'X', Blocks.OBSIDIAN, 'Y', Blocks.MOSSY_COBBLESTONE, 'C', Items.QUARTZ);
			dgr2.LOGGER.warn(LoggerStrings.DGR2_DARK_ORE_OFF);
		}
		if (ConfigHandler.startMsg) {
			FMLCommonHandler.instance().bus().register(dgr2.startmsg);
		}
    }
    
    public void init(FMLInitializationEvent e) {
		SetCreativeTabs.addCreativeTabNames();;
		ArmorNames.setArmorName();
		AddCrafting.Crafting();
		GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
    }
    public void postInit(FMLPostInitializationEvent e) {
    	dgr2.LOGGER.info(LoggerStrings.DGR2_DONE_LOADING);
    	new ClientProxy.updater();
    }
}