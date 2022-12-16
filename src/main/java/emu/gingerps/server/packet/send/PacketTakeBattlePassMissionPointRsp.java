package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TakeBattlePassMissionPointRspOuterClass;

import java.util.List;

public class PacketTakeBattlePassMissionPointRsp extends BasePacket {
    public PacketTakeBattlePassMissionPointRsp() {
        super(PacketOpcodes.TakeBattlePassMissionPointRsp);
    }
}
