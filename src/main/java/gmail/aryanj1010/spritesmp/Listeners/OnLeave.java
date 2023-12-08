package gmail.aryanj1010.spritesmp.Listeners;

import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import static gmail.aryanj1010.spritesmp.SpriteSMP.invisPlayers;
import static org.bukkit.plugin.java.JavaPlugin.getPlugin;

public class OnLeave implements Listener {
    @EventHandler
    public void onLeave (PlayerQuitEvent e) {
        for (Player invisPlayer : invisPlayers) {
            e.getPlayer().showPlayer(getPlugin(SpriteSMP.class), invisPlayer);
        }
    }
}
