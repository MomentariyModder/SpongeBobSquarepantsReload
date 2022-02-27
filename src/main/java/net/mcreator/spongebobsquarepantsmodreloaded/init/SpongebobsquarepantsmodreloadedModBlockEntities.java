
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spongebobsquarepantsmodreloaded.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.spongebobsquarepantsmodreloaded.block.entity.FridgeBlockEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.block.entity.CashboxBlockEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.block.entity.BoxforworkersBlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpongebobsquarepantsmodreloadedModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> CASHBOX = register("spongebobsquarepantsmodreloaded:cashbox",
			SpongebobsquarepantsmodreloadedModBlocks.CASHBOX, CashboxBlockEntity::new);
	public static final BlockEntityType<?> BOXFORWORKERS = register("spongebobsquarepantsmodreloaded:boxforworkers",
			SpongebobsquarepantsmodreloadedModBlocks.BOXFORWORKERS, BoxforworkersBlockEntity::new);
	public static final BlockEntityType<?> FRIDGE = register("spongebobsquarepantsmodreloaded:fridge",
			SpongebobsquarepantsmodreloadedModBlocks.FRIDGE, FridgeBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
