
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.jotibi.agarthamod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import de.jotibi.agarthamod.AgarthamodMod;

public class AgarthamodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AgarthamodMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> AGARTHA = REGISTRY.register("agartha",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.agarthamod.agartha")).icon(() -> new ItemStack(Items.NETHER_STAR)).displayItems((parameters, tabData) -> {
				tabData.accept(AgarthamodModBlocks.OVERGROWNSANDSTONE.get().asItem());
				tabData.accept(AgarthamodModItems.RAW_MILK.get());
				tabData.accept(AgarthamodModItems.COOLBOTTLE.get());
			}).withSearchBar().build());
}
