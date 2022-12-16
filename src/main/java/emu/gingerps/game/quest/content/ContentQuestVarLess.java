package emu.gingerps.game.quest.content;

import emu.gingerps.gingerps;
import emu.gingerps.data.excels.QuestData;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_CONTENT_QUEST_VAR_LESS)
public class ContentQuestVarLess extends QuestBaseHandler {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestCondition condition, String paramStr, int... params) {
        int questVarValue = quest.getMainQuest().getQuestVars()[params[0]];
        gingerps.getLogger().debug("questVar {} : {}", params[0],questVarValue);
        return questVarValue < params[1];
    }
}
