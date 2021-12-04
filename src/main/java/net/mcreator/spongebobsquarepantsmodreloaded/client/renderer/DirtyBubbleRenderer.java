package net.mcreator.spongebobsquarepantsmodreloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.GhastModel;

import net.mcreator.spongebobsquarepantsmodreloaded.entity.DirtyBubbleEntity;

public class DirtyBubbleRenderer extends MobRenderer<DirtyBubbleEntity, GhastModel<DirtyBubbleEntity>> {
	public DirtyBubbleRenderer(EntityRendererProvider.Context context) {
		super(context, new GhastModel(context.bakeLayer(ModelLayers.GHAST)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DirtyBubbleEntity entity) {
		return new ResourceLocation("spongebobsquarepantsmodreloaded:textures/ghast.png");
	}
}
