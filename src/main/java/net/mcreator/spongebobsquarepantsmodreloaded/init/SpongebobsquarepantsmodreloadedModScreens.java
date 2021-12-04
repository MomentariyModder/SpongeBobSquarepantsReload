
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spongebobsquarepantsmodreloaded.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.spongebobsquarepantsmodreloaded.client.gui.CashboxGUIScreen;
import net.mcreator.spongebobsquarepantsmodreloaded.client.gui.BoxforworkersGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SpongebobsquarepantsmodreloadedModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(SpongebobsquarepantsmodreloadedModMenus.CASHBOX_GUI, CashboxGUIScreen::new);
			MenuScreens.register(SpongebobsquarepantsmodreloadedModMenus.BOXFORWORKERS_GUI, BoxforworkersGUIScreen::new);
		});
	}
}
