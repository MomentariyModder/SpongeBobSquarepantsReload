
package net.mcreator.spongebobsquarepantsmodreloaded.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.spongebobsquarepantsmodreloaded.init.SpongebobsquarepantsmodreloadedModTabs;

public class KKCocaColaItem extends Item {
	public KKCocaColaItem() {
		super(new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

						.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}
}
