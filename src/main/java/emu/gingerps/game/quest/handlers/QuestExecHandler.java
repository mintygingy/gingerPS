package emu.gingerps.game.quest.handlers;

import emu.gingerps.data.excels.QuestData;
import emu.gingerps.game.quest.GameQuest;

public abstract class QuestExecHandler {

	public abstract boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr);

}
