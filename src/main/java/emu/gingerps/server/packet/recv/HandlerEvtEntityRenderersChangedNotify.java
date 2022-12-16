package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EvtEntityRenderersChangedNotifyOuterClass;
import emu.gingerps.net.proto.ForwardTypeOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketEvtEntityRenderersChangedNotify;
import emu.gingerps.server.packet.send.PacketWorldPlayerLocationNotify;

@Opcodes(PacketOpcodes.EvtEntityRenderersChangedNotify)
public class HandlerEvtEntityRenderersChangedNotify extends PacketHandler {

	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify.parseFrom(payload);

        switch (req.getForwardType()) {
            case FORWARD_TYPE_TO_ALL ->
                session.getPlayer().getScene().broadcastPacket(new PacketEvtEntityRenderersChangedNotify(req));
            case FORWARD_TYPE_TO_ALL_EXCEPT_CUR ->
                session.getPlayer().getScene().broadcastPacketToOthers(session.getPlayer(), new PacketEvtEntityRenderersChangedNotify(req));
            case FORWARD_TYPE_TO_HOST ->
                session.getPlayer().getScene().getWorld().getHost().sendPacket(new PacketEvtEntityRenderersChangedNotify(req));
        }

	}

}
