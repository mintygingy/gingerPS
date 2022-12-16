package emu.gingerps.game.quest.content;

import emu.gingerps.data.excels.QuestData;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_CONTENT_UNLOCK_TRANS_POINT)
public class ContentUnlockTransPoint extends QuestBaseHandler {
    @Override
    public boolean execute(GameQuest quest, QuestData.QuestCondition condition, String paramStr, int... params) {
        return condition.getParam()[0] == params[0] && condition.getParam()[1] == params[1];
    }
}
