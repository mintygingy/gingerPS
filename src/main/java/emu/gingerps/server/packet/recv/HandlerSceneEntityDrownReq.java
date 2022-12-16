package emu.gingerps.server.packet.recv;

import emu.gingerps.game.entity.EntityAvatar;
import emu.gingerps.game.entity.EntityMonster;
import emu.gingerps.game.entity.GameEntity;
import emu.gingerps.game.props.FightProperty;
import emu.gingerps.game.props.LifeState;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SceneEntityDrownReqOuterClass.SceneEntityDrownReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketSceneEntityDrownRsp;

@Opcodes(PacketOpcodes.SceneEntityDrownReq)
public class HandlerSceneEntityDrownReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        SceneEntityDrownReq req = SceneEntityDrownReq.parseFrom(payload);

        GameEntity entity = session.getPlayer().getScene().getEntityById(req.getEntityId());

        if (entity == null || !(entity instanceof EntityMonster || entity instanceof EntityAvatar)) {
        	return;
        }
        
        entity.setFightProperty(FightProperty.FIGHT_PROP_CUR_HP, 0);

        //TODO: make a list somewhere of all entities to remove per tick rather than one by one
        session.getPlayer().getScene().killEntity(entity, 0);
        session.getPlayer().getScene().broadcastPacket(new PacketSceneEntityDrownRsp(req.getEntityId()));
    }

}
