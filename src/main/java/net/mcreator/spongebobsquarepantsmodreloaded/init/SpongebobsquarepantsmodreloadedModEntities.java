
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spongebobsquarepantsmodreloaded.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.spongebobsquarepantsmodreloaded.entity.SquiliamEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.entity.SquidwardEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.entity.SpongeBobEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.entity.SandyEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.entity.PlanktonEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.entity.PatrickEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.entity.MrKrabsEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.entity.MermaidManEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.entity.ManRayEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.entity.JellyfishEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.entity.FlyingDutchmanEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.entity.DirtyBubbleEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.entity.BarnacleBoyEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpongebobsquarepantsmodreloadedModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<SpongeBobEntity> SPONGE_BOB = register("sponge_bob",
			EntityType.Builder.<SpongeBobEntity>of(SpongeBobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpongeBobEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<PatrickEntity> PATRICK = register("patrick",
			EntityType.Builder.<PatrickEntity>of(PatrickEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PatrickEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<SquidwardEntity> SQUIDWARD = register("squidward",
			EntityType.Builder.<SquidwardEntity>of(SquidwardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SquidwardEntity::new).sized(0.6f, 1.95f));
	public static final EntityType<MrKrabsEntity> MR_KRABS = register("mr_krabs",
			EntityType.Builder.<MrKrabsEntity>of(MrKrabsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MrKrabsEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<SandyEntity> SANDY = register("sandy",
			EntityType.Builder.<SandyEntity>of(SandyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SandyEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<SquiliamEntity> SQUILIAM = register("squiliam",
			EntityType.Builder.<SquiliamEntity>of(SquiliamEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SquiliamEntity::new).sized(0.6f, 1.95f));
	public static final EntityType<MermaidManEntity> MERMAID_MAN = register("mermaid_man",
			EntityType.Builder.<MermaidManEntity>of(MermaidManEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MermaidManEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<BarnacleBoyEntity> BARNACLE_BOY = register("barnacle_boy",
			EntityType.Builder.<BarnacleBoyEntity>of(BarnacleBoyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BarnacleBoyEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<PlanktonEntity> PLANKTON = register("plankton",
			EntityType.Builder.<PlanktonEntity>of(PlanktonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PlanktonEntity::new).sized(0.3f, 0.9f));
	public static final EntityType<DirtyBubbleEntity> DIRTY_BUBBLE = register("dirty_bubble",
			EntityType.Builder.<DirtyBubbleEntity>of(DirtyBubbleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DirtyBubbleEntity::new).sized(1f, 1f));
	public static final EntityType<ManRayEntity> MAN_RAY = register("man_ray",
			EntityType.Builder.<ManRayEntity>of(ManRayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ManRayEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<FlyingDutchmanEntity> FLYING_DUTCHMAN = register("flying_dutchman",
			EntityType.Builder.<FlyingDutchmanEntity>of(FlyingDutchmanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlyingDutchmanEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<JellyfishEntity> JELLYFISH = register("jellyfish",
			EntityType.Builder.<JellyfishEntity>of(JellyfishEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JellyfishEntity::new).sized(0.6f, 1.8f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SpongeBobEntity.init();
			PatrickEntity.init();
			SquidwardEntity.init();
			MrKrabsEntity.init();
			SandyEntity.init();
			SquiliamEntity.init();
			MermaidManEntity.init();
			BarnacleBoyEntity.init();
			PlanktonEntity.init();
			DirtyBubbleEntity.init();
			ManRayEntity.init();
			FlyingDutchmanEntity.init();
			JellyfishEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SPONGE_BOB, SpongeBobEntity.createAttributes().build());
		event.put(PATRICK, PatrickEntity.createAttributes().build());
		event.put(SQUIDWARD, SquidwardEntity.createAttributes().build());
		event.put(MR_KRABS, MrKrabsEntity.createAttributes().build());
		event.put(SANDY, SandyEntity.createAttributes().build());
		event.put(SQUILIAM, SquiliamEntity.createAttributes().build());
		event.put(MERMAID_MAN, MermaidManEntity.createAttributes().build());
		event.put(BARNACLE_BOY, BarnacleBoyEntity.createAttributes().build());
		event.put(PLANKTON, PlanktonEntity.createAttributes().build());
		event.put(DIRTY_BUBBLE, DirtyBubbleEntity.createAttributes().build());
		event.put(MAN_RAY, ManRayEntity.createAttributes().build());
		event.put(FLYING_DUTCHMAN, FlyingDutchmanEntity.createAttributes().build());
		event.put(JELLYFISH, JellyfishEntity.createAttributes().build());
	}
}
