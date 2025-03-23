
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.jotibi.agarthamod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import de.jotibi.agarthamod.block.OvergrownsandstoneBlock;
import de.jotibi.agarthamod.block.AgarthaPortalBlock;
import de.jotibi.agarthamod.AgarthamodMod;

public class AgarthamodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AgarthamodMod.MODID);
	public static final DeferredBlock<Block> OVERGROWNSANDSTONE = REGISTRY.register("overgrownsandstone", OvergrownsandstoneBlock::new);
	public static final DeferredBlock<Block> AGARTHA_PORTAL = REGISTRY.register("agartha_portal", AgarthaPortalBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			OvergrownsandstoneBlock.blockColorLoad(event);
		}
	}
}
