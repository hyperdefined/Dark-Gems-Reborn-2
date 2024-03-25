package hyperdefined.dgr2.config;

import java.io.File;

import hyperdefined.dgr2.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
 
public class ConfigHandler {
	
    public static Configuration config;
    
	public static boolean darkOreC;
	public static boolean startMsg;
	
	public static int shardOre;
	public static int darkOre;
	
	public static final String DARK_ORE_GEN_DESC = "This will allow you disable the generation of Dark Ore, If you disable it, you will have to craft it.";
	public static final String START_MSG_DESC = "Disable or enable the message when you join the game.";
	public static final String DARK_ORE_NAME = "doesDarkOreGenerate";
	public static final String START_MSG_NAME = "showStartMsg";
	public static final String DGR2_CONFIG_PATH = "/darkgemsreborn2/config.cfg";
	public static final String DGR2_SHARD_ORE_DESC = "You can change how high or low the Shards can spawn.";
	public static final String DGR2_SHARD_ORE_NAME ="shardOreSpawnLevel";
	public static final String DGR2_DARK_ORE_DESC = "You can change how high or low the Dark ore can spawn.";
	public static final String DGR2_DARK_ORE_NAME ="darkOreSpawnLevel";
 
    public static void init(FMLPreInitializationEvent e) {	
    	config = new Configuration(new File(e.getModConfigurationDirectory() + DGR2_CONFIG_PATH));
    	loadConfiguration();
    }

    public static void loadConfiguration() {
    	ConfigHandler.darkOreC = ConfigHandler.config.getBoolean(DARK_ORE_NAME, Configuration.CATEGORY_GENERAL, true, DARK_ORE_GEN_DESC); 
    	ConfigHandler.startMsg = ConfigHandler.config.getBoolean(START_MSG_NAME, Configuration.CATEGORY_GENERAL, true, START_MSG_DESC);
    	ConfigHandler.shardOre = ConfigHandler.config.getInt(DGR2_SHARD_ORE_NAME, Configuration.CATEGORY_GENERAL, 30, 1, 256, DGR2_SHARD_ORE_DESC);
    	ConfigHandler.darkOre = ConfigHandler.config.getInt(DGR2_DARK_ORE_NAME, Configuration.CATEGORY_GENERAL, 30, 1, 256, DGR2_DARK_ORE_DESC);
        if(config.hasChanged()){ config.save();}
    }
    
    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event){
    	if(event.modID.equals(Reference.MODID))
    	{
    		loadConfiguration();
    	}
    }
}