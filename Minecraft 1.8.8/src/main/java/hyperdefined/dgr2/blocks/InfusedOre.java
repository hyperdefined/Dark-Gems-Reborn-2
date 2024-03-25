package hyperdefined.dgr2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InfusedOre extends Block{

	public InfusedOre(int par1, int par2) {
		super(Material.rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(8f);
		this.setResistance(20f);
		this.setHarvestLevel("pickaxe", 10);
	}
}
