package gmail.aryanj1010.spritesmp.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public class OnPotionSplash implements Listener {

  @EventHandler
  public void onPotionSplash(org.bukkit.event.entity.PotionSplashEvent e) {
    if (
      ((PotionMeta) e.getPotion().getItem().getItemMeta()).getBasePotionData()
        .isUpgraded() &&
      ((PotionMeta) e.getPotion().getItem().getItemMeta()).getBasePotionData()
        .getType()
        .equals(PotionType.STRENGTH)
    ) e.setCancelled(true);
  }
}
