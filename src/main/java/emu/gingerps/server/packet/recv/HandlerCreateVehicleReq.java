package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.CreateVehicleReqOuterClass;

import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketCreateVehicleRsp;

import emu.gingerps.utils.Position;

@Opcodes(PacketOpcodes.CreateVehicleReq)
public class HandlerCreateVehicleReq extends PacketHandler {

	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		CreateVehicleReqOuterClass.CreateVehicleReq req = CreateVehicleReqOuterClass.CreateVehicleReq.parseFrom(payload);
		session.send(new PacketCreateVehicleRsp(session.getPlayer(), req.getVehicleId(), req.getScenePointId(), new Position(req.getPos()), new Position(req.getRot())));
	}
}
