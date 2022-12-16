package emu.gingerps.server.packet.recv;

import emu.gingerps.data.GameData;
import emu.gingerps.data.binout.MainQuestData;
import emu.gingerps.data.binout.MainQuestData.TalkData;
import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.game.quest.GameMainQuest;
import emu.gingerps.game.quest.enums.ParentQuestState;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.NpcTalkReqOuterClass.NpcTalkReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketNpcTalkRsp;

@Opcodes(PacketOpcodes.NpcTalkReq)
public class HandlerNpcTalkReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        NpcTalkReq req = NpcTalkReq.parseFrom(payload);

        //Check if mainQuest exists
        //remove last 2 digits to get a mainQuestId
        int talkId = req.getTalkId();
        int mainQuestId = talkId/100;
        MainQuestData mainQuestData = GameData.getMainQuestDataMap().get(mainQuestId);

        if (mainQuestData != null) {
            // This talk is associated with a quest. Handle it.
            // If the quest has no talk data defined on it, create one.
            TalkData talkForQuest = new TalkData(talkId, "");
            if (mainQuestData.getTalks() != null) {
                var talks = mainQuestData.getTalks().stream().filter(p -> p.getId() == talkId).toList();

                if (talks.size() > 0) {
                    talkForQuest = talks.get(0);
                }
            }

            // Add to the list of done talks for this quest.
            var mainQuest = session.getPlayer().getQuestManager().getMainQuestById(mainQuestId);
            if (mainQuest != null) {
                session.getPlayer().getQuestManager().getMainQuestById(mainQuestId).getTalks().put(talkId, talkForQuest);
            }

            // Fire quest triggers.
            session.getPlayer().getQuestManager().triggerEvent(QuestTrigger.QUEST_CONTENT_COMPLETE_ANY_TALK, String.valueOf(req.getTalkId()), 0, 0);
            session.getPlayer().getQuestManager().triggerEvent(QuestTrigger.QUEST_CONTENT_COMPLETE_TALK, req.getTalkId(), 0);
            session.getPlayer().getQuestManager().triggerEvent(QuestTrigger.QUEST_CONTENT_FINISH_PLOT, req.getTalkId(), 0);
        }

        session.send(new PacketNpcTalkRsp(req.getNpcEntityId(), req.getTalkId(), req.getEntityId()));
    }
}
