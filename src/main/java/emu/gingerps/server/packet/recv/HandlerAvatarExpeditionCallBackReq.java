package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketAvatarExpeditionCallBackRsp;

@Opcodes(PacketOpcodes.AvatarExpeditionCallBackReq)
public class HandlerAvatarExpeditionCallBackReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        AvatarExpeditionCallBackReq req = AvatarExpeditionCallBackReq.parseFrom(payload);
        var player = session.getPlayer();

        for (int i = 0; i < req.getAvatarGuidCount(); i++) {
            player.removeExpeditionInfo(req.getAvatarGuid(i));
        }

        player.save();
        session.send(new PacketAvatarExpeditionCallBackRsp(player.getExpeditionInfo()));
    }
}
