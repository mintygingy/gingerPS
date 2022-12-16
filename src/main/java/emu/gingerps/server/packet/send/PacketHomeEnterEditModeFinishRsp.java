package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;

public class PacketHomeEnterEditModeFinishRsp extends BasePacket {

    public PacketHomeEnterEditModeFinishRsp() {
        super(PacketOpcodes.HomeEnterEditModeFinishRsp);

    }
}
