
package net.mcreator.spongebobsquarepantsmodreloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.spongebobsquarepantsmodreloaded.entity.PatrickEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelpatrick;

public class PatrickRenderer extends MobRenderer<PatrickEntity, Modelpatrick<PatrickEntity>> {
	public PatrickRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpatrick(context.bakeLayer(Modelpatrick.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PatrickEntity entity) {
		return new ResourceLocation("spongebobsquarepantsmodreloaded:textures/patrick.png");
	}
}
