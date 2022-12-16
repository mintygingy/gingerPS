package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.QuestUpdateQuestVarReqOuterClass;
import emu.gingerps.net.proto.QuestUpdateQuestVarRspOuterClass;

@Opcodes(PacketOpcodes.QuestUpdateQuestVarReq)
public class PacketQuestUpdateQuestVarRsp extends BasePacket {


    public PacketQuestUpdateQuestVarRsp(int questId) {
        super(PacketOpcodes.QuestUpdateQuestVarRsp);
        var rsp = QuestUpdateQuestVarRspOuterClass.QuestUpdateQuestVarRsp.newBuilder()
            .setQuestId(questId).build();
        this.setData(rsp);
    }
}
