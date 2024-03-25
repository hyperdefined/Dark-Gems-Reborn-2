package hyperdefined.dgr2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DarkOre extends Block{

	public DarkOre(int par1, int par2) {
		super(Material.rock);
		this.setStepSound(stepSound.STONE);
		this.setHardness(5f);
		this.setResistance(7f);
		this.setRegistryName("dark_ore");
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
}