package emu.gingerps.server.packet.recv;

import emu.gingerps.game.entity.EntityAvatar;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EvtAvatarLockChairReqOuterClass.EvtAvatarLockChairReq;
import emu.gingerps.net.proto.PacketHeadOuterClass.PacketHead;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketEvtAvatarLockChairRsp;

@Opcodes(PacketOpcodes.EvtAvatarLockChairReq)
public class HandlerEvtAvatarLockChairReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        PacketHead head = PacketHead.parseFrom(header);
        EvtAvatarLockChairReq lockChairReq = EvtAvatarLockChairReq.parseFrom(payload);

        EntityAvatar entityAvatar = session.getPlayer().getTeamManager().getCurrentAvatarEntity();

        session.send(new PacketEvtAvatarLockChairRsp(head.getClientSequenceId(), entityAvatar, lockChairReq));
    }

}
