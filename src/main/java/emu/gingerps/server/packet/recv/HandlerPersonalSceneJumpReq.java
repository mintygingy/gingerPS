package emu.gingerps.server.packet.recv;

import emu.gingerps.data.GameData;
import emu.gingerps.data.binout.ScenePointEntry;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PersonalSceneJumpReqOuterClass.PersonalSceneJumpReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketPersonalSceneJumpRsp;
import emu.gingerps.utils.Position;


@Opcodes(PacketOpcodes.PersonalSceneJumpReq)
public class HandlerPersonalSceneJumpReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        PersonalSceneJumpReq req = PersonalSceneJumpReq.parseFrom(payload);
        var player = session.getPlayer();

        // get the scene point
        ScenePointEntry scenePointEntry = GameData.getScenePointEntryById(player.getSceneId(), req.getPointId());

        if (scenePointEntry != null) {
            Position pos = scenePointEntry.getPointData().getTranPos().clone();  // This might not need cloning
            int sceneId = scenePointEntry.getPointData().getTranSceneId();

            player.getWorld().transferPlayerToScene(player, sceneId, pos);
            session.send(new PacketPersonalSceneJumpRsp(sceneId, pos));
        }

    }

}
