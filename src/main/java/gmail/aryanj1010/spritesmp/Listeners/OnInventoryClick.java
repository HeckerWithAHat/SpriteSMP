package gmail.aryanj1010.spritesmp.Listeners;

import static gmail.aryanj1010.spritesmp.Listeners.OnClick.inv;
import static org.bukkit.plugin.java.JavaPlugin.getPlugin;

import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.BanList;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.meta.SkullMeta;

public class OnInventoryClick implements Listener {

  @EventHandler
  public void onInventoryClick(InventoryClickEvent e) {
    if (
      e.getClickedInventory().equals(inv) &&
      e.getCurrentItem().getType().equals(Material.PLAYER_HEAD)
    ) {
      e.setCancelled(true);
      SpriteSMP
        .getPlugin(SpriteSMP.class)
        .getServer()
        .dispatchCommand(
          getPlugin(SpriteSMP.class).getServer().getConsoleSender(),
          "pardon " + e.getCurrentItem().getItemMeta().getDisplayName()
        );
      e.getCurrentItem().setAmount(0);
    }
  }
}
