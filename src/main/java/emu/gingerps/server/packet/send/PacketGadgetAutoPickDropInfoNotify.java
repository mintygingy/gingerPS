package emu.gingerps.server.packet.send;

import java.util.Collection;

import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GadgetAutoPickDropInfoNotifyOuterClass.GadgetAutoPickDropInfoNotify;
import emu.gingerps.net.proto.GadgetAutoPickDropInfoNotifyOuterClass.GadgetAutoPickDropInfoNotify.Builder;

public class PacketGadgetAutoPickDropInfoNotify extends BasePacket {
	
	public PacketGadgetAutoPickDropInfoNotify(Collection<GameItem> items) {
		super(PacketOpcodes.GadgetAutoPickDropInfoNotify);
		
		GadgetAutoPickDropInfoNotify.Builder proto = GadgetAutoPickDropInfoNotify.newBuilder();
		
		items.forEach(item -> proto.addItemList(item.toProto()));
		
		this.setData(proto);
	}
}
