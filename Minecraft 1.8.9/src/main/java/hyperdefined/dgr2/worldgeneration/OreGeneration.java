package hyperdefined.dgr2.worldgeneration;

import java.util.Random;

import hyperdefined.dgr2.config.ConfigHandler;
import hyperdefined.dgr2.init.BlockRegistry;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGeneration implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimensionId()) {
            case -1:
                break;
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                break;
        }
    }

    private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
        for (int k = 0; k < 10; k++)
        {
            int BlockXCoord = chunkX + rand.nextInt(16);
            int BlockZCoord = chunkZ + rand.nextInt(16);
            int quisqueY = rand.nextInt(ConfigHandler.darkOre);
            BlockPos quisquePos = new BlockPos(BlockXCoord, quisqueY, BlockZCoord);
            if (ConfigHandler.darkOreC){
                (new WorldGenMinable(BlockRegistry.dark_ore.getDefaultState(), 3)).generate(world, rand, quisquePos);
            }
        }
        for (int k = 0; k < 10; k++)
        {
            int BlockXCoord = chunkX + rand.nextInt(16);
            int BlockZCoord = chunkZ + rand.nextInt(16);
            int quisqueY = rand.nextInt(ConfigHandler.shardOre);
            BlockPos quisquePos = new BlockPos(BlockXCoord, quisqueY, BlockZCoord);
            
            (new WorldGenMinable(BlockRegistry.infused_ore.getDefaultState(), 3)).generate(world, rand, quisquePos);
            (new WorldGenMinable(BlockRegistry.green_ore.getDefaultState(), 3)).generate(world, rand, quisquePos);
            (new WorldGenMinable(BlockRegistry.blue_ore.getDefaultState(), 3)).generate(world, rand, quisquePos);
            (new WorldGenMinable(BlockRegistry.magical_ore.getDefaultState(), 3)).generate(world, rand, quisquePos);
        }
    }
}