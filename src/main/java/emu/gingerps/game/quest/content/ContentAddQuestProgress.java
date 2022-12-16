package emu.gingerps.game.quest.content;

import emu.gingerps.data.excels.QuestData.QuestCondition;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_CONTENT_ADD_QUEST_PROGRESS)
public class ContentAddQuestProgress extends QuestBaseHandler {

    @Override
    public boolean execute(GameQuest quest, QuestCondition condition, String paramStr, int... params) {
        /*
            //paramStr is a lua group, params[0] may also be a lua group!
             questid = xxxxxx lua group = xxxxxxyy
            count seems relevant only for lua group
        */
        return condition.getParam()[0] == params[0]; //missing params[1], paramStr, and count
    }

}
