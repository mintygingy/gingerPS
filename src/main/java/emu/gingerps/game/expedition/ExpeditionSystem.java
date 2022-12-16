package emu.gingerps.game.expedition;

import emu.gingerps.gingerps;
import emu.gingerps.data.DataLoader;
import emu.gingerps.server.game.BaseGameSystem;
import emu.gingerps.server.game.GameServer;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

import java.util.List;

public class ExpeditionSystem extends BaseGameSystem {
    private final Int2ObjectMap<List<ExpeditionRewardDataList>> expeditionRewardData;

    public ExpeditionSystem(GameServer server) {
        super(server);
        this.expeditionRewardData = new Int2ObjectOpenHashMap<>();
        this.load();
    }

    public Int2ObjectMap<List<ExpeditionRewardDataList>> getExpeditionRewardDataList() {
        return expeditionRewardData;
    }

    public synchronized void load() {
        getExpeditionRewardDataList().clear();
        try {
            List<ExpeditionRewardInfo> banners = DataLoader.loadList("ExpeditionReward.json", ExpeditionRewardInfo.class);
            if (banners.size() > 0) {
                for (ExpeditionRewardInfo di : banners) {
                    getExpeditionRewardDataList().put(di.getExpId(), di.getExpeditionRewardDataList());
                }
                gingerps.getLogger().debug("Expedition reward successfully loaded.");
            } else {
                gingerps.getLogger().error("Unable to load expedition reward. Expedition reward size is 0.");
            }
        } catch (Exception e) {
            gingerps.getLogger().error("Unable to load expedition reward.", e);
        }
    }
}
