package net.mcreator.spongebobsquarepantsmodreloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.spongebobsquarepantsmodreloaded.entity.SquidwardEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelcalamardo;

public class SquidwardRenderer extends MobRenderer<SquidwardEntity, Modelcalamardo<SquidwardEntity>> {
	public SquidwardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcalamardo(context.bakeLayer(Modelcalamardo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SquidwardEntity entity) {
		return new ResourceLocation("spongebobsquarepantsmodreloaded:textures/calamardo.png");
	}
}
