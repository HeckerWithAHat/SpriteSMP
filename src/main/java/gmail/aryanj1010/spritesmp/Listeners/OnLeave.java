package gmail.aryanj1010.spritesmp.Listeners;

import static gmail.aryanj1010.spritesmp.API.ActionBarManager.removeActionBar;
import static gmail.aryanj1010.spritesmp.SpriteSMP.invisPlayers;
import static org.bukkit.plugin.java.JavaPlugin.getPlugin;

import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnLeave implements Listener {

  @EventHandler
  public void onLeave(PlayerQuitEvent e) {
    removeActionBar(e.getPlayer());
    if (invisPlayers.isEmpty()) return;
    for (Player invisPlayer : invisPlayers) {
      e.getPlayer().showPlayer(getPlugin(SpriteSMP.class), invisPlayer);
    }
  }
}
