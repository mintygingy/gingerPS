package emu.gingerps.game.systems;

import emu.gingerps.gingerps;
import emu.gingerps.data.DataLoader;
import emu.gingerps.game.player.Player;
import emu.gingerps.game.world.World;
import emu.gingerps.net.proto.AnnounceDataOuterClass;
import emu.gingerps.server.game.BaseGameSystem;
import emu.gingerps.server.game.GameServer;
import emu.gingerps.server.packet.send.PacketServerAnnounceNotify;
import emu.gingerps.server.packet.send.PacketServerAnnounceRevokeNotify;
import emu.gingerps.utils.Utils;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.*;

@Getter
public class AnnouncementSystem extends BaseGameSystem {
    private final Map<Integer, AnnounceConfigItem> announceConfigItemMap;

    public AnnouncementSystem(GameServer server) {
        super(server);
        this.announceConfigItemMap = new HashMap<>();
        loadConfig();
    }

    private int loadConfig() {
        try {
            List<AnnounceConfigItem> announceConfigItems = DataLoader.loadList("Announcement.json", AnnounceConfigItem.class);

            announceConfigItemMap.clear();
            announceConfigItems.forEach(i -> announceConfigItemMap.put(i.getTemplateId(), i));
        } catch (Exception e) {
            gingerps.getLogger().error("Unable to load server announce config.", e);
        }

        return announceConfigItemMap.size();
    }

    public List<Player> getOnlinePlayers() {
        return getServer().getWorlds().stream()
            .map(World::getPlayers)
            .flatMap(Collection::stream)
            .toList();
    }

    public void broadcast(List<AnnounceConfigItem> tpl) {
        if (tpl == null || tpl.size() == 0) {
            return;
        }

        var list = tpl.stream()
            .map(AnnounceConfigItem::toProto)
            .map(AnnounceDataOuterClass.AnnounceData.Builder::build)
            .toList();

        getOnlinePlayers().forEach(i -> i.sendPacket(new PacketServerAnnounceNotify(list)));
    }

    public int refresh() {
        return loadConfig();
    }

    public void revoke(int tplId) {
        getOnlinePlayers().forEach(i -> i.sendPacket(new PacketServerAnnounceRevokeNotify(tplId)));
    }

    @Data
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public class AnnounceConfigItem{
        int templateId;
        AnnounceType type;
        int frequency;
        String content;
        Date beginTime;
        Date endTime;
        boolean tick;
        int interval;

        public AnnounceDataOuterClass.AnnounceData.Builder toProto() {
            var proto = AnnounceDataOuterClass.AnnounceData.newBuilder();

            proto.setConfigId(templateId)
                // I found the time here is useless
                .setBeginTime(Utils.getCurrentSeconds() + 1)
                .setEndTime(Utils.getCurrentSeconds() + 10);

            if (type == AnnounceType.CENTER) {
                proto.setCenterSystemText(content)
                    .setCenterSystemFrequency(frequency)
                ;
            }else {
                proto.setCountDownText(content)
                    .setCountDownFrequency(frequency)
                ;
            }

            return proto;
        }
    }

    public enum AnnounceType{
        CENTER, COUNTDOWN
    }
}
