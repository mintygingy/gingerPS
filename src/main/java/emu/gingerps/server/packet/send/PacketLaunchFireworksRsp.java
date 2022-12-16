package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;

public class PacketLaunchFireworksRsp extends BasePacket {

    public PacketLaunchFireworksRsp() {
        super(PacketOpcodes.LaunchFireworksRsp);

    }

}
