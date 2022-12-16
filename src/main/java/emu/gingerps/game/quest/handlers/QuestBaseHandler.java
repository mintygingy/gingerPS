package emu.gingerps.game.quest.handlers;

import emu.gingerps.data.excels.QuestData.QuestCondition;
import emu.gingerps.game.quest.GameQuest;

public abstract class QuestBaseHandler {

	public abstract boolean execute(GameQuest quest, QuestCondition condition, String paramStr, int... params);

}
