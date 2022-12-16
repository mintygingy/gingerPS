package emu.gingerps.server.packet.send;

import java.util.Collection;

import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify;
import emu.gingerps.net.proto.StoreTypeOuterClass.StoreType;

public class PacketStoreItemChangeNotify extends BasePacket {
	
	private PacketStoreItemChangeNotify() {
		super(PacketOpcodes.StoreItemChangeNotify);
	}
	
	public PacketStoreItemChangeNotify(GameItem item) {
		this();
		
		StoreItemChangeNotify.Builder proto = StoreItemChangeNotify.newBuilder()
				.setStoreType(StoreType.STORE_TYPE_PACK)
				.addItemList(item.toProto());
		
		this.setData(proto);
	}
	
	public PacketStoreItemChangeNotify(Collection<GameItem> items) {
		this();

		StoreItemChangeNotify.Builder proto = StoreItemChangeNotify.newBuilder()
				.setStoreType(StoreType.STORE_TYPE_PACK);
		
		items.forEach(item -> proto.addItemList(item.toProto()));
		
		this.setData(proto);
	}
}
