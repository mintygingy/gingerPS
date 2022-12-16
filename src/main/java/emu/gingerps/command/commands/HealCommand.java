package emu.gingerps.command.commands;

import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.FightProperty;
import emu.gingerps.server.packet.send.PacketAvatarFightPropUpdateNotify;
import emu.gingerps.server.packet.send.PacketAvatarLifeStateChangeNotify;

import java.util.List;

import static emu.gingerps.utils.Language.translate;

@Command(label = "heal", aliases = {"h"}, permission = "player.heal", permissionTargeted = "player.heal.others")
public final class HealCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        targetPlayer.getTeamManager().getActiveTeam().forEach(entity -> {
            boolean isAlive = entity.isAlive();
            entity.setFightProperty(
                    FightProperty.FIGHT_PROP_CUR_HP,
                    entity.getFightProperty(FightProperty.FIGHT_PROP_MAX_HP)
            );
            entity.getWorld().broadcastPacket(new PacketAvatarFightPropUpdateNotify(entity.getAvatar(), FightProperty.FIGHT_PROP_CUR_HP));
            if (!isAlive) {
                entity.getWorld().broadcastPacket(new PacketAvatarLifeStateChangeNotify(entity.getAvatar()));
            }
        });
        CommandHandler.sendMessage(sender, translate(sender, "commands.heal.success"));
    }
}
