package net.mcreator.spongebobsquarepantsmodreloaded.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WorldJoinProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("\u00A79| \u00A7eSpongeBob Squarepants Reload"), (false));
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("\u00A79| \u00A7eVersion: \u00A7f2.0"), (false));
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("\u00A79| \u00A7fmomentariymodder.github.io/PerodiumCraft.html"), (false));
	}
}
