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

public class blueArmor extends ItemArmor {
	public String textureName;

	public blueArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
		super(dgr2.gem4Armor, 0, type);
		this.textureName = ("blue_armor");
		this.setUnlocalizedName("blue_armor");
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
		lores.add("Tier 4");
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return Reference.MODID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
		@Override 
		public void registerIcons(IIconRegister reg){
			if(this == ItemRegistry.blue_boots)
				this.itemIcon = reg.registerIcon(Reference.MODID +":" + "blue_boots");
			if(this == ItemRegistry.blue_leggings)
			this.itemIcon = reg.registerIcon(Reference.MODID +":" + "blue_leggings");
			if(this == ItemRegistry.blue_chestplate)
				this.itemIcon = reg.registerIcon(Reference.MODID +":" + "blue_chestplate");
			if(this == ItemRegistry.blue_helmet)
				this.itemIcon = reg.registerIcon(Reference.MODID +":" + "blue_helmet");
		}
	}