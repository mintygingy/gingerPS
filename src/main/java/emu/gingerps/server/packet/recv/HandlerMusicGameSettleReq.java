package emu.gingerps.server.packet.recv;

//import emu.gingerps.game.activity.musicgame.MusicGameActivityHandler;
//import emu.gingerps.game.activity.musicgame.MusicGamePlayerData;
import emu.gingerps.game.props.ActivityType;
import emu.gingerps.game.props.WatcherTriggerType;
import emu.gingerps.net.packet.Opcodes;
import emu.gingerps.net.packet.PacketHandler;
import emu.gingerps.net.packet.PacketOpcodes;
import emu.gingerps.net.proto.MusicGameSettleReqOuterClass;
import emu.gingerps.server.game.GameSession;
import emu.gingerps.server.packet.send.PacketActivityInfoNotify;
import emu.gingerps.server.packet.send.PacketMusicGameSettleRsp;

@Opcodes(PacketOpcodes.MusicGameSettleReq)
public class HandlerMusicGameSettleReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = MusicGameSettleReqOuterClass.MusicGameSettleReq.parseFrom(payload);

        var playerData = session.getPlayer().getActivityManager().getPlayerActivityDataByActivityType(ActivityType.NEW_ACTIVITY_MUSIC_GAME);
        if (playerData.isEmpty()) {
            return;
        }
        //var handler = (MusicGameActivityHandler) playerData.get().getActivityHandler();
        boolean isNewRecord = false;
        // check if custom beatmap

        // TODO: PROTO IS OBFUSCATED, NEED TO GET PROPER VALUES.
        // Discovered: 23/08/2022.
        // Probably was an issue in 2.8 but was discovered in 3.0 port.
        // - Benj

        /*if (req.getMusicShareId() == 0) {
            session.getPlayer().getActivityManager().triggerWatcher(
                WatcherTriggerType.TRIGGER_FLEUR_FAIR_MUSIC_GAME_REACH_SCORE,
                String.valueOf(req.getMusicBasicId()),
                String.valueOf(req.getScore())
            );

            isNewRecord = handler.setMusicGameRecord(playerData.get(),
                MusicGamePlayerData.MusicGameRecord.of()
                    .musicId(req.getMusicBasicId())
                    .maxCombo(req.getMaxCombo())
                    .maxScore(req.getScore())
                    .build());

            // update activity info
            session.send(new PacketActivityInfoNotify(handler.toProto(playerData.get())));
        }else {
            handler.setMusicGameCustomBeatmapRecord(playerData.get(),
                MusicGamePlayerData.CustomBeatmapRecord.of()
                    .musicShareId(req.getMusicShareId())
                    .score(req.getMaxCombo())
                    .settle(req.getSuccess())
                    .build());
        }


        session.send(new PacketMusicGameSettleRsp(req.getMusicBasicId(), req.getMusicShareId(), isNewRecord));*/
    }

}
