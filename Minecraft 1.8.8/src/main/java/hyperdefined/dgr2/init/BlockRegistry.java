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
import net.minecraft.client.resources.model.ModelResourceLocation;
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
		dark_block = (new DarkBlock(2001, 0)).setUnlocalizedName("dark_block");
		infused_block = (new InfusedBlock(2001, 0)).setUnlocalizedName("infused_block");
		green_block = (new GreenBlock(2001, 0)).setUnlocalizedName("green_block");
		blue_block = (new BlueBlock(2001, 0)).setUnlocalizedName("blue_block");
		magical_block = (new MagicalBlock(2001, 0)).setUnlocalizedName("magical_block");
		dark_ore = new DarkOre(2009, 0).setUnlocalizedName("dark_ore");
		blue_ore = new BlueOre(2010, 0).setUnlocalizedName("blue_ore");
		magical_ore = new MagicalOre(2011, 0).setUnlocalizedName("magical_ore");
		green_ore = new GreenOre(2012, 0).setUnlocalizedName("green_ore");
		infused_ore = new InfusedOre(2013, 0).setUnlocalizedName("infused_ore");
	}
	public static void register() {
		dgr2.LOGGER.info(LoggerStrings.DGR2_ADD_BLOCKS);
		GameRegistry.registerBlock(dark_block, dark_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(infused_block, infused_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(green_block, green_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blue_block, blue_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(magical_block, magical_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(dark_ore, dark_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blue_ore, blue_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(magical_ore, magical_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(green_ore, green_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(infused_ore, infused_ore.getUnlocalizedName().substring(5));
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
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}