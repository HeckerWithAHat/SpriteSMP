package gmail.aryanj1010.spritesmp.Listeners;

import static gmail.aryanj1010.spritesmp.SpriteSMP.*;

import gmail.aryanj1010.spritesmp.SpriteSMP;
import java.sql.Date;
import java.time.Instant;
import java.util.Objects;
import org.bukkit.BanList;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class OnKill implements Listener {

  @EventHandler
  public void onKillPlayer(PlayerDeathEvent e) {
    if (e.getEntity().getKiller() != null) {
      e
        .getDrops()
        .add(
          ps
            .getSprite(Objects.requireNonNull(e.getEntity().getKiller()))
            .getFullItem()
            .getItem()
        );
    } else {
      e
        .getDrops()
        .add(
          ps
            .getSprite(Objects.requireNonNull(e.getEntity()))
            .getFullItem()
            .getItem()
        );
    }

    psc.updatePlayer(e.getEntity(), -1);
    if (psc.getCount(e.getEntity()) <= -5) {
      e.getEntity().getInventory().clear();
      getPlugin(SpriteSMP.class)
        .getServer()
        .dispatchCommand(
          getPlugin(SpriteSMP.class).getServer().getConsoleSender(),
          "ban " + e.getEntity().getName() + "\"Out of Sprites\""
        );
      e.getEntity().kickPlayer("Out of Sprites");
    }
  }
}
