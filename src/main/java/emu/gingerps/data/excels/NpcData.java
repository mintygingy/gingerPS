package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import lombok.Getter;

@ResourceType(name = "NpcExcelConfigData.json")
@Getter
public class NpcData extends GameResource {
    @Getter(onMethod = @__(@Override))
    private int id;

    private String jsonName;
    private String alias;
    private String scriptDataPath;
    private String luaDataPath;

    private boolean isInteractive;
    private boolean hasMove;
    private String dyePart;
    private String billboardIcon;

    private long nameTextMapHash;
    private int campID;
}
