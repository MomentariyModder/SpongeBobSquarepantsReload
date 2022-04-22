package net.mcreator.spongebobsquarepantsmodreloaded.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class Modelpatrick<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("spongebobsquarepantsmodreloaded", "modelpatrick"), "main");
	public final ModelPart cuerpo;
	public final ModelPart leftLeg;
	public final ModelPart rightLeg;
	public final ModelPart leftArm;
	public final ModelPart rightArm;

	public Modelpatrick(ModelPart root) {
		this.cuerpo = root.getChild("cuerpo");
		this.leftLeg = root.getChild("leftLeg");
		this.rightLeg = root.getChild("rightLeg");
		this.leftArm = root.getChild("leftArm");
		this.rightArm = root.getChild("rightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -6.0F, -5.0F, 10.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-5.0F, -14.0F, -5.0F, 10.0F, 10.0F, 8.0F, new CubeDeformation(-0.5F)).texOffs(40, 0)
						.addBox(-3.0F, -21.0F, -4.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 13.0F, 0.0F));
		PartDefinition leftLeg = partdefinition.addOrReplaceChild(
				"leftLeg", CubeListBuilder.create().texOffs(43, 6).addBox(-2.0F, 2.0F, -3.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(37, 14).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-3.0F, 18.0F, 0.0F));
		PartDefinition rightLeg = partdefinition.addOrReplaceChild(
				"rightLeg", CubeListBuilder.create().texOffs(43, 6).addBox(-2.0F, 2.0F, -3.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(37, 14).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(3.0F, 18.0F, 0.0F));
		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 10.0F, -1.0F));
		PartDefinition leftArm_r1 = leftArm.addOrReplaceChild("leftArm_r1",
				CubeListBuilder.create().texOffs(39, 27).addBox(-2.0F, 5.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 27)
						.addBox(-2.0F, -2.0F, -1.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 10.0F, -1.0F));
		PartDefinition rightArm_r1 = rightArm.addOrReplaceChild("rightArm_r1",
				CubeListBuilder.create().texOffs(39, 27).addBox(-1.0F, 5.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(39, 27)
						.addBox(-1.0F, -2.0F, -1.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		cuerpo.render(poseStack, buffer, packedLight, packedOverlay);
		leftLeg.render(poseStack, buffer, packedLight, packedOverlay);
		rightLeg.render(poseStack, buffer, packedLight, packedOverlay);
		leftArm.render(poseStack, buffer, packedLight, packedOverlay);
		rightArm.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
