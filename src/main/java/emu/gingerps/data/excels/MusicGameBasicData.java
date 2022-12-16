package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@ResourceType(name = "MusicGameBasicConfigData.json")
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MusicGameBasicData extends GameResource {
    @Getter(onMethod = @__(@Override))
    int id;
    int musicID;
    int musicLevel;
}
