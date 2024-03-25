package hyperdefined.dgr2.blocks;

import hyperdefined.dgr2.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GreenBlock extends Block {

	public GreenBlock(int par1, int par2) {
		super(Material.rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(10f);
		this.setResistance(5f);
		this.setBlockTextureName(Reference.MODID + ":" + "green_block");
		this.setBlockName("green_block");
	}
}