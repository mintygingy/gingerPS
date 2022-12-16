package emu.gingerps.server.packet.send;

import emu.gingerps.game.home.HomeSceneItem;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.HomeGetArrangementInfoRspOuterClass;

import java.util.List;

public class PacketHomeGetArrangementInfoRsp extends BasePacket {

	public PacketHomeGetArrangementInfoRsp(Player player, List<Integer> sceneIdList) {
		super(PacketOpcodes.HomeGetArrangementInfoRsp);

		var home = player.getHome();

		var homeScenes = sceneIdList.stream()
				.map(home::getHomeSceneItem)
				.map(HomeSceneItem::toProto)
				.toList();

		home.save();

		var proto = HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp.newBuilder();

		proto.addAllSceneArrangementInfoList(homeScenes);

		this.setData(proto);
	}
}
