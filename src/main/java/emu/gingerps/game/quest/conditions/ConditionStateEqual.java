package emu.gingerps.game.quest.conditions;

import emu.gingerps.gingerps;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.data.excels.QuestData.QuestCondition;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_COND_STATE_EQUAL)
public class ConditionStateEqual extends QuestBaseHandler {

    @Override
    public boolean execute(GameQuest quest, QuestCondition condition, String paramStr, int... params) {
        GameQuest checkQuest = quest.getOwner().getQuestManager().getQuestById(condition.getParam()[0]);
        if (checkQuest == null) {
            /*
            Will spam the console
            //gingerps.getLogger().debug("Warning: quest {} hasn't been started yet!", condition.getParam()[0]);

            */
            return false;
        }
        return checkQuest.getState().getValue() == condition.getParam()[1];
    }

}
