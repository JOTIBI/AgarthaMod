
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package de.jotibi.agarthamod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import de.jotibi.agarthamod.world.inventory.Guivillager1Menu;
import de.jotibi.agarthamod.AgarthamodMod;

public class AgarthamodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, AgarthamodMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<Guivillager1Menu>> GUIVILLAGER_1 = REGISTRY.register("guivillager_1", () -> IMenuTypeExtension.create(Guivillager1Menu::new));
}
