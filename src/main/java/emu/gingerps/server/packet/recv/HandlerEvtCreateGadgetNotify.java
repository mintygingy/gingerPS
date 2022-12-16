package emu.gingerps.server.packet.recv;

import emu.gingerps.game.entity.EntitySolarIsotomaClientGadget;
import emu.gingerps.game.entity.EntityClientGadget;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.EvtCreateGadgetNotifyOuterClass.EvtCreateGadgetNotify;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.EvtCreateGadgetNotify)
public class HandlerEvtCreateGadgetNotify extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        EvtCreateGadgetNotify notify = EvtCreateGadgetNotify.parseFrom(payload);

        // Sanity check - dont add duplicate entities
        if (session.getPlayer().getScene().getEntityById(notify.getEntityId()) != null) {
            return;
        }

        // Create entity and summon in world
        var gadgetId = notify.getConfigId();
        EntityClientGadget gadget = switch (gadgetId) {
            //Solar Isotoma.
            case EntitySolarIsotomaClientGadget.GADGET_ID ->
                new EntitySolarIsotomaClientGadget(session.getPlayer().getScene(), session.getPlayer(), notify);

            //Default.
            default ->
                new EntityClientGadget(session.getPlayer().getScene(), session.getPlayer(), notify);
        };

        session.getPlayer().getScene().onPlayerCreateGadget(gadget);
    }

}
