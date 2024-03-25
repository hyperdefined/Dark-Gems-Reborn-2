package hyperdefined.dgr2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MagicalOre extends Block{

	public MagicalOre(int par1, int par2) {
		super(Material.ROCK);
		this.setSoundType(getSoundType().STONE);
		this.setHardness(5f);
		this.setResistance(7f);
		this.setHarvestLevel("pickaxe", 25);
		this.setRegistryName("magical_ore");
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
}