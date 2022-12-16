package emu.gingerps.server.packet.recv;

import emu.gingerps.data.GameData;
import emu.gingerps.data.binout.ScenePointEntry;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SceneTransToPointReqOuterClass.SceneTransToPointReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.event.player.PlayerTeleportEvent.TeleportType;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketSceneTransToPointRsp;

@Opcodes(PacketOpcodes.SceneTransToPointReq)
public class HandlerSceneTransToPointReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        SceneTransToPointReq req = SceneTransToPointReq.parseFrom(payload);
        var player = session.getPlayer();

        ScenePointEntry scenePointEntry = GameData.getScenePointEntryById(req.getSceneId(), req.getPointId());

        if (scenePointEntry != null) {
            if (player.getWorld().transferPlayerToScene(player, req.getSceneId(), TeleportType.WAYPOINT, scenePointEntry.getPointData().getTranPos().clone())) {
                session.send(new PacketSceneTransToPointRsp(player, req.getPointId(), req.getSceneId()));
                return;
            }
        }

        session.send(new PacketSceneTransToPointRsp());
    }

}
