package emu.gingerps.command.commands;

import emu.gingerps.gingerps;
import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;
import emu.gingerps.game.player.Player;

import java.util.List;

import static emu.gingerps.utils.Language.translate;

@Command(label = "resetShopLimit", aliases = {"resetshop"}, permission = "server.resetshop", permissionTargeted = "server.resetshop.others")
public final class ResetShopLimitCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        targetPlayer.getShopLimit().forEach(x -> x.setNextRefreshTime(0));
        targetPlayer.save();
        CommandHandler.sendMessage(sender, translate(sender, "commands.resetShopLimit.success"));
    }
}
