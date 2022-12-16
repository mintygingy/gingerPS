package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarFetterLevelRewardRspOuterClass.AvatarFetterLevelRewardRsp;

public class PacketAvatarFetterLevelRewardRsp extends BasePacket {
	
	public PacketAvatarFetterLevelRewardRsp(long guid, int fetterLevel, int rewardId) {
		super(PacketOpcodes.AvatarFetterLevelRewardRsp);
		
		AvatarFetterLevelRewardRsp proto = AvatarFetterLevelRewardRsp.newBuilder()
                .setAvatarGuid(guid)
                .setFetterLevel(fetterLevel)
                .setRetcode(0)
                .setRewardId(rewardId)
                .build();
		
		this.setData(proto);
	}

    public PacketAvatarFetterLevelRewardRsp(long guid, int fetterLevel) {
		super(PacketOpcodes.AvatarFetterLevelRewardRsp);
		
		AvatarFetterLevelRewardRsp proto = AvatarFetterLevelRewardRsp.newBuilder()
                .setAvatarGuid(guid)
                .setFetterLevel(fetterLevel)
                .setRetcode(1)
                .setRewardId(0)
                .build();
		
		this.setData(proto);
	}

}
