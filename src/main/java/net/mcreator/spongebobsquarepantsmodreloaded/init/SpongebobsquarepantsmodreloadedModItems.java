
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spongebobsquarepantsmodreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.spongebobsquarepantsmodreloaded.item.TomatoSliceItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.TomatoItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.SpongeBobDriverLicenseItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.SpatulaItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.SecretIngredientItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.SecretFormulaItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.SaltItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.QuarterItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.PennyItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.PatricksDriverLicenseItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.OneDollarItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.NickelItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.MrKrabsDriverlicenseItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.KrabbyPattyItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.KnifeItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.KKCocaColaItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.GoldenSpatulaItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.FrenchFriesItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.FakeDollarItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.DimeItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.ClarinetItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.ChumBurgerItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.CheeseSliceItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.CheeseItem;
import net.mcreator.spongebobsquarepantsmodreloaded.item.BurgerSutletItem;
import net.mcreator.spongebobsquarepantsmodreloaded.SpongebobsquarepantsmodreloadedMod;

public class SpongebobsquarepantsmodreloadedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SpongebobsquarepantsmodreloadedMod.MODID);
	public static final RegistryObject<Item> SPONGE_BOB = REGISTRY.register("sponge_bob_spawn_egg",
			() -> new ForgeSpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.SPONGE_BOB, -2047179, -8627405,
					new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)));
	public static final RegistryObject<Item> PATRICK = REGISTRY.register("patrick_spawn_egg",
			() -> new ForgeSpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.PATRICK, -2323059, -6246327,
					new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)));
	public static final RegistryObject<Item> SQUIDWARD = REGISTRY.register("squidward_spawn_egg",
			() -> new ForgeSpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.SQUIDWARD, -10179162, -8629230,
					new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)));
	public static final RegistryObject<Item> MR_KRABS = REGISTRY.register("mr_krabs_spawn_egg",
			() -> new ForgeSpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.MR_KRABS, -4784128, -5611321,
					new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)));
	public static final RegistryObject<Item> SANDY = REGISTRY.register("sandy_spawn_egg",
			() -> new ForgeSpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.SANDY, -3881788, -7052489,
					new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)));
	public static final RegistryObject<Item> SQUILIAM = REGISTRY.register("squiliam_spawn_egg",
			() -> new ForgeSpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.SQUILIAM, -8277846, -9233612,
					new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)));
	public static final RegistryObject<Item> MERMAID_MAN = REGISTRY.register("mermaid_man_spawn_egg",
			() -> new ForgeSpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.MERMAID_MAN, -22016, -12674281,
					new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)));
	public static final RegistryObject<Item> BARNACLE_BOY = REGISTRY.register("barnacle_boy_spawn_egg",
			() -> new ForgeSpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.BARNACLE_BOY, -1036008, -12565320,
					new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)));
	public static final RegistryObject<Item> PLANKTON = REGISTRY.register("plankton_spawn_egg",
			() -> new ForgeSpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.PLANKTON, -13847953, -3322581,
					new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)));
	public static final RegistryObject<Item> DIRTY_BUBBLE = REGISTRY.register("dirty_bubble_spawn_egg",
			() -> new ForgeSpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.DIRTY_BUBBLE, -3956640, -9480145,
					new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)));
	public static final RegistryObject<Item> MAN_RAY = REGISTRY.register("man_ray_spawn_egg",
			() -> new ForgeSpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.MAN_RAY, -16623178, -2283211,
					new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)));
	public static final RegistryObject<Item> FLYING_DUTCHMAN = REGISTRY.register("flying_dutchman_spawn_egg",
			() -> new ForgeSpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.FLYING_DUTCHMAN, -8145325, -16766464,
					new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)));
	public static final RegistryObject<Item> PENNY = REGISTRY.register("penny", () -> new PennyItem());
	public static final RegistryObject<Item> NICKEL = REGISTRY.register("nickel", () -> new NickelItem());
	public static final RegistryObject<Item> QUARTER = REGISTRY.register("quarter", () -> new QuarterItem());
	public static final RegistryObject<Item> ONE_DOLLAR = REGISTRY.register("one_dollar", () -> new OneDollarItem());
	public static final RegistryObject<Item> DIME = REGISTRY.register("dime", () -> new DimeItem());
	public static final RegistryObject<Item> KNIFE = REGISTRY.register("knife", () -> new KnifeItem());
	public static final RegistryObject<Item> SPATULA = REGISTRY.register("spatula", () -> new SpatulaItem());
	public static final RegistryObject<Item> GOLDEN_SPATULA = REGISTRY.register("golden_spatula", () -> new GoldenSpatulaItem());
	public static final RegistryObject<Item> SECRET_FORMULA = REGISTRY.register("secret_formula", () -> new SecretFormulaItem());
	public static final RegistryObject<Item> SECRET_INGREDIENT = REGISTRY.register("secret_ingredient", () -> new SecretIngredientItem());
	public static final RegistryObject<Item> BURGER_SUTLET = REGISTRY.register("burger_sutlet", () -> new BurgerSutletItem());
	public static final RegistryObject<Item> TOMATO = REGISTRY.register("tomato", () -> new TomatoItem());
	public static final RegistryObject<Item> TOMATO_SLICE = REGISTRY.register("tomato_slice", () -> new TomatoSliceItem());
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> CHEESE_SLICE = REGISTRY.register("cheese_slice", () -> new CheeseSliceItem());
	public static final RegistryObject<Item> SALT = REGISTRY.register("salt", () -> new SaltItem());
	public static final RegistryObject<Item> KRABBY_PATTY = REGISTRY.register("krabby_patty", () -> new KrabbyPattyItem());
	public static final RegistryObject<Item> CHUM_BURGER = REGISTRY.register("chum_burger", () -> new ChumBurgerItem());
	public static final RegistryObject<Item> FRENCH_FRIES = REGISTRY.register("french_fries", () -> new FrenchFriesItem());
	public static final RegistryObject<Item> KK_COCA_COLA = REGISTRY.register("kk_coca_cola", () -> new KKCocaColaItem());
	public static final RegistryObject<Item> CASHBOX = block(SpongebobsquarepantsmodreloadedModBlocks.CASHBOX,
			SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI);
	public static final RegistryObject<Item> BOXFORWORKERS = block(SpongebobsquarepantsmodreloadedModBlocks.BOXFORWORKERS,
			SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI);
	public static final RegistryObject<Item> JELLYFISH = REGISTRY.register("jellyfish_spawn_egg",
			() -> new ForgeSpawnEggItem(SpongebobsquarepantsmodreloadedModEntities.JELLYFISH, -65281, -65281,
					new Item.Properties().tab(SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI)));
	public static final RegistryObject<Item> KRABBY_PATTY_BLOCK = block(SpongebobsquarepantsmodreloadedModBlocks.KRABBY_PATTY_BLOCK, null);
	public static final RegistryObject<Item> KRUSTY_TABLE = block(SpongebobsquarepantsmodreloadedModBlocks.KRUSTY_TABLE,
			SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI);
	public static final RegistryObject<Item> CLARINET = REGISTRY.register("clarinet", () -> new ClarinetItem());
	public static final RegistryObject<Item> FRIDGE = block(SpongebobsquarepantsmodreloadedModBlocks.FRIDGE,
			SpongebobsquarepantsmodreloadedModTabs.TAB_SPONGE_BOB_GUI);
	public static final RegistryObject<Item> PATRICKS_DRIVER_LICENSE = REGISTRY.register("patricks_driver_license",
			() -> new PatricksDriverLicenseItem());
	public static final RegistryObject<Item> SPONGE_BOB_DRIVER_LICENSE = REGISTRY.register("sponge_bob_driver_license",
			() -> new SpongeBobDriverLicenseItem());
	public static final RegistryObject<Item> MR_KRABS_DRIVERLICENSE = REGISTRY.register("mr_krabs_driverlicense",
			() -> new MrKrabsDriverlicenseItem());
	public static final RegistryObject<Item> FAKE_DOLLAR = REGISTRY.register("fake_dollar", () -> new FakeDollarItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
