package hyperdefined.dgr2.tools;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class MagicalSpade extends ItemSpade{

	public MagicalSpade(int i,ToolMaterial gem5) {
		super(gem5);
		this.setRegistryName("magical_spade");
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.EPIC;
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
		lores.add("Tier 5");
	}
}
