// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmedusa<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "medusa"), "main");
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;

	public Modelmedusa(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 26).addBox(
				-4.0F, -18.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(0, 0)
						.addBox(1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(0, 0)
						.addBox(6.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(0, 0)
						.addBox(4.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-3.0F, 14.0F, -4.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(0, 0)
						.addBox(1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(0, 0)
						.addBox(6.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(0, 0)
						.addBox(4.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-3.0F, 14.0F, 3.0F, 0.3491F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, buffer, packedLight, packedOverlay);
		bone2.render(poseStack, buffer, packedLight, packedOverlay);
		bone3.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bone3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.bone2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}