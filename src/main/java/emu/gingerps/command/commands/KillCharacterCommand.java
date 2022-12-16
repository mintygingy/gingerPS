package emu.gingerps.command.commands;

import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;
import emu.gingerps.game.entity.EntityAvatar;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.FightProperty;
import emu.gingerps.game.props.LifeState;
import emu.gingerps.server.packet.send.PacketEntityFightPropUpdateNotify;
import emu.gingerps.server.packet.send.PacketLifeStateChangeNotify;

import java.util.List;

import static emu.gingerps.utils.Language.translate;

@Command(label = "killCharacter", aliases = {"suicide", "kill"}, permission = "player.killcharacter", permissionTargeted = "player.killcharacter.others")
public final class KillCharacterCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        EntityAvatar entity = targetPlayer.getTeamManager().getCurrentAvatarEntity();
        entity.setFightProperty(FightProperty.FIGHT_PROP_CUR_HP, 0f);
        // Packets
        entity.getWorld().broadcastPacket(new PacketEntityFightPropUpdateNotify(entity, FightProperty.FIGHT_PROP_CUR_HP));
        entity.getWorld().broadcastPacket(new PacketLifeStateChangeNotify(0, entity, LifeState.LIFE_DEAD));
        // remove
        targetPlayer.getScene().removeEntity(entity);
        entity.onDeath(0);

        CommandHandler.sendMessage(sender, translate(sender, "commands.killCharacter.success", targetPlayer.getNickname()));
    }
}
