
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.jotibi.agarthamod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import de.jotibi.agarthamod.item.RawMilkItem;
import de.jotibi.agarthamod.item.CoolbottleItem;
import de.jotibi.agarthamod.item.AgarthaMasterKeyItem;
import de.jotibi.agarthamod.item.AgarthaMapItem;
import de.jotibi.agarthamod.item.AgarthaKeyItem;
import de.jotibi.agarthamod.item.AgarthaItem;
import de.jotibi.agarthamod.AgarthamodMod;

public class AgarthamodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AgarthamodMod.MODID);
	public static final DeferredItem<Item> OVERGROWNSANDSTONE = block(AgarthamodModBlocks.OVERGROWNSANDSTONE);
	public static final DeferredItem<Item> RAW_MILK = REGISTRY.register("raw_milk", RawMilkItem::new);
	public static final DeferredItem<Item> COOLBOTTLE = REGISTRY.register("coolbottle", CoolbottleItem::new);
	public static final DeferredItem<Item> AGARTHA = REGISTRY.register("agartha", AgarthaItem::new);
	public static final DeferredItem<Item> AGARTHA_MAP = REGISTRY.register("agartha_map", AgarthaMapItem::new);
	public static final DeferredItem<Item> AGARTHA_KEY = REGISTRY.register("agartha_key", AgarthaKeyItem::new);
	public static final DeferredItem<Item> AGARTHA_MASTER_KEY = REGISTRY.register("agartha_master_key", AgarthaMasterKeyItem::new);
	public static final DeferredItem<Item> UF_OCONTROL = block(AgarthamodModBlocks.UF_OCONTROL);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
