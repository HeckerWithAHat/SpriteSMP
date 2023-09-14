package gmail.aryanj1010.spritesmp.Listeners;

import org.bukkit.BanList;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.meta.SkullMeta;

import static gmail.aryanj1010.spritesmp.SpriteSMP.plugin;

public class OnInventoryClick implements Listener {
    @EventHandler
    public void onInventoryClick (InventoryClickEvent e) {
        if (e.getClickedInventory().getSize() == 36 && e.getClickedInventory().getHolder() == ((Player) e.getWhoClicked()) && e.getCurrentItem().getType().equals(Material.PLAYER_HEAD)) {
            plugin.getServer().getBanList(BanList.Type.PROFILE).pardon(((SkullMeta)e.getCurrentItem().getItemMeta()).getOwnerProfile().getName());
        }
    }
}
