package emu.gingerps.server.packet.send;

import emu.gingerps.gingerps;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.shop.ShopInfo;
import emu.gingerps.game.shop.ShopLimit;
import emu.gingerps.game.shop.ShopSystem;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetShopRspOuterClass;
import emu.gingerps.net.proto.ItemParamOuterClass;
import emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods;
import emu.gingerps.net.proto.ShopOuterClass.Shop;
import emu.gingerps.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PacketGetShopRsp extends BasePacket {
    public PacketGetShopRsp(Player inv, int shopType) {
        super(PacketOpcodes.GetShopRsp);

        // TODO: CityReputationLevel
        Shop.Builder shop = Shop.newBuilder()
                .setShopType(shopType)
                .setCityId(1) //mock
                .setCityReputationLevel(10); //mock

        ShopSystem manager = gingerps.getGameServer().getShopSystem();
        if (manager.getShopData().get(shopType) != null) {
            List<ShopInfo> list = manager.getShopData().get(shopType);
            List<ShopGoods> goodsList = new ArrayList<>();
            for (ShopInfo info : list) {
                ShopGoods.Builder goods = ShopGoods.newBuilder()
                        .setGoodsId(info.getGoodsId())
                        .setGoodsItem(ItemParamOuterClass.ItemParam.newBuilder().setItemId(info.getGoodsItem().getId()).setCount(info.getGoodsItem().getCount()).build())
                        .setScoin(info.getScoin())
                        .setHcoin(info.getHcoin())
                        .setBuyLimit(info.getBuyLimit())
                        .setBeginTime(info.getBeginTime())
                        .setEndTime(info.getEndTime())
                        .setMinLevel(info.getMinLevel())
                        .setMaxLevel(info.getMaxLevel())
                        .setMcoin(info.getMcoin())
                        .setDisableType(info.getDisableType())
//                        .setSecondarySheetId(info.getSecondarySheetId())
                        ;
                if (info.getCostItemList() != null) {
                    goods.addAllCostItemList(info.getCostItemList().stream().map(x -> ItemParamOuterClass.ItemParam.newBuilder().setItemId(x.getId()).setCount(x.getCount()).build()).collect(Collectors.toList()));
                }
                if (info.getPreGoodsIdList() != null) {
                    goods.addAllPreGoodsIdList(info.getPreGoodsIdList());
                }

                int currentTs = Utils.getCurrentSeconds();
                ShopLimit currentShopLimit = inv.getGoodsLimit(info.getGoodsId());
                int nextRefreshTime = ShopSystem.getShopNextRefreshTime(info);
                if (currentShopLimit != null) {
                    if (currentShopLimit.getNextRefreshTime() < currentTs) { // second game day
                        currentShopLimit.setHasBoughtInPeriod(0);
                        currentShopLimit.setNextRefreshTime(nextRefreshTime);
                    }
                    goods.setBoughtNum(currentShopLimit.getHasBoughtInPeriod());
                    goods.setNextRefreshTime(currentShopLimit.getNextRefreshTime());
                } else {
                    inv.addShopLimit(goods.getGoodsId(), 0, nextRefreshTime); // save generated refresh time
                    goods.setNextRefreshTime(nextRefreshTime);
                }

                goodsList.add(goods.build());
            }
            shop.addAllGoodsList(goodsList);
        }

        inv.save();
        this.setData(GetShopRspOuterClass.GetShopRsp.newBuilder().setShop(shop).build());
    }
}
