package hyperdefined.dgr2.config;

import hyperdefined.dgr2.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

public class ConfigGui extends GuiConfig {

	static String CONFIG_MESSAGE = TextFormatting.BOLD + "Any changes made will require a game restart!";
	
	public ConfigGui(GuiScreen parent) {
		super(parent,
    		new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), Reference.MODID, true, true, CONFIG_MESSAGE);
  }
}