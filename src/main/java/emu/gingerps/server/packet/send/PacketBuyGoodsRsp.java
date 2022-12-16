package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.BuyGoodsRspOuterClass;
import emu.gingerps.net.proto.ShopGoodsOuterClass;

public class PacketBuyGoodsRsp extends BasePacket {
    public PacketBuyGoodsRsp(int shopType, int boughtNum, ShopGoodsOuterClass.ShopGoods sg) {
        super(PacketOpcodes.BuyGoodsRsp);

        BuyGoodsRspOuterClass.BuyGoodsRsp buyGoodsRsp = BuyGoodsRspOuterClass.BuyGoodsRsp.newBuilder()
                .setShopType(shopType)
                .setBuyCount(boughtNum)
                .addGoodsList(ShopGoodsOuterClass.ShopGoods.newBuilder()
                        .mergeFrom(sg)
                        .setBoughtNum(boughtNum)
                ).build();

        this.setData(buyGoodsRsp);
    }
}
