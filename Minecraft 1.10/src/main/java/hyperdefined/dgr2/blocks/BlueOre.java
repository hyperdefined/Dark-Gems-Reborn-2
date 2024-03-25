package hyperdefined.dgr2.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.audio.Sound;

public class BlueOre extends Block{

	public BlueOre(int par1, int par2) {
		super(Material.ROCK);
		this.setSoundType(getSoundType().STONE);
		this.setHardness(5f);
		this.setResistance(7f);
		this.setHarvestLevel("pickaxe", 20);
		this.setRegistryName("blue_ore");
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
}