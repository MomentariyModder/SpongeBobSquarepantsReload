
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spongebobsquarepantsmodreloaded.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelspongebob;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelsandy;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelplankton;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelpatrick;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelmedusa;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelholandes_volador;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelgary;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelcangrejo;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelcalamardo;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SpongebobsquarepantsmodreloadedModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcalamardo.LAYER_LOCATION, Modelcalamardo::createBodyLayer);
		event.registerLayerDefinition(Modelholandes_volador.LAYER_LOCATION, Modelholandes_volador::createBodyLayer);
		event.registerLayerDefinition(Modelsandy.LAYER_LOCATION, Modelsandy::createBodyLayer);
		event.registerLayerDefinition(Modelgary.LAYER_LOCATION, Modelgary::createBodyLayer);
		event.registerLayerDefinition(Modelpatrick.LAYER_LOCATION, Modelpatrick::createBodyLayer);
		event.registerLayerDefinition(Modelspongebob.LAYER_LOCATION, Modelspongebob::createBodyLayer);
		event.registerLayerDefinition(Modelmedusa.LAYER_LOCATION, Modelmedusa::createBodyLayer);
		event.registerLayerDefinition(Modelplankton.LAYER_LOCATION, Modelplankton::createBodyLayer);
		event.registerLayerDefinition(Modelcangrejo.LAYER_LOCATION, Modelcangrejo::createBodyLayer);
	}
}
