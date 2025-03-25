package de.jotibi.agarthamod.procedures;

import net.neoforged.bus.api.Event;

public class AgarthaMasterKeyItemIsCraftedsmeltedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("agarthamod:agarthamusic")), SoundSource.NEUTRAL, 500, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("agarthamod:agarthamusic")), SoundSource.NEUTRAL, 500, 1, false);
			}
		}
	}
}
