
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spongebobsquarepantsmodreloaded.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SpongebobsquarepantsmodreloadedModTabs {
	public static CreativeModeTab TAB_SPONGE_BOB_GUI;

	public static void load() {
		TAB_SPONGE_BOB_GUI = new CreativeModeTab("tabsponge_bob_gui") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SpongebobsquarepantsmodreloadedModItems.KRABBY_PATTY.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
