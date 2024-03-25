package hyperdefined.dgr2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MagicalBlock extends Block{

	public MagicalBlock(int par1, int par2) {
		super(Material.rock);
		this.setStepSound(stepSound.STONE);
		this.setHardness(10f);
		this.setResistance(5f);
		this.setRegistryName("magical_block");
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
}