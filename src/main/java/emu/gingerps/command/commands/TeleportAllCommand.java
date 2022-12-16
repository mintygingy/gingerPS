package emu.gingerps.command.commands;

import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;
import emu.gingerps.game.player.Player;
import emu.gingerps.server.event.player.PlayerTeleportEvent.TeleportType;

import java.util.List;

import static emu.gingerps.utils.Language.translate;

@Command(label = "teleportAll", aliases = {"tpall"}, permission = "player.tpall", permissionTargeted = "player.tpall.others")
public final class TeleportAllCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (!targetPlayer.getWorld().isMultiplayer()) {
            CommandHandler.sendMessage(sender, translate(sender, "commands.teleportAll.error"));
            return;
        }

        for (Player player : targetPlayer.getWorld().getPlayers()) {
            if (player.equals(targetPlayer))
                continue;

            player.getWorld().transferPlayerToScene(player, targetPlayer.getSceneId(), TeleportType.COMMAND, targetPlayer.getPosition());
        }

        CommandHandler.sendMessage(sender, translate(sender, "commands.teleportAll.success"));
    }
}
