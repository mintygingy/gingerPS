package emu.gingerps.game.quest.exec;

import emu.gingerps.data.excels.QuestData;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestExecHandler;

import java.util.Arrays;

@QuestValue(QuestTrigger.QUEST_EXEC_UNLOCK_AREA)
public class ExecUnlockArea extends QuestExecHandler {
    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        // Unlock the trans point for the player.
        int sceneId = Integer.parseInt(paramStr[0]);
        int areaId = Integer.parseInt(paramStr[1]);
        quest.getOwner().getProgressManager().unlockSceneArea(sceneId, areaId);

        // Done.
        return true;
    }
}
