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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class MagicalArmor extends ItemArmor {
	public String textureName;

	public MagicalArmor(String unlocalizedName, ArmorMaterial material, String textureName, EntityEquipmentSlot slot) {
		super(dgr2.gem5Armor, 0, slot);
		this.textureName = "magical_armor";
		this.setUnlocalizedName("magical_armor");
 }

 @Override
 	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
	 	lores.add("Tier 5");
 }
 
 	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
	 	return Reference.MODID + ":textures/armor/" + this.textureName + "_" + (slot == 2 ? "2" : "1") + ".png";
 }

 @Override
 	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	 	if (itemStack.getItem().equals(ItemRegistry.magical_boots)) player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), -1));
 	}
}