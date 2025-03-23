package de.jotibi.agarthamod.procedures;

import net.neoforged.bus.api.Event;

public class AgarthaPlayerLeavesDimensionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeAllEffects();
	}
}
