package emu.gingerps.server.packet.send;

import emu.gingerps.game.dungeons.challenge.WorldChallenge;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.DungeonChallengeFinishNotifyOuterClass.DungeonChallengeFinishNotify;

public class PacketDungeonChallengeFinishNotify extends BasePacket {

	public PacketDungeonChallengeFinishNotify(WorldChallenge challenge) {
		super(PacketOpcodes.DungeonChallengeFinishNotify, true);

		DungeonChallengeFinishNotify proto = DungeonChallengeFinishNotify.newBuilder()
				.setChallengeIndex(challenge.getChallengeIndex())
				.setIsSuccess(challenge.isSuccess())
				.setChallengeRecordType(2)
				.build();

		this.setData(proto);
	}
}
