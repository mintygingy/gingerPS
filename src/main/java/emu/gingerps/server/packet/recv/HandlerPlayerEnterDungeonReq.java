package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.PlayerEnterDungeonReq)
public class HandlerPlayerEnterDungeonReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        // Auto template
        PlayerEnterDungeonReq req = PlayerEnterDungeonReq.parseFrom(payload);

        session.getServer().getDungeonSystem().enterDungeon(session.getPlayer(), req.getPointId(), req.getDungeonId());
    }

}
