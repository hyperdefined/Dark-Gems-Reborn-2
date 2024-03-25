package hyperdefined.dgr2.init;

import hyperdefined.dgr2.LoggerStrings;
import hyperdefined.dgr2.Reference;
import hyperdefined.dgr2.dgr2;
import hyperdefined.dgr2.armor.BlueArmor;
import hyperdefined.dgr2.armor.DarkArmor;
import hyperdefined.dgr2.armor.GreenArmor;
import hyperdefined.dgr2.armor.InfusedArmor;
import hyperdefined.dgr2.armor.MagicalArmor;
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
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
		ItemRegistry.dark_gem = (new DarkGem(2002)).setUnlocalizedName("dark_gem");
		ItemRegistry.infused_gem = (new InfusedGem(20122)).setUnlocalizedName("infused_gem");
		ItemRegistry.green_gem = (new GreenGem(43545)).setUnlocalizedName("green_gem");
		ItemRegistry.magical_gem = (new MagicalGem(56356)).setUnlocalizedName("magical_gem");
		ItemRegistry.blue_gem = (new BlueGem(6665)).setUnlocalizedName("blue_gem");
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
		ItemRegistry.infused_shards = (new InfusedShards(6667)).setUnlocalizedName("infused_shards");
		ItemRegistry.magical_shards = (new MagicalShards(6668)).setUnlocalizedName("magical_shards");
		ItemRegistry.green_shards = (new GreenShards(4499)).setUnlocalizedName("green_shards");
		ItemRegistry.blue_shards = (new BlueShards(6666)).setUnlocalizedName("blue_shards");
	}
	public static void register() {
		dgr2.LOGGER.info(LoggerStrings.DGR2_ADD_ITEMS);
		GameRegistry.registerItem(ItemRegistry.dark_gem, dark_gem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.infused_gem, infused_gem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.green_gem, green_gem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.blue_gem, blue_gem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.magical_gem, magical_gem.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(ItemRegistry.infused_shards, infused_shards.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.green_shards, green_shards.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.blue_shards, blue_shards.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.magical_shards, magical_shards.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(dark_pickaxe, dark_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dark_spade, dark_spade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dark_sword, dark_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dark_axe, dark_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.dark_hammer, dark_hammer.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(ItemRegistry.infused_spade, infused_spade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.infused_axe, infused_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.infused_pickaxe, infused_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.infused_sword, infused_sword.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(ItemRegistry.green_sword, green_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.green_pickaxe, green_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.green_axe, green_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.green_spade, green_spade.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(ItemRegistry.blue_sword, blue_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.blue_pickaxe, blue_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.blue_axe, blue_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.blue_spade, blue_spade.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(ItemRegistry.magical_sword, magical_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.magical_pickaxe, magical_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.magical_axe, magical_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRegistry.magical_spade, magical_spade.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(dark_helmet = new DarkArmor("dark_helmet", dgr2.gemArmor, "gemArmor", 0), "dark_helmet"); //0 for helmet
		GameRegistry.registerItem(dark_chestplate = new DarkArmor("dark_chestplate", dgr2.gemArmor, "gemArmor", 1), "dark_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(dark_leggings = new DarkArmor("dark_leggings", dgr2.gemArmor, "gemArmor", 2), "dark_leggings"); // 2 for leggings
		GameRegistry.registerItem(dark_boots = new DarkArmor("dark_boots", dgr2.gemArmor, "gemArmor", 3), "dark_boots"); // 3 for boots

		GameRegistry.registerItem(infused_helmet = new InfusedArmor("infused_helmet", dgr2.gem2Armor, "gem2Armor", 0), "infused_helmet"); //0 for helmet
		GameRegistry.registerItem(infused_chestplate = new InfusedArmor("infused_chestplate", dgr2.gem2Armor, "gem2Armor", 1), "infused_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(infused_leggings = new InfusedArmor("infused_leggings", dgr2.gem2Armor, "gem2Armor", 2), "infused_leggings"); // 2 for leggings
		GameRegistry.registerItem(infused_boots = new InfusedArmor("infused_boots", dgr2.gem2Armor, "gem2Armor", 3), "infused_boots"); // 3 for boots

		GameRegistry.registerItem(green_helmet = new GreenArmor("green_helmet", dgr2.gem3Armor, "gem3Armor", 0), "green_helmet"); //0 for helmet
		GameRegistry.registerItem(green_chestplate = new GreenArmor("green_chestplate", dgr2.gem3Armor, "gem3Armor", 1), "green_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(green_leggings = new GreenArmor("green_leggings", dgr2.gem3Armor, "gem3Armor", 2), "green_leggings"); // 2 for leggings
		GameRegistry.registerItem(green_boots = new GreenArmor("green_boots", dgr2.gem3Armor, "gem3Armor", 3), "green_boots"); // 3 for boots

		GameRegistry.registerItem(blue_helmet = new BlueArmor("blue_helmet", dgr2.gem4Armor, "gem4Armor", 0), "blue_helmet"); //0 for helmet
		GameRegistry.registerItem(blue_chestplate = new BlueArmor("blue_chestplate", dgr2.gem4Armor, "gem4Armor", 1), "blue_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(blue_leggings = new BlueArmor("blue_leggings", dgr2.gem4Armor, "gem4Armor", 2), "blue_leggings"); // 2 for leggings
		GameRegistry.registerItem(blue_boots = new BlueArmor("blue_boots", dgr2.gem4Armor, "gem4Armor", 3), "blue_boots"); // 3 for boots

		GameRegistry.registerItem(magical_helmet = new MagicalArmor("magical_helmet", dgr2.gem5Armor, "gem5Armor", 0), "magical_helmet"); //0 for helmet
		GameRegistry.registerItem(magical_chestplate = new MagicalArmor("magical_chestplate", dgr2.gem5Armor, "gem5Armor", 1), "magical_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(magical_leggings = new MagicalArmor("magical_leggings", dgr2.gem5Armor, "gem5Armor", 2), "magical_leggings"); // 2 for leggings
		GameRegistry.registerItem(magical_boots = new MagicalArmor("magical_boots", dgr2.gem5Armor, "gem5Armor", 3), "magical_boots"); // 3 for boots
	}
	public static void registerRenders() {
		registerRender(dark_gem);
		registerRender(infused_gem);
		registerRender(green_gem);
		registerRender(blue_gem);
		registerRender(magical_gem);
		registerRender(blue_shards);
		registerRender(infused_shards);
		registerRender(green_shards);
		registerRender(magical_shards);
		registerRender(infused_axe);
		registerRender(infused_pickaxe);
		registerRender(infused_spade);
		registerRender(infused_sword);
		registerRender(dark_pickaxe);
		registerRender(dark_axe);
		registerRender(dark_spade);
		registerRender(dark_sword);
		registerRender(green_sword);
		registerRender(green_axe);
		registerRender(green_pickaxe);
		registerRender(green_spade);
		registerRender(blue_sword);
		registerRender(blue_axe);
		registerRender(blue_pickaxe);
		registerRender(blue_spade);
		registerRender(magical_sword);
		registerRender(magical_axe);
		registerRender(magical_pickaxe);
		registerRender(magical_spade);
		registerRender(dark_hammer);
		registerRender(dark_leggings);
		registerRender(dark_boots);
		registerRender(dark_chestplate);
		registerRender(dark_helmet);
		registerRender(infused_leggings);
		registerRender(infused_boots);
		registerRender(infused_chestplate);
		registerRender(infused_helmet);
		registerRender(green_leggings);
		registerRender(green_boots);
		registerRender(green_chestplate);
		registerRender(green_helmet);
		registerRender(blue_leggings);
		registerRender(blue_boots);
		registerRender(blue_chestplate);
		registerRender(blue_helmet);
		registerRender(magical_leggings);
		registerRender(magical_boots);
		registerRender(magical_chestplate);
		registerRender(magical_helmet);
	}
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}