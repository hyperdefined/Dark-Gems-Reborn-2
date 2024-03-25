package hyperdefined.dgr2.tools;

import java.util.List;

import hyperdefined.dgr2.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class GreenSpade extends ItemSpade{

	public GreenSpade(int i,ToolMaterial gem3) {
		super(gem3);
		this.setUnlocalizedName("green_spade");
		this.setTextureName(Reference.MODID + ":" + "green_shovel");
	}
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.uncommon;
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
		lores.add("Tier 3");
	}
}