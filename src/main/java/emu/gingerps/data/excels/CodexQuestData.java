package emu.gingerps.data.excels;

import emu.gingerps.data.GameData;
import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;

@ResourceType(name = {"QuestCodexExcelConfigData.json"})
public class CodexQuestData extends GameResource {
    private int Id;
    private int parentQuestId;
    private int chapterId;
    private int sortOrder;
    private boolean isDisuse;

    public int getParentQuestId() {
        return parentQuestId;
    }

    public int getId() {
        return Id;
    }

    public int getChapterId() {
        return chapterId;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public boolean getIsDisuse() {
        return isDisuse;
    }

    @Override
    public void onLoad() {
        if(!this.getIsDisuse()) {
            GameData.getCodexQuestDataIdMap().put(this.getParentQuestId(), this);
        }
    }
}
