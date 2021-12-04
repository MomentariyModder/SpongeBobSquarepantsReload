package net.mcreator.spongebobsquarepantsmodreloaded.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelgary<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("spongebobsquarepantsmodreloaded", "modelgary"), "main");
	public final ModelPart bone;

	public Modelgary(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 49).addBox(-3.0F, -1.0F, -7.0F, 6.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -9.0F, -1.0F, 6.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(29, 0)
						.addBox(-2.0F, -8.0F, -6.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)).texOffs(0, 16)
						.addBox(-3.0F, -10.0F, -7.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F)).texOffs(29, 0)
						.addBox(1.0F, -8.0F, -6.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)).texOffs(0, 16)
						.addBox(0.0F, -10.0F, -7.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		bone.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
