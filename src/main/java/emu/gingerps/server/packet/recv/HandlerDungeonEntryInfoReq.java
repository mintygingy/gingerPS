package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.DungeonEntryInfoReq)
public class HandlerDungeonEntryInfoReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        DungeonEntryInfoReq req = DungeonEntryInfoReq.parseFrom(payload);

        session.getServer().getDungeonSystem().getEntryInfo(session.getPlayer(), req.getPointId());
    }

}
