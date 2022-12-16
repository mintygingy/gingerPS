package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketAvatarExpeditionAllDataRsp;

@Opcodes(PacketOpcodes.AvatarExpeditionAllDataReq)
public class HandlerAvatarExpeditionAllDataReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var player = session.getPlayer();
        session.send(new PacketAvatarExpeditionAllDataRsp(player.getExpeditionInfo(), player.getExpeditionLimit()));
    }
}
