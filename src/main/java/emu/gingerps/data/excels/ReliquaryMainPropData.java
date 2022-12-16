package emu.gingerps.data.excels;

import com.google.gson.annotations.SerializedName;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import emu.gingerps.game.props.FightProperty;
import lombok.Getter;

@ResourceType(name = "ReliquaryMainPropExcelConfigData.json")
@Getter
public class ReliquaryMainPropData extends GameResource {
    @Getter(onMethod = @__(@Override))
    private int id;

    private int propDepotId;
    @SerializedName("propType")
    private FightProperty fightProp;
    private int weight;
}
