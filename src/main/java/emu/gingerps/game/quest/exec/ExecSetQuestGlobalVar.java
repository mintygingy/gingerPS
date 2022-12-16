package emu.gingerps.game.quest.exec;

import emu.gingerps.data.excels.QuestData;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestExecHandler;

@QuestValue(QuestTrigger.QUEST_EXEC_SET_QUEST_GLOBAL_VAR)
public class ExecSetQuestGlobalVar extends QuestExecHandler {
    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        quest.getOwner().getQuestManager().setQuestGlobalVarValue(Integer.valueOf(paramStr[0]),Integer.valueOf(paramStr[1]));
        return true;
    }
}
