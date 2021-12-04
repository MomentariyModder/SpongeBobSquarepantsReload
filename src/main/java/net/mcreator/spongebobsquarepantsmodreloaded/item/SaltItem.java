
package net.mcreator.spongebobsquarepantsmodreloaded.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.spongebobsquarepantsmodreloaded.init.SpongebobsquarepantsmodreloadedModTabs;

public class SaltItem extends Item {
	public SaltItem() {
		super(new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("salt");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}