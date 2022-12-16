package emu.gingerps.game.quest.content;

import emu.gingerps.data.binout.MainQuestData;
import emu.gingerps.game.quest.GameMainQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.data.excels.QuestData.QuestCondition;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_CONTENT_FINISH_PLOT)
public class ContentFinishPlot extends QuestBaseHandler {

    @Override
    public boolean execute(GameQuest quest, QuestCondition condition, String paramStr, int... params) {
        MainQuestData.TalkData talkData = quest.getMainQuest().getTalks().get(Integer.valueOf(params[0]));
        GameQuest subQuest = quest.getMainQuest().getChildQuestById(params[0]);
        return talkData != null || subQuest != null;
    }

}
