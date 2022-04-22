
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spongebobsquarepantsmodreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.spongebobsquarepantsmodreloaded.block.entity.FridgeBlockEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.block.entity.CashboxBlockEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.block.entity.BoxforworkersBlockEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.SpongebobsquarepantsmodreloadedMod;

public class SpongebobsquarepantsmodreloadedModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			SpongebobsquarepantsmodreloadedMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CASHBOX = register("cashbox", SpongebobsquarepantsmodreloadedModBlocks.CASHBOX,
			CashboxBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BOXFORWORKERS = register("boxforworkers",
			SpongebobsquarepantsmodreloadedModBlocks.BOXFORWORKERS, BoxforworkersBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FRIDGE = register("fridge", SpongebobsquarepantsmodreloadedModBlocks.FRIDGE,
			FridgeBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
