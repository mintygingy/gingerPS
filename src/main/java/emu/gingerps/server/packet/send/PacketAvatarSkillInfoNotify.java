package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify;
import emu.gingerps.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo;
import it.unimi.dsi.fastutil.ints.Int2IntMap;

public class PacketAvatarSkillInfoNotify extends BasePacket {
    public PacketAvatarSkillInfoNotify(long avatarGuid, Int2IntMap skillExtraChargeMap) {
        super(PacketOpcodes.AvatarSkillInfoNotify);

        var proto = AvatarSkillInfoNotify.newBuilder().setGuid(avatarGuid);

        skillExtraChargeMap.forEach((skillId, count) ->
            proto.putSkillMap(skillId, AvatarSkillInfo.newBuilder().setMaxChargeCount(count).build()));

        this.setData(proto);
    }
}
