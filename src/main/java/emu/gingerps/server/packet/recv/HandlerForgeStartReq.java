package emu.gingerps.server.packet.recv;

import java.lang.invoke.StringConcatFactory;

import emu.gingerps.gingerps;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ForgeStartReqOuterClass;
import emu.gingerps.net.proto.DeleteFriendReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketDelMailRsp;

@Opcodes(PacketOpcodes.ForgeStartReq)
public class HandlerForgeStartReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        ForgeStartReqOuterClass.ForgeStartReq req = ForgeStartReqOuterClass.ForgeStartReq.parseFrom(payload);
        session.getPlayer().getForgingManager().handleForgeStartReq(req);
    }

}
