package hyperdefined.dgr2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GreenOre extends Block {

	public GreenOre(int par1, int par2) {
		super(Material.ROCK);
		this.setSoundType(getSoundType().STONE);
		this.setHardness(5f);
		this.setResistance(7f);
		this.setHarvestLevel("pickaxe", 15);
		this.setRegistryName("green_ore");
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
}