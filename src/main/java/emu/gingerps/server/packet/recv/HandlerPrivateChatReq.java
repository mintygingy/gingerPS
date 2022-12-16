package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PrivateChatReqOuterClass.PrivateChatReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.PrivateChatReq)
public class HandlerPrivateChatReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        PrivateChatReq req = PrivateChatReq.parseFrom(payload);
        PrivateChatReq.ContentCase content = req.getContentCase();

        if (content == PrivateChatReq.ContentCase.TEXT) {
            session.getServer().getChatSystem().sendPrivateMessage(session.getPlayer(), req.getTargetUid(), req.getText());
        } else if (content == PrivateChatReq.ContentCase.ICON) {
            session.getServer().getChatSystem().sendPrivateMessage(session.getPlayer(), req.getTargetUid(), req.getIcon());
        }
    }

}
