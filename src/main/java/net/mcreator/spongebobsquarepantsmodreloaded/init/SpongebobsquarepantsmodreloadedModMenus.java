
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spongebobsquarepantsmodreloaded.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.spongebobsquarepantsmodreloaded.world.inventory.SecretFormulaGUIMenu;
import net.mcreator.spongebobsquarepantsmodreloaded.world.inventory.FridgeGUIMenu;
import net.mcreator.spongebobsquarepantsmodreloaded.world.inventory.CashboxGUIMenu;
import net.mcreator.spongebobsquarepantsmodreloaded.world.inventory.BoxforworkersGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpongebobsquarepantsmodreloadedModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CashboxGUIMenu> CASHBOX_GUI = register("cashbox_gui",
			(id, inv, extraData) -> new CashboxGUIMenu(id, inv, extraData));
	public static final MenuType<BoxforworkersGUIMenu> BOXFORWORKERS_GUI = register("boxforworkers_gui",
			(id, inv, extraData) -> new BoxforworkersGUIMenu(id, inv, extraData));
	public static final MenuType<FridgeGUIMenu> FRIDGE_GUI = register("fridge_gui", (id, inv, extraData) -> new FridgeGUIMenu(id, inv, extraData));
	public static final MenuType<SecretFormulaGUIMenu> SECRET_FORMULA_GUI = register("secret_formula_gui",
			(id, inv, extraData) -> new SecretFormulaGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
