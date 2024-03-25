package hyperdefined.dgr2.tools;

import java.util.List;

import hyperdefined.dgr2.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class GreenPickaxe extends ItemPickaxe{

	public GreenPickaxe(int i,ToolMaterial gem3) {
		super(gem3);
		this.setUnlocalizedName("green_pickaxe");
		this.setTextureName(Reference.MODID + ":" + "green_pickaxe");
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