package emu.gingerps.server.packet.send;

import java.util.List;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.DelTeamEntityNotifyOuterClass.DelTeamEntityNotify;

public class PacketDelTeamEntityNotify extends BasePacket {
	
	public PacketDelTeamEntityNotify(int sceneId, int teamEntityId) {
		super(PacketOpcodes.DelTeamEntityNotify);

		DelTeamEntityNotify proto = DelTeamEntityNotify.newBuilder()
				.setSceneId(sceneId)
				.addDelEntityIdList(teamEntityId)
				.build();
		
		this.setData(proto);
	}
	
	public PacketDelTeamEntityNotify(int sceneId, List<Integer> list) {
		super(PacketOpcodes.DelTeamEntityNotify);

		DelTeamEntityNotify proto = DelTeamEntityNotify.newBuilder()
				.setSceneId(sceneId)
				.addAllDelEntityIdList(list)
				.build();
		
		this.setData(proto);
	}
}
