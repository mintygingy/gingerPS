package emu.gingerps.server.packet.send;

import java.util.Set;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerLevelRewardUpdateNotifyOuterClass.PlayerLevelRewardUpdateNotify;

public class PacketPlayerLevelRewardUpdateNotify extends BasePacket {
	
	public PacketPlayerLevelRewardUpdateNotify(Set<Integer> rewardedLevels) {
		super(PacketOpcodes.PlayerLevelRewardUpdateNotify);

		PlayerLevelRewardUpdateNotify.Builder proto = PlayerLevelRewardUpdateNotify.newBuilder();
        
        for (Integer level : rewardedLevels) {
        	proto.addLevelList(level);
        }
		
		this.setData(proto.build());
	}
}
