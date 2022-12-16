package emu.gingerps.server.packet.recv;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.server.game.GameSession;

@Opcodes(PacketOpcodes.PlayerForceExitReq)
public class HandlerPlayerForceExitReq extends PacketHandler {
	@Override
	public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
		// Client should auto disconnect right now
		session.send(new BasePacket(PacketOpcodes.PlayerForceExitRsp));
		new Thread(){
			@Override
			public void run() {
				try {
					Thread.sleep(1000);// disconnect after 1 seconds
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				session.close();
				super.run();
			}
		}.start();
	}
}
