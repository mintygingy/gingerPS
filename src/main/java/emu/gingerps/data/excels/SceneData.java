package emu.gingerps.data.excels;

import com.google.gson.annotations.SerializedName;

import emu.gingerps.data.GameResource;
import emu.gingerps.data.ResourceType;

import emu.gingerps.game.props.SceneType;
import lombok.Getter;

@ResourceType(name = "SceneExcelConfigData.json")
@Getter
public class SceneData extends GameResource {
    @Getter(onMethod = @__(@Override))
    private int id;
    @SerializedName("type")
    private SceneType sceneType;
    private String scriptData;
}
