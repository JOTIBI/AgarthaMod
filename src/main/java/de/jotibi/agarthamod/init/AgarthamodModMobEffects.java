
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package de.jotibi.agarthamod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import de.jotibi.agarthamod.potion.PositivEnergieMobEffect;
import de.jotibi.agarthamod.AgarthamodMod;

public class AgarthamodModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, AgarthamodMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> POSITIV_ENERGIE = REGISTRY.register("positiv_energie", () -> new PositivEnergieMobEffect());
}
