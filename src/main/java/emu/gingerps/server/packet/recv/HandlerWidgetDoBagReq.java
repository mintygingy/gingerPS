package emu.gingerps.server.packet.recv;

import emu.gingerps.game.entity.EntityVehicle;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.WidgetDoBagReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketWidgetCoolDownNotify;
import emu.gingerps.server.packet.send.PacketWidgetDoBagRsp;
import emu.gingerps.server.packet.send.PacketWidgetGadgetDataNotify;
import emu.gingerps.utils.Position;

@Opcodes(PacketOpcodes.WidgetDoBagReq)
public class HandlerWidgetDoBagReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        WidgetDoBagReqOuterClass.WidgetDoBagReq req = WidgetDoBagReqOuterClass.WidgetDoBagReq.parseFrom(payload);
        var locationInfo = req.getWidgetCreatorInfo().getLocationInfo();
        Position pos = new Position(locationInfo.getPos());
        Position rot = new Position(locationInfo.getRot());
        switch (req.getMaterialId()) {
            case 220026 -> {
                this.spawnVehicle(session, 70500025, pos, rot);
                session.send(new PacketWidgetCoolDownNotify(15, System.currentTimeMillis() + 5000L, true));
                session.send(new PacketWidgetCoolDownNotify(15, System.currentTimeMillis() + 5000L, true));
            }
            case 220047 -> this.spawnVehicle(session, 70800058, pos, rot);
            default -> {}
        }
        session.send(new PacketWidgetDoBagRsp());
    }

    private void spawnVehicle(GameSession session, int gadgetId, Position pos, Position rot) throws Exception {
        var player = session.getPlayer();
        var scene = player.getScene();
        var entity = new EntityVehicle(scene, player, gadgetId, 0, pos, rot);
        scene.addEntity(entity);
        session.send(new PacketWidgetGadgetDataNotify(gadgetId, entity.getId()));
    }
}
