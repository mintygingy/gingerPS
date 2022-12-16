package emu.gingerps.server.packet.send;

import emu.gingerps.gingerps;
import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.GetOnlinePlayerListReqOuterClass;
import emu.gingerps.net.proto.GetOnlinePlayerListRspOuterClass.*;
import emu.gingerps.net.proto.MpSettingTypeOuterClass;
import emu.gingerps.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo;
import emu.gingerps.net.proto.ProfilePictureOuterClass.ProfilePicture;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PacketGetOnlinePlayerListRsp extends BasePacket {
    public PacketGetOnlinePlayerListRsp(Player session){
        super(PacketOpcodes.GetOnlinePlayerListRsp);
        
        List<Player> players = gingerps.getGameServer().getPlayers().values().stream().limit(50).toList();
        
        GetOnlinePlayerListRsp.Builder proto = GetOnlinePlayerListRsp.newBuilder();
        
        if (players.size() != 0) {
            for(Player player : players) {
                if (player.getUid() == session.getUid()) continue;
                
                proto.addPlayerInfoList(player.getOnlinePlayerInfo());
            }
        }
        
        this.setData(proto);
    }
}
