package hyperdefined.dgr2.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class InfusedGem extends Item{
	
	public InfusedGem(int par1){
		super();
		this.setRegistryName("infused_gem");
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
		lores.add("Tier 2");
	}
}