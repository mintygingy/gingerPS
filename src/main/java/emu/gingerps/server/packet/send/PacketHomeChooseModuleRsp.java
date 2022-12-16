package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeChooseModuleRspOuterClass;

public class PacketHomeChooseModuleRsp extends BasePacket {

    public PacketHomeChooseModuleRsp(int moduleId) {
        super(PacketOpcodes.HomeChooseModuleRsp);

        HomeChooseModuleRspOuterClass.HomeChooseModuleRsp proto = HomeChooseModuleRspOuterClass.HomeChooseModuleRsp.newBuilder()
                .setRetcode(0)
                .setModuleId(moduleId)
                .build();

        this.setData(proto);
    }
}
