package emu.gingerps.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import emu.gingerps.net.proto.GetGachaInfoRspOuterClass.GetGachaInfoRsp;
import emu.gingerps.net.proto.GetShopRspOuterClass.GetShopRsp;

public final class Dumpers {
    public static void extractBanner(byte[] data) throws Exception {
        GetGachaInfoRsp proto = GetGachaInfoRsp.parseFrom(data);
        System.out.println(proto);
    }

    public static void extractShop(byte[] data) throws Exception {
        GetShopRsp proto = GetShopRsp.parseFrom(data);
        System.out.println(proto);
    }
}
