package hyperdefined.dgr2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlueOre extends Block{

	public BlueOre(int par1, int par2) {
		super(Material.rock);
		this.setStepSound(stepSound.STONE);
		this.setHardness(5f);
		this.setResistance(7f);
		this.setHarvestLevel("pickaxe", 20);
		this.setRegistryName("blue_ore");
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
}