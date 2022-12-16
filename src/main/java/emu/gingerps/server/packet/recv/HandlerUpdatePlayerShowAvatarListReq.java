package emu.gingerps.server.packet.recv;

import emu.gingerps.gingerps;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.UpdatePlayerShowAvatarListReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketUpdatePlayerShowAvatarListRsp;

@Opcodes(PacketOpcodes.UpdatePlayerShowAvatarListReq)
public class HandlerUpdatePlayerShowAvatarListReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq req = UpdatePlayerShowAvatarListReqOuterClass.UpdatePlayerShowAvatarListReq.parseFrom(payload);

        session.getPlayer().setShowAvatars(req.getIsShowAvatar());
        session.getPlayer().setShowAvatarList(req.getShowAvatarIdListList());

        session.send(new PacketUpdatePlayerShowAvatarListRsp(req.getIsShowAvatar(), req.getShowAvatarIdListList()));
    }
}
