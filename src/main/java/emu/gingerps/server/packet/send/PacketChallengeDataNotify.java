package emu.gingerps.server.packet.send;

import emu.gingerps.game.dungeons.challenge.WorldChallenge;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChallengeDataNotifyOuterClass.ChallengeDataNotify;

public class PacketChallengeDataNotify extends BasePacket {

	public PacketChallengeDataNotify(WorldChallenge challenge, int index, int value) {
		super(PacketOpcodes.ChallengeDataNotify);

		ChallengeDataNotify proto = ChallengeDataNotify.newBuilder()
				.setChallengeIndex(challenge.getChallengeIndex())
				.setParamIndex(index)
				.setValue(value)
				.build();
		
		this.setData(proto);
	}
}
