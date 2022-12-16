package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.NpcTalkRspOuterClass.NpcTalkRsp;

public class PacketNpcTalkRsp extends BasePacket {
    public PacketNpcTalkRsp(int npcEntityId, int curTalkId, int entityId) {
        super(PacketOpcodes.NpcTalkRsp);

        NpcTalkRsp p = NpcTalkRsp.newBuilder()
                .setNpcEntityId(npcEntityId)
                .setCurTalkId(curTalkId)
                .setEntityId(entityId)
                .build();

        this.setData(p);
    }
}
