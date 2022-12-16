package emu.gingerps.game.quest.exec;

import emu.gingerps.data.excels.QuestData;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestExecHandler;

@QuestValue(QuestTrigger.QUEST_EXEC_UNLOCK_POINT)
public class ExecUnlockPoint extends QuestExecHandler {
    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        // Unlock the trans point for the player.
        int sceneId = Integer.parseInt(paramStr[0]);
        int pointId = Integer.parseInt(paramStr[1]);
        boolean isStatue = quest.getMainQuestId() == 303 || quest.getMainQuestId() == 352;

        quest.getOwner().getProgressManager().unlockTransPoint(sceneId, pointId, isStatue);

        // Done.
        return true;
    }
}
