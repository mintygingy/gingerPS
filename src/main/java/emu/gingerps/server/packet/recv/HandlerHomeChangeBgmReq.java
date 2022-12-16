package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeChangeBgmReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketHomeChangeBgmNotify;
import emu.gingerps.server.packet.send.PacketHomeChangeBgmRsp;

@Opcodes(PacketOpcodes.HomeChangeBgmReq)
public class HandlerHomeChangeBgmReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = HomeChangeBgmReqOuterClass.HomeChangeBgmReq.parseFrom(payload);

        int homeBgmId = req.getBgmId();
        var home = session.getPlayer().getHome();

        home.getHomeSceneItem(session.getPlayer().getSceneId()).setHomeBgmId(homeBgmId);
        home.save();

        session.send(new PacketHomeChangeBgmNotify(homeBgmId));
        session.send(new PacketHomeChangeBgmRsp());
    }
}
