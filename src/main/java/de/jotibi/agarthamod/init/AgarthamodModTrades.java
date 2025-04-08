
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package de.jotibi.agarthamod.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@EventBusSubscriber
public class AgarthamodModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.CARTOGRAPHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(AgarthamodModItems.AGARTHA_MAP.get()), 10, 5, 0.05f));
		}
		if (event.getType() == AgarthamodModVillagerProfessions.AGARTHAKEYVILLAGER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(AgarthamodModItems.RAW_MILK.get(), 16), new ItemStack(AgarthamodModItems.AGARTHA_KEY.get()), 10, 5, 0.05f));
		}
	}
}
