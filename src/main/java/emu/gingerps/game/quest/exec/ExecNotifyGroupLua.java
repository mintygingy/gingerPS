package emu.gingerps.game.quest.exec;

import emu.gingerps.data.excels.QuestData;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestGroupSuite;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestState;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestExecHandler;
import emu.gingerps.scripts.constants.EventType;
import emu.gingerps.scripts.data.ScriptArgs;
import emu.gingerps.server.packet.send.PacketGroupSuiteNotify;

@QuestValue(QuestTrigger.QUEST_EXEC_NOTIFY_GROUP_LUA)
public class ExecNotifyGroupLua extends QuestExecHandler {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        var sceneId = Integer.parseInt(paramStr[0]);
        var groupId = Integer.parseInt(paramStr[1]);

        var scriptManager = quest.getOwner().getScene().getScriptManager();

        if(quest.getOwner().getScene().getId() == sceneId){
            scriptManager.callEvent(
                quest.getState() == QuestState.QUEST_STATE_FINISHED ?
                    EventType.EVENT_QUEST_FINISH : EventType.EVENT_QUEST_START
                , new ScriptArgs());
        }

        return true;
    }

}
