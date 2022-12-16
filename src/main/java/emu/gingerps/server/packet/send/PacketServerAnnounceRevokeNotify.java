package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass;

public class PacketServerAnnounceRevokeNotify extends BasePacket {

	public PacketServerAnnounceRevokeNotify(int tplId) {
		super(PacketOpcodes.ServerAnnounceRevokeNotify);

        var proto = ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify.newBuilder();

        proto.addConfigIdList(tplId);

        this.setData(proto);
	}
}
