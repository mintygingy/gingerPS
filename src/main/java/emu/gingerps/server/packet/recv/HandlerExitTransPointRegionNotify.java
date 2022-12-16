package emu.gingerps.server.packet.recv;

import emu.gingerps.gingerps;
import emu.gingerps.game.managers.SotSManager;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.ExitTransPointRegionNotify)
public class HandlerExitTransPointRegionNotify extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception{
        session.getPlayer().getSotsManager().handleExitTransPointRegionNotify();
    }
}
