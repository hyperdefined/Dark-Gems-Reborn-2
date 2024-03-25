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

public class BlueArmor extends ItemArmor {
	public String textureName;

	public BlueArmor(String unlocalizedName, ArmorMaterial material, String textureName, EntityEquipmentSlot slot) {
		super(dgr2.gem4Armor, 0, slot);
		this.textureName = ("blue_armor");
		this.setUnlocalizedName("blue_armor");
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
		lores.add("Tier 4");
	}
}