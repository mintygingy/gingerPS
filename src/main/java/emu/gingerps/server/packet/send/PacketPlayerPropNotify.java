package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.PlayerProperty;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify;
import emu.gingerps.utils.ProtoHelper;

public class PacketPlayerPropNotify extends BasePacket {
	
	public PacketPlayerPropNotify(Player player, PlayerProperty prop) {
		super(PacketOpcodes.PlayerPropNotify);
		
		this.buildHeader(0);
		
		PlayerPropNotify proto = PlayerPropNotify.newBuilder()
				.putPropMap(prop.getId(), ProtoHelper.newPropValue(prop, player.getProperty(prop)))
				.build();
		
		this.setData(proto);
	}
}
