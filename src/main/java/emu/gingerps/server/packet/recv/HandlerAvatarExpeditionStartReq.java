package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketAvatarExpeditionStartRsp;
import emu.gingerps.utils.Utils;

@Opcodes(PacketOpcodes.AvatarExpeditionStartReq)
public class HandlerAvatarExpeditionStartReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        AvatarExpeditionStartReq req = AvatarExpeditionStartReq.parseFrom(payload);
        var player = session.getPlayer();

        int startTime = Utils.getCurrentSeconds();
        player.addExpeditionInfo(req.getAvatarGuid(), req.getExpId(), req.getHourTime(), startTime);
        player.save();
        session.send(new PacketAvatarExpeditionStartRsp(player.getExpeditionInfo()));
    }
}
