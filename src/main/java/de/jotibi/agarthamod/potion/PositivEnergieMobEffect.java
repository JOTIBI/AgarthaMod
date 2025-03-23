
package de.jotibi.agarthamod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.InstantenousMobEffect;

import de.jotibi.agarthamod.procedures.PositivEnergieEffectStartedappliedProcedure;

public class PositivEnergieMobEffect extends InstantenousMobEffect {
	public PositivEnergieMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16711851);
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		PositivEnergieEffectStartedappliedProcedure.execute(entity);
	}
}
