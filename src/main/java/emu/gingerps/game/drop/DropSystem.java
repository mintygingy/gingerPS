package emu.gingerps.game.drop;

import emu.gingerps.gingerps;
import emu.gingerps.data.DataLoader;
import emu.gingerps.data.GameData;
import emu.gingerps.data.excels.ItemData;
import emu.gingerps.game.entity.EntityItem;
import emu.gingerps.game.entity.EntityMonster;
import emu.gingerps.game.inventory.GameItem;
import emu.gingerps.game.inventory.ItemType;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.ActionReason;
import emu.gingerps.game.world.Scene;
import emu.gingerps.server.game.BaseGameSystem;
import emu.gingerps.server.game.GameServer;
import emu.gingerps.utils.Position;
import emu.gingerps.utils.Utils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

import java.util.List;

public class DropSystem extends BaseGameSystem {
    private final Int2ObjectMap<List<DropData>> dropData;

    public DropSystem(GameServer server) {
        super(server);
        this.dropData = new Int2ObjectOpenHashMap<>();
        this.load();
    }

    public Int2ObjectMap<List<DropData>> getDropData() {
        return dropData;
    }

    public synchronized void load() {
        getDropData().clear();
        try {
            List<DropInfo> banners = DataLoader.loadList("Drop.json", DropInfo.class);
            if (banners.size() > 0) {
                for (DropInfo di : banners) {
                    getDropData().put(di.getMonsterId(), di.getDropDataList());
                }
                gingerps.getLogger().debug("Drop data successfully loaded.");
            } else {
                gingerps.getLogger().error("Unable to load drop data. Drop data size is 0.");
            }
        } catch (Exception e) {
            gingerps.getLogger().error("Unable to load drop data.", e);
        }
    }
    private void addDropEntity(DropData dd, Scene dropScene, ItemData itemData, Position pos, int num, Player target) {
        if (!dd.isGive() && (itemData.getItemType() != ItemType.ITEM_VIRTUAL || itemData.getGadgetId() != 0)) {
            EntityItem entity = new EntityItem(dropScene, target, itemData, pos, num, dd.isShare());
            if (!dd.isShare())
                dropScene.addEntityToSingleClient(target, entity);
            else
                dropScene.addEntity(entity);
        } else {
            if (target != null) {
                target.getInventory().addItem(new GameItem(itemData, num), ActionReason.SubfieldDrop, true);
            } else {
                // target is null if items will be added are shared. no one could pick it up because of the combination(give + shared)
                // so it will be sent to all players' inventories directly.
                dropScene.getPlayers().forEach(x -> x.getInventory().addItem(new GameItem(itemData, num), ActionReason.SubfieldDrop, true));
            }
        }
    }

    private void processDrop(DropData dd, EntityMonster em, Player gp) {
        int target = Utils.randomRange(1, 10000);
        if (target >= dd.getMinWeight() && target < dd.getMaxWeight()) {
            ItemData itemData = GameData.getItemDataMap().get(dd.getItemId());
            int num = Utils.randomRange(dd.getMinCount(), dd.getMaxCount());

            if (itemData == null) {
                return;
            }
            if (itemData.isEquip()) {
                for (int i = 0; i < num; i++) {
                    float range = (2.5f + (.05f * num));
                    Position pos = em.getPosition().nearby2d(range).addY(3f);
                    addDropEntity(dd, em.getScene(), itemData, pos, num, gp);
                }
            } else {
                Position pos = em.getPosition().clone().addY(3f);
                addDropEntity(dd, em.getScene(), itemData, pos, num, gp);
            }
        }
    }

    public void callDrop(EntityMonster em) {
        int id = em.getMonsterData().getId();
        if (getDropData().containsKey(id)) {
            for (DropData dd : getDropData().get(id)) {
                if (dd.isShare())
                    processDrop(dd, em, null);
                else {
                    for (Player gp : em.getScene().getPlayers()) {
                        processDrop(dd, em, gp);
                    }
                }
            }
        }
    }
}
