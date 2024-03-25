package hyperdefined.dgr2.init;

import hyperdefined.dgr2.LoggerStrings;
import hyperdefined.dgr2.Reference;
import hyperdefined.dgr2.dgr2;
import hyperdefined.dgr2.blocks.BlueBlock;
import hyperdefined.dgr2.blocks.BlueOre;
import hyperdefined.dgr2.blocks.DarkBlock;
import hyperdefined.dgr2.blocks.DarkOre;
import hyperdefined.dgr2.blocks.GreenBlock;
import hyperdefined.dgr2.blocks.GreenOre;
import hyperdefined.dgr2.blocks.InfusedBlock;
import hyperdefined.dgr2.blocks.InfusedOre;
import hyperdefined.dgr2.blocks.MagicalBlock;
import hyperdefined.dgr2.blocks.MagicalOre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRegistry {

	public static Block dark_block;
	public static Block infused_block;
	public static Block green_block;
	public static Block blue_block;
	public static Block magical_block;
	public static Block dark_ore;
	public static Block blue_ore;
	public static Block magical_ore;
	public static Block green_ore;
	public static Block infused_ore;

	public static void init() {
		dgr2.LOGGER.info(LoggerStrings.DGR2_REGISTER_BLOCK_CLASSES);
		dark_block = (new DarkBlock(2001, 0));
		infused_block = (new InfusedBlock(2001, 0));
		green_block = (new GreenBlock(2001, 0));
		blue_block = (new BlueBlock(2001, 0));
		magical_block = (new MagicalBlock(2001, 0));
		dark_ore = new DarkOre(2009, 0);
		blue_ore = new BlueOre(2010, 0);
		magical_ore = new MagicalOre(2011, 0);
		green_ore = new GreenOre(2012, 0);
		infused_ore = new InfusedOre(2013, 0);
	}
	public static void register() {
		dgr2.LOGGER.info(LoggerStrings.DGR2_ADD_BLOCKS);
		GameRegistry.registerBlock(dark_block);
		GameRegistry.registerBlock(infused_block);
		GameRegistry.registerBlock(green_block);
		GameRegistry.registerBlock(blue_block);
		GameRegistry.registerBlock(magical_block);
		GameRegistry.registerBlock(dark_ore);
		GameRegistry.registerBlock(blue_ore);
		GameRegistry.registerBlock(magical_ore);
		GameRegistry.registerBlock(green_ore);
		GameRegistry.registerBlock(infused_ore);
	}
	public static void registerRenders() {
		registerRender(dark_block);
		registerRender(infused_block);
		registerRender(green_block);
		registerRender(blue_block);
		registerRender(magical_block);
		registerRender(dark_ore);
		registerRender(magical_ore);
		registerRender(green_ore);
		registerRender(blue_ore);
		registerRender(infused_ore);
	}
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}