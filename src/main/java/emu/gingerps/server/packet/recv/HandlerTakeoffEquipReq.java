package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.TakeoffEquipReqOuterClass.TakeoffEquipReq;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketTakeoffEquipRsp;

@Opcodes(PacketOpcodes.TakeoffEquipReq)
public class HandlerTakeoffEquipReq extends PacketHandler {
	
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		TakeoffEquipReq req = TakeoffEquipReq.parseFrom(payload);
		
		if (session.getPlayer().getInventory().unequipItem(req.getAvatarGuid(), req.getSlot())) {
			session.send(new PacketTakeoffEquipRsp(req.getAvatarGuid(), req.getSlot()));
		}
	}

}
