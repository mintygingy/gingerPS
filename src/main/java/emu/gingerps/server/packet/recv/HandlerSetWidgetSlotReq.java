package emu.gingerps.server.packet.recv;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SetWidgetSlotReqOuterClass;
import emu.gingerps.net.proto.WidgetSlotOpOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketSetWidgetSlotRsp;
import emu.gingerps.server.packet.send.PacketWidgetSlotChangeNotify;

@Opcodes(PacketOpcodes.SetWidgetSlotReq)
public class HandlerSetWidgetSlotReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        SetWidgetSlotReqOuterClass.SetWidgetSlotReq req = SetWidgetSlotReqOuterClass.SetWidgetSlotReq.parseFrom(payload);

        Player player = session.getPlayer();
        player.setWidgetId(req.getMaterialId());

        // WidgetSlotChangeNotify op & slot key
        session.send(new PacketWidgetSlotChangeNotify(WidgetSlotOpOuterClass.WidgetSlotOp.WIDGET_SLOT_OP_DETACH));

        //only attaching the widget can set it
        if(req.getOp() == WidgetSlotOpOuterClass.WidgetSlotOp.WIDGET_SLOT_OP_ATTACH){
            // WidgetSlotChangeNotify slot
            session.send(new PacketWidgetSlotChangeNotify(req.getMaterialId()));
        }

        // SetWidgetSlotRsp
        session.send(new PacketSetWidgetSlotRsp(req.getMaterialId()));
    }

}

