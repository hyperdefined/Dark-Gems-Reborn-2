package hyperdefined.dgr2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InfusedBlock extends Block{

	public InfusedBlock(int par1, int par2) {
		super(Material.ROCK);
		this.setSoundType(getSoundType().STONE);
		this.setHardness(10f);
		this.setResistance(5f);
		this.setRegistryName("infused_block");
		this.setUnlocalizedName(this.getRegistryName().toString());
	}	
}