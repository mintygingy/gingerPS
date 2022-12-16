package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.WearEquipReqOuterClass.WearEquipReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketWearEquipRsp;

@Opcodes(PacketOpcodes.WearEquipReq)
public class HandlerWearEquipReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		WearEquipReq req = WearEquipReq.parseFrom(payload);
		
		if (session.getPlayer().getInventory().equipItem(req.getAvatarGuid(), req.getEquipGuid())) {
			session.send(new PacketWearEquipRsp(req.getAvatarGuid(), req.getEquipGuid()));
		}
	}

}
