package emu.gingerps.server.packet.send;

import java.util.Collection;
import java.util.stream.Stream;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.player.PlayerBuffManager.PlayerBuff;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ServerBuffChangeNotifyOuterClass.ServerBuffChangeNotify;
import emu.gingerps.net.proto.ServerBuffChangeNotifyOuterClass.ServerBuffChangeNotify.ServerBuffChangeType;

public class PacketServerBuffChangeNotify extends BasePacket {

    public PacketServerBuffChangeNotify(Player player, ServerBuffChangeType changeType, PlayerBuff buff) {
        this(player, changeType, Stream.of(buff));
    }

    public PacketServerBuffChangeNotify(Player player, ServerBuffChangeType changeType, Collection<PlayerBuff> buffs) {
        this(player, changeType, buffs.stream());
    }

    public PacketServerBuffChangeNotify(Player player, ServerBuffChangeType changeType, Stream<PlayerBuff> buffs) {
        super(PacketOpcodes.ServerBuffChangeNotify);

        var proto = ServerBuffChangeNotify.newBuilder();

        player.getTeamManager().getActiveTeam().stream()
            .mapToLong(entity -> entity.getAvatar().getGuid())
            .forEach(proto::addAvatarGuidList);

        proto.setServerBuffChangeType(changeType);
        buffs.map(PlayerBuff::toProto)
            .forEach(proto::addServerBuffList);

        this.setData(proto);
    }
}
