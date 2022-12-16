package emu.gingerps.game.dungeons.challenge.trigger;

import emu.gingerps.game.dungeons.challenge.WorldChallenge;
import emu.gingerps.game.entity.EntityGadget;
import emu.gingerps.game.entity.EntityMonster;
import emu.gingerps.game.props.FightProperty;
import emu.gingerps.server.packet.send.PacketChallengeDataNotify;

public class GuardTrigger extends KillMonsterTrigger{
    @Override
    public void onBegin(WorldChallenge challenge) {
        super.onBegin(challenge);
        challenge.getScene().broadcastPacket(new PacketChallengeDataNotify(challenge, 2, 100));
    }

    @Override
    public void onGadgetDamage(WorldChallenge challenge, EntityGadget gadget) {
        var curHp = gadget.getFightProperties().get(FightProperty.FIGHT_PROP_CUR_HP.getId());
        var maxHp = gadget.getFightProperties().get(FightProperty.FIGHT_PROP_BASE_HP.getId());
        int percent = (int) (curHp / maxHp);
        challenge.getScene().broadcastPacket(new PacketChallengeDataNotify(challenge, 2, percent));

        if(percent <= 0){
            challenge.fail();
        }
    }
}
