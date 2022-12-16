package emu.gingerps.game.quest.content;

import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.data.excels.QuestData.QuestCondition;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_CONTENT_ENTER_DUNGEON)
public class ContentEnterDungeon extends QuestBaseHandler {

    @Override
    public boolean execute(GameQuest quest, QuestCondition condition, String paramStr, int... params) {
        return condition.getParam()[0] == params[0]; //missing params[1]
    }

}
