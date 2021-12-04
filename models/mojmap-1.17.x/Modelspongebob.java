// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelspongebob<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "spongebob"), "main");
	private final ModelPart bone;
	private final ModelPart leftArm;
	private final ModelPart rightArm;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;

	public Modelspongebob(ModelPart root) {
		this.bone = root.getChild("bone");
		this.leftArm = root.getChild("leftArm");
		this.rightArm = root.getChild("rightArm");
		this.leftLeg = root.getChild("leftLeg");
		this.rightLeg = root.getChild("rightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -7.0F, -4.0F, 10.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-0.5F, -2.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).texOffs(24, 0)
						.addBox(2.0F, -1.75F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-3.0F, -1.75F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-0.5F, 3.1F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(0, 22)
						.addBox(-0.5F, 2.5F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-0.5F, 4.25F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).texOffs(0, 24)
						.addBox(-1.0F, 3.75F, -4.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition bone_r1 = bone.addOrReplaceChild("bone_r1",
				CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -1.5038F, -7.6628F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 9.0F, -2.0F));

		PartDefinition leftArm_r1 = leftArm.addOrReplaceChild("leftArm_r1",
				CubeListBuilder.create().texOffs(28, 0)
						.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(28, 3)
						.addBox(-1.0F, 5.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(0, 26)
						.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 9.0F, -2.0F));

		PartDefinition rightArm_r1 = rightArm.addOrReplaceChild("rightArm_r1",
				CubeListBuilder.create().texOffs(28, 0)
						.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(28, 3)
						.addBox(-1.0F, 5.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(0, 26)
						.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg",
				CubeListBuilder.create().texOffs(8, 18)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-0.5F, 2.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 30)
						.addBox(-1.0F, 8.0F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 13.0F, -2.0F));

		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg",
				CubeListBuilder.create().texOffs(8, 18)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-0.5F, 2.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 30)
						.addBox(-1.0F, 8.0F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 13.0F, -2.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, buffer, packedLight, packedOverlay);
		leftArm.render(poseStack, buffer, packedLight, packedOverlay);
		rightArm.render(poseStack, buffer, packedLight, packedOverlay);
		leftLeg.render(poseStack, buffer, packedLight, packedOverlay);
		rightLeg.render(poseStack, buffer, packedLight, packedOverlay);
	}
}