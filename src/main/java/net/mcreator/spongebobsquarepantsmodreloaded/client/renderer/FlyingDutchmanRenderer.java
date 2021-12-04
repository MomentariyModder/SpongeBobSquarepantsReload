package net.mcreator.spongebobsquarepantsmodreloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.spongebobsquarepantsmodreloaded.entity.FlyingDutchmanEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelholandes_volador;

public class FlyingDutchmanRenderer extends MobRenderer<FlyingDutchmanEntity, Modelholandes_volador<FlyingDutchmanEntity>> {
	public FlyingDutchmanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelholandes_volador(context.bakeLayer(Modelholandes_volador.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlyingDutchmanEntity entity) {
		return new ResourceLocation("spongebobsquarepantsmodreloaded:textures/holandes_volador.png");
	}
}
