package emu.gingerps.server.packet.send;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.SceneEntityDrownRspOuterClass.SceneEntityDrownRsp;

public class PacketSceneEntityDrownRsp extends BasePacket {

    public PacketSceneEntityDrownRsp(int entityId) {
        super(PacketOpcodes.SceneEntityDrownRsp);

        SceneEntityDrownRsp proto = SceneEntityDrownRsp.newBuilder().setEntityId(entityId).build();

        this.setData(proto);
    }
}


