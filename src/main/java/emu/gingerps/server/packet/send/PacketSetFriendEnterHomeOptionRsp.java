package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;

public class PacketSetFriendEnterHomeOptionRsp extends BasePacket {
    public PacketSetFriendEnterHomeOptionRsp() {
        super(PacketOpcodes.SetFriendEnterHomeOptionRsp);
    }
}
