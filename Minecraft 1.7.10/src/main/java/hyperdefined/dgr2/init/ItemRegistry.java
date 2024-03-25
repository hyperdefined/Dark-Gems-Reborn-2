package hyperdefined.dgr2.init;

import cpw.mods.fml.common.registry.GameRegistry;
import hyperdefined.dgr2.LoggerStrings;
import hyperdefined.dgr2.dgr2;
import hyperdefined.dgr2.armor.blueArmor;
import hyperdefined.dgr2.armor.darkArmor;
import hyperdefined.dgr2.armor.greenArmor;
import hyperdefined.dgr2.armor.infusedArmor;
import hyperdefined.dgr2.armor.magicalArmor;
import hyperdefined.dgr2.items.BlueGem;
import hyperdefined.dgr2.items.BlueShards;
import hyperdefined.dgr2.items.DarkGem;
import hyperdefined.dgr2.items.GreenGem;
import hyperdefined.dgr2.items.GreenShards;
import hyperdefined.dgr2.items.InfusedGem;
import hyperdefined.dgr2.items.InfusedShards;
import hyperdefined.dgr2.items.MagicalGem;
import hyperdefined.dgr2.items.MagicalShards;
import hyperdefined.dgr2.tools.BlueAxe;
import hyperdefined.dgr2.tools.BluePickaxe;
import hyperdefined.dgr2.tools.BlueSpade;
import hyperdefined.dgr2.tools.BlueSword;
import hyperdefined.dgr2.tools.DarkAxe;
import hyperdefined.dgr2.tools.DarkHammer;
import hyperdefined.dgr2.tools.DarkPickaxe;
import hyperdefined.dgr2.tools.DarkSpade;
import hyperdefined.dgr2.tools.DarkSword;
import hyperdefined.dgr2.tools.GreenAxe;
import hyperdefined.dgr2.tools.GreenPickaxe;
import hyperdefined.dgr2.tools.GreenSpade;
import hyperdefined.dgr2.tools.GreenSword;
import hyperdefined.dgr2.tools.InfusedAxe;
import hyperdefined.dgr2.tools.InfusedPickaxe;
import hyperdefined.dgr2.tools.InfusedSpade;
import hyperdefined.dgr2.tools.InfusedSword;
import hyperdefined.dgr2.tools.MagicalAxe;
import hyperdefined.dgr2.tools.MagicalPickaxe;
import hyperdefined.dgr2.tools.MagicalSpade;
import hyperdefined.dgr2.tools.MagicalSword;
import net.minecraft.item.Item;

public class ItemRegistry {
	
	public static Item dark_gem;
	public static Item infused_gem;
	public static Item blue_gem;
	public static Item magical_gem;
	public static Item green_gem;

	public static Item green_shards;
	public static Item blue_shards;
	public static Item infused_shards;
	public static Item magical_shards;

	public static Item dark_axe;
	public static Item dark_pickaxe;
	public static Item dark_spade;
	public static Item dark_sword;
	public static Item dark_hammer;

	public static Item infused_pickaxe;
	public static Item infused_axe;
	public static Item infused_sword;
	public static Item infused_spade;

	public static Item green_spade;
	public static Item green_pickaxe;
	public static Item green_sword;
	public static Item green_axe;

	public static Item blue_spade;
	public static Item blue_pickaxe;
	public static Item blue_sword;
	public static Item blue_axe;

	public static Item magical_spade;
	public static Item magical_pickaxe;
	public static Item magical_sword;
	public static Item magical_axe;

	public static Item dark_helmet;
	public static Item dark_chestplate;
	public static Item dark_leggings;
	public static Item dark_boots;

	public static Item infused_helmet;
	public static Item infused_chestplate;
	public static Item infused_leggings;
	public static Item infused_boots;

	public static Item blue_helmet;
	public static Item blue_chestplate;
	public static Item blue_leggings;
	public static Item blue_boots;

	public static Item green_helmet;
	public static Item green_chestplate;
	public static Item green_leggings;
	public static Item green_boots;

	public static Item magical_helmet;
	public static Item magical_chestplate;
	public static Item magical_leggings;
	public static Item magical_boots;

	
	public static void init() {
		dgr2.LOGGER.info(LoggerStrings.DGR2_REGISTER_ITEM_CLASSES);
		//Gems
		ItemRegistry.dark_gem = new DarkGem(2002).setUnlocalizedName("dark_gem");
		ItemRegistry.infused_gem = new InfusedGem(20122).setUnlocalizedName("infused_gem");
		ItemRegistry.green_gem = new GreenGem(43545).setUnlocalizedName("green_gem");
		ItemRegistry.magical_gem = new MagicalGem(56356).setUnlocalizedName("magical_gem");
		ItemRegistry.blue_gem = new BlueGem(6665).setUnlocalizedName("blue_gem");
		//Tools
		dark_pickaxe = new DarkPickaxe(2001, dgr2.gem);
		dark_spade = new DarkSpade(2002, dgr2.gem);
		dark_sword = new DarkSword(2003, dgr2.gem);
		dark_axe = new DarkAxe(2004, dgr2.gem);
		dark_hammer = new DarkHammer(2005, dgr2.hammer).setUnlocalizedName("dark_hammer");
		infused_pickaxe = new InfusedPickaxe(2006, dgr2.gem2);
		infused_axe = new InfusedAxe(2007, dgr2.gem2);
		infused_sword = new InfusedSword(2008, dgr2.gem2);
		infused_spade = new InfusedSpade(2009, dgr2.gem2);
		green_spade = new GreenSpade(2010, dgr2.gem3);
		green_pickaxe = new GreenPickaxe(2011, dgr2.gem3);
		green_sword = new GreenSword(2012, dgr2.gem3);
		green_axe = new GreenAxe(2013, dgr2.gem3);
		blue_spade = new BlueSpade(2014, dgr2.gem4);
		blue_pickaxe = new BluePickaxe(2015, dgr2.gem4);
		blue_sword = new BlueSword(2016, dgr2.gem4);
		blue_axe = new BlueAxe(2017, dgr2.gem4);
		magical_spade = new MagicalSpade(2018, dgr2.gem5);
		magical_pickaxe = new MagicalPickaxe(2019, dgr2.gem5);
		magical_sword = new MagicalSword(2020, dgr2.gem5);
		magical_axe = new MagicalAxe(2021, dgr2.gem5);

		//shards
		ItemRegistry.infused_shards = new InfusedShards(6667).setUnlocalizedName("infused_shards");
		ItemRegistry.magical_shards = new MagicalShards(6668).setUnlocalizedName("magical_shards");
		ItemRegistry.green_shards = new GreenShards(4499).setUnlocalizedName("green_shards");
		ItemRegistry.blue_shards = new BlueShards(6666).setUnlocalizedName("blue_shards");
		

		
	}
	public static void register() {
		dgr2.LOGGER.info(LoggerStrings.DGR2_ADD_ITEMS);
		GameRegistry.registerItem(ItemRegistry.dark_gem, "dark_gem");
		GameRegistry.registerItem(ItemRegistry.infused_gem, "infused_gem");
		GameRegistry.registerItem(ItemRegistry.green_gem, "green_gem");
		GameRegistry.registerItem(ItemRegistry.blue_gem, "blue_gem");
		GameRegistry.registerItem(ItemRegistry.magical_gem, "magical_gem");

		GameRegistry.registerItem(ItemRegistry.infused_shards, "infused_shards");
		GameRegistry.registerItem(ItemRegistry.green_shards, "green_shards");
		GameRegistry.registerItem(ItemRegistry.blue_shards, "blue_shards");
		GameRegistry.registerItem(ItemRegistry.magical_shards, "magical_shards");


		GameRegistry.registerItem(dark_pickaxe, "dark_pickaxe");
		GameRegistry.registerItem(dark_spade, "dark_spade");
		GameRegistry.registerItem(dark_sword, "dark_sword");
		GameRegistry.registerItem(dark_axe, "dark_axe");
		GameRegistry.registerItem(ItemRegistry.dark_hammer, "dark_hammer");


		GameRegistry.registerItem(ItemRegistry.infused_spade, "infused_spade");
		GameRegistry.registerItem(ItemRegistry.infused_axe, "infused_axe");
		GameRegistry.registerItem(ItemRegistry.infused_pickaxe, "infused_pickaxe");
		GameRegistry.registerItem(ItemRegistry.infused_sword, "infused_sword");

		GameRegistry.registerItem(ItemRegistry.green_sword, "green_sword");
		GameRegistry.registerItem(ItemRegistry.green_pickaxe, "green_pickaxe");
		GameRegistry.registerItem(ItemRegistry.green_axe, "green_axe");
		GameRegistry.registerItem(ItemRegistry.green_spade, "green_spade");

		GameRegistry.registerItem(ItemRegistry.blue_sword, "blue_sword");
		GameRegistry.registerItem(ItemRegistry.blue_pickaxe, "blue_pickaxe");
		GameRegistry.registerItem(ItemRegistry.blue_axe, "blue_axe");
		GameRegistry.registerItem(ItemRegistry.blue_spade, "blue_spade");

		GameRegistry.registerItem(ItemRegistry.magical_sword, "magical_sword");
		GameRegistry.registerItem(ItemRegistry.magical_pickaxe, "magical_pickaxe");
		GameRegistry.registerItem(ItemRegistry.magical_axe, "magical_axe");
		GameRegistry.registerItem(ItemRegistry.magical_spade, "magical_spade");


		GameRegistry.registerItem(dark_helmet = new darkArmor("dark_helmet", dgr2.gemArmor, "gemArmor", 0), "dark_helmet"); //0 for helmet
		GameRegistry.registerItem(dark_chestplate = new darkArmor("dark_chestplate", dgr2.gemArmor, "gemArmor", 1), "dark_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(dark_leggings = new darkArmor("dark_leggings", dgr2.gemArmor, "gemArmor", 2), "dark_leggings"); // 2 for leggings
		GameRegistry.registerItem(dark_boots = new darkArmor("dark_boots", dgr2.gemArmor, "gemArmor", 3), "dark_boots"); // 3 for boots

		GameRegistry.registerItem(infused_helmet = new infusedArmor("infused_helmet", dgr2.gem2Armor, "gem2Armor", 0), "infused_helmet"); //0 for helmet
		GameRegistry.registerItem(infused_chestplate = new infusedArmor("infused_chestplate", dgr2.gem2Armor, "gem2Armor", 1), "infused_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(infused_leggings = new infusedArmor("infused_leggings", dgr2.gem2Armor, "gem2Armor", 2), "infused_leggings"); // 2 for leggings
		GameRegistry.registerItem(infused_boots = new infusedArmor("infused_boots", dgr2.gem2Armor, "gem2Armor", 3), "infused_boots"); // 3 for boots

		GameRegistry.registerItem(green_helmet = new greenArmor("green_helmet", dgr2.gem3Armor, "gem3Armor", 0), "green_helmet"); //0 for helmet
		GameRegistry.registerItem(green_chestplate = new greenArmor("green_chestplate", dgr2.gem3Armor, "gem3Armor", 1), "green_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(green_leggings = new greenArmor("green_leggings", dgr2.gem3Armor, "gem3Armor", 2), "green_leggings"); // 2 for leggings
		GameRegistry.registerItem(green_boots = new greenArmor("green_boots", dgr2.gem3Armor, "gem3Armor", 3), "green_boots"); // 3 for boots

		GameRegistry.registerItem(blue_helmet = new blueArmor("blue_helmet", dgr2.gem4Armor, "gem4Armor", 0), "blue_helmet"); //0 for helmet
		GameRegistry.registerItem(blue_chestplate = new blueArmor("blue_chestplate", dgr2.gem4Armor, "gem4Armor", 1), "blue_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(blue_leggings = new blueArmor("blue_leggings", dgr2.gem4Armor, "gem4Armor", 2), "blue_leggings"); // 2 for leggings
		GameRegistry.registerItem(blue_boots = new blueArmor("blue_boots", dgr2.gem4Armor, "gem4Armor", 3), "blue_boots"); // 3 for boots

		GameRegistry.registerItem(magical_helmet = new magicalArmor("magical_helmet", dgr2.gem5Armor, "gem5Armor", 0), "magical_helmet"); //0 for helmet
		GameRegistry.registerItem(magical_chestplate = new magicalArmor("magical_chestplate", dgr2.gem5Armor, "gem5Armor", 1), "magical_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(magical_leggings = new magicalArmor("magical_leggings", dgr2.gem5Armor, "gem5Armor", 2), "magical_leggings"); // 2 for leggings
		GameRegistry.registerItem(magical_boots = new magicalArmor("magical_boots", dgr2.gem5Armor, "gem5Armor", 3), "magical_boots"); // 3 for boots
	}
}