package emu.gingerps.game.quest.content;

import emu.gingerps.gingerps;
import emu.gingerps.data.GameData;
import emu.gingerps.data.excels.QuestData;
import emu.gingerps.data.excels.TriggerExcelConfigData;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_CONTENT_TRIGGER_FIRE)
public class ContentTriggerFire extends QuestBaseHandler {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestCondition condition, String paramStr, int... params) {
        if (quest.getTriggers().containsKey(quest.getTriggerNameById(params[0]))) {
            //We don't want to put a new key here
            return quest.getTriggers().get(quest.getTriggerNameById(params[0]));
        } else {
            gingerps.getLogger().error("quest {} doesn't have trigger {}", quest.getSubQuestId(), params[0]);
            return false;
        }
    }
}
