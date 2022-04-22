// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsandy<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sandy"), "main");
	private final ModelPart head;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;
	private final ModelPart bone;
	private final ModelPart rightArm;
	private final ModelPart leftArm;

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
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -4.0F, -3.0F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(1, 38)
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

		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg",
				CubeListBuilder.create().texOffs(32, 10)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-2.0F, 8.0F, -6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg",
				CubeListBuilder.create().texOffs(32, 10)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-2.0F, 8.0F, -6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 10)
						.addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 26)
						.addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 33)
						.addBox(-1.0F, -8.0F, 6.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(48, 10)
				.addBox(-3.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(48, 10)
				.addBox(-1.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		leftLeg.render(poseStack, buffer, packedLight, packedOverlay);
		rightLeg.render(poseStack, buffer, packedLight, packedOverlay);
		bone.render(poseStack, buffer, packedLight, packedOverlay);
		rightArm.render(poseStack, buffer, packedLight, packedOverlay);
		leftArm.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}