
package net.mcreator.spongebobsquarepantsmodreloaded.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.spongebobsquarepantsmodreloaded.init.SpongebobsquarepantsmodreloadedModTabs;

public class CheeseItem extends Item {
	public CheeseItem() {
		super(new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.3f)

						.build()));
	}
}
