package emu.gingerps.data.excels;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;
import emu.gingerps.game.props.ServerBuffType;
import lombok.Getter;

@ResourceType(name = "BuffExcelConfigData.json")
@Getter
public class BuffData extends GameResource {
    private int groupId;
    private int serverBuffId;
    private float time;
    private boolean isPersistent;
    private ServerBuffType serverBuffType;
    private String abilityName;
    private String modifierName;

    @Override
    public int getId() {
        return this.serverBuffId;
    }

    public void onLoad() {
        this.serverBuffType = this.serverBuffType != null ? this.serverBuffType : ServerBuffType.SERVER_BUFF_NONE;
    }
}
