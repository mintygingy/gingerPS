package emu.gingerps.data.excels;

import emu.gingerps.data.GameData;
import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import lombok.Getter;

@ResourceType(name = "DungeonExcelConfigData.json")
public class DungeonData extends GameResource {
    @Getter(onMethod = @__(@Override))
    private int id;
    @Getter private int sceneId;
    @Getter private int showLevel;
    private int passRewardPreviewID;
    private String involveType; // TODO enum

    private RewardPreviewData previewData;

    @Getter private int statueCostID;
    @Getter private int statueCostCount;

    public RewardPreviewData getRewardPreview() {return previewData;}

    @Override
    public void onLoad() {
        if (this.passRewardPreviewID > 0) {
            this.previewData = GameData.getRewardPreviewDataMap().get(this.passRewardPreviewID);
        }
    }
}
