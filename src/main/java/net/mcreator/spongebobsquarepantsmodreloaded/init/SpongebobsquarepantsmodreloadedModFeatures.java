
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spongebobsquarepantsmodreloaded.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.spongebobsquarepantsmodreloaded.world.features.PrisonFeature;
import net.mcreator.spongebobsquarepantsmodreloaded.world.features.KrustyCrabFeature;
import net.mcreator.spongebobsquarepantsmodreloaded.SpongebobsquarepantsmodreloadedMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class SpongebobsquarepantsmodreloadedModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES,
			SpongebobsquarepantsmodreloadedMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> KRUSTY_CRAB = register("krusty_crab", KrustyCrabFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, KrustyCrabFeature.GENERATE_BIOMES, KrustyCrabFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PRISON = register("prison", PrisonFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, PrisonFeature.GENERATE_BIOMES, PrisonFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
