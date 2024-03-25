package hyperdefined.dgr2.tools;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class InfusedAxe extends ItemTool{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});
	
	public InfusedAxe(int i, ToolMaterial gem2) {
		super(gem2, EFFECTIVE_ON);
		this.setRegistryName("infused_axe");
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.damageVsEntity = gem2.getDamageVsEntity();
		this.attackSpeed = -3.0F;
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