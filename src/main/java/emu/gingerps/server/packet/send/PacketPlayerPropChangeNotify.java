package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.PlayerProperty;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerPropChangeNotifyOuterClass.PlayerPropChangeNotify;
import emu.gingerps.utils.ProtoHelper;

public class PacketPlayerPropChangeNotify extends BasePacket {

    public PacketPlayerPropChangeNotify(Player player, PlayerProperty prop, int delta) {
        super(PacketOpcodes.PlayerPropChangeNotify);

        this.buildHeader(0);

        PlayerPropChangeNotify proto = PlayerPropChangeNotify.newBuilder()
                .setPropType(prop.getId())
                .setPropDelta(delta)
                .build();

        this.setData(proto);
    }
}
