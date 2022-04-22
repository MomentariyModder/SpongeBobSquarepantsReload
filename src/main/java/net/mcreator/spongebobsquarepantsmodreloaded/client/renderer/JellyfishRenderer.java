
package net.mcreator.spongebobsquarepantsmodreloaded.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.spongebobsquarepantsmodreloaded.entity.JellyfishEntity;
import net.mcreator.spongebobsquarepantsmodreloaded.client.model.Modelmedusa;

public class JellyfishRenderer extends MobRenderer<JellyfishEntity, Modelmedusa<JellyfishEntity>> {
	public JellyfishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmedusa(context.bakeLayer(Modelmedusa.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JellyfishEntity entity) {
		return new ResourceLocation("spongebobsquarepantsmodreloaded:textures/medusa.png");
	}
}
