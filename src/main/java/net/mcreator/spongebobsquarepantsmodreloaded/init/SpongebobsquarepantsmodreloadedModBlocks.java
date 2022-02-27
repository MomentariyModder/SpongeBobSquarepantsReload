
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spongebobsquarepantsmodreloaded.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.spongebobsquarepantsmodreloaded.block.KrustyTableBlock;
import net.mcreator.spongebobsquarepantsmodreloaded.block.KrabbyPattyBlockBlock;
import net.mcreator.spongebobsquarepantsmodreloaded.block.FridgeBlock;
import net.mcreator.spongebobsquarepantsmodreloaded.block.CashboxBlock;
import net.mcreator.spongebobsquarepantsmodreloaded.block.BoxforworkersBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpongebobsquarepantsmodreloadedModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block CASHBOX = register(new CashboxBlock());
	public static final Block BOXFORWORKERS = register(new BoxforworkersBlock());
	public static final Block KRABBY_PATTY_BLOCK = register(new KrabbyPattyBlockBlock());
	public static final Block KRUSTY_TABLE = register(new KrustyTableBlock());
	public static final Block FRIDGE = register(new FridgeBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

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
