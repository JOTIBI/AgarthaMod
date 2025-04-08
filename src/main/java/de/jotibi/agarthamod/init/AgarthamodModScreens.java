
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package de.jotibi.agarthamod.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import de.jotibi.agarthamod.client.gui.Guivillager1Screen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AgarthamodModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(AgarthamodModMenus.GUIVILLAGER_1.get(), Guivillager1Screen::new);
	}
}
