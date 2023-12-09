package gmail.aryanj1010.spritesmp.Listeners;

import static gmail.aryanj1010.spritesmp.SpriteSMP.ps;

import gmail.aryanj1010.spritesmp.Items.items;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class OnDamage implements Listener {

  @EventHandler
  public void onDamage(EntityDamageEvent e) {
    if (!(e.getEntity() instanceof Player)) return;
    Player p = ((Player) e.getEntity());
    if (
      ps.getSprite(p).equals(items.AirSprite) &&
      e.getCause().equals(EntityDamageEvent.DamageCause.FALL)
    ) e.setCancelled(true);
  }
}
