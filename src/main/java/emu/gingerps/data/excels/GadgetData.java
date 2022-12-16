package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import emu.gingerps.game.props.EntityType;
import lombok.Getter;

@ResourceType(name = "GadgetExcelConfigData.json")
@Getter
public class GadgetData extends GameResource {
    @Getter(onMethod = @__(@Override))
    private int id;

    private EntityType type;
    private String jsonName;
    private boolean isInteractive;
    private String[] tags;
    private String itemJsonName;
    private long nameTextMapHash;
    private int campID;
}
