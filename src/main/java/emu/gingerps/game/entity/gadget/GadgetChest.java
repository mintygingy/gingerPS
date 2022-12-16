package emu.gingerps.game.entity.gadget;

import emu.gingerps.gingerps;
import emu.gingerps.game.entity.EntityGadget;
import emu.gingerps.game.entity.gadget.chest.BossChestInteractHandler;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.LifeState;
import emu.gingerps.net.proto.BossChestInfoOuterClass.BossChestInfo;
import emu.gingerps.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq;
import emu.gingerps.net.proto.InterOpTypeOuterClass.InterOpType;
import emu.gingerps.net.proto.InteractTypeOuterClass;
import emu.gingerps.net.proto.InteractTypeOuterClass.InteractType;
import emu.gingerps.net.proto.ResinCostTypeOuterClass;
import emu.gingerps.net.proto.SceneGadgetInfoOuterClass.SceneGadgetInfo;
import emu.gingerps.scripts.constants.ScriptGadgetState;
import emu.gingerps.server.packet.send.PacketGadgetInteractRsp;
import emu.gingerps.server.packet.send.PacketLifeStateChangeNotify;

public class GadgetChest extends GadgetContent {

    public GadgetChest(EntityGadget gadget) {
        super(gadget);
    }

    public boolean onInteract(Player player, GadgetInteractReq req) {
        var chestInteractHandlerMap = getGadget().getScene().getWorld().getServer().getWorldDataSystem().getChestInteractHandlerMap();
        var handler = chestInteractHandlerMap.get(getGadget().getGadgetData().getJsonName());
        if (handler == null) {
            gingerps.getLogger().warn("Could not found the handler of this type of Chests {}", getGadget().getGadgetData().getJsonName());
            return false;
        }

        if (req.getOpType() == InterOpType.INTER_OP_TYPE_START && handler.isTwoStep()) {
            player.sendPacket(new PacketGadgetInteractRsp(getGadget(), InteractType.INTERACT_TYPE_OPEN_CHEST, InterOpType.INTER_OP_TYPE_START));
            return false;
        }else {
            boolean success;
            if (handler instanceof BossChestInteractHandler bossChestInteractHandler) {
                success = bossChestInteractHandler.onInteract(this, player,
                    req.getResinCostType()== ResinCostTypeOuterClass.ResinCostType.RESIN_COST_TYPE_CONDENSE);
            }else {
                success = handler.onInteract(this, player);
            }
            if (!success) {
                return false;
            }

            getGadget().updateState(ScriptGadgetState.ChestOpened);
            player.sendPacket(new PacketGadgetInteractRsp(this.getGadget(), InteractTypeOuterClass.InteractType.INTERACT_TYPE_OPEN_CHEST));

            return true;
        }
    }

    public void onBuildProto(SceneGadgetInfo.Builder gadgetInfo) {
        if (getGadget().getMetaGadget() == null) {
            return;
        }

        var bossChest = getGadget().getMetaGadget().boss_chest;
        if (bossChest != null) {
            var players = getGadget().getScene().getPlayers().stream().map(Player::getUid).toList();

            gadgetInfo.setBossChest(BossChestInfo.newBuilder()
                    .setMonsterConfigId(bossChest.monster_config_id)
                    .setResin(bossChest.resin)
                    .addAllQualifyUidList(players)
                    .addAllRemainUidList(players)
                    .build());
        }

    }
}
