package de.jotibi.agarthamod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;

import de.jotibi.agarthamod.init.AgarthamodModMobEffects;

public class AgarthaPlayerEntersDimensionsoundProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(AgarthamodModMobEffects.POSITIV_ENERGIE, 999999, 5));
		if (world instanceof Level _level) {
			if (_level.isClientSide()) {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("agarthamod:agarthamusic")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}
