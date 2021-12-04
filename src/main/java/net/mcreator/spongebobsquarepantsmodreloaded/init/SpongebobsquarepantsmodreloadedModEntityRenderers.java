
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spongebobsquarepantsmodreloaded.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.spongebobsquarepantsmodreloaded.client.renderer.SquiliamRenderer;
import net.mcreator.spongebobsquarepantsmodreloaded.client.renderer.SquidwardRenderer;
import net.mcreator.spongebobsquarepantsmodreloaded.client.renderer.SpongeBobRenderer;
import net.mcreator.spongebobsquarepantsmodreloaded.client.renderer.SandyRenderer;
import net.mcreator.spongebobsquarepantsmodreloaded.client.renderer.PlanktonRenderer;
import net.mcreator.spongebobsquarepantsmodreloaded.client.renderer.PatrickRenderer;
import net.mcreator.spongebobsquarepantsmodreloaded.client.renderer.MrKrabsRenderer;
import net.mcreator.spongebobsquarepantsmodreloaded.client.renderer.MermaidManRenderer;
import net.mcreator.spongebobsquarepantsmodreloaded.client.renderer.ManRayRenderer;
import net.mcreator.spongebobsquarepantsmodreloaded.client.renderer.JellyfishRenderer;
import net.mcreator.spongebobsquarepantsmodreloaded.client.renderer.FlyingDutchmanRenderer;
import net.mcreator.spongebobsquarepantsmodreloaded.client.renderer.DirtyBubbleRenderer;
import net.mcreator.spongebobsquarepantsmodreloaded.client.renderer.BarnacleBoyRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SpongebobsquarepantsmodreloadedModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SpongebobsquarepantsmodreloadedModEntities.SPONGE_BOB, SpongeBobRenderer::new);
		event.registerEntityRenderer(SpongebobsquarepantsmodreloadedModEntities.PATRICK, PatrickRenderer::new);
		event.registerEntityRenderer(SpongebobsquarepantsmodreloadedModEntities.SQUIDWARD, SquidwardRenderer::new);
		event.registerEntityRenderer(SpongebobsquarepantsmodreloadedModEntities.MR_KRABS, MrKrabsRenderer::new);
		event.registerEntityRenderer(SpongebobsquarepantsmodreloadedModEntities.SANDY, SandyRenderer::new);
		event.registerEntityRenderer(SpongebobsquarepantsmodreloadedModEntities.SQUILIAM, SquiliamRenderer::new);
		event.registerEntityRenderer(SpongebobsquarepantsmodreloadedModEntities.MERMAID_MAN, MermaidManRenderer::new);
		event.registerEntityRenderer(SpongebobsquarepantsmodreloadedModEntities.BARNACLE_BOY, BarnacleBoyRenderer::new);
		event.registerEntityRenderer(SpongebobsquarepantsmodreloadedModEntities.PLANKTON, PlanktonRenderer::new);
		event.registerEntityRenderer(SpongebobsquarepantsmodreloadedModEntities.DIRTY_BUBBLE, DirtyBubbleRenderer::new);
		event.registerEntityRenderer(SpongebobsquarepantsmodreloadedModEntities.MAN_RAY, ManRayRenderer::new);
		event.registerEntityRenderer(SpongebobsquarepantsmodreloadedModEntities.FLYING_DUTCHMAN, FlyingDutchmanRenderer::new);
		event.registerEntityRenderer(SpongebobsquarepantsmodreloadedModEntities.JELLYFISH, JellyfishRenderer::new);
	}
}
