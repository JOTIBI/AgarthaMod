
package de.jotibi.agarthamod.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import de.jotibi.agarthamod.procedures.AgarthaMasterKeyItemIsCraftedsmeltedProcedure;

public class AgarthaMasterKeyItem extends Item {
	public AgarthaMasterKeyItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		AgarthaMasterKeyItemIsCraftedsmeltedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
	}
}
