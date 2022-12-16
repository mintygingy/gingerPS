package emu.gingerps.scripts.data;

import emu.gingerps.utils.Position;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class SceneObject {
    public int level;
    public int config_id;
    public int area_id;

    public Position pos;
    public Position rot;
    /**
     * not set by lua
     */
    public transient SceneGroup group;
}
