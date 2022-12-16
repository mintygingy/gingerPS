package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.McoinExchangeHcoinRspOuterClass;

public class PacketMcoinExchangeHcoinRsp extends BasePacket {

    public PacketMcoinExchangeHcoinRsp(int retCode) {
        super(PacketOpcodes.McoinExchangeHcoinRsp);

        McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp proto = McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.newBuilder()
                .setRetcode(retCode)
                .build();

        this.setData(proto);
    }
}
