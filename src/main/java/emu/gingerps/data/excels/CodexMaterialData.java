package emu.gingerps.data.excels;

import emu.gingerps.data.GameData;
import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;

@ResourceType(name = {"MaterialCodexExcelConfigData.json"})
public class CodexMaterialData extends GameResource {
    private int Id;
    private int materialId;
    private int sortOrder;

    public int getSortOrder() {
        return sortOrder;
    }

    public int getMaterialId() {
        return materialId;
    }

    public int getId() {
        return Id;
    }

    @Override
    public void onLoad() {
        GameData.getCodexMaterialDataIdMap().put(this.getMaterialId(), this);
    }
}
