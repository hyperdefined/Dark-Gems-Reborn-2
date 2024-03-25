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

public class InfusedArmor extends ItemArmor {
	public String textureName;

	public InfusedArmor(String unlocalizedName, ArmorMaterial material, String textureName, EntityEquipmentSlot slot) {
		super(dgr2.gem2Armor, 0, slot);
		this.textureName = "infused_armor";
		this.setUnlocalizedName("infused_armor");
		
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
		lores.add("Tier 2");
	}
}