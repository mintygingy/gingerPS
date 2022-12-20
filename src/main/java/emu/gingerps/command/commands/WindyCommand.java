package emu.gingerps.command.commands;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.server.packet.send.PacketWindSeedClientNotify;
import java.util.List;
import emu.gingerps.game.player.Player;
import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;

@Command(label = "windy", usage = "windy", aliases = { "w" }, permission = "player.windy", permissionTargeted = "player.windy.others")
public class WindyCommand implements CommandHandler
{
    @Override
    public void execute(final Player sender, final Player targetPlayer, final List<String> args) {
		
		String path = "C:/Windy/" + args.get(0) + ".luac";
		targetPlayer.sendPacket(new PacketWindSeedClientNotify(path));
        CommandHandler.sendMessage(sender, "Sob!");
    }
}