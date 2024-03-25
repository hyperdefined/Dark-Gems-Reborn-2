package hyperdefined.dgr2.init;

import hyperdefined.dgr2.LoggerStrings;
import hyperdefined.dgr2.dgr2;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class AddCrafting {
	public static void Crafting(){
		dgr2.LOGGER.info(LoggerStrings.DGR2_ADD_CRAFTING);
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.dark_block), "XXX", "XXX", "XXX", 'X', ItemRegistry.dark_gem);
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.infused_block), "XXX", "XXX", "XXX", 'X', ItemRegistry.infused_gem);
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.green_block), "XXX", "XXX", "XXX", 'X', ItemRegistry.green_gem);
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blue_block), "XXX", "XXX", "XXX", 'X', ItemRegistry.blue_gem);
		GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.magical_block), "XXX", "XXX", "XXX", 'X', ItemRegistry.magical_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.dark_pickaxe), "XXX", " Y ", " Y ", 'X', ItemRegistry.dark_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.dark_sword), "X", "X", "Y", 'X', ItemRegistry.dark_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.dark_axe), " XX", " YX", " Y ", 'X', ItemRegistry.dark_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.dark_spade), "X", "Y", "Y", 'X', ItemRegistry.dark_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.dark_hammer, 1), " X ", " YX", "Y  ", 'X', ItemRegistry.dark_gem, 'Y', Items.stick);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.dark_gem, 9), BlockRegistry.dark_block);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.infused_gem, 9), BlockRegistry.infused_block);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.green_gem, 9), BlockRegistry.green_block);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.blue_gem, 9), BlockRegistry.blue_block);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.magical_gem, 9), BlockRegistry.magical_block);
		
		GameRegistry.addSmelting(BlockRegistry.dark_ore, new ItemStack(ItemRegistry.dark_gem), 0.1f); //First item is what you put in the furnace.
		GameRegistry.addSmelting(BlockRegistry.magical_ore, new ItemStack(ItemRegistry.magical_shards), 5.0f);
		GameRegistry.addSmelting(BlockRegistry.infused_ore, new ItemStack(ItemRegistry.infused_shards), 5.0f);
		GameRegistry.addSmelting(BlockRegistry.green_ore, new ItemStack(ItemRegistry.green_shards), 5.0f);
		GameRegistry.addSmelting(BlockRegistry.blue_ore, new ItemStack(ItemRegistry.blue_shards), 5.0f);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.blue_gem), ItemRegistry.dark_gem, ItemRegistry.blue_shards, new ItemStack(ItemRegistry.dark_hammer, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.green_gem), ItemRegistry.dark_gem, ItemRegistry.green_shards, new ItemStack(ItemRegistry.dark_hammer, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.infused_gem), ItemRegistry.dark_gem, ItemRegistry.infused_shards, new ItemStack(ItemRegistry.dark_hammer, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.magical_gem), ItemRegistry.dark_gem, ItemRegistry.magical_shards, new ItemStack(ItemRegistry.dark_hammer, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.green_pickaxe), "XXX", " Y ", " Y ", 'X', ItemRegistry.green_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.green_sword), "X", "X", "Y", 'X', ItemRegistry.green_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.green_axe), " XX", " YX", " Y ", 'X', ItemRegistry.green_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.green_spade), "X", "Y", "Y", 'X', ItemRegistry.green_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.infused_pickaxe), "XXX", " Y ", " Y ", 'X', ItemRegistry.infused_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.infused_sword), "X", "X", "Y", 'X', ItemRegistry.infused_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.infused_axe), " XX", " YX", " Y ", 'X', ItemRegistry.infused_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.infused_spade), "X", "Y", "Y", 'X', ItemRegistry.infused_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.blue_pickaxe), "XXX", " Y ", " Y ", 'X', ItemRegistry.blue_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.blue_sword), "X", "X", "Y", 'X', ItemRegistry.blue_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.blue_axe), " XX", " YX", " Y ", 'X', ItemRegistry.blue_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.blue_spade), "X", "Y", "Y", 'X', ItemRegistry.blue_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.magical_pickaxe), "XXX", " Y ", " Y ", 'X', ItemRegistry.magical_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.magical_sword), "X", "X", "Y", 'X', ItemRegistry.magical_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.magical_axe), " XX", " YX", " Y ", 'X', ItemRegistry.magical_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.magical_spade), " X ", " Y ", " Y ", 'X', ItemRegistry.magical_gem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.dark_helmet), "XXX", "X X", "   ", 'X', ItemRegistry.dark_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.dark_chestplate), "X X", "XXX", "XXX", 'X', ItemRegistry.dark_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.dark_leggings), "XXX", "X X", "X X", 'X', ItemRegistry.dark_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.dark_boots), "   ", "X X", "X X", 'X', ItemRegistry.dark_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.infused_helmet), "XXX", "X X", "   ", 'X', ItemRegistry.infused_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.infused_chestplate), "X X", "XXX", "XXX", 'X', ItemRegistry.infused_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.infused_leggings), "XXX", "X X", "X X", 'X', ItemRegistry.infused_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.infused_boots), "   ", "X X", "X X", 'X', ItemRegistry.infused_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.green_helmet), "XXX", "X X", "   ", 'X', ItemRegistry.green_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.green_chestplate), "X X", "XXX", "XXX", 'X', ItemRegistry.green_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.green_leggings), "XXX", "X X", "X X", 'X', ItemRegistry.green_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.green_boots), "   ", "X X", "X X", 'X', ItemRegistry.green_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.blue_helmet), "XXX", "X X", "   ", 'X', ItemRegistry.blue_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.blue_chestplate), "X X", "XXX", "XXX", 'X', ItemRegistry.blue_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.blue_leggings), "XXX", "X X", "X X", 'X', ItemRegistry.blue_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.blue_boots), "   ", "X X", "X X", 'X', ItemRegistry.blue_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.magical_helmet), "XXX", "X X", "   ", 'X', ItemRegistry.magical_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.magical_chestplate), "X X", "XXX", "XXX", 'X', ItemRegistry.magical_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.magical_leggings), "XXX", "X X", "X X", 'X', ItemRegistry.magical_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.magical_boots), "   ", "X X", "X X", 'X', ItemRegistry.magical_gem);
	}
}
