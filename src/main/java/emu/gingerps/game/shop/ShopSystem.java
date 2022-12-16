package emu.gingerps.game.shop;

import emu.gingerps.gingerps;
import emu.gingerps.data.DataLoader;
import emu.gingerps.data.GameData;
import emu.gingerps.data.common.ItemParamData;
import emu.gingerps.data.excels.ShopGoodsData;
import emu.gingerps.server.game.BaseGameSystem;
import emu.gingerps.server.game.GameServer;
import emu.gingerps.utils.Utils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

import static emu.gingerps.config.Configuration.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShopSystem extends BaseGameSystem {
    private final Int2ObjectMap<List<ShopInfo>> shopData;
    private final Int2ObjectMap<List<ItemParamData>> shopChestData;

    private static final int REFRESH_HOUR = 4; // In GMT+8 server
    private static final String TIME_ZONE = "Asia/Shanghai"; // GMT+8 Timezone

    public ShopSystem(GameServer server) {
        super(server);
        this.shopData = new Int2ObjectOpenHashMap<>();
        this.shopChestData = new Int2ObjectOpenHashMap<>();
        this.load();
    }

    public Int2ObjectMap<List<ShopInfo>> getShopData() {
        return shopData;
    }

    public List<ItemParamData> getShopChestData(int chestId) {
        return this.shopChestData.get(chestId);
    }

    public static int getShopNextRefreshTime(ShopInfo shopInfo) {
        return switch (shopInfo.getShopRefreshType()) {
            case SHOP_REFRESH_DAILY -> Utils.getNextTimestampOfThisHour(REFRESH_HOUR, TIME_ZONE, shopInfo.getShopRefreshParam());
            case SHOP_REFRESH_WEEKLY ->  Utils.getNextTimestampOfThisHourInNextWeek(REFRESH_HOUR, TIME_ZONE, shopInfo.getShopRefreshParam());
            case SHOP_REFRESH_MONTHLY -> Utils.getNextTimestampOfThisHourInNextMonth(REFRESH_HOUR, TIME_ZONE, shopInfo.getShopRefreshParam());
            default -> 0;
        };
    }

    private void loadShop() {
        getShopData().clear();
        try {
            List<ShopTable> banners = DataLoader.loadList("Shop.json", ShopTable.class);
            if (banners.size() > 0) {
                for (ShopTable shopTable : banners) {
                    shopTable.getItems().forEach(ShopInfo::removeVirtualCosts);
                    getShopData().put(shopTable.getShopId(), shopTable.getItems());
                }
                gingerps.getLogger().debug("Shop data successfully loaded.");
            } else {
                gingerps.getLogger().error("Unable to load shop data. Shop data size is 0.");
            }

            if (GAME_OPTIONS.enableShopItems) {
                GameData.getShopGoodsDataEntries().forEach((k, v) -> {
                    if (!getShopData().containsKey(k.intValue()))
                        getShopData().put(k.intValue(), new ArrayList<>());
                    for (ShopGoodsData sgd : v) {
                        var shopInfo = new ShopInfo(sgd);
                        getShopData().get(k.intValue()).add(shopInfo);
                    }
                });
            }
        } catch (Exception e) {
            gingerps.getLogger().error("Unable to load shop data.", e);
        }
    }

    private void loadShopChest() {
        shopChestData.clear();
        try {
            Map<Integer, String> chestMap = DataLoader.loadMap("ShopChest.v2.json", Integer.class, String.class);
            chestMap.forEach((chestId, itemStr) -> {
                if (itemStr.isEmpty()) return;
                var entries = itemStr.split(",");
                var list = new ArrayList<ItemParamData>(entries.length);
                for (var entry : entries) {
                    var idAndCount = entry.split(":");
                    int id = Integer.parseInt(idAndCount[0]);
                    int count = Integer.parseInt(idAndCount[1]);
                    list.add(new ItemParamData(id, count));
                }
                this.shopChestData.put((int) chestId, list);
            });
            gingerps.getLogger().debug("Loaded " + chestMap.size() + " ShopChest entries.");
        } catch (Exception e) {
            gingerps.getLogger().error("Unable to load ShopChest data.", e);
        }
    }

    public synchronized void load() {
        loadShop();
        loadShopChest();
    }

    public GameServer getServer() {
        return server;
    }
}
