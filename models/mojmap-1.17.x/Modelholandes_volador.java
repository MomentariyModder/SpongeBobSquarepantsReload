// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelholandes_volador<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "holandes_volador"), "main");
	private final ModelPart bone;
	private final ModelPart head;
	private final ModelPart rightLeg;
	private final ModelPart leftLeg;

	public Modelholandes_volador(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = root.getChild("head");
		this.rightLeg = root.getChild("rightLeg");
		this.leftLeg = root.getChild("leftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -14.5F, -3.0F, 8.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, 0.0F));

		PartDefinition bone_r1 = bone.addOrReplaceChild("bone_r1",
				CubeListBuilder.create().texOffs(48, 15).addBox(-2.0F, 7.1F, 6.7F, 4.0F, 6.0F, 4.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -1.5446F, 0.0F, 0.0F));

		PartDefinition bone_r2 = bone.addOrReplaceChild("bone_r2",
				CubeListBuilder.create().texOffs(48, 15).addBox(-2.0F, 6.0F, 1.8F, 4.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone_r3 = bone.addOrReplaceChild("bone_r3",
				CubeListBuilder.create().texOffs(42, 0).addBox(-3.0F, -2.0F, -2.8F, 6.0F, 10.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 21)
						.addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(3.0F, -7.0F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(-11.0F, -7.0F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-10.0F, -8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(9.0F, -8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-10.0F, -6.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(9.0F, -6.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 25)
						.addBox(-5.0F, -1.0F, -5.5F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(42, 25)
						.addBox(-0.2F, 1.0F, -5.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 25)
						.addBox(1.8F, -2.0F, -5.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 25)
						.addBox(-3.0F, -3.0F, -5.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 16)
						.addBox(-0.5F, -3.7F, -7.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(42, 25)
						.addBox(-4.8F, -2.0F, -5.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 25)
						.addBox(-2.2F, 3.0F, -5.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 25)
						.addBox(-4.2F, 1.0F, -5.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-5.0F, -15.0F, -5.0F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.1F)).texOffs(0, 41)
						.addBox(-5.0F, -19.0F, -5.0F, 10.0F, 5.0F, 10.0F, new CubeDeformation(1.1F)).texOffs(9, 46)
						.addBox(5.0F, -15.0F, -2.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(9, 46)
						.addBox(5.0F, -19.0F, -2.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(1.1F)).texOffs(9, 46)
						.addBox(-10.0F, -15.0F, -2.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(9, 46)
						.addBox(-10.0F, -19.0F, -2.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(1.1F)),
				PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(37, 18).addBox(4.0F, -1.0F, -5.0F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-4.5F, -2.0F, -5.0F, -0.3142F, 0.0F, 0.0F));

		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create(),
				PartPose.offset(4.0F, -4.0F, 0.0F));

		PartDefinition rightLeg_r1 = rightLeg.addOrReplaceChild("rightLeg_r1",
				CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, 8.0F, -1.0F, 2.0F, 9.0F, 2.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.7F, 1.2F, 0.0F, 0.0F, -0.0436F));

		PartDefinition rightLeg_r2 = rightLeg.addOrReplaceChild("rightLeg_r2",
				CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, 0.0F, -1.0F, 2.0F, 9.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, -0.0436F));

		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create(),
				PartPose.offset(-4.0F, -4.0F, 0.0F));

		PartDefinition leftLeg_r1 = leftLeg.addOrReplaceChild("leftLeg_r1",
				CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, 8.0F, -1.0F, 2.0F, 9.0F, 2.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-2.0F, 0.7F, 1.2F, 0.0F, 0.0F, 0.0436F));

		PartDefinition leftLeg_r2 = leftLeg.addOrReplaceChild("leftLeg_r2",
				CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, 0.0F, -1.0F, 2.0F, 9.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0436F));

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
		head.render(poseStack, buffer, packedLight, packedOverlay);
		rightLeg.render(poseStack, buffer, packedLight, packedOverlay);
		leftLeg.render(poseStack, buffer, packedLight, packedOverlay);
	}
}