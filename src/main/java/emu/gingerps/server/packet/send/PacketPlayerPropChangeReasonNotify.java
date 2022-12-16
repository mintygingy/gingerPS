package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.game.props.PlayerProperty;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify;
import emu.gingerps.net.proto.PropChangeReasonOuterClass.PropChangeReason;

public class PacketPlayerPropChangeReasonNotify extends BasePacket {

    public PacketPlayerPropChangeReasonNotify(Player player, PlayerProperty prop, int oldValue, int newValue, PropChangeReason changeReason) {
        super(PacketOpcodes.PlayerPropChangeReasonNotify);

        this.buildHeader(0);

        PlayerPropChangeReasonNotify proto = PlayerPropChangeReasonNotify.newBuilder()
                .setPropType(prop.getId())
                .setReason(changeReason)
                .setOldValue(oldValue)
                .setCurValue(newValue)
                .build();

        this.setData(proto);
    }
}
