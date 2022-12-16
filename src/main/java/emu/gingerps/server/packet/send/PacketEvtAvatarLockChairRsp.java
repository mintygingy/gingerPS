package emu.gingerps.server.packet.send;

import emu.gingerps.game.entity.EntityAvatar;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EvtAvatarLockChairReqOuterClass.EvtAvatarLockChairReq;
import emu.gingerps.net.proto.EvtAvatarLockChairRspOuterClass.EvtAvatarLockChairRsp;
import emu.gingerps.net.proto.RetcodeOuterClass;

public class PacketEvtAvatarLockChairRsp extends BasePacket {
    public PacketEvtAvatarLockChairRsp(int clientSequence, EntityAvatar entityAvatar, EvtAvatarLockChairReq lockChairReq) {
        super(PacketOpcodes.EvtAvatarLockChairRsp);

        EvtAvatarLockChairRsp p = EvtAvatarLockChairRsp.newBuilder()
                .setRetcode(RetcodeOuterClass.Retcode.RET_SUCC_VALUE)
                .setEntityId(entityAvatar.getId())
                .setPosition(lockChairReq.getPosition())
                .setChairId(lockChairReq.getChairId())
                .build();

        this.setData(p);
    }
}
