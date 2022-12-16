package emu.gingerps.server.packet.recv;

import java.math.BigInteger;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HitTreeNotifyOuterClass.HitTreeNotify;
import emu.gingerps.server.game.GameSession;

/**
 * Implement Deforestation Function
 */
@Opcodes(PacketOpcodes.HitTreeNotify)
public class HandlerHitTreeNotify extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        HitTreeNotify hit = HitTreeNotify.parseFrom(payload);
        session.getPlayer().getDeforestationManager().onDeforestationInvoke(hit);
    }
}