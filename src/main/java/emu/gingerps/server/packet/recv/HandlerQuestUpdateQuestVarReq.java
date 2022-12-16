package emu.gingerps.server.packet.recv;

import emu.gingerps.game.quest.GameMainQuest;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PacketHeadOuterClass;
import emu.gingerps.net.proto.PlayerSetPauseReqOuterClass;
import emu.gingerps.net.proto.QuestUpdateQuestVarReqOuterClass;
import emu.gingerps.net.proto.QuestVarOpOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketPlayerSetPauseRsp;
import emu.gingerps.server.packet.send.PacketQuestUpdateQuestVarRsp;

import java.util.List;

@Opcodes(PacketOpcodes.QuestUpdateQuestVarReq)
public class HandlerQuestUpdateQuestVarReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        //Client sends packets. One with the value, and one with the index and the new value to set/inc/dec
        var req = QuestUpdateQuestVarReqOuterClass.QuestUpdateQuestVarReq.parseFrom(payload);
        GameMainQuest mainQuest = session.getPlayer().getQuestManager().getMainQuestById(req.getQuestId()/100);
        List<QuestVarOpOuterClass.QuestVarOp> questVars = req.getQuestVarOpListList();
        if (mainQuest.getQuestVarsUpdate().size() == 0) {
            for (QuestVarOpOuterClass.QuestVarOp questVar : questVars) {
                mainQuest.getQuestVarsUpdate().add(questVar.getValue());
            }
        } else {
            for (QuestVarOpOuterClass.QuestVarOp questVar : questVars) {
                if (questVar.getIsAdd()) {
                    if (questVar.getValue() >= 0) {
                        mainQuest.incQuestVar(questVar.getIndex(), questVar.getValue());
                    } else {
                        mainQuest.decQuestVar(questVar.getIndex(), questVar.getValue());
                    }
                } else {
                    mainQuest.setQuestVar(questVar.getIndex(), mainQuest.getQuestVarsUpdate().get(0));
                }
                //remove the first element from the update list
                mainQuest.getQuestVarsUpdate().remove(0);
            }
        }
        session.send(new PacketQuestUpdateQuestVarRsp(req.getQuestId()));
    }

}
