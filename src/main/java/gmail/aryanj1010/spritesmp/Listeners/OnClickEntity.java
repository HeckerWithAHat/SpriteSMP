package gmail.aryanj1010.spritesmp.Listeners;

import gmail.aryanj1010.spritesmp.Items.items;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;
import java.util.UUID;


public class OnClickEntity implements Listener {
    final HashMap<UUID, Long> advancedWaterRight = new HashMap<>();

    @EventHandler
    public void onClickEntity (PlayerInteractEntityEvent e) {
        if (e.getPlayer().getInventory().getItem(e.getHand()).equals(items.AdvancedWaterSword)) {
            if (!advancedWaterRight.containsKey(e.getPlayer().getUniqueId())) {
                PotionEffect slow = new PotionEffect(PotionEffectType.SLOW, 10 * 20, 255);
                PotionEffect jump = new PotionEffect(PotionEffectType.JUMP, 10 * 20, 255);
                PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, 10 * 20, 1);
                PotionEffect strength = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 10 * 20, 1);
                ((LivingEntity) e.getRightClicked()).addPotionEffect(slow);
                ((LivingEntity) e.getRightClicked()).addPotionEffect(jump);
                e.getPlayer().addPotionEffect(speed);
                e.getPlayer().addPotionEffect(strength);
                advancedWaterRight.put(e.getPlayer().getUniqueId(), System.currentTimeMillis());
            } else {
                Long timeElapsed = System.currentTimeMillis() - advancedWaterRight.get(e.getPlayer().getUniqueId());
                if (timeElapsed >= 120000) {
                    PotionEffect slow = new PotionEffect(PotionEffectType.SLOW, 10 * 20, 255);
                    PotionEffect jump = new PotionEffect(PotionEffectType.JUMP, 10 * 20, 255);
                    PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, 10 * 20, 1);
                    PotionEffect strength = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 10 * 20, 1);
                    ((LivingEntity) e.getRightClicked()).addPotionEffect(slow);
                    ((LivingEntity) e.getRightClicked()).addPotionEffect(jump);
                    e.getPlayer().addPotionEffect(speed);
                    e.getPlayer().addPotionEffect(strength);
                    advancedWaterRight.put(e.getPlayer().getUniqueId(), System.currentTimeMillis());
                } else {
                    e.getPlayer().sendMessage("120 seconds hasn't passed! Please Wait " + Math.round((float) ((120000 - timeElapsed) / 1000)) + " seconds");

                }
            }
        }
    }
}
