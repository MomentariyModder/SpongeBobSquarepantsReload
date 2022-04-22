
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spongebobsquarepantsmodreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.spongebobsquarepantsmodreloaded.block.KrustyTableBlock;
import net.mcreator.spongebobsquarepantsmodreloaded.block.KrabbyPattyBlockBlock;
import net.mcreator.spongebobsquarepantsmodreloaded.block.FridgeBlock;
import net.mcreator.spongebobsquarepantsmodreloaded.block.CashboxBlock;
import net.mcreator.spongebobsquarepantsmodreloaded.block.BoxforworkersBlock;
import net.mcreator.spongebobsquarepantsmodreloaded.SpongebobsquarepantsmodreloadedMod;

public class SpongebobsquarepantsmodreloadedModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SpongebobsquarepantsmodreloadedMod.MODID);
	public static final RegistryObject<Block> CASHBOX = REGISTRY.register("cashbox", () -> new CashboxBlock());
	public static final RegistryObject<Block> BOXFORWORKERS = REGISTRY.register("boxforworkers", () -> new BoxforworkersBlock());
	public static final RegistryObject<Block> KRABBY_PATTY_BLOCK = REGISTRY.register("krabby_patty_block", () -> new KrabbyPattyBlockBlock());
	public static final RegistryObject<Block> KRUSTY_TABLE = REGISTRY.register("krusty_table", () -> new KrustyTableBlock());
	public static final RegistryObject<Block> FRIDGE = REGISTRY.register("fridge", () -> new FridgeBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BoxforworkersBlock.registerRenderLayer();
			KrabbyPattyBlockBlock.registerRenderLayer();
			KrustyTableBlock.registerRenderLayer();
			FridgeBlock.registerRenderLayer();
		}
	}
}
