package gmail.aryanj1010.spritesmp.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import static gmail.aryanj1010.spritesmp.Items.items.*;

public class OnBlockBreak implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {


        if (e.getPlayer().getInventory().getItemInMainHand().equals(FirePickaxe.getFullItem().getItem())) {
            if ((Math.random()*100)<5) {
                e.getBlock().getDrops().add(FireBladeFragment.getFullItem().getItem());
            }
        } else if (e.getPlayer().getInventory().getItemInMainHand().equals(WaterPickaxe.getFullItem().getItem())) {
            if ((Math.random()*100)<5) {
                e.getBlock().getDrops().add(WaterBladeFragment.getFullItem().getItem());
            }
        } else if (e.getPlayer().getInventory().getItemInMainHand().equals(EarthPickaxe.getFullItem().getItem())) {
             if ((Math.random()*100)<5) {
                e.getBlock().getDrops().add(EarthBladeFragment.getFullItem().getItem());
            }
        } else if (e.getPlayer().getInventory().getItemInMainHand().equals(AirPickaxe.getFullItem().getItem())) {
             if ((Math.random()*100)<5) {
                e.getBlock().getDrops().add(AirBladeFragment.getFullItem().getItem());
            }
        } else if (e.getPlayer().getInventory().getItemInMainHand().equals(ShadowPickaxe.getFullItem().getItem())) {
            if ((Math.random()*100)<5) {
                e.getBlock().getDrops().add(ShadowBladeFragment.getFullItem().getItem());
            }
        } else if (e.getPlayer().getInventory().getItemInMainHand().equals(GlowPickaxe.getFullItem().getItem())) {
            if ((Math.random()*100)<5) {
                e.getBlock().getDrops().add(GlowBladeFragment.getFullItem().getItem());
            }
        }
    }
}
