
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package de.jotibi.agarthamod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import de.jotibi.agarthamod.AgarthamodMod;

public class AgarthamodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, AgarthamodMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> AGARTHAMUSIC = REGISTRY.register("agarthamusic", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("agarthamod", "agarthamusic")));
}
