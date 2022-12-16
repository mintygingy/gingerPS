package emu.gingerps.server.packet.send;

import emu.gingerps.game.gacha.GachaSystem;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;

public class PacketGetGachaInfoRsp extends BasePacket {

    public PacketGetGachaInfoRsp(GachaSystem manager, Player player) {
        super(PacketOpcodes.GetGachaInfoRsp);

        this.setData(manager.toProto(player));
    }

}
