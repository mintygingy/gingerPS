package emu.gingerps.server.packet.recv;

import emu.gingerps.game.gacha.GachaBanner;
import emu.gingerps.game.gacha.PlayerGachaBannerInfo;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GachaWishReqOuterClass.GachaWishReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketGachaWishRsp;

@Opcodes(PacketOpcodes.GachaWishReq)
public class HandlerGachaWishReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        GachaWishReq req = GachaWishReq.parseFrom(payload);

        GachaBanner banner = session.getServer().getGachaSystem().getGachaBanners().get(req.getGachaScheduleId());
        PlayerGachaBannerInfo gachaInfo = session.getPlayer().getGachaInfo().getBannerInfo(banner);

        gachaInfo.setFailedChosenItemPulls(0);
        gachaInfo.setWishItemId(req.getItemId());

        session.send(new PacketGachaWishRsp(req.getGachaType(), req.getGachaScheduleId(), req.getItemId(), 0, banner.getWishMaxProgress()));
    }

}
