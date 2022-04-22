
package net.mcreator.spongebobsquarepantsmodreloaded.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.spongebobsquarepantsmodreloaded.procedures.KrabbyPattyBlockOnBlockRightClickedProcedure;
import net.mcreator.spongebobsquarepantsmodreloaded.init.SpongebobsquarepantsmodreloadedModItems;
import net.mcreator.spongebobsquarepantsmodreloaded.init.SpongebobsquarepantsmodreloadedModBlocks;

import java.util.List;
import java.util.Collections;

public class KrabbyPattyBlockBlock extends Block {
	public KrabbyPattyBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.LILY_PAD).strength(0f, 1f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return box(5, 0, 5, 11, 7, 11).move(offset.x, offset.y, offset.z);
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(SpongebobsquarepantsmodreloadedModItems.KRABBY_PATTY.get());
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(SpongebobsquarepantsmodreloadedModItems.KRABBY_PATTY.get()));
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();

		KrabbyPattyBlockOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(SpongebobsquarepantsmodreloadedModBlocks.KRABBY_PATTY_BLOCK.get(),
				renderType -> renderType == RenderType.cutout());
	}
}
