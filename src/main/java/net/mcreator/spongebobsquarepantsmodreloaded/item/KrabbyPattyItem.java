
package net.mcreator.spongebobsquarepantsmodreloaded.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.InteractionResult;

import net.mcreator.spongebobsquarepantsmodreloaded.procedures.KrabbyPattyRightClickedOnBlockProcedure;
import net.mcreator.spongebobsquarepantsmodreloaded.init.SpongebobsquarepantsmodreloadedModTabs;

public class KrabbyPattyItem extends Item {
	public KrabbyPattyItem() {
		super(new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(8).saturationMod(8f)

						.build()));
	}

	@Override
	public InteractionResult onItemUseFirst(ItemStack itemstack, UseOnContext context) {
		KrabbyPattyRightClickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.PASS;
	}
}
