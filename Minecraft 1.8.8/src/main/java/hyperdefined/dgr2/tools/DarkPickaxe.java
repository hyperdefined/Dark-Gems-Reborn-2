package hyperdefined.dgr2.tools;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class DarkPickaxe extends ItemPickaxe {

	public DarkPickaxe(int i, ToolMaterial gem) {
		super(gem);
		this.setUnlocalizedName("dark_pickaxe");
	}
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.COMMON;	
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
		lores.add("Tier 1");
	}
}
