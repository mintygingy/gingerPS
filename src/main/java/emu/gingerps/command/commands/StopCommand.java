package emu.gingerps.command.commands;

import emu.gingerps.gingerps;
import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;
import emu.gingerps.game.player.Player;

import java.util.List;

import static emu.gingerps.utils.Language.translate;

@Command(label = "stop", aliases = {"shutdown"}, permission = "server.stop", targetRequirement = Command.TargetRequirement.NONE)
public final class StopCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        CommandHandler.sendMessage(null, translate("commands.stop.success"));
        for (Player p : gingerps.getGameServer().getPlayers().values()) {
            CommandHandler.sendMessage(p, translate(p, "commands.stop.success"));
        }

        System.exit(1000);
    }
}
