
package net.mcreator.spongebobsquarepantsmodreloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.spongebobsquarepantsmodreloaded.entity.PlanktonEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelplankton;

public class PlanktonRenderer extends MobRenderer<PlanktonEntity, Modelplankton<PlanktonEntity>> {
	public PlanktonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelplankton(context.bakeLayer(Modelplankton.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PlanktonEntity entity) {
		return new ResourceLocation("spongebobsquarepantsmodreloaded:textures/plankton.png");
	}
}
