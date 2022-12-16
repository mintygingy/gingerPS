package emu.gingerps.game.quest.exec;

import emu.gingerps.data.excels.QuestData;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestExecHandler;

import java.util.Arrays;

@QuestValue(QuestTrigger.QUEST_EXEC_ADD_QUEST_PROGRESS)
public class ExecAddQuestProgress extends QuestExecHandler {
    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        var param = Arrays.stream(paramStr)
            .filter(i -> !i.isBlank())
            .mapToInt(Integer::parseInt)
            .toArray();

        quest.getOwner().getQuestManager().triggerEvent(QuestTrigger.QUEST_CONTENT_ADD_QUEST_PROGRESS, param);

        return true;
    }
}
