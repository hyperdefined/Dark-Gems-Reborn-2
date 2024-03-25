package hyperdefined.dgr2.armor;

import java.util.List;

import hyperdefined.dgr2.Reference;
import hyperdefined.dgr2.dgr2;
import hyperdefined.dgr2.init.ItemRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class darkArmor extends ItemArmor {
	public String textureName;

	public darkArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
		super(dgr2.gemArmor, 0, type);
		this.textureName = "dark_armor";
		this.setUnlocalizedName("dark_armor");
	}@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
		lores.add("Tier 1");
	}@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return Reference.MODID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
	
	@Override 
	public void registerIcons(IIconRegister reg){
		if(this == ItemRegistry.dark_boots)
			this.itemIcon = reg.registerIcon(Reference.MODID +":" + "dark_boots");
		if(this == ItemRegistry.dark_leggings)
			this.itemIcon = reg.registerIcon(Reference.MODID +":" + "dark_leggings");
		if(this == ItemRegistry.dark_chestplate)
			this.itemIcon = reg.registerIcon(Reference.MODID +":" + "dark_chestplate");
		if(this == ItemRegistry.dark_helmet)
			this.itemIcon = reg.registerIcon(Reference.MODID +":" + "dark_helmet");
	}
}