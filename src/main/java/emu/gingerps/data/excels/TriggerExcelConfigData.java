package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import lombok.Getter;

@ResourceType(name = "TriggerExcelConfigData.json") @Getter
public class TriggerExcelConfigData extends GameResource {
    @Getter private int id;
    private int sceneId;
    private int groupId;
    private String triggerName;
}
