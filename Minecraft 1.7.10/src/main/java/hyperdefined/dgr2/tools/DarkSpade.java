package hyperdefined.dgr2.tools;

import java.util.List;

import hyperdefined.dgr2.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class DarkSpade extends ItemSpade{

	public DarkSpade(int i,ToolMaterial gem) {
		super(gem);
		this.setUnlocalizedName("dark_spade");
		this.setTextureName(Reference.MODID + ":" + "dark_shovel");
	}
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.common;
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
		lores.add("Tier 1");
	}
}