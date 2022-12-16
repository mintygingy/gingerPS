package emu.gingerps.server.packet.send;

import emu.gingerps.game.player.Player;
import emu.gingerps.net.packet.BasePacket;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.AvatarTeamAllDataNotifyOuterClass.AvatarTeamAllDataNotify;

public class PacketAvatarTeamAllDataNotify extends BasePacket {
    public PacketAvatarTeamAllDataNotify(Player player) {
        super(PacketOpcodes.AvatarTeamAllDataNotify);

        AvatarTeamAllDataNotify.Builder proto = AvatarTeamAllDataNotify.newBuilder();

        // Add the id list for custom teams.
        for (int id : player.getTeamManager().getTeams().keySet()) {
            if (id > 4) {
                proto.addBackupAvatarTeamOrderList(id);
            }
        }

        // Add the avatar lists for all the teams the player has.
        player.getTeamManager().getTeams().forEach((id, teamInfo) -> proto.putAvatarTeamMap(id, teamInfo.toProto(player)));

        this.setData(proto);
    }
}
