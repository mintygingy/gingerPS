package emu.gingerps.command.commands;

import java.util.List;

import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;
import emu.gingerps.data.GameData;
import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.game.player.Player;
import emu.gingerps.server.packet.send.PacketAvatarFetterDataNotify;

import static emu.gingerps.utils.Language.translate;

@Command(
    label = "setFetterLevel",
    usage = {"<level>"},
    aliases = {"setfetterlvl", "setfriendship"},
    permission = "player.setfetterlevel",
    permissionTargeted = "player.setfetterlevel.others")
public final class SetFetterLevelCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (args.size() != 1) {
            sendUsageMessage(sender);
            return;
        }

        try {
            int fetterLevel = Integer.parseInt(args.get(0));
            if (fetterLevel < 0 || fetterLevel > 10) {
                CommandHandler.sendMessage(sender, translate(sender, "commands.setFetterLevel.range_error"));
                return;
            }
            Avatar avatar = targetPlayer.getTeamManager().getCurrentAvatarEntity().getAvatar();

            avatar.setFetterLevel(fetterLevel);
            if (fetterLevel != 10) {
                avatar.setFetterExp(GameData.getAvatarFetterLevelDataMap().get(fetterLevel).getExp());
            }
            avatar.save();

            targetPlayer.sendPacket(new PacketAvatarFetterDataNotify(avatar));
            CommandHandler.sendMessage(sender, translate(sender, "commands.setFetterLevel.success", fetterLevel));
        } catch (NumberFormatException ignored) {
            CommandHandler.sendMessage(sender, translate(sender, "commands.setFetterLevel.level_error"));
        }
    }

}
