package emu.gingerps.data.excels;

import com.google.gson.annotations.SerializedName;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;

@ResourceType(name = "ReliquarySetExcelConfigData.json")
public class ReliquarySetData extends GameResource {
    private int setId;
    private int[] setNeedNum;

    @SerializedName(value="equipAffixId", alternate={"EquipAffixId"})
    private int equipAffixId;

    @Override
    public int getId() {
        return setId;
    }

    public int[] getSetNeedNum() {
        return setNeedNum;
    }

    public int getEquipAffixId() {
        return equipAffixId;
    }

    @Override
    public void onLoad() {

    }
}
