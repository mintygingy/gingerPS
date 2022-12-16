package emu.gingerps.server.packet.send;

import com.google.protobuf.ByteString;
import emu.gingerps.gingerps;
import emu.gingerps.gingerps.ServerRunMode;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerLoginRspOuterClass.PlayerLoginRsp;
import emu.gingerps.net.proto.QueryCurrRegionHttpRspOuterClass;
import emu.gingerps.net.proto.RegionInfoOuterClass.RegionInfo;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.http.dispatch.RegionHandler;
import emu.gingerps.utils.Crypto;
import emu.gingerps.utils.FileUtils;

import static emu.gingerps.config.Configuration.*;

import java.io.File;
import java.util.Base64;
import java.util.Objects;

public class PacketPlayerLoginRsp extends BasePacket {

    private static QueryCurrRegionHttpRspOuterClass.QueryCurrRegionHttpRsp regionCache;

    public PacketPlayerLoginRsp(GameSession session) {
        super(PacketOpcodes.PlayerLoginRsp, 1);

        this.setUseDispatchKey(true);

        RegionInfo info;

        if (SERVER.runMode == ServerRunMode.GAME_ONLY) {
            if (regionCache == null) {
                try {
                    // todo: we might want to push custom config to client
                    RegionInfo serverRegion = RegionInfo.newBuilder()
                            .setGateserverIp(lr(GAME_INFO.accessAddress, GAME_INFO.bindAddress))
                            .setGateserverPort(lr(GAME_INFO.accessPort, GAME_INFO.bindPort))
                            .setSecretKey(ByteString.copyFrom(Crypto.DISPATCH_SEED))
                            .build();

                    regionCache = QueryCurrRegionHttpRspOuterClass.QueryCurrRegionHttpRsp.newBuilder().setRegionInfo(serverRegion).build();
                } catch (Exception e) {
                    gingerps.getLogger().error("Error while initializing region cache!", e);
                }
            }

            info = regionCache.getRegionInfo();
        } else {
            info = Objects.requireNonNull(RegionHandler.getCurrentRegion()).getRegionInfo();
        }

        PlayerLoginRsp p = PlayerLoginRsp.newBuilder()
                .setIsUseAbilityHash(true) // true
                .setAbilityHashCode(1844674) // 1844674
                .setGameBiz("hk4e_global")
                .setClientDataVersion(info.getClientDataVersion())
                .setClientSilenceDataVersion(info.getClientSilenceDataVersion())
                .setClientMd5(info.getClientDataMd5())
                .setClientSilenceMd5(info.getClientSilenceDataMd5())
                .setResVersionConfig(info.getResVersionConfig())
                .setClientVersionSuffix(info.getClientVersionSuffix())
                .setClientSilenceVersionSuffix(info.getClientSilenceVersionSuffix())
                .setIsScOpen(false)
                //.setScInfo(ByteString.copyFrom(new byte[] {}))
                .setRegisterCps("mihoyo")
                .setCountryCode("US")
                .build();

        this.setData(p.toByteArray());
    }
}
