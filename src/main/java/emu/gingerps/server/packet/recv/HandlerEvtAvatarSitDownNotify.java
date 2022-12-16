package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketEvtAvatarSitDownNotify;

@Opcodes(PacketOpcodes.EvtAvatarSitDownNotify)
public class HandlerEvtAvatarSitDownNotify extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        EvtAvatarSitDownNotify notify = EvtAvatarSitDownNotify.parseFrom(payload);

        session.getPlayer().getScene().broadcastPacket(new PacketEvtAvatarSitDownNotify(notify));
    }

}

