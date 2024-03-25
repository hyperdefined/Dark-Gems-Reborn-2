package hyperdefined.dgr2.tools;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class BluePickaxe extends ItemPickaxe{

	public BluePickaxe(int i,ToolMaterial gem4) {
		super(gem4);
		this.setRegistryName("blue_pickaxe");
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.RARE;
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
		lores.add("Tier 4");
	}
}