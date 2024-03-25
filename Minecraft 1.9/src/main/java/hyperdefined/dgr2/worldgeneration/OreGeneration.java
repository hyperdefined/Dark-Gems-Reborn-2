package hyperdefined.dgr2.worldgeneration;

import java.util.Random;

import hyperdefined.dgr2.config.ConfigHandler;
import hyperdefined.dgr2.init.BlockRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGeneration implements IWorldGenerator{
	
	private WorldGenerator gen_dark_ore;
	private WorldGenerator gen_infused_ore;
	private WorldGenerator gen_green_ore;
	private WorldGenerator gen_blue_ore;
	private WorldGenerator gen_magical_ore;

	public OreGeneration() {
		this.gen_dark_ore = new WorldGenMinable(BlockRegistry.dark_ore.getDefaultState(), 2);
		this.gen_infused_ore = new WorldGenMinable(BlockRegistry.infused_ore.getDefaultState(), 2);
		this.gen_green_ore = new WorldGenMinable(BlockRegistry.green_ore.getDefaultState(), 2);
		this.gen_blue_ore = new WorldGenMinable(BlockRegistry.blue_ore.getDefaultState(), 2);
		this.gen_magical_ore = new WorldGenMinable(BlockRegistry.magical_ore.getDefaultState(), 2);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
			switch (world.provider.getDimension()) {
			case 0: //overworld
				if (ConfigHandler.darkOreC) {
				this.runGenerator(gen_dark_ore, world, random, chunkX, chunkZ, 5, 1, ConfigHandler.darkOre); //rarity, minY, maxY
				}
				this.runGenerator(gen_infused_ore, world, random, chunkX, chunkZ, 5, 1, ConfigHandler.shardOre); //rarity, minY, maxY
				this.runGenerator(gen_green_ore, world, random, chunkX, chunkZ, 5, 1, ConfigHandler.shardOre); //rarity, minY, maxY
				this.runGenerator(gen_blue_ore, world, random, chunkX, chunkZ, 5, 1, ConfigHandler.shardOre); //rarity, minY, maxY
				this.runGenerator(gen_magical_ore, world, random, chunkX, chunkZ, 5, 1, ConfigHandler.shardOre); //rarity, minY, maxY
				break;
			case -1: //nether
				break;
			case 1: //end
				break;
			}
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chancesToSpawn, int minHeight, int maxHeight){
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Argurment for Generation");
		
		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++){
			int x = chunkX * 16 + random.nextInt(16);
			int y = minHeight +  random.nextInt(heightDiff);
			int z = chunkZ * 16 + random.nextInt(16);
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}
}