package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import lombok.Getter;

@ResourceType(name = "TowerFloorExcelConfigData.json")
@Getter
public class TowerFloorData extends GameResource {
    private int floorId;
    private int floorIndex;
    private int levelGroupId;
    private int overrideMonsterLevel;
    private int teamNum;
    private int floorLevelConfigId;

    @Override
    public int getId() {
        return this.floorId;
    }
}
