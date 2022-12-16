package emu.gingerps.server.packet.recv;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetFriendShowNameCardInfoReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketGetFriendShowNameCardInfoRsp;

@Opcodes(PacketOpcodes.GetFriendShowNameCardInfoReq)
public class HandlerGetFriendShowNameCardInfoReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = GetFriendShowNameCardInfoReqOuterClass.GetFriendShowNameCardInfoReq.parseFrom(payload);

        int targetUid = req.getUid();
        Player target = session.getServer().getPlayerByUid(targetUid, true);

        session.send(new PacketGetFriendShowNameCardInfoRsp(targetUid, target.getShowNameCardInfoList()));
    }
}
