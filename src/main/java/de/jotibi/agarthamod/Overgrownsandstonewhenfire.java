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
package de.jotibi.agarthamod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashMap;

public class OvergrownsandstoneTickProcedure {
	private static final HashMap<BlockPos, Integer> fireTicks = new HashMap<>();

	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world == null)
			return;

		BlockPos blockPos = new BlockPos((int)x, (int)y, (int)z);
		BlockPos abovePos = blockPos.above();
		BlockState above = world.getBlockState(abovePos);

		// Wenn Feuer über dem Block ist
		if (above.getBlock() == Blocks.FIRE) {
			int ticks = fireTicks.getOrDefault(blockPos, 0);
			ticks++;

			// Nach 100 Ticks (ca. 5 Sekunden bei 20 TPS)
			if (ticks >= 100) {
				world.setBlock(blockPos, Blocks.SANDSTONE.defaultBlockState(), 3);
				fireTicks.remove(blockPos);
			} else {
				fireTicks.put(blockPos, ticks);
			}
		} else {
			// Wenn kein Feuer mehr da ist, Timer zurücksetzen
			fireTicks.remove(blockPos);
		}
	}
}
