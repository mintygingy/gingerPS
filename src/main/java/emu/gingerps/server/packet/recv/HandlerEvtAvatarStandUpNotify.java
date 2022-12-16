package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EvtAvatarStandUpNotifyOuterClass.EvtAvatarStandUpNotify;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketEvtAvatarStandUpNotify;

@Opcodes(PacketOpcodes.EvtAvatarStandUpNotify)
public class HandlerEvtAvatarStandUpNotify extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        EvtAvatarStandUpNotify notify = EvtAvatarStandUpNotify.parseFrom(payload);

        session.getPlayer().getScene().broadcastPacket(new PacketEvtAvatarStandUpNotify(notify));
    }

}
