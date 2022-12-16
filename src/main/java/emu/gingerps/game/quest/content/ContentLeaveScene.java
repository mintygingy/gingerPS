package emu.gingerps.game.quest.content;

import emu.gingerps.data.excels.QuestData.QuestCondition;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.quest.GameQuest;
import emu.gingerps.game.quest.QuestValue;
import emu.gingerps.game.quest.enums.QuestTrigger;
import emu.gingerps.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_CONTENT_LEAVE_SCENE)
public class ContentLeaveScene extends QuestBaseHandler {

    @Override
    public boolean execute(GameQuest quest, QuestCondition condition, String paramStr, int... params) {
        return quest.getOwner().getScene().getPrevScene() == params[0];
    }

}
