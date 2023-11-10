package gmail.aryanj1010.spritesmp.Listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;

public class OnEntityChangeBlock implements Listener {
    @EventHandler
    public void onEntityChangeBlock (EntityChangeBlockEvent e) {
        if (e.getBlockData().getMaterial().equals(Material.MAGMA_BLOCK)) {
            e.getBlock().getWorld().createExplosion(e.getBlock().getLocation(), 5);
        }
    }
}
