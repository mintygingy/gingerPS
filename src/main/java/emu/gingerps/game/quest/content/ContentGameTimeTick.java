package emu.gingerps.game.quest.content;

import emu.gingerps.data.excels.QuestData.QuestCondition;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_CONTENT_GAME_TIME_TICK)
public class ContentGameTimeTick extends QuestBaseHandler {

	@Override
	public boolean execute(GameQuest quest, QuestCondition condition, String paramStr, int... params) {
        var range = condition.getParamStr().split(",");
        var min = Math.min(Integer.parseInt(range[0]), Integer.parseInt(range[1]));
        var max = Math.max(Integer.parseInt(range[0]), Integer.parseInt(range[1]));

        // params[0] is clock, params[1] is day
		return params[0] >= min && params[0] <= max &&
            params[1] >= condition.getParam()[0];
	}

}
