package emu.gingerps.server.packet.send;

import emu.gingerps.data.GameData;
import emu.gingerps.game.activity.ActivityConfigItem;
import emu.gingerps.game.activity.ActivityManager;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo;
import emu.gingerps.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp;
import emu.gingerps.net.proto.RetcodeOuterClass;

import java.util.ArrayList;
import java.util.List;

public class PacketGetActivityShopSheetInfoRsp extends BasePacket {


    public PacketGetActivityShopSheetInfoRsp(int shopType) {
        super(PacketOpcodes.GetActivityShopSheetInfoRsp);

        var sheetInfo = GameData.getActivityShopDataMap().get(shopType);
        ActivityConfigItem activityConfigItem = null;

        if (sheetInfo != null) {
            activityConfigItem = ActivityManager.getScheduleActivityConfigMap().get(sheetInfo.getScheduleId());
        }

        if (sheetInfo == null || activityConfigItem == null) {
            setData(GetActivityShopSheetInfoRsp.newBuilder()
                .setShopType(shopType)
                .setRetcode(RetcodeOuterClass.Retcode.RET_SHOP_NOT_OPEN_VALUE)
                .build());
            return;
        }

        List<ActivityShopSheetInfo> sheetInfos = new ArrayList<>(sheetInfo.getSheetList().size());
        for (int id : sheetInfo.getSheetList()) {
            sheetInfos.add(ActivityShopSheetInfo.newBuilder()
                .setSheetId(id)
                .setBeginTime((int) activityConfigItem.getBeginTime().getTime())
                .setEndTime((int) activityConfigItem.getEndTime().getTime())
                .build());
        }

        setData(GetActivityShopSheetInfoRsp.newBuilder()
            .setShopType(shopType)
            .addAllSheetInfoList(sheetInfos)
            .build());
    }
}
