package emu.gingerps.command.commands;

import emu.gingerps.gingerps;
import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;
import emu.gingerps.command.Command.TargetRequirement;
import emu.gingerps.game.player.Player;

import java.util.List;

@Command(
    label = "sendMessage",
    aliases = {"say", "sendservmsg", "sendservermessage", "b", "broadcast"},
    usage = {"<message>"},
    permission = "server.sendmessage",
    permissionTargeted = "server.sendmessage.others",
    targetRequirement = TargetRequirement.NONE)
public final class SendMessageCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (args.size() == 0) {
            sendUsageMessage(sender);
            return;
        }

        String message = String.join(" ", args);

        if (targetPlayer == null) {
            for (Player p : gingerps.getGameServer().getPlayers().values()) {
                CommandHandler.sendMessage(p, message);
            }
        } else {
            CommandHandler.sendMessage(targetPlayer, message);
        }
        CommandHandler.sendTranslatedMessage(sender, "commands.sendMessage.success");
    }
}
