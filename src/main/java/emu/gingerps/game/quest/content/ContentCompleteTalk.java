package emu.gingerps.game.quest.content;

import emu.gingerps.data.binout.MainQuestData;
import emu.gingerps.game.quest.GameMainQuest;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.data.excels.QuestData.QuestCondition;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_CONTENT_COMPLETE_TALK)
public class ContentCompleteTalk extends QuestBaseHandler {

    @Override
    public boolean execute(GameQuest quest, QuestCondition condition, String paramStr, int... params) {
        GameMainQuest checkMainQuest = quest.getOwner().getQuestManager().getMainQuestById(params[0] / 100);
        if (checkMainQuest == null) {
            return false;
        }

        MainQuestData.TalkData talkData = checkMainQuest.getTalks().get(condition.getParam()[0]);
        return talkData != null;

        // This expression makes zero sense.
        // return talkData == null || condition.getParamStr().contains(paramStr) || checkMainQuest.getChildQuestById(params[0]) != null;
    }
}
