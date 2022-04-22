
package net.mcreator.spongebobsquarepantsmodreloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.spongebobsquarepantsmodreloaded.entity.SquiliamEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelcalamardo;

public class SquiliamRenderer extends MobRenderer<SquiliamEntity, Modelcalamardo<SquiliamEntity>> {
	public SquiliamRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcalamardo(context.bakeLayer(Modelcalamardo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SquiliamEntity entity) {
		return new ResourceLocation("spongebobsquarepantsmodreloaded:textures/squliam.png");
	}
}
