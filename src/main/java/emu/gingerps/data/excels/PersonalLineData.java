package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@ResourceType(name = "PersonalLineExcelConfigData.json")
@Getter
@Setter  // TODO: remove setters next API break
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonalLineData extends GameResource {
    @Getter(onMethod = @__(@Override))
    int id;
    int avatarID;
    List<Integer> preQuestId;
    int startQuestId;
    int chapterId;
}
