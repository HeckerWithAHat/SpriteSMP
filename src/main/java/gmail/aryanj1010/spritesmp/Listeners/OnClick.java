package gmail.aryanj1010.spritesmp.Listeners;

import gmail.aryanj1010.spritesmp.API.AbilityWithCoolDown;
import gmail.aryanj1010.spritesmp.Items.items;
import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

import java.util.*;

import static gmail.aryanj1010.spritesmp.Items.items.*;
import static gmail.aryanj1010.spritesmp.SpriteSMP.*;
import static org.bukkit.Bukkit.getScheduler;
import static org.bukkit.Bukkit.getServer;


public class OnClick implements Listener {
    final HashMap<UUID, Long> fireLeft = new HashMap<>();
    final HashMap<UUID, Long> fireRight = new HashMap<>();

    final HashMap<UUID, Long> waterLeft = new HashMap<>();
    final List<UUID> waterLeftInUse = new ArrayList<>();
    final HashMap<UUID, Integer> waterLeftTaskNumbers = new HashMap<>();
    final HashMap<UUID, FallingBlock> waterLeftFallingBlocks = new HashMap<>();
    final HashMap<UUID, Long> waterRight = new HashMap<>();

    final HashMap<UUID, Long> airLeft = new HashMap<>();
    final HashMap<UUID, Long> airRight = new HashMap<>();

    final HashMap<UUID, Long> earthLeft = new HashMap<>();
    final List<UUID> earthLeftInUse = new ArrayList<>();
    final HashMap<UUID, Integer> earthLeftTaskNumbers = new HashMap<>();
    final HashMap<UUID, FallingBlock> earthLeftFallingBlocks = new HashMap<>();
    final HashMap<UUID, Long> earthRight = new HashMap<>();

    final HashMap<UUID, Long> advancedFireLeft = new HashMap<>();
    final HashMap<UUID, Long> advancedFireRight = new HashMap<>();

    final HashMap<UUID, Long> advancedWaterLeft = new HashMap<>();
    final List<UUID> advancedWaterLeftInUse = new ArrayList<>();
    final HashMap<UUID, Integer> advancedWaterLeftTaskNumbers = new HashMap<>();
    final HashMap<UUID, FallingBlock> advancedWaterLeftFallingBlocks = new HashMap<>();

    final HashMap<UUID, Long> advancedAirLeft = new HashMap<>();
    final HashMap<UUID, Long> advancedAirRight = new HashMap<>();

    final HashMap<UUID, Long> advancedEarthLeft = new HashMap<>();
    final List<UUID> advancedEarthLeftInUse = new ArrayList<>();
    final HashMap<UUID, Integer> advancedEarthLeftTaskNumbers = new HashMap<>();
    final HashMap<UUID, FallingBlock> advancedEarthLeftFallingBlocks = new HashMap<>();
    final HashMap<UUID, Long> advancedEarthRight = new HashMap<>();

    public static Inventory inv = getServer().createInventory(null, 36, "Revival Screen");

    @EventHandler
    public void onClick (PlayerInteractEvent e) {
        ItemStack i = e.getItem();
        Player p = e.getPlayer();
        UUID uuid = p.getUniqueId();
        if (i == null) return;
        if ((!p.isSneaking()) && (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)) {
            if (i.equals(FireSword.getFullItem().getItem())) {
                new AbilityWithCoolDown(fireLeft, () -> {
                    RayTraceResult le =  p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getLocation().getDirection().normalize(), 20, entity -> !entity.equals((Entity) p));
                    for (int j = 0; j < 10; j++) {
                        p.spawnParticle(Particle.FLAME,
                                p.getEyeLocation(),
                                0,
                                p.getEyeLocation().getDirection().normalize().getX(),
                                p.getEyeLocation().getDirection().normalize().getY(),
                                p.getEyeLocation().getDirection().normalize().getZ(),
                                null);
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (le == null) return;
                    ((LivingEntity)le.getHitEntity()).setHealth(((LivingEntity)le.getHitEntity()).getHealth()-8);
                }, 60, p);
            } else if (i.equals(WaterSword.getFullItem().getItem())) {

                    new AbilityWithCoolDown(waterLeft, () -> {
                        RayTraceResult le =  p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getLocation().getDirection().normalize(), 20, entity -> !entity.equals((Entity) p));
                        for (int j = 0; j < 10; j++) {
                            p.spawnParticle(Particle.WATER_BUBBLE,
                                    p.getEyeLocation(),
                                    0,
                                    p.getEyeLocation().getDirection().normalize().getX(),
                                    p.getEyeLocation().getDirection().normalize().getY(),
                                    p.getEyeLocation().getDirection().normalize().getZ(),
                                    null);
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        if (le == null) return;
                        ((LivingEntity)le.getHitEntity()).setHealth(((LivingEntity)le.getHitEntity()).getHealth()-8);
                    }, 60, p);

            } else if (i.equals(AirSword.getFullItem().getItem())) {
                new AbilityWithCoolDown(airLeft, () ->{
                    LivingEntity le = (LivingEntity) p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getEyeLocation().getDirection().normalize(), 5, entity -> !entity.equals((Entity) p)).getHitEntity();
                    le.setVelocity(p.getLocation().getDirection().normalize().multiply(-1));
                }, 30, p);
            } else if (i.equals(EarthSword.getFullItem().getItem())) {
                /*if (!earthLeftInUse.contains(uuid)) {
                    if (!earthLeft.containsKey(p.getUniqueId())) {

                        FallingBlock fb = p.getWorld().spawnFallingBlock(p.getEyeLocation().add(p.getEyeLocation().getDirection().normalize().multiply(3)), e.getClickedBlock().getType().createBlockData());
                        fb.setHurtEntities(true);
                        fb.setDamagePerBlock(8);
                        fb.setMaxDamage(8);
                        fb.setGravity(false);
                        earthLeftInUse.add(uuid);
                        int i1 = getServer().getScheduler().runTaskTimer(SpriteSMP.getPlugin(SpriteSMP.class), () -> {
                            fb.teleport(p.getEyeLocation().add(p.getEyeLocation().getDirection().normalize().multiply(3).add(new Vector(0, 0.25, 0))));
                        }, 0, 2).getTaskId();
                        earthLeftTaskNumbers.put(uuid, i1);
                        earthLeftFallingBlocks.put(uuid, fb);
                    } else {
                        long timeElapsed = System.currentTimeMillis() - earthLeft.get(p.getUniqueId());
                        if (timeElapsed >= 60 * 1000L) {
                            FallingBlock fb = p.getWorld().spawnFallingBlock(p.getEyeLocation().add(p.getEyeLocation().getDirection().normalize().multiply(3)), e.getClickedBlock().getType().createBlockData());
                            fb.setHurtEntities(true);
                            fb.setDamagePerBlock(8);
                            fb.setMaxDamage(8);
                            fb.setGravity(false);
                            earthLeftInUse.add(uuid);
                            int i1 = getServer().getScheduler().runTaskTimer(SpriteSMP.getPlugin(SpriteSMP.class), () -> {
                                fb.teleport(p.getEyeLocation().add(p.getEyeLocation().getDirection().normalize().multiply(3).add(new Vector(0, 0.25, 0))));
                            }, 0, 2).getTaskId();
                            earthLeftTaskNumbers.put(uuid, i1);
                            earthLeftFallingBlocks.put(uuid, fb);
                        } else {
                            p.sendMessage(60 + " seconds hasn't passed! Please Wait " + Math.round((float) (((60 * 1000L) - timeElapsed) / 1000)) + " seconds");
                        }
                    }
                }
                        new AbilityWithCoolDown(earthLeft, () -> {
                            getScheduler().cancelTask(earthLeftTaskNumbers.get(uuid));
                            earthLeftTaskNumbers.remove(uuid);
                            earthLeftInUse.remove(uuid);
                            earthLeftFallingBlocks.get(uuid).setVelocity(p.getLocation().getDirection().normalize().multiply(2));
                            earthLeftFallingBlocks.remove(uuid);
                        }, 60, p);
*/

                if (!earthLeftInUse.contains(p.getUniqueId())) {
                    if (!earthLeft.containsKey(p.getUniqueId())){
                        FallingBlock fb = p.getWorld().spawnFallingBlock(p.getEyeLocation().add(p.getEyeLocation().getDirection().normalize().multiply(3)), e.getClickedBlock().getType().createBlockData());
                        fb.setHurtEntities(true);
                        fb.setDamagePerBlock(8);
                        fb.setMaxDamage(8);
                        fb.setGravity(false);

                        earthLeftInUse.add(p.getUniqueId());
                        int i1 = getServer().getScheduler().runTaskTimer(SpriteSMP.getPlugin(SpriteSMP.class), () -> {
                            fb.teleport(p.getEyeLocation().add(p.getEyeLocation().getDirection().normalize().multiply(3).add(new Vector(0, 0.25, 0))));
                            fb.setTicksLived(1);
                        }, 0, 2).getTaskId();
                        earthLeftTaskNumbers.put(uuid, i1);
                        earthLeftFallingBlocks.put(uuid, fb);
                    } else {
                        long timeElapsed = System.currentTimeMillis() - earthLeft.get(p.getUniqueId());

                        if (timeElapsed >= 60000) {
                            FallingBlock fb = p.getWorld().spawnFallingBlock(p.getEyeLocation().add(p.getEyeLocation().getDirection().normalize().multiply(3)), e.getClickedBlock().getType().createBlockData());
                            fb.setHurtEntities(true);
                            fb.setDamagePerBlock(8);
                            fb.setMaxDamage(8);
                            fb.setGravity(false);

                            earthLeftInUse.add(p.getUniqueId());
                            int i1 = getServer().getScheduler().runTaskTimer(SpriteSMP.getPlugin(SpriteSMP.class), () -> {
                                fb.teleport(p.getEyeLocation().add(p.getEyeLocation().getDirection().normalize().multiply(3).add(new Vector(0, 0.25, 0))));
                                fb.setTicksLived(1);
                            }, 0, 2).getTaskId();
                            earthLeftTaskNumbers.put(uuid, i1);
                            earthLeftFallingBlocks.put(uuid, fb);
                        } else {
                            p.sendMessage(60 + " seconds hasn't passed! Please Wait " + Math.round((float) (((60 * 1000L) - timeElapsed) / 1000)) + " seconds");

                        }
                    }
                } else {
                    new AbilityWithCoolDown(earthLeft, () -> {
                        getScheduler().cancelTask(earthLeftTaskNumbers.get(uuid));
                        earthLeftTaskNumbers.remove(uuid);
                        earthLeftInUse.remove(uuid);
                        earthLeftFallingBlocks.get(uuid).setVelocity(p.getLocation().getDirection().normalize().multiply(2));
                        earthLeftFallingBlocks.get(uuid).setGravity(true);
                        earthLeftFallingBlocks.remove(uuid);
                    }, 60, p);
                }

            } else if (i.equals(AdvancedFireSword.getFullItem().getItem())) {
                new AbilityWithCoolDown(advancedFireLeft, () -> {
                    RayTraceResult le =  p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getLocation().getDirection().normalize(), 20, entity -> !entity.equals((Entity) p));
                    for (int j = 0; j < 10; j++) {
                        p.spawnParticle(Particle.FLAME,
                                p.getEyeLocation(),
                                0,
                                p.getEyeLocation().getDirection().normalize().getX(),
                                p.getEyeLocation().getDirection().normalize().getY(),
                                p.getEyeLocation().getDirection().normalize().getZ(),
                                null);
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (le == null) return;
                    ((LivingEntity)le.getHitEntity()).setHealth(((LivingEntity)le.getHitEntity()).getHealth()-12);
                }, 60, p);
            } else if (i.equals(AdvancedWaterSword.getFullItem().getItem())) {
                new AbilityWithCoolDown(advancedWaterLeft, () -> {
                    RayTraceResult le =  p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getLocation().getDirection().normalize(), 20, entity -> !entity.equals((Entity) p));
                    for (int j = 0; j < 10; j++) {
                        p.spawnParticle(Particle.WATER_BUBBLE,
                                p.getEyeLocation(),
                                0,
                                p.getEyeLocation().getDirection().normalize().getX(),
                                p.getEyeLocation().getDirection().normalize().getY(),
                                p.getEyeLocation().getDirection().normalize().getZ(),
                                null);
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    if (le == null) return;
                    ((LivingEntity)le.getHitEntity()).setHealth(((LivingEntity)le.getHitEntity()).getHealth()-12);
                }, 60, p);
            } else if (i.equals(AdvancedAirSword.getFullItem().getItem())) {
                new AbilityWithCoolDown(advancedAirLeft, () -> {LivingEntity le = (LivingEntity) p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getEyeLocation().getDirection().normalize(), 5, entity -> !entity.equals((Entity) p)).getHitEntity();
                    le.setVelocity(p.getLocation().getDirection().normalize().multiply(-4));
                    le.damage(6);}, 120, p);
            } else if (i.equals(AdvancedEarthSword.getFullItem().getItem())) {
                if (!advancedEarthLeftInUse.contains(p.getUniqueId())) {
                    if (!advancedEarthLeft.containsKey(p.getUniqueId())){
                        FallingBlock fb = p.getWorld().spawnFallingBlock(p.getEyeLocation().add(p.getEyeLocation().getDirection().normalize().multiply(3)), e.getClickedBlock().getType().createBlockData());
                        fb.setHurtEntities(true);
                        fb.setDamagePerBlock(8);
                        fb.setMaxDamage(8);
                        fb.setGravity(false);

                        advancedEarthLeftInUse.add(p.getUniqueId());
                        int i1 = getServer().getScheduler().runTaskTimer(SpriteSMP.getPlugin(SpriteSMP.class), () -> {
                            fb.teleport(p.getEyeLocation().add(p.getEyeLocation().getDirection().normalize().multiply(3).add(new Vector(0, 0.25, 0))));
                            fb.setTicksLived(1);
                        }, 0, 2).getTaskId();
                        advancedEarthLeftTaskNumbers.put(uuid, i1);
                        advancedEarthLeftFallingBlocks.put(uuid, fb);
                    } else {
                        long timeElapsed = System.currentTimeMillis() - advancedEarthLeft.get(p.getUniqueId());

                        if (timeElapsed >= 60000) {
                            FallingBlock fb = p.getWorld().spawnFallingBlock(p.getEyeLocation().add(p.getEyeLocation().getDirection().normalize().multiply(3)), e.getClickedBlock().getType().createBlockData());
                            fb.setHurtEntities(true);
                            fb.setDamagePerBlock(8);
                            fb.setMaxDamage(8);
                            fb.setGravity(false);

                            advancedEarthLeftInUse.add(p.getUniqueId());
                            int i1 = getServer().getScheduler().runTaskTimer(SpriteSMP.getPlugin(SpriteSMP.class), () -> {
                                fb.teleport(p.getEyeLocation().add(p.getEyeLocation().getDirection().normalize().multiply(3).add(new Vector(0, 0.25, 0))));
                                fb.setTicksLived(1);
                            }, 0, 2).getTaskId();
                            advancedEarthLeftTaskNumbers.put(uuid, i1);
                            advancedEarthLeftFallingBlocks.put(uuid, fb);
                        } else {
                            p.sendMessage(60 + " seconds hasn't passed! Please Wait " + Math.round((float) (((60 * 1000L) - timeElapsed) / 1000)) + " seconds");
                        }
                    }
                } else {
                    new AbilityWithCoolDown(advancedEarthLeft, () -> {
                        getScheduler().cancelTask(advancedEarthLeftTaskNumbers.get(uuid));
                        advancedEarthLeftTaskNumbers.remove(uuid);
                        advancedEarthLeftInUse.remove(uuid);
                        advancedEarthLeftFallingBlocks.get(uuid).setVelocity(p.getLocation().getDirection().normalize().multiply(2));
                        advancedEarthLeftFallingBlocks.get(uuid).setGravity(true);
                        advancedEarthLeftFallingBlocks.remove(uuid);
                    }, 60, p);
                }
            }
        }  else if (p.isSneaking() && (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)) {
            if (i.equals(FireSword.getFullItem().getItem())) {
                new AbilityWithCoolDown(fireRight, () -> {
                    for (int j = (int) p.getLocation().getX() - 2; j < (int) p.getLocation().getX() + 2; j++) {
                        for (int k = (int) p.getLocation().getZ() - 2; k < (int) p.getLocation().getZ() + 2; k++) {
                            if (p.getWorld().getBlockAt(new Location(p.getWorld(), j, p.getLocation().getY(), k)).getType().equals(Material.AIR)) p.getWorld().setBlockData(new Location(p.getWorld(), j, p.getLocation().getY(), k), Material.FIRE.createBlockData());
                        }
                    }
                }, 30, p);
            } else if (i.equals(WaterSword.getFullItem().getItem()) && p.getWorld().getBlockAt(p.getLocation()).getType().equals(Material.WATER)) {
                new AbilityWithCoolDown(waterRight, () -> {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20*5, 2));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20*5, 2));
                }, 120, p);
            } else if (i.equals(AirSword.getFullItem().getItem())) {
                new AbilityWithCoolDown(airRight, () -> {
                    p.sendMessage("You can now fly for 5 seconds");
                    p.setAllowFlight(true);
                    getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), () -> p.sendMessage("3"), 2*20);
                    getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), () -> p.sendMessage("2"), 3*20);
                    getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), () -> p.sendMessage("1"), 4*20);
                    getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), () -> {p.sendMessage("0");p.setAllowFlight(false);}, 5*20);
                }, 60, p);
            } else if (i.equals(EarthSword.getFullItem().getItem())) {
                new AbilityWithCoolDown(earthRight, () -> {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10*20, 1));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 10*20, 1));
                }, 40, p);
            } else if (i.equals(AdvancedFireSword.getFullItem().getItem())) {

                new AbilityWithCoolDown(advancedFireRight, () -> {
                    p.getWorld().spawnFallingBlock(p.getLocation().add(new Random().nextInt(51)-25, 10, new Random().nextInt(51)-25), Material.MAGMA_BLOCK.createBlockData());
                    p.getWorld().spawnFallingBlock(p.getLocation().add(new Random().nextInt(51)-25, 10, new Random().nextInt(51)-25), Material.MAGMA_BLOCK.createBlockData());
                    p.getWorld().spawnFallingBlock(p.getLocation().add(new Random().nextInt(51)-25, 10, new Random().nextInt(51)-25), Material.MAGMA_BLOCK.createBlockData());
                    p.getWorld().spawnFallingBlock(p.getLocation().add(new Random().nextInt(51)-25, 10, new Random().nextInt(51)-25), Material.MAGMA_BLOCK.createBlockData());
                }, 120, p);

            }  else if (i.equals(AdvancedAirSword.getFullItem().getItem())) {
                new AbilityWithCoolDown(advancedAirRight, () -> {
                    LivingEntity entity = (LivingEntity) p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getEyeLocation().getDirection().normalize(), 20, en -> !en.equals((Entity) p)).getHitEntity();
                    entity.getWorld().strikeLightning(entity.getLocation());
                    entity.damage(6);
                }, 180, p);
            } else if (i.equals(AdvancedEarthSword.getFullItem().getItem())) {
                new AbilityWithCoolDown(advancedEarthRight, () -> {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20*20, 1));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 15*20, 1));
                }, 60, p);
            }
        }
        if (e.getItem().isSimilar(RevivalSprite.getFullItem().getItem())) {
            inv.clear();
            for (OfflinePlayer op:
                 getServer().getBannedPlayers()) {
                ItemStack head = new ItemStack(Material.PLAYER_HEAD);
                SkullMeta hm = (SkullMeta) head.getItemMeta();
                hm.setOwningPlayer(op);
                hm.setDisplayName(op.getName());
                head.setItemMeta(hm);
                inv.addItem(head);
            }
        }
        if (e.getItem().isSimilar(RerollSprite.getFullItem().getItem())) {
            ps.rerollSprite(p);
        }

    }
}
