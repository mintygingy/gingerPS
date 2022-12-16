package emu.gingerps.game.quest.conditions;

import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.data.excels.QuestData.QuestCondition;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_COND_PLAYER_LEVEL_EQUAL_GREATER)
public class ConditionPlayerLevelEqualGreater extends QuestBaseHandler {

	@Override
	public boolean execute(GameQuest quest, QuestCondition condition, String paramStr, int... params) {
		return quest.getOwner().getLevel() >= params[0];
	}

}
