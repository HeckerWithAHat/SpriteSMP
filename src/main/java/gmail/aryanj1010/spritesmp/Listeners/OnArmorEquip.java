package gmail.aryanj1010.spritesmp.Listeners;

import gmail.aryanj1010.spritesmp.API.ArmorEquipEvent;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class OnArmorEquip implements Listener {
    @EventHandler
    public void onArmorEquip (ArmorEquipEvent e) {
        Material m1 = e.getNewArmorPiece().getType();
        Material m2 = Material.NETHERITE_HELMET;
        Material m3 = Material.NETHERITE_CHESTPLATE;
        Material m4 = Material.NETHERITE_LEGGINGS;
        Material m5 = Material.NETHERITE_BOOTS;
        if (m1 == m2 || m1 == m3 || m1 == m4 || m1 == m5) e.setCancelled(true);
    }
}
