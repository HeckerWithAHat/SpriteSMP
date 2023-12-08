package gmail.aryanj1010.spritesmp.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import static gmail.aryanj1010.spritesmp.Items.items.GlowSword;
import static gmail.aryanj1010.spritesmp.SpriteSMP.markedPlayer;

public class OnEntityDamageByEntity implements Listener {
    @EventHandler
    public void onEntityDamageByEntity (EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player && e.getEntity() instanceof Player) {
            Player damager = (Player) e.getDamager();
            Player damaged = (Player) e.getEntity();
            if (markedPlayer.get(damager) == null) return;
            if (markedPlayer.get(damager).equals(damaged) && (damager.getInventory().getItemInMainHand().equals(GlowSword.getFullItem().getItem()))) {
                e.setDamage(e.getDamage() * 1.1);
            }

        }
    }
}
