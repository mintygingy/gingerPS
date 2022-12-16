package emu.gingerps.server.packet.send;

import emu.gingerps.game.entity.GameEntity;
import emu.gingerps.game.props.FightProperty;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.ChangeEnergyReasonOuterClass.ChangeEnergyReason;
import emu.gingerps.net.proto.ChangeHpReasonOuterClass.ChangeHpReason;
import emu.gingerps.net.proto.EntityFightPropChangeReasonNotifyOuterClass.EntityFightPropChangeReasonNotify;
import emu.gingerps.net.proto.PropChangeReasonOuterClass.PropChangeReason;

import java.util.List;

public class PacketEntityFightPropChangeReasonNotify extends BasePacket {

    public PacketEntityFightPropChangeReasonNotify(GameEntity entity, FightProperty prop, Float value, List<Integer> param, PropChangeReason reason, ChangeHpReason changeHpReason) {
        super(PacketOpcodes.EntityFightPropChangeReasonNotify);

        EntityFightPropChangeReasonNotify.Builder proto = EntityFightPropChangeReasonNotify.newBuilder()
                .setEntityId(entity.getId())
                .setPropType(prop.getId())
                .setPropDelta(value)
                .setReason(reason)
                .setChangeHpReason(changeHpReason);

        for(int p : param){
            proto.addParamList(p);
        }

        this.setData(proto);
    }

    public PacketEntityFightPropChangeReasonNotify(GameEntity entity, FightProperty prop, Float value, PropChangeReason reason, ChangeHpReason changeHpReason) {
        super(PacketOpcodes.EntityFightPropChangeReasonNotify);

        EntityFightPropChangeReasonNotify proto = EntityFightPropChangeReasonNotify.newBuilder()
                .setEntityId(entity.getId())
                .setPropType(prop.getId())
                .setPropDelta(value)
                .setReason(reason)
                .setChangeHpReason(changeHpReason)
                .build();

        this.setData(proto);
    }

    public PacketEntityFightPropChangeReasonNotify(GameEntity entity, FightProperty prop, Float value, PropChangeReason reason) {
        super(PacketOpcodes.EntityFightPropChangeReasonNotify);

        EntityFightPropChangeReasonNotify proto = EntityFightPropChangeReasonNotify.newBuilder()
                .setEntityId(entity.getId())
                .setPropType(prop.getId())
                .setPropDelta(value)
                .setReason(reason)
                .build();

        this.setData(proto);
    }

    public PacketEntityFightPropChangeReasonNotify(GameEntity entity, FightProperty prop, Float value, ChangeEnergyReason reason) {
        super(PacketOpcodes.EntityFightPropChangeReasonNotify);

        EntityFightPropChangeReasonNotify proto = EntityFightPropChangeReasonNotify.newBuilder()
                .setEntityId(entity.getId())
                .setPropType(prop.getId())
                .setPropDelta(value)
                .setChangeEnergyReason(reason)
                .build();

        this.setData(proto);
    }
}
