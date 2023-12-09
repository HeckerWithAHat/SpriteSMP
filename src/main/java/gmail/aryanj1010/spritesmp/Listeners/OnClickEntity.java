package gmail.aryanj1010.spritesmp.Listeners;

import gmail.aryanj1010.spritesmp.API.AbilityWithCoolDown;
import gmail.aryanj1010.spritesmp.Items.items;
import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;
import java.util.UUID;

import static gmail.aryanj1010.spritesmp.Listeners.OnClick.waterRight;
import static gmail.aryanj1010.spritesmp.SpriteSMP.markedPlayer;
import static org.bukkit.Bukkit.getScheduler;
import static org.bukkit.plugin.java.JavaPlugin.getPlugin;


public class OnClickEntity implements Listener {

    // Cooldowns

    final HashMap<UUID, Long> shadowRight = new HashMap<>();
    final HashMap<UUID, Long> glowRight = new HashMap<>();


    @EventHandler
    public void onClickEntity (PlayerInteractEntityEvent e) {
        if (e.getPlayer().getInventory().getItem(e.getHand()).equals(items.AdvancedWaterSword.getFullItem().getItem())) {
            new AbilityWithCoolDown(waterRight, () -> {
                PotionEffect slow = new PotionEffect(PotionEffectType.SLOW, 10 * 20, 255);
                PotionEffect jump = new PotionEffect(PotionEffectType.JUMP, 10 * 20, 255);
                PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, 10 * 20, 1);
                PotionEffect strength = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 10 * 20, 1);
                ((LivingEntity) e.getRightClicked()).addPotionEffect(slow);
                ((LivingEntity) e.getRightClicked()).addPotionEffect(jump);
                e.getPlayer().addPotionEffect(speed);
                e.getPlayer().addPotionEffect(strength);
            }, 120, e.getPlayer());
        }
        if (e.getPlayer().getInventory().getItem(e.getHand()).equals(items.ShadowSword.getFullItem().getItem()) && !e.getPlayer().isSneaking()) {
            new AbilityWithCoolDown(shadowRight, () -> {
                PotionEffect blindness = new PotionEffect(PotionEffectType.BLINDNESS, 10*20, 255);
                ((LivingEntity)e.getRightClicked()).addPotionEffect(blindness);
            }, 60, e.getPlayer());
        } else if (e.getPlayer().getInventory().getItem(e.getHand()).equals(items.AdvancedShadowSword.getFullItem().getItem()) && !e.getPlayer().isSneaking()) {
            new AbilityWithCoolDown(shadowRight, () -> {
                PotionEffect blindness = new PotionEffect(PotionEffectType.BLINDNESS, 15*20, 255);
                ((LivingEntity)e.getRightClicked()).addPotionEffect(blindness);
            }, 60, e.getPlayer());
        }

        if (e.getPlayer().getInventory().getItem(e.getHand()).equals(items.GlowSword.getFullItem().getItem()) && !e.getPlayer().isSneaking()) {
            new AbilityWithCoolDown(glowRight, () -> {
                if (!(e.getRightClicked() instanceof Player)) return;
                PotionEffect glow = new PotionEffect(PotionEffectType.GLOWING, 10*20, 255);
                ((LivingEntity)e.getRightClicked()).addPotionEffect(glow);
                if (markedPlayer.containsKey(e.getPlayer())) markedPlayer.get(e.getPlayer()).removePotionEffect(PotionEffectType.GLOWING);
                markedPlayer.put(e.getPlayer(), (Player) e.getRightClicked());
                getScheduler().runTaskLater(getPlugin(SpriteSMP.class), (Runnable) () -> {
                    if (markedPlayer.get(e.getPlayer()).equals((Player) e.getRightClicked())) {
                        markedPlayer.remove(e.getPlayer());
                    }
                }, 10*20);
            }, 60, e.getPlayer());
        } else if (e.getPlayer().getInventory().getItem(e.getHand()).equals(items.AdvancedGlowSword.getFullItem().getItem()) && !e.getPlayer().isSneaking()) {
            new AbilityWithCoolDown(glowRight, () -> {
                if (!(e.getRightClicked() instanceof Player)) return;
                PotionEffect glow = new PotionEffect(PotionEffectType.GLOWING, 20*20, 255);
                ((LivingEntity)e.getRightClicked()).addPotionEffect(glow);
                if (markedPlayer.containsKey(e.getPlayer())) markedPlayer.get(e.getPlayer()).removePotionEffect(PotionEffectType.GLOWING);
                markedPlayer.put(e.getPlayer(), (Player) e.getRightClicked());
                getScheduler().runTaskLater(getPlugin(SpriteSMP.class), (Runnable) () -> {
                    if (markedPlayer.get(e.getPlayer()).equals((Player) e.getRightClicked())) {
                        markedPlayer.remove(e.getPlayer());
                    }
                }, 20*20);
            }, 60, e.getPlayer());
        }
    }
}
