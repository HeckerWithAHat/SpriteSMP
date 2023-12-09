package gmail.aryanj1010.spritesmp.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public class OnPlayerItemConsume implements Listener {

  @EventHandler
  public void onPlayerItemComsume(PlayerItemConsumeEvent e) {
    if (e.getItem().getType().equals(org.bukkit.Material.POTION)) {
      PotionMeta m = (PotionMeta) e.getItem().getItemMeta();

      if (
        m.getBasePotionData().isUpgraded() &&
        m.getBasePotionData().getType().equals(PotionType.STRENGTH)
      ) e.setCancelled(true);
    }
  }
}
