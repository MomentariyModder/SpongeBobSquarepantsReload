
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spongebobsquarepantsmodreloaded.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.spongebobsquarepantsmodreloaded.item.TomatoSliceItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.TomatoItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.SpatulaItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.SecretIngredientItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.SecretFormulaItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.SaltItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.QuarterItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.PennyItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.OneDollarItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.NickelItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.KrabbyPattyItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.KnifeItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.KKCocaColaItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.GoldenSpatulaItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.FrenchFriesItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.DimeItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.ChumBurgerItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.CheeseSliceItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.CheeseItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.BurgerSutletItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpongebobsquarepantsmodreloadedModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item SPONGE_BOB = register(new SpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.SPONGE_BOB, -2047179, -8627405,
			new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)).setRegistryName("sponge_bob_spawn_egg"));
	public static final Item PATRICK = register(new SpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.PATRICK, -2323059, -6246327,
			new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)).setRegistryName("patrick_spawn_egg"));
	public static final Item SQUIDWARD = register(new SpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.SQUIDWARD, -10179162, -8629230,
			new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)).setRegistryName("squidward_spawn_egg"));
	public static final Item MR_KRABS = register(new SpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.MR_KRABS, -4784128, -5611321,
			new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)).setRegistryName("mr_krabs_spawn_egg"));
	public static final Item SANDY = register(new SpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.SANDY, -3881788, -7052489,
			new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)).setRegistryName("sandy_spawn_egg"));
	public static final Item SQUILIAM = register(new SpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.SQUILIAM, -8277846, -9233612,
			new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)).setRegistryName("squiliam_spawn_egg"));
	public static final Item MERMAID_MAN = register(new SpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.MERMAID_MAN, -22016, -12674281,
			new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)).setRegistryName("mermaid_man_spawn_egg"));
	public static final Item BARNACLE_BOY = register(new SpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.BARNACLE_BOY, -1036008, -12565320,
			new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)).setRegistryName("barnacle_boy_spawn_egg"));
	public static final Item PLANKTON = register(new SpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.PLANKTON, -13847953, -3322581,
			new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)).setRegistryName("plankton_spawn_egg"));
	public static final Item DIRTY_BUBBLE = register(new SpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.DIRTY_BUBBLE, -3956640, -9480145,
			new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)).setRegistryName("dirty_bubble_spawn_egg"));
	public static final Item MAN_RAY = register(new SpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.MAN_RAY, -16623178, -2283211,
			new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)).setRegistryName("man_ray_spawn_egg"));
	public static final Item FLYING_DUTCHMAN = register(new SpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.FLYING_DUTCHMAN, -8145325,
			-16766464, new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI))
					.setRegistryName("flying_dutchman_spawn_egg"));
	public static final Item PENNY = register(new PennyItem());
	public static final Item NICKEL = register(new NickelItem());
	public static final Item QUARTER = register(new QuarterItem());
	public static final Item ONE_DOLLAR = register(new OneDollarItem());
	public static final Item DIME = register(new DimeItem());
	public static final Item KNIFE = register(new KnifeItem());
	public static final Item SPATULA = register(new SpatulaItem());
	public static final Item GOLDEN_SPATULA = register(new GoldenSpatulaItem());
	public static final Item SECRET_FORMULA = register(new SecretFormulaItem());
	public static final Item SECRET_INGREDIENT = register(new SecretIngredientItem());
	public static final Item BURGER_SUTLET = register(new BurgerSutletItem());
	public static final Item TOMATO = register(new TomatoItem());
	public static final Item TOMATO_SLICE = register(new TomatoSliceItem());
	public static final Item CHEESE = register(new CheeseItem());
	public static final Item CHEESE_SLICE = register(new CheeseSliceItem());
	public static final Item SALT = register(new SaltItem());
	public static final Item KRABBY_PATTY = register(new KrabbyPattyItem());
	public static final Item CHUM_BURGER = register(new ChumBurgerItem());
	public static final Item FRENCH_FRIES = register(new FrenchFriesItem());
	public static final Item KK_COCA_COLA = register(new KKCocaColaItem());
	public static final Item CASHBOX = register(SpongebobsquarepantsmodreloadedModBlocks.CASHBOX,
			SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI);
	public static final Item BOXFORWORKERS = register(SpongebobsquarepantsmodreloadedModBlocks.BOXFORWORKERS,
			SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI);
	public static final Item JELLYFISH = register(new SpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.JELLYFISH, -65281, -65281,
			new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)).setRegistryName("jellyfish_spawn_egg"));
	public static final Item KELPS = register(SpongebobsquarepantsmodreloadedModBlocks.KELPS, CreativeModeTab.TAB_DECORATIONS);
	public static final Item KRABBY_PATTY_BLOCK = register(SpongebobsquarepantsmodreloadedModBlocks.KRABBY_PATTY_BLOCK, null);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
