package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.CombineReqOuterClass;
import emu.gingerps.net.proto.CombineRspOuterClass;
import emu.gingerps.net.proto.ItemParamOuterClass;
import emu.gingerps.net.proto.RetcodeOuterClass;

public class PacketCombineRsp extends BasePacket {

    public PacketCombineRsp() {
        super(PacketOpcodes.CombineRsp);

        CombineRspOuterClass.CombineRsp proto = CombineRspOuterClass.CombineRsp.newBuilder()
                .setRetcode(RetcodeOuterClass.Retcode.RET_SVR_ERROR_VALUE).build();


        this.setData(proto);
    }

    public PacketCombineRsp(int retcode) {
        super(PacketOpcodes.CombineRsp);

        CombineRspOuterClass.CombineRsp proto = CombineRspOuterClass.CombineRsp.newBuilder()
                .setRetcode(retcode).build();


        this.setData(proto);
    }

    public PacketCombineRsp(CombineReqOuterClass.CombineReq combineReq,
                            Iterable<ItemParamOuterClass.ItemParam> costItemList,
                            Iterable<ItemParamOuterClass.ItemParam> resultItemList,
                            Iterable<ItemParamOuterClass.ItemParam> totalRandomItemList,
                            Iterable<ItemParamOuterClass.ItemParam> totalReturnItemList,
                            Iterable<ItemParamOuterClass.ItemParam> totalExtraItemList) {

        super(PacketOpcodes.CombineRsp);

        CombineRspOuterClass.CombineRsp proto = CombineRspOuterClass.CombineRsp.newBuilder()
                .setRetcode(RetcodeOuterClass.Retcode.RET_SUCC_VALUE)
                .setCombineId(combineReq.getCombineId())
                .setCombineCount(combineReq.getCombineCount())
                .setAvatarGuid(combineReq.getAvatarGuid())
                .addAllCostItemList(costItemList)
                .addAllResultItemList(resultItemList)
//                .addAllTotalRandomItemList(totalRandomItemList)
//                .addAllTotalReturnItemList(totalReturnItemList)
//                .addAllTotalExtraItemList(totalExtraItemList)
                .build();

        this.setData(proto);
    }



}
