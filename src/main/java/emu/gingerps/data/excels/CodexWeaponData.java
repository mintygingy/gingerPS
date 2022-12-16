package emu.gingerps.data.excels;

import emu.gingerps.data.GameData;
import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;

@ResourceType(name = {"WeaponCodexExcelConfigData.json"})
public class CodexWeaponData extends GameResource {
    private int Id;
    private int weaponId;
    private int sortOrder;

    public int getSortOrder() {
        return sortOrder;
    }

    public int getWeaponId() {
        return weaponId;
    }

    public int getId() {
        return Id;
    }

    @Override
    public void onLoad() {
        GameData.getCodexWeaponDataIdMap().put(this.getWeaponId(), this);
    }
}
