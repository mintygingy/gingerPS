package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import lombok.Getter;

@ResourceType(name = "PlayerLevelExcelConfigData.json")
@Getter
public class PlayerLevelData extends GameResource {
    private int level;
    private int exp;
    private int rewardId;
    private int expeditionLimitAdd = 0;
    private int unlockWorldLevel;
    private long unlockDescTextMapHash;

    @Override
    public int getId() {
        return this.level;
    }
}
