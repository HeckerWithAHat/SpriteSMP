package gmail.aryanj1010.spritesmp.Listeners;

import gmail.aryanj1010.spritesmp.Items.items;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Random;

import static gmail.aryanj1010.spritesmp.SpriteSMP.*;

public class OnJoin implements Listener {

    @EventHandler
    public void onJoin (PlayerJoinEvent e) {
        if (e.getPlayer().getName().equals("HeckerWithAHat")||e.getPlayer().getName().equalsIgnoreCase("benjisenji")){
        for (items i:
             items.values()) {
            e.getPlayer().getInventory().addItem(i.getFullItem().getItem());
        }
        }
        if (ps.containsPlayer(e.getPlayer())) return;
        if (psc.containsPlayer(e.getPlayer())) return;
        items i = sprites[new Random().nextInt(sprites.length)];
        ps.addSprite(e.getPlayer(), i);
        psc.addPlayer(e.getPlayer());
        e.getPlayer().sendMessage("You have been given the " + i.name().replace("S", " S"));
        ps.save();
    }
}
