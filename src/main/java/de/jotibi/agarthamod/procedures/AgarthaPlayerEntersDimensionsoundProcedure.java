package de.jotibi.agarthamod.procedures;

import net.neoforged.bus.api.Event;

public class AgarthaPlayerEntersDimensionsoundProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(AgarthamodModMobEffects.POSITIV_ENERGIE, 999999, 5));
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("agarthamod:agarthamusic")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("agarthamod:agarthamusic")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}
