package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetFriendEnterHomeOptionReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketPlayerHomeCompInfoNotify;
import emu.gingerps.server.packet.send.PacketSetFriendEnterHomeOptionRsp;

@Opcodes(PacketOpcodes.SetFriendEnterHomeOptionReq)
public class HandlerSetFriendEnterHomeOptionReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = SetFriendEnterHomeOptionReqOuterClass.SetFriendEnterHomeOptionReq.parseFrom(payload);

        session.getPlayer().getHome().setEnterHomeOption(req.getOptionValue());
        session.getPlayer().getHome().save();

        session.send(new PacketPlayerHomeCompInfoNotify(session.getPlayer()));
        session.send(new PacketSetFriendEnterHomeOptionRsp());
    }
}
