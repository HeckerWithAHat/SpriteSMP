package gmail.aryanj1010.spritesmp.Listeners;

import gmail.aryanj1010.spritesmp.Items.items;
import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

import java.util.Iterator;
import java.util.List;

import static gmail.aryanj1010.spritesmp.Items.items.*;
import static gmail.aryanj1010.spritesmp.SpriteSMP.ps;
import static org.bukkit.Bukkit.getConsoleSender;
import static org.bukkit.Bukkit.getServer;
import static org.bukkit.plugin.java.JavaPlugin.getPlugin;

public class OnBlockBreak implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Block broken = e.getBlock();
        items it = ps.getSprite(e.getPlayer());
        boolean hasEarth = it == EarthSprite;
        boolean hasAir = it == AirSprite;
        boolean hasWater = it == WaterSprite;
        boolean hasFire = it == FireSprite;
        boolean hasShadow = it == ShadowSprite;
        boolean hasGlow = it == GlowSprite;
        if (e.getPlayer().getInventory().getItemInMainHand().equals(FirePickaxe.getFullItem().getItem()) && hasFire) {
            if ((Math.random() * 100) < 5) {
                broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), FireBladeFragment.getFullItem().getItem());
            }

            for (ItemStack i :
                    broken.getDrops()) {
                getConsoleSender().sendMessage(i.toString());
                for (Iterator<Recipe> r = Bukkit.recipeIterator(); r.hasNext(); ) {
                    Recipe j = r.next();
                    if (j instanceof FurnaceRecipe && ((FurnaceRecipe) j).getInput().equals(i)) {
                        getConsoleSender().sendMessage(j.toString());
                        getConsoleSender().sendMessage(j.getResult().toString());
                        e.setDropItems(false);
                        List<ItemStack> is = (List<ItemStack>) broken.getDrops();
                        is.remove(i);
                        is.add(((FurnaceRecipe) j).getResult());
                        for (ItemStack k :
                                is) {
                            broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), k);
                        }

                    }
                }
            }
        } else if (e.getPlayer().getInventory().getItemInMainHand().equals(WaterPickaxe.getFullItem().getItem()) && hasWater) {
            if ((Math.random() * 100) < 5) {
                broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), WaterBladeFragment.getFullItem().getItem());
            }
        } else if (e.getPlayer().getInventory().getItemInMainHand().equals(EarthPickaxe.getFullItem().getItem()) && hasEarth) {
            if ((Math.random() * 100) < 5) {
                broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), EarthBladeFragment.getFullItem().getItem());
            }
            if ((Math.random() * 100) < 20) {
                broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), (ItemStack) broken.getDrops().toArray()[0]);
            }
        } else if (e.getPlayer().getInventory().getItemInMainHand().equals(AirPickaxe.getFullItem().getItem()) && hasAir) {
            if ((Math.random() * 100) < 5) {
                broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), AirBladeFragment.getFullItem().getItem());
            }
        } else if (e.getPlayer().getInventory().getItemInMainHand().equals(ShadowPickaxe.getFullItem().getItem()) && hasShadow) {
            if ((Math.random() * 100) < 5) {
                broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), ShadowBladeFragment.getFullItem().getItem());
            }
            BlockFace facing = e.getPlayer().getFacing();
            Block up;
            Block down;
            Block left;
            Block right;
            Block upLeft;
            Block upRight;
            Block downLeft;
            Block downRight;
            e.getPlayer().sendMessage(facing.toString());
            if (e.getPlayer().getEyeLocation().getPitch() < -60) {
                up = broken.getRelative(BlockFace.NORTH);
                down = broken.getRelative(BlockFace.SOUTH);
                left = broken.getRelative(BlockFace.WEST);
                right = broken.getRelative(BlockFace.EAST);
                upLeft = broken.getRelative(BlockFace.NORTH).getRelative(BlockFace.WEST);
                upRight = broken.getRelative(BlockFace.NORTH).getRelative(BlockFace.EAST);
                downLeft = broken.getRelative(BlockFace.SOUTH).getRelative(BlockFace.WEST);
                downRight = broken.getRelative(BlockFace.SOUTH).getRelative(BlockFace.EAST);
            } else if (e.getPlayer().getEyeLocation().getPitch() > 60) {
                up = broken.getRelative(BlockFace.NORTH);
                down = broken.getRelative(BlockFace.SOUTH);
                left = broken.getRelative(BlockFace.WEST);
                right = broken.getRelative(BlockFace.EAST);
                upLeft = broken.getRelative(BlockFace.NORTH).getRelative(BlockFace.WEST);
                upRight = broken.getRelative(BlockFace.NORTH).getRelative(BlockFace.EAST);
                downLeft = broken.getRelative(BlockFace.SOUTH).getRelative(BlockFace.WEST);
                downRight = broken.getRelative(BlockFace.SOUTH).getRelative(BlockFace.EAST);
            } else if (facing.equals(BlockFace.NORTH)) {
                up = broken.getRelative(BlockFace.UP);
                down = broken.getRelative(BlockFace.DOWN);
                left = broken.getRelative(BlockFace.WEST);
                right = broken.getRelative(BlockFace.EAST);
                upLeft = broken.getRelative(BlockFace.UP).getRelative(BlockFace.WEST);
                upRight = broken.getRelative(BlockFace.UP).getRelative(BlockFace.EAST);
                downLeft = broken.getRelative(BlockFace.DOWN).getRelative(BlockFace.WEST);
                downRight = broken.getRelative(BlockFace.DOWN).getRelative(BlockFace.EAST);
            } else if (facing.equals(BlockFace.EAST)) {
                up = broken.getRelative(BlockFace.UP);
                down = broken.getRelative(BlockFace.DOWN);
                left = broken.getRelative(BlockFace.NORTH);
                right = broken.getRelative(BlockFace.SOUTH);
                upLeft = broken.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH);
                upRight = broken.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH);
                downLeft = broken.getRelative(BlockFace.DOWN).getRelative(BlockFace.NORTH);
                downRight = broken.getRelative(BlockFace.DOWN).getRelative(BlockFace.SOUTH);
            } else if (facing.equals(BlockFace.SOUTH)) {
                up = broken.getRelative(BlockFace.UP);
                down = broken.getRelative(BlockFace.DOWN);
                left = broken.getRelative(BlockFace.EAST);
                right = broken.getRelative(BlockFace.WEST);
                upLeft = broken.getRelative(BlockFace.UP).getRelative(BlockFace.EAST);
                upRight = broken.getRelative(BlockFace.UP).getRelative(BlockFace.WEST);
                downLeft = broken.getRelative(BlockFace.DOWN).getRelative(BlockFace.EAST);
                downRight = broken.getRelative(BlockFace.DOWN).getRelative(BlockFace.WEST);
            } else if (facing.equals(BlockFace.WEST)) {
                up = broken.getRelative(BlockFace.UP);
                down = broken.getRelative(BlockFace.DOWN);
                left = broken.getRelative(BlockFace.SOUTH);
                right = broken.getRelative(BlockFace.NORTH);
                upLeft = broken.getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH);
                upRight = broken.getRelative(BlockFace.UP).getRelative(BlockFace.NORTH);
                downLeft = broken.getRelative(BlockFace.DOWN).getRelative(BlockFace.SOUTH);
                downRight = broken.getRelative(BlockFace.DOWN).getRelative(BlockFace.NORTH);
            } else {
                up = broken.getRelative(BlockFace.NORTH);
                down = broken.getRelative(BlockFace.SOUTH);
                left = broken.getRelative(BlockFace.WEST);
                right = broken.getRelative(BlockFace.EAST);
                upLeft = broken.getRelative(BlockFace.NORTH).getRelative(BlockFace.WEST);
                upRight = broken.getRelative(BlockFace.NORTH).getRelative(BlockFace.EAST);
                downLeft = broken.getRelative(BlockFace.SOUTH).getRelative(BlockFace.WEST);
                downRight = broken.getRelative(BlockFace.SOUTH).getRelative(BlockFace.EAST);
            }


            getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> up.breakNaturally(), 3);
            getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> upRight.breakNaturally(), 6);
            getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> right.breakNaturally(), 9);
            getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> downRight.breakNaturally(), 12);
            getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> down.breakNaturally(), 15);
            getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> downLeft.breakNaturally(), 18);
            getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> left.breakNaturally(), 21);
            getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> upLeft.breakNaturally(), 24);

        } else if (e.getPlayer().getInventory().getItemInMainHand().equals(GlowPickaxe.getFullItem().getItem()) && hasGlow) {
            if ((Math.random() * 100) < 5) {
                broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), GlowBladeFragment.getFullItem().getItem());
            }
            if (Math.random() * 100 < 10) {
                int x = (int) (Math.random() * 100);
                if (x < 1)
                    broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), new ItemStack(Material.DIAMOND));
                if (1 <= x && x < 3)
                    broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), new ItemStack(Material.LAPIS_LAZULI));
                if (3 <= x && x < 6)
                    broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), new ItemStack(Material.REDSTONE));
                if (6 <= x && x < 13)
                    broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), new ItemStack(Material.GOLD_INGOT));
                if (13 <= x && x < 25)
                    broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), new ItemStack(Material.IRON_INGOT));
                if (25 <= x && x < 50)
                    broken.getLocation().getWorld().dropItemNaturally(broken.getLocation(), new ItemStack(Material.COAL));
            }



        }


    }
}
