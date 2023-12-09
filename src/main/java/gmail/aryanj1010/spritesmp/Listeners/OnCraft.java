package gmail.aryanj1010.spritesmp.Listeners;

import static gmail.aryanj1010.spritesmp.Items.items.*;
import static gmail.aryanj1010.spritesmp.SpriteSMP.ps;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;

public class OnCraft implements Listener {

  @EventHandler
  public void onCraft(CraftItemEvent e) {
    ItemStack result = e.getRecipe().getResult();
    if (
      result.isSimilar(FireSword.getFullItem().getItem()) &&
      ps.getSprite((Player) e.getWhoClicked()) != FireSprite
    ) e.setCancelled(true);
    if (
      result.isSimilar(WaterSword.getFullItem().getItem()) &&
      ps.getSprite((Player) e.getWhoClicked()) != WaterSprite
    ) e.setCancelled(true);
    if (
      result.isSimilar(AirSword.getFullItem().getItem()) &&
      ps.getSprite((Player) e.getWhoClicked()) != AirSprite
    ) e.setCancelled(true);
    if (
      result.isSimilar(EarthSword.getFullItem().getItem()) &&
      ps.getSprite((Player) e.getWhoClicked()) != EarthSprite
    ) e.setCancelled(true);
    if (
      result.isSimilar(AdvancedFireSword.getFullItem().getItem()) &&
      ps.getSprite((Player) e.getWhoClicked()) != FireSprite
    ) e.setCancelled(true);
    if (
      result.isSimilar(AdvancedWaterSword.getFullItem().getItem()) &&
      ps.getSprite((Player) e.getWhoClicked()) != WaterSprite
    ) e.setCancelled(true);
    if (
      result.isSimilar(AdvancedAirSword.getFullItem().getItem()) &&
      ps.getSprite((Player) e.getWhoClicked()) != AirSprite
    ) e.setCancelled(true);
    if (
      result.isSimilar(AdvancedEarthSword.getFullItem().getItem()) &&
      ps.getSprite((Player) e.getWhoClicked()) != EarthSprite
    ) e.setCancelled(true);
  }
}
