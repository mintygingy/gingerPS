package emu.gingerps.server.packet.send;

import java.util.Collection;
import java.util.List;

import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.game.props.ActionReason;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ItemAddHintNotifyOuterClass.ItemAddHintNotify;

public class PacketItemAddHintNotify extends BasePacket {
	
	public PacketItemAddHintNotify(GameItem item, ActionReason reason) {
		super(PacketOpcodes.ItemAddHintNotify);
		
		ItemAddHintNotify proto = ItemAddHintNotify.newBuilder()
				.addItemList(item.toItemHintProto())
				.setReason(reason.getValue())
				.build();
		
		this.setData(proto);
	}

	public PacketItemAddHintNotify(Collection<GameItem> items, ActionReason reason) {
		super(PacketOpcodes.ItemAddHintNotify);
		
		ItemAddHintNotify.Builder proto = ItemAddHintNotify.newBuilder()
				.setReason(reason.getValue());
		
		for (GameItem item : items) {
			proto.addItemList(item.toItemHintProto());
		}
		
		this.setData(proto);
	}
}
