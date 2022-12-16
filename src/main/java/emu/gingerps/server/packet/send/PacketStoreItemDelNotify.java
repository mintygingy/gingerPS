package emu.gingerps.server.packet.send;

import java.util.Collection;

import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.StoreItemDelNotifyOuterClass.StoreItemDelNotify;
import emu.gingerps.net.proto.StoreTypeOuterClass.StoreType;

public class PacketStoreItemDelNotify extends BasePacket {
	
	private PacketStoreItemDelNotify() {
		super(PacketOpcodes.StoreItemDelNotify);
	}
	
	public PacketStoreItemDelNotify(GameItem item) {
		this();
		
		StoreItemDelNotify.Builder proto = StoreItemDelNotify.newBuilder()
				.setStoreType(StoreType.STORE_TYPE_PACK)
				.addGuidList(item.getGuid());
		
		this.setData(proto);
	}
	
	public PacketStoreItemDelNotify(Collection<GameItem> items) {
		this();

		StoreItemDelNotify.Builder proto = StoreItemDelNotify.newBuilder()
				.setStoreType(StoreType.STORE_TYPE_PACK);
		
		items.stream().forEach(item -> proto.addGuidList(item.getGuid()));
		
		this.setData(proto);
	}
}
