package emu.gingerps.server.packet.recv;

import emu.gingerps.data.GameData;
import emu.gingerps.data.excels.QuestData;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AddQuestContentProgressReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketAddQuestContentProgressRsp;
import emu.gingerps.data.excels.QuestData.QuestCondition;
import java.util.List;
import java.util.stream.Stream;

@Opcodes(PacketOpcodes.AddQuestContentProgressReq)
public class HandlerAddQuestContentProgressReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = AddQuestContentProgressReqOuterClass.AddQuestContentProgressReq.parseFrom(payload);
        //Find all conditions in quest that are the same as the given one
        Stream<QuestCondition> finishCond = GameData.getQuestDataMap().get(req.getParam()).getFinishCond().stream();
        Stream<QuestCondition> acceptCond = GameData.getQuestDataMap().get(req.getParam()).getAcceptCond().stream();
        Stream<QuestCondition> failCond = GameData.getQuestDataMap().get(req.getParam()).getFailCond().stream();
        List<QuestCondition> allCondMatch = Stream.concat(Stream.concat(acceptCond,failCond),finishCond).filter(p -> p.getType().getValue() == req.getContentType()).toList();
        for (QuestCondition cond : allCondMatch ) {
            session.getPlayer().getQuestManager().triggerEvent(QuestTrigger.getContentTriggerByValue(req.getContentType()), cond.getParam());
        }
        session.send(new PacketAddQuestContentProgressRsp(req.getContentType()));
    }

}
