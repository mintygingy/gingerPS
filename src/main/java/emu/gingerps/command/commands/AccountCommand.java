package emu.gingerps.command.commands;

import at.favre.lib.crypto.bcrypt.BCrypt;
import emu.gingerps.gingerps;
import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;
import emu.gingerps.config.Configuration;
import emu.gingerps.database.DatabaseHelper;
import emu.gingerps.game.Account;
import emu.gingerps.game.player.Player;

import java.util.List;

import static emu.gingerps.utils.Language.translate;

@Command(
    label = "account",
    usage = {
        "create <username> [<UID>]",  // Only with EXPERIMENTAL_RealPassword == false
        "delete <username>",
        "create <username> <password> [<UID>]",  // Only with EXPERIMENTAL_RealPassword == true
        "resetpass <username> <password>"},  // Only with EXPERIMENTAL_RealPassword == true
    targetRequirement = Command.TargetRequirement.NONE)
public final class AccountCommand implements CommandHandler {
    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (sender != null) {
            CommandHandler.sendTranslatedMessage(sender, "commands.generic.console_execute_error");
            return;
        }

        if (args.size() < 2) {
            sendUsageMessage(sender);
            return;
        }

        String action = args.get(0);
        String username = args.get(1);

        switch (action) {
            default:
                sendUsageMessage(sender);
                return;
            case "create":
                int uid = 0;
                String password = "";

                if (Configuration.ACCOUNT.EXPERIMENTAL_RealPassword == true) {
                    if (args.size() < 3) {
                        CommandHandler.sendMessage(sender, "EXPERIMENTAL_RealPassword requires a password argument");
                        CommandHandler.sendMessage(sender, "Usage: account create <username> <password> [uid]");
                        return;
                    }
                    password = args.get(2);

                    if (args.size() == 4) {
                        try {
                            uid = Integer.parseInt(args.get(3));
                        } catch (NumberFormatException ignored) {
                            CommandHandler.sendMessage(sender, translate(sender, "commands.account.invalid"));
                            if (Configuration.ACCOUNT.EXPERIMENTAL_RealPassword == true) {
                                CommandHandler.sendMessage(sender, "EXPERIMENTAL_RealPassword requires argument 2 to be a password, not a uid");
                                CommandHandler.sendMessage(sender, "Usage: account create <username> <password> [uid]");
                            }
                            return;
                        }
                    }
                } else {
                    if (args.size() > 2) {
                        try {
                            uid = Integer.parseInt(args.get(2));
                        } catch (NumberFormatException ignored) {
                            CommandHandler.sendMessage(sender, translate(sender, "commands.account.invalid"));
                            return;
                        }
                    }
                }

                emu.gingerps.game.Account account = DatabaseHelper.createAccountWithUid(username, uid);
                if (account == null) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.account.exists"));
                    return;
                } else {
                    if (Configuration.ACCOUNT.EXPERIMENTAL_RealPassword == true) {
                        account.setPassword(BCrypt.withDefaults().hashToString(12, password.toCharArray()));
                    }
                    account.addPermission("*");
                    account.save(); // Save account to database.

                    CommandHandler.sendMessage(sender, translate(sender, "commands.account.create", account.getReservedPlayerUid()));
                }
                return;
            case "delete":
                // Get the account we want to delete.
                Account toDelete = DatabaseHelper.getAccountByName(username);

                if (toDelete == null) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.account.no_account"));
                    return;
                }

                DatabaseHelper.deleteAccount(toDelete);
                CommandHandler.sendMessage(sender, translate(sender, "commands.account.delete"));
                return;
            case "resetpass":
                if (Configuration.ACCOUNT.EXPERIMENTAL_RealPassword != true) {
                    CommandHandler.sendMessage(sender, "resetpass requires EXPERIMENTAL_RealPassword to be true.");
                    return;
                }

                if (args.size() != 3) {
                    CommandHandler.sendMessage(sender, "Invalid Args");
                    CommandHandler.sendMessage(sender, "Usage: account resetpass <username> <password>");
                    return;
                }

                Account toUpdate = DatabaseHelper.getAccountByName(username);

                if (toUpdate == null) {
                    CommandHandler.sendMessage(sender, translate(sender, "commands.account.no_account"));
                    return;
                }

                // Make sure player can't stay logged in with old password.
                kickAccount(toUpdate);

                toUpdate.setPassword(BCrypt.withDefaults().hashToString(12, args.get(2).toCharArray()));
                toUpdate.save();
                CommandHandler.sendMessage(sender, "Password Updated.");
                return;
        }
    }

    private void kickAccount(Account account) {
        Player player = gingerps.getGameServer().getPlayerByAccountId(account.getId());
        if (player != null) {
            player.getSession().close();
        }
    }
}
