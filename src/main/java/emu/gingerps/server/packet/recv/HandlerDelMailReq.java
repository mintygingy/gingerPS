package emu.gingerps.server.packet.recv;

import emu.gingerps.gingerps;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.DelMailReqOuterClass;
import emu.gingerps.net.proto.DeleteFriendReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketDelMailRsp;

@Opcodes(PacketOpcodes.DelMailReq)
public class HandlerDelMailReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        DelMailReqOuterClass.DelMailReq req = DelMailReqOuterClass.DelMailReq.parseFrom(payload);
        
        session.getPlayer().getMailHandler().deleteMail(req.getMailIdListList());
    }

}
