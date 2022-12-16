package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo;
import emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify;

public class PacketPlayerChatNotify extends BasePacket {

	public PacketPlayerChatNotify(Player sender, int channelId, String message) {
		super(PacketOpcodes.PlayerChatNotify);

		ChatInfo info = ChatInfo.newBuilder()
				.setTime((int) (System.currentTimeMillis() / 1000))
				.setUid(sender.getUid())
				.setText(message)
				.build();

		PlayerChatNotify proto = PlayerChatNotify.newBuilder()
				.setChannelId(channelId)
				.setChatInfo(info)
				.build();

		this.setData(proto);
	}

	public PacketPlayerChatNotify(Player sender, int channelId, int emote) {
		super(PacketOpcodes.PlayerChatNotify);

		ChatInfo info = ChatInfo.newBuilder()
				.setTime((int) (System.currentTimeMillis() / 1000))
				.setUid(sender.getUid())
				.setIcon(emote)
				.build();

		PlayerChatNotify proto = PlayerChatNotify.newBuilder()
				.setChannelId(channelId)
				.setChatInfo(info)
				.build();

		this.setData(proto);
	}

	public PacketPlayerChatNotify(Player sender, int channelId, ChatInfo.SystemHint systemHint) {
		super(PacketOpcodes.PlayerChatNotify);

		ChatInfo info = ChatInfo.newBuilder()
				.setTime((int) (System.currentTimeMillis() / 1000))
				.setUid(sender.getUid())
				.setSystemHint(systemHint)
				.build();

		PlayerChatNotify proto = PlayerChatNotify.newBuilder()
				.setChannelId(channelId)
				.setChatInfo(info)
				.build();

		this.setData(proto);
	}
}
