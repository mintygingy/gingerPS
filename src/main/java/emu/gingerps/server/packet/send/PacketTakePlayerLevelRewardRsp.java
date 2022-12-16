package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TakePlayerLevelRewardRspOuterClass.TakePlayerLevelRewardRsp;

public class PacketTakePlayerLevelRewardRsp extends BasePacket {

    public PacketTakePlayerLevelRewardRsp(int level, int rewardId) {
		super(PacketOpcodes.TakePlayerLevelRewardRsp);
        
        int retcode = 0;

        if (rewardId == 0) {
            retcode = 1;
        }

        TakePlayerLevelRewardRsp proto = TakePlayerLevelRewardRsp.newBuilder()
                .setLevel(level)
                .setRewardId(rewardId)
                .setRetcode(retcode)
                .build();

		this.setData(proto);
	}
}
