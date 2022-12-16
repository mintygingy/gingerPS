package emu.gingerps.server.packet.recv;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.PlayerProperty;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PropValueOuterClass.PropValue;
import emu.gingerps.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketSetPlayerPropRsp;

@Opcodes(PacketOpcodes.SetPlayerPropReq)
public class HandlerSetPlayerPropReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        // Auto template
        SetPlayerPropReq req = SetPlayerPropReq.parseFrom(payload);
        Player player = session.getPlayer();
        for (PropValue p : req.getPropListList()) {
            PlayerProperty prop = PlayerProperty.getPropById(p.getType());
            if (prop == PlayerProperty.PROP_IS_MP_MODE_AVAILABLE) {
                if (!player.setProperty(prop, (int) p.getVal(), false)) {
                    session.send(new PacketSetPlayerPropRsp(1));
                    return;
                }
            }
        }
        player.save();
        session.send(new PacketSetPlayerPropRsp(0));
    }



}
