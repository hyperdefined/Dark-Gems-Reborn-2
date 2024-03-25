package hyperdefined.dgr2.tools;

import java.util.List;

import hyperdefined.dgr2.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class BlueSpade extends ItemSpade{

	public BlueSpade(int i,ToolMaterial gem4) {
		super(gem4);
		this.setUnlocalizedName("blue_spade");
		this.setTextureName(Reference.MODID + ":" + "blue_shovel");
	}
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.rare;
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
		lores.add("Tier 4");
	}
}