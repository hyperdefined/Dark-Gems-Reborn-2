package hyperdefined.dgr2.worldgeneration;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import hyperdefined.dgr2.config.ConfigHandler;
import hyperdefined.dgr2.init.BlockRegistry;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class dgr2Generation implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
	}

	private void generateEnd(World world, Random random, int i, int j) {}

	private void generateSurface(World world, Random random, int i, int j) {
        for(int k = 0; k < 10; k++){
        	int BlockXCoord = i + random.nextInt(16);
        	int BlockYCoord = random.nextInt(ConfigHandler.darkOre);
        	int BlockZCoord = j + random.nextInt(16);
        	int maxVeinSize = 4;
        	int minVeinSize = 1;
        	int VeinSize = random.nextInt(maxVeinSize - minVeinSize) + minVeinSize;
        	if (ConfigHandler.darkOreC = true){
        	(new WorldGenMinable(BlockRegistry.dark_ore, VeinSize)).generate(world, random, BlockXCoord, BlockYCoord, BlockZCoord);
        	}
        }
        for(int k = 0; k < 10; k++){
        	int BlockXCoord = i + random.nextInt(16);
        	int BlockYCoord = random.nextInt(ConfigHandler.shardOre);
        	int BlockZCoord = j + random.nextInt(16);
        	int maxVeinSize = 4;
        	int minVeinSize = 1;
        	int VeinSize = random.nextInt(maxVeinSize - minVeinSize) + minVeinSize;
        	(new WorldGenMinable(BlockRegistry.infused_ore, VeinSize)).generate(world, random, BlockXCoord, BlockYCoord, BlockZCoord);
        }
        for(int k = 0; k < 10; k++){
        	int BlockXCoord = i + random.nextInt(16);
        	int BlockYCoord = random.nextInt(ConfigHandler.shardOre);
        	int BlockZCoord = j + random.nextInt(16);
        	int maxVeinSize = 4;
        	int minVeinSize = 1;
        	int VeinSize = random.nextInt(maxVeinSize - minVeinSize) + minVeinSize;
        	(new WorldGenMinable(BlockRegistry.green_ore, VeinSize)).generate(world, random, BlockXCoord, BlockYCoord, BlockZCoord);
        }
        for(int k = 0; k < 10; k++){
        	int BlockXCoord = i + random.nextInt(16);
        	int BlockYCoord = random.nextInt(ConfigHandler.shardOre);
        	int BlockZCoord = j + random.nextInt(16);
        	int maxVeinSize = 4;
        	int minVeinSize = 1;
        	int VeinSize = random.nextInt(maxVeinSize - minVeinSize) + minVeinSize;
        	(new WorldGenMinable(BlockRegistry.blue_ore, VeinSize)).generate(world, random, BlockXCoord, BlockYCoord, BlockZCoord);
        }
        for(int k = 0; k < 10; k++){
        	int BlockXCoord = i + random.nextInt(16);
        	int BlockYCoord = random.nextInt(ConfigHandler.shardOre);
        	int BlockZCoord = j + random.nextInt(16);
        	int maxVeinSize = 4;
        	int minVeinSize = 1;
        	int VeinSize = random.nextInt(maxVeinSize - minVeinSize) + minVeinSize;
        	(new WorldGenMinable(BlockRegistry.magical_ore, VeinSize)).generate(world, random, BlockXCoord, BlockYCoord, BlockZCoord);
        }
	}
	private void generateNether(World world, Random random, int i, int j) {}
}