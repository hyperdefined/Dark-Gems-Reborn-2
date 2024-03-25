package hyperdefined.dgr2.tools;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class DarkHammer extends ItemSword{

	public DarkHammer(int i, ToolMaterial hammer) {
		super(hammer);
		this.setRegistryName("dark_hammer");
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setNoRepair();
	}

	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.COMMON;
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