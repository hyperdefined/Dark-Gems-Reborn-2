package hyperdefined.dgr2.init;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.registry.LanguageRegistry;

public class AddNames {
	public static void addItemNames() {
		
		Logger LOGGER3 = LogManager.getLogger("DarkGemsReborn2"); {
			LOGGER3.info("Adding names to items...");
		}
		
		LanguageRegistry.addName(ItemRegistry.dark_hammer, "Dark Hammer");

		LanguageRegistry.addName(ItemRegistry.dark_spade, "Dark Shovel");
		LanguageRegistry.addName(ItemRegistry.dark_sword, "Dark Sword");
		LanguageRegistry.addName(ItemRegistry.dark_pickaxe, "Dark Pickaxe");
		LanguageRegistry.addName(ItemRegistry.dark_axe, "Dark Axe");

		LanguageRegistry.addName(ItemRegistry.infused_spade, "Infused Shovel");
		LanguageRegistry.addName(ItemRegistry.infused_sword, "Infused Sword");
		LanguageRegistry.addName(ItemRegistry.infused_pickaxe, "Infused Pickaxe");
		LanguageRegistry.addName(ItemRegistry.infused_axe, "Infused Axe");

		LanguageRegistry.addName(ItemRegistry.green_spade, "Green Shovel");
		LanguageRegistry.addName(ItemRegistry.green_sword, "Green Sword");
		LanguageRegistry.addName(ItemRegistry.green_pickaxe, "Green Pickaxe");
		LanguageRegistry.addName(ItemRegistry.green_axe, "Green Axe");

		LanguageRegistry.addName(ItemRegistry.blue_spade, "Blue Shovel");
		LanguageRegistry.addName(ItemRegistry.blue_sword, "Blue Sword");
		LanguageRegistry.addName(ItemRegistry.blue_pickaxe, "Blue Pickaxe");
		LanguageRegistry.addName(ItemRegistry.blue_axe, "Blue Axe");

		LanguageRegistry.addName(ItemRegistry.magical_spade, "Magical Shovel");
		LanguageRegistry.addName(ItemRegistry.magical_sword, "Magical Sword");
		LanguageRegistry.addName(ItemRegistry.magical_pickaxe, "Magical Pickaxe");
		LanguageRegistry.addName(ItemRegistry.magical_axe, "Magical Axe");

		LanguageRegistry.addName(ItemRegistry.magical_gem, "Magical Gem");
		LanguageRegistry.addName(ItemRegistry.green_gem, "Green Gem");
		LanguageRegistry.addName(ItemRegistry.infused_gem, "Infused Gem");
		LanguageRegistry.addName(ItemRegistry.blue_gem, "Blue Gem");
		LanguageRegistry.addName(ItemRegistry.dark_gem, "Dark Gem");

		LanguageRegistry.addName(ItemRegistry.magical_shards, "Magical Shards");
		LanguageRegistry.addName(ItemRegistry.green_shards, "Green Shards");
		LanguageRegistry.addName(ItemRegistry.infused_shards, "Infused Shards");
		LanguageRegistry.addName(ItemRegistry.blue_shards, "Blue Shards");

		LanguageRegistry.addName(BlockRegistry.dark_block, "Dark Block");
		LanguageRegistry.addName(BlockRegistry.infused_block, "Infused Block");
		LanguageRegistry.addName(BlockRegistry.green_block, "Green Block");
		LanguageRegistry.addName(BlockRegistry.blue_block, "Blue Block");
		LanguageRegistry.addName(BlockRegistry.magical_block, "Magical Block");
		
		LanguageRegistry.addName(BlockRegistry.dark_ore, "Dark Ore");
		LanguageRegistry.addName(BlockRegistry.infused_ore, "Infused Shard Ore");
		LanguageRegistry.addName(BlockRegistry.green_ore, "Green Shard Ore");
		LanguageRegistry.addName(BlockRegistry.blue_ore, "Blue Shard Ore");
		LanguageRegistry.addName(BlockRegistry.magical_ore, "Magical Shard Ore");

		LanguageRegistry.addName(ItemRegistry.dark_helmet, "Dark Helmet");
		LanguageRegistry.addName(ItemRegistry.dark_chestplate, "Dark Chestplate");
		LanguageRegistry.addName(ItemRegistry.dark_leggings, "Dark Leggings");
		LanguageRegistry.addName(ItemRegistry.dark_boots, "Dark Boots");

		LanguageRegistry.addName(ItemRegistry.infused_helmet, "Infused Helmet");
		LanguageRegistry.addName(ItemRegistry.infused_chestplate, "Infused Chestplate");
		LanguageRegistry.addName(ItemRegistry.infused_leggings, "Infused Leggings");
		LanguageRegistry.addName(ItemRegistry.infused_boots, "Infused Boots");

		LanguageRegistry.addName(ItemRegistry.green_helmet, "Green Helmet");
		LanguageRegistry.addName(ItemRegistry.green_chestplate, "Green Chestplate");
		LanguageRegistry.addName(ItemRegistry.green_leggings, "Green Leggings");
		LanguageRegistry.addName(ItemRegistry.green_boots, "Green Boots");

		LanguageRegistry.addName(ItemRegistry.blue_helmet, "Blue Helmet");
		LanguageRegistry.addName(ItemRegistry.blue_chestplate, "Blue Chestplate");
		LanguageRegistry.addName(ItemRegistry.blue_leggings, "Blue Leggings");
		LanguageRegistry.addName(ItemRegistry.blue_boots, "Blue Boots");

		LanguageRegistry.addName(ItemRegistry.magical_helmet, "Magical Helmet");
		LanguageRegistry.addName(ItemRegistry.magical_chestplate, "Magical Chestplate");
		LanguageRegistry.addName(ItemRegistry.magical_leggings, "Magical Leggings");
		LanguageRegistry.addName(ItemRegistry.magical_boots, "Magical Boots");
	}
}

