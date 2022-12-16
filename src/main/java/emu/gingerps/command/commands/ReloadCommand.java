package emu.gingerps.command.commands;

import emu.gingerps.gingerps;
import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;
import emu.gingerps.game.player.Player;

import java.util.List;

import static emu.gingerps.utils.Language.translate;

@Command(label = "reload", permission = "server.reload", targetRequirement = Command.TargetRequirement.NONE)
public final class ReloadCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        CommandHandler.sendMessage(sender, translate(sender, "commands.reload.reload_start"));

        gingerps.loadConfig();
        gingerps.loadLanguage();
        gingerps.getGameServer().getGachaSystem().load();
        gingerps.getGameServer().getDropSystem().load();
        gingerps.getGameServer().getShopSystem().load();

        CommandHandler.sendMessage(sender, translate(sender, "commands.reload.reload_done"));
    }
}
