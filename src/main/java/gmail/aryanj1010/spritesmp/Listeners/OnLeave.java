package gmail.aryanj1010.spritesmp.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import static gmail.aryanj1010.spritesmp.API.ActionBarManager.removeActionBar;

public class OnLeave implements Listener {
    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        removeActionBar(e.getPlayer());
    }
}
