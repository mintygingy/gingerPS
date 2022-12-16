package emu.gingerps.game.quest.content;

import emu.gingerps.data.binout.MainQuestData;
import emu.gingerps.data.excels.QuestData;
import emu.gingerps.game.quest.GameMainQuest;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_CONTENT_NOT_FINISH_PLOT)
public class ContentNotFinishPlot extends QuestBaseHandler {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestCondition condition, String paramStr, int... params) {
        GameMainQuest checkMainQuest = quest.getOwner().getQuestManager().getMainQuestById(params[0]/100);
        if (checkMainQuest == null) {return false;}
        MainQuestData.TalkData talkData = checkMainQuest.getTalks().get(Integer.valueOf(params[0]));
        return talkData == null;
    }

}
