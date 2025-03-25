package de.jotibi.agarthamod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import de.jotibi.agarthamod.init.AgarthamodModMobEffects;

public class AgarthaPlayerEntersDimensionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(AgarthamodModMobEffects.POSITIV_ENERGIE, 999999, 5));
	}
}
