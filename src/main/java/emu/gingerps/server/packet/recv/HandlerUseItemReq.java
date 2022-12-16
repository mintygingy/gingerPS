package emu.gingerps.server.packet.recv;

import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.UseItemReqOuterClass.UseItemReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketUseItemRsp;

@Opcodes(PacketOpcodes.UseItemReq)
public class HandlerUseItemReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        UseItemReq req = UseItemReq.parseFrom(payload);

        GameItem useItem = session.getServer().getInventorySystem().useItem(session.getPlayer(), req.getTargetGuid(), req.getGuid(), req.getCount(), req.getOptionIdx(), req.getIsEnterMpDungeonTeam());
        if (useItem != null) {
            session.send(new PacketUseItemRsp(req.getTargetGuid(), useItem));
        } else {
            session.send(new PacketUseItemRsp());
        }
    }

}
