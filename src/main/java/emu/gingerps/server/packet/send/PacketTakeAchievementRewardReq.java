package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TakeAchievementRewardReqOuterClass.TakeAchievementRewardReq;
import emu.gingerps.server.game.GameSession;

import java.util.ArrayList;
import java.util.List;

public class PacketTakeAchievementRewardReq extends BasePacket {

    public PacketTakeAchievementRewardReq(GameSession session) {
        super(PacketOpcodes.TakeAchievementRewardReq);

        TakeAchievementRewardReq proto = TakeAchievementRewardReq.newBuilder().build();

        this.setData(proto);
    }

}
