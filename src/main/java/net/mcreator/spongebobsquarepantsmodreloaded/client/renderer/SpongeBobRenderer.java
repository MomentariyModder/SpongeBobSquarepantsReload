package net.mcreator.spongebobsquarepantsmodreloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.spongebobsquarepantsmodreloaded.entity.SpongeBobEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelspongebob;

public class SpongeBobRenderer extends MobRenderer<SpongeBobEntity, Modelspongebob<SpongeBobEntity>> {
	public SpongeBobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspongebob(context.bakeLayer(Modelspongebob.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpongeBobEntity entity) {
		return new ResourceLocation("spongebobsquarepantsmodreloaded:textures/spongebob.png");
	}
}
