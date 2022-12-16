package emu.gingerps.command.commands;

import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;
import emu.gingerps.game.avatar.Avatar;
import emu.gingerps.game.entity.EntityAvatar;
import emu.gingerps.game.player.Player;

import java.util.List;

import static emu.gingerps.utils.Language.translate;

@Command(
    label = "resetConst",
    aliases = {"resetconstellation"},
    usage = "[all]",
    permission = "player.resetconstellation",
    permissionTargeted = "player.resetconstellation.others")
public final class ResetConstCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (args.size() > 0 && args.get(0).equalsIgnoreCase("all")) {
            targetPlayer.getAvatars().forEach(this::resetConstellation);
            CommandHandler.sendMessage(sender, translate(sender, "commands.resetConst.reset_all"));
        } else {
            EntityAvatar entity = targetPlayer.getTeamManager().getCurrentAvatarEntity();
            if (entity == null) {
                return;
            }

            Avatar avatar = entity.getAvatar();
            this.resetConstellation(avatar);

            CommandHandler.sendMessage(sender, translate(sender, "commands.resetConst.success", avatar.getAvatarData().getName()));
        }
    }

    private void resetConstellation(Avatar avatar) {
        avatar.forceConstellationLevel(-1);
    }
}
