package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.PlayerProperty;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ResinChangeNotifyOuterClass.ResinChangeNotify;

public class PacketResinChangeNotify extends BasePacket {
	
	public PacketResinChangeNotify(Player player) {
		super(PacketOpcodes.ResinChangeNotify);
		
		ResinChangeNotify proto = ResinChangeNotify.newBuilder()
				.setCurValue(player.getProperty(PlayerProperty.PROP_PLAYER_RESIN))
				.setNextAddTimestamp(player.getNextResinRefresh())
				.build();

		// ToDo: Add ability to buy resin with primogems, has to be included here.
		
		this.setData(proto);
	}
}
