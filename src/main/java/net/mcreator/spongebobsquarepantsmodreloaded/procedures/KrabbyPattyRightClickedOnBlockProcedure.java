package net.mcreator.spongebobsquarepantsmodreloaded.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.spongebobsquarepantsmodreloaded.init.SpongebobsquarepantsmodreloadedModItems;
import net.mcreator.spongebobsquarepantsmodreloaded.init.SpongebobsquarepantsmodreloadedModBlocks;

public class KrabbyPattyRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), SpongebobsquarepantsmodreloadedModBlocks.KRABBY_PATTY_BLOCK.defaultBlockState(),
				3);
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(SpongebobsquarepantsmodreloadedModItems.KRABBY_PATTY);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
