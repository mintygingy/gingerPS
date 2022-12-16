package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ItemParamOuterClass.ItemParam;
import emu.gingerps.net.proto.TakeCompoundOutputRspOuterClass.TakeCompoundOutputRsp;

public class PackageTakeCompoundOutputRsp extends BasePacket {

    public PackageTakeCompoundOutputRsp(Iterable<ItemParam> itemList, int retcode) {
        super(PacketOpcodes.TakeCompoundOutputRsp);
        var builder = TakeCompoundOutputRsp.newBuilder()
            .addAllItemList(itemList)
            .setRetcode(retcode);
        setData(builder.build());
    }
}
