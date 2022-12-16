package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.VehicleInteractReqOuterClass;

import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketVehicleInteractRsp;

@Opcodes(PacketOpcodes.VehicleInteractReq)
public class HandlerVehicleInteractReq extends PacketHandler {

	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		VehicleInteractReqOuterClass.VehicleInteractReq req = VehicleInteractReqOuterClass.VehicleInteractReq.parseFrom(payload);
		session.getPlayer().getStaminaManager().handleVehicleInteractReq(session, req.getEntityId(), req.getInteractType());
		session.send(new PacketVehicleInteractRsp(session.getPlayer(), req.getEntityId(), req.getInteractType()));
	}
}
