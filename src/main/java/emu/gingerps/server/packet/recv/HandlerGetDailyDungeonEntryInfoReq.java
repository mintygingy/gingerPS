package emu.gingerps.server.packet.recv;

import emu.gingerps.gingerps;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetDailyDungeonEntryInfoReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketGetDailyDungeonEntryInfoRsp;

@Opcodes(PacketOpcodes.GetDailyDungeonEntryInfoReq)
public class HandlerGetDailyDungeonEntryInfoReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req=
                GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq.parseFrom(payload);

        session.send(new PacketGetDailyDungeonEntryInfoRsp(req.getSceneId()));
    }
}
