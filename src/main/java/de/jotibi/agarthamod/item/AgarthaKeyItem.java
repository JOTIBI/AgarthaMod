
package de.jotibi.agarthamod.item;

public class AgarthaKeyItem extends Item {
	public AgarthaKeyItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}