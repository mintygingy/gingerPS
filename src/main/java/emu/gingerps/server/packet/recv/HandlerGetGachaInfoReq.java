package emu.gingerps.server.packet.recv;

import emu.gingerps.game.gacha.GachaBanner;
import emu.gingerps.game.gacha.PlayerGachaBannerInfo;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketGachaWishRsp;
import emu.gingerps.server.packet.send.PacketGetGachaInfoRsp;

@Opcodes(PacketOpcodes.GetGachaInfoReq)
public class HandlerGetGachaInfoReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        session.send(new PacketGetGachaInfoRsp(session.getServer().getGachaSystem(), session.getPlayer()));
    }

}
