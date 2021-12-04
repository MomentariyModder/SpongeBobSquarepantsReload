package net.mcreator.spongebobsquarepantsmodreloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.spongebobsquarepantsmodreloaded.entity.SandyEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelsandy;

public class SandyRenderer extends MobRenderer<SandyEntity, Modelsandy<SandyEntity>> {
	public SandyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsandy(context.bakeLayer(Modelsandy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SandyEntity entity) {
		return new ResourceLocation("spongebobsquarepantsmodreloaded:textures/sandy.png");
	}
}
