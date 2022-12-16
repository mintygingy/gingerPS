package emu.gingerps.game.quest.conditions;

import emu.gingerps.gingerps;
import emu.gingerps.data.excels.QuestData;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_COND_QUEST_GLOBAL_VAR_LESS)
public class ConditionQuestGlobalVarLess extends QuestBaseHandler {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestCondition condition, String paramStr, int... params) {
        Integer questGlobalVarValue = quest.getMainQuest().getQuestManager().getQuestGlobalVarValue(Integer.valueOf(params[0]));
        gingerps.getLogger().debug("questGlobarVar {} : {}", params[0],questGlobalVarValue);
        return questGlobalVarValue.intValue() < params[1];
    }
}
