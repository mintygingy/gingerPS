package emu.gingerps.server.packet.recv;

import emu.gingerps.game.entity.EntityGadget;
import emu.gingerps.game.entity.GameEntity;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SelectWorktopOptionReqOuterClass.SelectWorktopOptionReq;
import emu.gingerps.scripts.constants.EventType;
import emu.gingerps.scripts.data.ScriptArgs;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketSelectWorktopOptionRsp;

@Opcodes(PacketOpcodes.SelectWorktopOptionReq)
public class HandlerSelectWorktopOptionReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        SelectWorktopOptionReq req = SelectWorktopOptionReq.parseFrom(payload);

        try {
            GameEntity entity = session.getPlayer().getScene().getEntityById(req.getGadgetEntityId());

            if (!(entity instanceof EntityGadget)) {
                return;
            }
            session.getPlayer().getScene().selectWorktopOptionWith(req);
            session.getPlayer().getScene().getScriptManager().callEvent(
                    EventType.EVENT_SELECT_OPTION,
                    new ScriptArgs(entity.getConfigId(), req.getOptionId())
            );
        } finally {
            // Always send packet
            session.send(new PacketSelectWorktopOptionRsp(req.getGadgetEntityId(), req.getOptionId()));
        }
    }

}
