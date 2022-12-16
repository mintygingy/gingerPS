package emu.gingerps.scripts.data;

import emu.gingerps.utils.Position;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class SceneConfig {
	public Position vision_anchor;
	public Position born_pos;
	public Position born_rot;
	public Position begin_pos;
	public Position size;
}
