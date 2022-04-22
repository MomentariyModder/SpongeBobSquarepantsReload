
package net.mcreator.spongebobsquarepantsmodreloaded.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.spongebobsquarepantsmodreloaded.init.SpongebobsquarepantsmodreloadedModTabs;

public class MrKrabsDriverlicenseItem extends Item {
	public MrKrabsDriverlicenseItem() {
		super(new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
