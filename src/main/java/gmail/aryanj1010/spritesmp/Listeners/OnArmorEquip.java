package gmail.aryanj1010.spritesmp.Listeners;

import gmail.aryanj1010.spritesmp.API.ArmorEquipEvent;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class OnArmorEquip implements Listener {

  @EventHandler
  public void onArmorEquip(ArmorEquipEvent e) {
    if (
      e.getNewArmorPiece().getType() == Material.NETHERITE_HELMET ||
      e.getNewArmorPiece().getType() == Material.NETHERITE_CHESTPLATE ||
      e.getNewArmorPiece().getType() == Material.NETHERITE_LEGGINGS ||
      e.getNewArmorPiece().getType() == Material.NETHERITE_BOOTS
    ) e.setCancelled(true);
  }
}
