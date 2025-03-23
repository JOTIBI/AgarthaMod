/*
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside de.jotibi.agarthamod as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
package de.jotibi.agarthamod;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class Overgrownsandstonewhenfire {
	public Overgrownsandstonewhenfire() {
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		new Overgrownsandstonewhenfire();
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
	}

	@EventBusSubscriber
	private static class OvergrownsandstonewhenfireForgeBusEvents {
		@SubscribeEvent
		public static void serverLoad(ServerStartingEvent event) {
		}
	}

	// Diese Methode wird aus der Prozedur in MCreator aufgerufen
	public static void onDestroyedByFire(LevelAccessor world, double x, double y, double z) {
		if (world == null)
			return;

		BlockPos pos = new BlockPos((int) x, (int) y, (int) z);

		// Ersetze Block durch Sandstein
		world.setBlock(pos, Blocks.SANDSTONE.defaultBlockState(), 3);
	}
}
