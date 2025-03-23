
package de.jotibi.agarthamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CoolbottleItem extends Item {
	public CoolbottleItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
