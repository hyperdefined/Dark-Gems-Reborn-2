package hyperdefined.dgr2.armor;

import java.util.List;

import hyperdefined.dgr2.Reference;
import hyperdefined.dgr2.dgr2;
import hyperdefined.dgr2.init.ItemRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class GreenArmor extends ItemArmor {
	public String textureName;

	public GreenArmor(String unlocalizedName, ArmorMaterial material, String textureName, EntityEquipmentSlot slot) {
		super(dgr2.gem3Armor, 0, slot);
		this.textureName = "green_armor";
		this.setUnlocalizedName("green_armor");
	}

 @Override
 	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
	 lores.add("Tier 3");
 	}
 public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
	 return Reference.MODID + ":textures/armor/" + this.textureName + "_" + (slot == 2 ? "2" : "1") + ".png";
 	}
}