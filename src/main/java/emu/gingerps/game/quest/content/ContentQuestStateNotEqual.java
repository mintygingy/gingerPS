package emu.gingerps.game.quest.content;

import emu.gingerps.data.excels.QuestData;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_CONTENT_QUEST_STATE_NOT_EQUAL)
public class ContentQuestStateNotEqual extends QuestBaseHandler {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestCondition condition, String paramStr, int... params) {
        GameQuest checkQuest = quest.getOwner().getQuestManager().getQuestById(params[0]);

        if (checkQuest != null) {
            return checkQuest.getState().getValue() != params[1];
        }

        return false;
    }

}
