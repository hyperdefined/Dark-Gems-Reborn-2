package hyperdefined.dgr2.tools;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class InfusedPickaxe extends ItemPickaxe {

	public InfusedPickaxe(int i, ToolMaterial gem2) {
		super(gem2);
		this.setRegistryName("infused_pickaxe");
		this.setUnlocalizedName(this.getRegistryName().toString());
	}
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.COMMON;
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
		lores.add("Tier 2");
	}
}