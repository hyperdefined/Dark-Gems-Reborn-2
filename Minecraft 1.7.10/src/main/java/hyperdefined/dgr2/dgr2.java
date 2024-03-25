package hyperdefined.dgr2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import hyperdefined.dgr2.config.ConfigHandler;
import hyperdefined.dgr2.init.BlockRegistry;
import hyperdefined.dgr2.init.ItemRegistry;
import hyperdefined.dgr2.init.Message;
import hyperdefined.dgr2.proxy.CommonProxy;
import hyperdefined.dgr2.worldgeneration.dgr2Generation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;

@Mod(name = Reference.MOD_NAME, modid = Reference.MODID, version = Reference.VERSION, guiFactory = Reference.MOD_GUI_FACTORY, acceptedMinecraftVersions = Reference.MCVERSION)
	
	public class dgr2 {
 
@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
 	public static CommonProxy proxy;

@Instance(Reference.MODID)
 	public static dgr2 Instance;

 	public static final Logger LOGGER = LogManager.getLogger("DarkGemsReborn2");

 	public static CreativeTabs tabdarkItems = new CreativeTabs("tabdarkItems") {
 		@Override
 		public Item getTabIconItem() {
 			return ItemRegistry.dark_gem;
 		}
 	};

 	public static CreativeTabs tabdarkBlocks = new CreativeTabs("tabdarkBlocks") {
 		public Item getTabIconItem() {
 			return Item.getItemFromBlock(BlockRegistry.dark_block);
 		}
 	};
 	
 	public static CreativeTabs tabdarkTools = new CreativeTabs("tabdarkTools") {
 		@Override
 		public net.minecraft.item.Item getTabIconItem() {
 			return ItemRegistry.blue_pickaxe;
 		}
 	};
 	
 	public static CreativeTabs tabdarkOres = new CreativeTabs("tabdarkOres") {
 		public net.minecraft.item.Item getTabIconItem() {
 			return Item.getItemFromBlock(BlockRegistry.dark_ore);
 		}
 	};
 	
 	public static CreativeTabs tabdarkArmor = new CreativeTabs("tabdarkArmor") {
 		@Override
 		public Item getTabIconItem() {
 			return ItemRegistry.magical_chestplate;
 		}
 	};

 	//("name", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
 	public static ToolMaterial gem = EnumHelper.addToolMaterial("gem", 12, 2000, 6.0f, 3.5f, 8); //regular
 	public static ToolMaterial gem2 = EnumHelper.addToolMaterial("gem2", 15, 2300, 7.5f, 4.0f, 10); //infused
 	public static ToolMaterial gem3 = EnumHelper.addToolMaterial("gem3", 20, 2600, 10.5f, 5.0f, 10); //green
 	public static ToolMaterial gem4 = EnumHelper.addToolMaterial("gem4", 25, 2900, 12.0f, 6.0f, 12); //blue
 	public static ToolMaterial gem5 = EnumHelper.addToolMaterial("gem5", 30, 3100, 15.5f, 8.0f, 14); //magical
 	public static ToolMaterial hammer = EnumHelper.addToolMaterial("hammer", 2, 300, 2.0f, 2.0f, 2);

 	public static ArmorMaterial gemArmor = EnumHelper.addArmorMaterial("dark_armor", 33, new int[] {2, 6, 5, 2}, 9);
 	public static ArmorMaterial gem2Armor = EnumHelper.addArmorMaterial("infused_armor", 36, new int[] {4, 8, 7, 4}, 9);
 	public static ArmorMaterial gem3Armor = EnumHelper.addArmorMaterial("green_armor", 39, new int[] {6, 10, 9, 6}, 13);
 	public static ArmorMaterial gem4Armor = EnumHelper.addArmorMaterial("blue_armor", 42, new int[] { 8, 12, 11, 8}, 15);
 	public static ArmorMaterial gem5Armor = EnumHelper.addArmorMaterial("magical_armor", 45, new int[] {10, 14, 13, 8}, 17);
 
 	public static IWorldGenerator dgr2OreGeneration = new dgr2Generation();

 	public static Message startmsg = new Message();


 @EventHandler
 	public void PreInit(FMLPreInitializationEvent e) {
	 proxy.preInit(e);
	 ConfigHandler.init(e);
	 FMLCommonHandler.instance().bus().register(new ConfigHandler());
	 dgr2.LOGGER.info(LoggerStrings.DGR2_PREINIT_DONE);
	 
 	}
 
 @EventHandler
 	public void Init(FMLInitializationEvent e) {
	 proxy.init(e);
 	}
 
 @EventHandler
 	public void postInit(FMLPostInitializationEvent e) {
	 proxy.postInit(e);
 }
};