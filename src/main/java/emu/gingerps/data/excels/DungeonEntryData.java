package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import lombok.Getter;
import lombok.Setter;

@ResourceType(name = "DungeonEntryExcelConfigData.json")
@Getter
@Setter  // TODO: remove this next API break
public class DungeonEntryData extends GameResource {
    @Getter(onMethod = @__(@Override))
    private int id;
    private int dungeonEntryId;
    private int sceneId;
}
