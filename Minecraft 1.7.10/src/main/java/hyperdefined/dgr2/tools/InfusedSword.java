package hyperdefined.dgr2.tools;

import java.util.List;

import hyperdefined.dgr2.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class InfusedSword extends ItemSword{

	public InfusedSword(int i, ToolMaterial gem2) {
		super(gem2);
		this.setUnlocalizedName("infused_sword");
		this.setTextureName(Reference.MODID + ":" + "infused_sword");
	}
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.common;
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
		lores.add("Tier 2");
	}

}