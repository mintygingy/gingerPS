package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.CanUseSkillNotifyOuterClass;

public class PacketCanUseSkillNotify extends BasePacket {

    public PacketCanUseSkillNotify(boolean canUseSkill) {
        super(PacketOpcodes.CanUseSkillNotify);

        CanUseSkillNotifyOuterClass.CanUseSkillNotify proto = CanUseSkillNotifyOuterClass.CanUseSkillNotify.newBuilder()
                .setIsCanUseSkill(canUseSkill)
                .build();

        this.setData(proto);
    }

}
