package emu.gingerps.command.commands;

import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;
import emu.gingerps.game.player.Player;
import emu.gingerps.utils.Position;

import java.util.List;

@Command(label = "position", aliases = {"pos"})
public final class PositionCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        Position pos = targetPlayer.getPosition();
        Position rot = targetPlayer.getRotation();
        CommandHandler.sendTranslatedMessage(sender, "commands.position.success",
                pos.getX(), pos.getY(), pos.getZ(), rot.getX(), rot.getY(), rot.getZ(), targetPlayer.getSceneId());
    }
}
