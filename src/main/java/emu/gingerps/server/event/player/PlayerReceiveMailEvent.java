package emu.gingerps.server.event.player;

import emu.gingerps.game.mail.Mail;
import emu.gingerps.game.player.Player;
import emu.gingerps.server.event.Cancellable;
import emu.gingerps.server.event.types.PlayerEvent;

public final class PlayerReceiveMailEvent extends PlayerEvent implements Cancellable {
    private Mail message;
    
    public PlayerReceiveMailEvent(Player player, Mail message) {
        super(player);
        
        this.message = message;
    }
    
    public void setMessage(Mail message) {
        this.message = message;
    }
    
    public Mail getMessage() {
        return this.message;
    }
}
