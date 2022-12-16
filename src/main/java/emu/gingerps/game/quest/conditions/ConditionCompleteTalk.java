package emu.gingerps.game.quest.conditions;

import emu.gingerps.gingerps;
import emu.gingerps.data.GameData;
import emu.gingerps.data.binout.MainQuestData;
import emu.gingerps.data.excels.QuestData;
import emu.gingerps.game.quest.GameMainQuest;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_COND_COMPLETE_TALK)
public class ConditionCompleteTalk extends QuestBaseHandler {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestCondition condition, String paramStr, int... params) {
        GameMainQuest checkMainQuest = quest.getOwner().getQuestManager().getMainQuestById(condition.getParam()[0]/100);
        if (checkMainQuest == null || GameData.getMainQuestDataMap().get(checkMainQuest.getParentQuestId()).getTalks() == null) {
            gingerps.getLogger().debug("Warning: mainQuest {} hasn't been started yet, or has no talks", condition.getParam()[0]/100);
            return false;
        }
        MainQuestData.TalkData talkData = checkMainQuest.getTalks().get(Integer.valueOf(params[0]));
        return talkData != null || checkMainQuest.getChildQuestById(params[0]) != null;
    }

}
