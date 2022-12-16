package emu.gingerps.game.quest.conditions;

import emu.gingerps.data.excels.QuestData.QuestCondition;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_COND_LUA_NOTIFY)
public class ConditionLuaNotify extends QuestBaseHandler {
    //Wrong implementation. Example: 7010226 has no paramStr
    @Override
    public boolean execute(GameQuest quest, QuestCondition condition, String paramStr, int... params) {
        return condition.getParam()[0] == Integer.parseInt(paramStr);
    }

}
