package hyperdefined.dgr2.blocks;

import hyperdefined.dgr2.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlueBlock extends Block{

	public BlueBlock(int par1, int par2) {
		super(Material.rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(10f);
		this.setResistance(5f);
		this.setBlockTextureName(Reference.MODID + ":" + "blue_block");
		this.setBlockName("blue_block");
	}	
}