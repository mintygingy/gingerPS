package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import emu.gingerps.data.ResourceType.LoadPriority;
import lombok.Getter;

@ResourceType(name = "MonsterDescribeExcelConfigData.json", loadPriority = LoadPriority.HIGH)
@Getter
public class MonsterDescribeData extends GameResource {
    @Getter(onMethod = @__(@Override))
    private int id;
    private long nameTextMapHash;
    private int titleID;
    private int specialNameLabID;
}
