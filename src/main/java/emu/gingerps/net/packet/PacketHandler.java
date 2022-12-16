package emu.gingerps.net.packet;

import emu.gingerps.server.game.GameSession;

public abstract class PacketHandler {
	protected static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
	
	public abstract void handle(GameSession session, byte[] header, byte[] payload) throws Exception;
}
