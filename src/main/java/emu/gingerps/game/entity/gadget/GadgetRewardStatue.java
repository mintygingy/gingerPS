package emu.gingerps.game.entity.gadget;

import emu.gingerps.game.dungeons.challenge.DungeonChallenge;
import emu.gingerps.game.entity.EntityGadget;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq;
import emu.gingerps.net.proto.InteractTypeOuterClass.InteractType;
import emu.gingerps.net.proto.SceneGadgetInfoOuterClass.SceneGadgetInfo;
import emu.gingerps.server.packet.send.PacketGadgetInteractRsp;

public class GadgetRewardStatue extends GadgetContent {
	
	public GadgetRewardStatue(EntityGadget gadget) {
		super(gadget);
	}

	public boolean onInteract(Player player, GadgetInteractReq req) {
		if (player.getScene().getChallenge() != null && player.getScene().getChallenge() instanceof DungeonChallenge dungeonChallenge) {
			dungeonChallenge.getStatueDrops(player, req);
		}
		
		player.sendPacket(new PacketGadgetInteractRsp(getGadget(), InteractType.INTERACT_TYPE_OPEN_STATUE));
		
		return false;
	}

	public void onBuildProto(SceneGadgetInfo.Builder gadgetInfo) {
		
	}
}
