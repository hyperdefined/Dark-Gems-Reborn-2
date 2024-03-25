package hyperdefined.dgr2.items;

import java.util.List;

import hyperdefined.dgr2.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GreenGem extends Item {
	public GreenGem(int par1) {
		super();
		this.setTextureName(Reference.MODID + ":" + "green_gem");
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
		lores.add("Tier 3");
	}
}