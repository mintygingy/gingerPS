package emu.gingerps.command.commands;

import emu.gingerps.gingerps;
import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;
import emu.gingerps.command.Command.TargetRequirement;
import emu.gingerps.game.Account;
import emu.gingerps.game.player.Player;

import java.util.List;

import static emu.gingerps.utils.Language.translate;

@Command(label = "permission", usage = {
    "add <permission>",
    "remove <permission>",
    "clear",
    "list"
}, permission = "permission", targetRequirement = TargetRequirement.PLAYER)
public final class PermissionCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (args.isEmpty() || args.size() > 2) {
            sendUsageMessage(sender);
            return;
        }

        if (!gingerps.getPermissionHandler().EnablePermissionCommand()) {
            CommandHandler.sendTranslatedMessage(sender, "commands.generic.permission_error");
            return;
        }

        String action = args.get(0);
        String permission = "";
        if (args.size() > 1) {
            permission = args.get(1);
        }

        Account account = targetPlayer.getAccount();
        if (account == null) {
            CommandHandler.sendMessage(sender, translate(sender, "commands.permission.account_error"));
            return;
        }

        switch (action) {
            default:
                sendUsageMessage(sender);
                break;
            case "add":
                if (permission.isEmpty()) {
                    sendUsageMessage(sender);
                } else if (account.addPermission(permission)) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.permission.add"));
                } else CommandHandler.sendMessage(sender, translate(sender, "commands.permission.has_error"));
                break;
            case "remove":
                if (account.removePermission(permission)) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.permission.remove"));
                } else CommandHandler.sendMessage(sender, translate(sender, "commands.permission.not_have_error"));
                break;
            case "clear":
                account.clearPermission();
                CommandHandler.sendMessage(sender, translate(sender, "commands.permission.remove"));
                break;
            case "list":
                CommandHandler.sendMessage(sender, String.join("\n", account.getPermissions()));
                break;
        }

        account.save();
    }
}
