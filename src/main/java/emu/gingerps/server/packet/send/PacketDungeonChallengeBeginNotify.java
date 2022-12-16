package emu.gingerps.server.packet.send;

import emu.gingerps.game.dungeons.challenge.WorldChallenge;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.DungeonChallengeBeginNotifyOuterClass.DungeonChallengeBeginNotify;

public class PacketDungeonChallengeBeginNotify extends BasePacket {
	
	public PacketDungeonChallengeBeginNotify(WorldChallenge challenge) {
		super(PacketOpcodes.DungeonChallengeBeginNotify, true);

		DungeonChallengeBeginNotify proto = DungeonChallengeBeginNotify.newBuilder()
				.setChallengeId(challenge.getChallengeId())
				.setChallengeIndex(challenge.getChallengeIndex())
				.setGroupId(challenge.getGroup().id)
				.addAllParamList(challenge.getParamList())
				.build();

		this.setData(proto);
	}
}
