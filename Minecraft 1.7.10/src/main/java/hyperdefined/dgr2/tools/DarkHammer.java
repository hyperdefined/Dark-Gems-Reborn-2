package hyperdefined.dgr2.tools;

import hyperdefined.dgr2.Reference;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class DarkHammer extends ItemSword{

	public DarkHammer(int i, ToolMaterial hammer) {
		super(hammer);
		this.setUnlocalizedName("dark_hammer");
		this.setNoRepair();
		this.setTextureName(Reference.MODID + ":" + "dark_hammer");
	}
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.common;
	}
    public boolean hasContainerItem(ItemStack itemStack)
    {
       return true;
    }
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack stack = itemStack.copy();

        stack.setItemDamage(stack.getItemDamage() + 6);
        stack.stackSize = 1;

        return stack;
    }
}