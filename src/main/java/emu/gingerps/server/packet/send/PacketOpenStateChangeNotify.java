package emu.gingerps.server.packet.send;

import java.util.Map;

import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.OpenStateChangeNotifyOuterClass.OpenStateChangeNotify;

//Sets openState to value
public class PacketOpenStateChangeNotify extends BasePacket {

    public PacketOpenStateChangeNotify(int openState, int value) {
        super(PacketOpcodes.OpenStateChangeNotify);

        OpenStateChangeNotify proto = OpenStateChangeNotify.newBuilder()
            .putOpenStateMap(openState, value)
            .build();

        this.setData(proto);
    }

    public PacketOpenStateChangeNotify(Map<Integer, Integer> map) {
        super(PacketOpcodes.OpenStateChangeNotify);

        OpenStateChangeNotify proto = OpenStateChangeNotify.newBuilder()
            .putAllOpenStateMap(map)
            .build();

        this.setData(proto);
    }

}
