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
public class Modelsandy<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("spongebobsquarepantsmodreloaded", "modelsandy"), "main");
	public final ModelPart head;
	public final ModelPart leftLeg;
	public final ModelPart rightLeg;
	public final ModelPart bone;
	public final ModelPart rightArm;
	public final ModelPart leftArm;

	public Modelsandy(ModelPart root) {
		this.head = root.getChild("head");
		this.leftLeg = root.getChild("leftLeg");
		this.rightLeg = root.getChild("rightLeg");
		this.bone = root.getChild("bone");
		this.rightArm = root.getChild("rightArm");
		this.leftArm = root.getChild("leftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -3.0F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(1, 38)
						.addBox(-5.0F, -1.0F, -6.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 38)
						.addBox(-5.0F, -11.0F, -6.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-4.0F, -9.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 34)
						.addBox(-4.0F, -10.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 34)
						.addBox(-4.0F, -8.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 34)
						.addBox(-3.0F, -9.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 34)
						.addBox(-5.0F, -9.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 38)
						.addBox(-5.0F, -1.0F, 5.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 38)
						.addBox(-5.0F, -11.0F, 5.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 38)
						.addBox(5.0F, -10.0F, 5.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 38)
						.addBox(-6.0F, -10.0F, -6.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 38)
						.addBox(5.0F, -10.0F, -6.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 38)
						.addBox(-6.0F, -10.0F, 5.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 38)
						.addBox(5.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(1, 38)
						.addBox(5.0F, -11.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(1, 38)
						.addBox(-6.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(1, 38)
						.addBox(-6.0F, -11.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-3.0F, -8.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(2.0F, -9.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-3.0F, -9.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leftLeg = partdefinition
				.addOrReplaceChild("leftLeg",
						CubeListBuilder.create().texOffs(32, 10).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
								.texOffs(0, 26).addBox(-2.0F, 8.0F, -6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
						PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition rightLeg = partdefinition
				.addOrReplaceChild("rightLeg",
						CubeListBuilder.create().texOffs(32, 10).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
								.texOffs(0, 26).addBox(-2.0F, 8.0F, -6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 10).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 26)
						.addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 33)
						.addBox(-1.0F, -8.0F, 6.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm",
				CubeListBuilder.create().texOffs(48, 10).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 0.0F, 0.0F));
		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm",
				CubeListBuilder.create().texOffs(48, 10).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		leftLeg.render(poseStack, buffer, packedLight, packedOverlay);
		rightLeg.render(poseStack, buffer, packedLight, packedOverlay);
		bone.render(poseStack, buffer, packedLight, packedOverlay);
		rightArm.render(poseStack, buffer, packedLight, packedOverlay);
		leftArm.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
