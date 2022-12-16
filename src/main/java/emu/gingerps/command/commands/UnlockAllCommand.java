package emu.gingerps.command.commands;

import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;
import emu.gingerps.data.GameData;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.player.PlayerProgressManager;
import emu.gingerps.server.packet.send.PacketOpenStateChangeNotify;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static emu.gingerps.utils.Language.translate;

@Command(label = "unlockall", usage = {""}, permission = "player.unlockall", permissionTargeted = "player.unlockall.others")
public final class UnlockAllCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        Map<Integer, Integer> changed = new HashMap<>();

        for (var state : GameData.getOpenStateList()) {
            // Don't unlock blacklisted open states.
            if (PlayerProgressManager.BLACKLIST_OPEN_STATES.contains(state.getId())) {
                continue;
            }

            if (targetPlayer.getProgressManager().getOpenState(state.getId()) == 0) {
                targetPlayer.getOpenStates().put(state.getId(), 1);
                changed.put(state.getId(), 1);
            }
        }

        targetPlayer.sendPacket(new PacketOpenStateChangeNotify(changed));

        CommandHandler.sendMessage(sender, translate(sender, "commands.unlockall.success", targetPlayer.getNickname()));
    }
}
