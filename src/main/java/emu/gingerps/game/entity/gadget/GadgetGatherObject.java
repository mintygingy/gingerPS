package emu.gingerps.game.entity.gadget;

import emu.gingerps.data.GameData;
import emu.gingerps.data.excels.ItemData;
import emu.gingerps.game.entity.EntityGadget;
import emu.gingerps.game.entity.EntityItem;
import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.ActionReason;
import emu.gingerps.game.world.Scene;
import emu.gingerps.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo;
import emu.gingerps.net.proto.InteractTypeOuterClass.InteractType;
import emu.gingerps.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq;
import emu.gingerps.net.proto.SceneGadgetInfoOuterClass.SceneGadgetInfo;
import emu.gingerps.server.packet.send.PacketGadgetInteractRsp;
import emu.gingerps.utils.Utils;

public class GadgetGatherObject extends GadgetContent {
    private int itemId;
    private boolean isForbidGuest;

    public GadgetGatherObject(EntityGadget gadget) {
        super(gadget);

        if (gadget.getSpawnEntry() != null) {
            this.itemId = gadget.getSpawnEntry().getGatherItemId();
        }
    }

    public int getItemId() {
        return this.itemId;
    }

    public boolean isForbidGuest() {
        return isForbidGuest;
    }

    public boolean onInteract(Player player, GadgetInteractReq req) {
        // Sanity check
        ItemData itemData = GameData.getItemDataMap().get(getItemId());
        if (itemData == null) {
            return false;
        }

        GameItem item = new GameItem(itemData, 1);
        player.getInventory().addItem(item, ActionReason.Gather);

        getGadget().getScene().broadcastPacket(new PacketGadgetInteractRsp(getGadget(), InteractType.INTERACT_TYPE_GATHER));

        return true;
    }

    public void onBuildProto(SceneGadgetInfo.Builder gadgetInfo) {
        GatherGadgetInfo gatherGadgetInfo = GatherGadgetInfo.newBuilder()
                .setItemId(this.getItemId())
                .setIsForbidGuest(this.isForbidGuest())
                .build();

        gadgetInfo.setGatherGadget(gatherGadgetInfo);
    }

    public void dropItems(Player player) {
        Scene scene = getGadget().getScene();
        int times = Utils.randomRange(1,2);

        for (int i = 0 ; i < times ; i++) {
            EntityItem item = new EntityItem(
                    scene,
                    player,
                    GameData.getItemDataMap().get(itemId),
                    getGadget().getPosition().nearby2d(1f).addY(2f),
                    1,
                    true);

            scene.addEntity(item);
        }

        scene.killEntity(this.getGadget(), player.getTeamManager().getCurrentAvatarEntity().getId());
        // Todo: add record
    }
}
