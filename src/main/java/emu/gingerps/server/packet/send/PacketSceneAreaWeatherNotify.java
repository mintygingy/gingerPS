package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.world.World;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify;

public class PacketSceneAreaWeatherNotify extends BasePacket {
	
	public PacketSceneAreaWeatherNotify(Player player) {
		super(PacketOpcodes.SceneAreaWeatherNotify);
		
		SceneAreaWeatherNotify proto = SceneAreaWeatherNotify.newBuilder()
				.setWeatherAreaId(player.getWeatherId())
				.setClimateType(player.getClimate().getValue())
				.build();
		
		this.setData(proto);
	}
}
