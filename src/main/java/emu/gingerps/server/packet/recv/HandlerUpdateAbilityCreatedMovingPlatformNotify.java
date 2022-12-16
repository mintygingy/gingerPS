package emu.gingerps.server.packet.recv;

import emu.gingerps.game.entity.platform.EntityPlatform;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.UpdateAbilityCreatedMovingPlatformNotifyOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketPlatformStartRouteNotify;
import emu.gingerps.server.packet.send.PacketPlatformStopRouteNotify;

@Opcodes(PacketOpcodes.UpdateAbilityCreatedMovingPlatformNotify)
public class HandlerUpdateAbilityCreatedMovingPlatformNotify extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var notify = UpdateAbilityCreatedMovingPlatformNotifyOuterClass.UpdateAbilityCreatedMovingPlatformNotify.parseFrom(payload);
        var entity = session.getPlayer().getScene().getEntityById(notify.getEntityId());

        if (!(entity instanceof EntityPlatform)) {
            return;
        }

        var scene = ((EntityPlatform) entity).getOwner().getScene();

        switch (notify.getOpType()) {
            case OP_TYPE_ACTIVATE -> scene.broadcastPacket(new PacketPlatformStartRouteNotify((EntityPlatform) entity, scene));
            case OP_TYPE_DEACTIVATE -> scene.broadcastPacket(new PacketPlatformStopRouteNotify((EntityPlatform) entity, scene));
        }
    }
}
