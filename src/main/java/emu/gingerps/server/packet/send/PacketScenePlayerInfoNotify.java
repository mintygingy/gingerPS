package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.world.World;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify;
import emu.gingerps.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo;

public class PacketScenePlayerInfoNotify extends BasePacket {
	
	public PacketScenePlayerInfoNotify(World world) {
		super(PacketOpcodes.ScenePlayerInfoNotify);

		ScenePlayerInfoNotify.Builder proto = ScenePlayerInfoNotify.newBuilder();
		
		for (int i = 0; i < world.getPlayers().size(); i++) {
			Player p = world.getPlayers().get(i);

			ScenePlayerInfo pInfo = ScenePlayerInfo.newBuilder()
					.setUid(p.getUid())
					.setPeerId(p.getPeerId())
					.setName(p.getNickname())
					.setSceneId(p.getSceneId())
					.setOnlinePlayerInfo(p.getOnlinePlayerInfo())
					.build();
			
			proto.addPlayerInfoList(pInfo);
		}
		
		this.setData(proto.build());
	}
}
