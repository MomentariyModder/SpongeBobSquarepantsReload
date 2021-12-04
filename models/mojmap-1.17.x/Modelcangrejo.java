// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcangrejo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cangrejo"), "main");
	private final ModelPart bone;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;

	public Modelcangrejo(ModelPart root) {
		this.bone = root.getChild("bone");
		this.leftLeg = root.getChild("leftLeg");
		this.rightLeg = root.getChild("rightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(24, 50)
						.addBox(-7.0F, -11.0F, -4.0F, 12.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 18)
						.addBox(-6.0F, -12.0F, -4.0F, 10.0F, 2.0F, 8.0F, new CubeDeformation(-0.14F)).texOffs(52, 0)
						.addBox(5.0F, -11.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
						.addBox(-12.0F, -11.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 58)
						.addBox(10.0F, -11.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 58)
						.addBox(-13.0F, -11.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(9.0F, -6.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-14.0F, -6.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 34)
						.addBox(-6.0F, -5.0F, -4.0F, 10.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-5.0F, -14.0F, -4.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(-0.45F)).texOffs(0, 18)
						.addBox(-1.5F, -13.5F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(4, 0)
						.addBox(0.0F, -23.2F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(-0.4F)).texOffs(4, 0)
						.addBox(-4.0F, -23.2F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(-0.4F)),
				PartPose.offset(1.0F, 24.0F, 0.0F));

		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 21.0F, 0.0F));

		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 21.0F, 0.0F));

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
		leftLeg.render(poseStack, buffer, packedLight, packedOverlay);
		rightLeg.render(poseStack, buffer, packedLight, packedOverlay);
	}
}