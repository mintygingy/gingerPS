package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify;

public class PacketEnterScenePeerNotify extends BasePacket {

	public PacketEnterScenePeerNotify(Player player) {
		super(PacketOpcodes.EnterScenePeerNotify);
		
		EnterScenePeerNotify proto = EnterScenePeerNotify.newBuilder()
				.setDestSceneId(player.getSceneId())
				.setPeerId(player.getPeerId())
				.setHostPeerId(player.getWorld().getHost().getPeerId())
				.setEnterSceneToken(player.getEnterSceneToken()) 
				.build();

		this.setData(proto);
	}
}
