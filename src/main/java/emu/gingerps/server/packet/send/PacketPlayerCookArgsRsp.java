package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerCookArgsRspOuterClass.PlayerCookArgsRsp;

public class PacketPlayerCookArgsRsp extends BasePacket {
    
    public PacketPlayerCookArgsRsp() {
        super(PacketOpcodes.PlayerCookArgsRsp);

        PlayerCookArgsRsp proto = PlayerCookArgsRsp.newBuilder()
            .build();

        this.setData(proto);
    }
}
