
package de.jotibi.agarthamod.potion;

public class PositivEnergieMobEffect extends InstantenousMobEffect {
	public PositivEnergieMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16711851);
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		PositivEnergieEffectStartedappliedProcedure.execute(entity);
	}
}