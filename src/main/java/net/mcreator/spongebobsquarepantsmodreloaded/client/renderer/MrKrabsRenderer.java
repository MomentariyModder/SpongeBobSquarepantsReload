package net.mcreator.spongebobsquarepantsmodreloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.spongebobsquarepantsmodreloaded.entity.MrKrabsEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelcangrejo;

public class MrKrabsRenderer extends MobRenderer<MrKrabsEntity, Modelcangrejo<MrKrabsEntity>> {
	public MrKrabsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcangrejo(context.bakeLayer(Modelcangrejo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MrKrabsEntity entity) {
		return new ResourceLocation("spongebobsquarepantsmodreloaded:textures/cangrejo.png");
	}
}
