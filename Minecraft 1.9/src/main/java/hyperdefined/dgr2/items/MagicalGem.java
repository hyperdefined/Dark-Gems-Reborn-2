package hyperdefined.dgr2.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MagicalGem extends Item {
	
	public MagicalGem(int par1) {
		super();
		this.setRegistryName("magical_gem");
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
		lores.add("Tier 5");
	}
}