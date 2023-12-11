package gmail.aryanj1010.spritesmp.Listeners;

import gmail.aryanj1010.spritesmp.API.AbilityWithCoolDown;
import gmail.aryanj1010.spritesmp.Items.items;
import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
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
import static org.bukkit.Bukkit.*;


/**
 * This class represents a listener for player click events.
 * It handles various abilities based on the item the player is holding.
 */
public class OnClick implements Listener {
    static final HashMap<UUID, Long> fireLeft = new HashMap<>();
    static final HashMap<UUID, Long> fireRight = new HashMap<>();
    static final HashMap<UUID, Long> firePickaxeRight = new HashMap<>();

    static final HashMap<UUID, Long> waterLeft = new HashMap<>();

    static final HashMap<UUID, Long> waterRight = new HashMap<>();

    static final HashMap<UUID, Long> airLeft = new HashMap<>();
    static final HashMap<UUID, Long> airRight = new HashMap<>();

    static final HashMap<UUID, Long> earthLeft = new HashMap<>();
    static final List<UUID> earthLeftInUse = new ArrayList<>();
    static final HashMap<UUID, Integer> earthLeftTaskNumbers = new HashMap<>();
    static final HashMap<UUID, FallingBlock> earthLeftFallingBlocks = new HashMap<>();
    static final HashMap<UUID, Long> earthRight = new HashMap<>();

    static final HashMap<UUID, Long> shadowShiftRight = new HashMap<>();
    static final HashMap<UUID, Long> glowShiftRight = new HashMap<>();


    static final HashMap<UUID, Long> endRight = new HashMap<>();
    static final HashMap<UUID, Long> endShiftRight = new HashMap<>();

    static final HashMap<UUID, Long> BOALeft = new HashMap<>();
    static final HashMap<UUID, Long> BOAShiftLeft = new HashMap<>();
    static final HashMap<UUID, Long> BOARight = new HashMap<>();
    static final HashMap<UUID, Long> BOAShiftRight = new HashMap<>();


    public static Inventory inv = getServer().createInventory(null, 36, "Revival Screen");

    @EventHandler
    public void onClick(PlayerInteractEvent e) {
        if (e.getHand() != EquipmentSlot.HAND) return;
        items it = ps.getSprite(e.getPlayer());
        boolean hasEarth = it == EarthSprite;
        boolean hasAir = it == AirSprite;
        boolean hasWater = it == WaterSprite;
        boolean hasFire = it == FireSprite;
        boolean hasShadow = it == ShadowSprite;
        boolean hasGlow = it == GlowSprite;

        ItemStack i = e.getItem().clone();


        if (i == null) return;
        for (Map.Entry<Enchantment, Integer> entry : i.getEnchantments().entrySet()) {
            i.removeEnchantment(entry.getKey());
        }
        Player p = e.getPlayer();
        UUID uuid = p.getUniqueId();
        if ((!p.isSneaking()) && (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)) {
            if (i.equals(FireSword.getFullItem().getItem()) && hasFire) {
                new AbilityWithCoolDown(fireLeft, () -> {
                    RayTraceResult le = p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getLocation().getDirection().normalize(), 20, entity -> !entity.equals((Entity) p));
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
                    ((LivingEntity) le.getHitEntity()).setHealth(((LivingEntity) le.getHitEntity()).getHealth() - 8);
                }, 60, p);
            } else if (i.equals(WaterSword.getFullItem().getItem()) && hasWater) {

                new AbilityWithCoolDown(waterLeft, () -> {
                    RayTraceResult le = p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getLocation().getDirection().normalize(), 20, entity -> !entity.equals((Entity) p));
                    for (int j = 0; j < 10; j++) {
                        p.spawnParticle(Particle.NAUTILUS,
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
                    ((LivingEntity) le.getHitEntity()).setHealth(((LivingEntity) le.getHitEntity()).getHealth() - 8);
                }, 60, p);

            } else if (i.equals(AirSword.getFullItem().getItem()) && hasAir) {
                new AbilityWithCoolDown(airLeft, () -> {
                    LivingEntity le = (LivingEntity) p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getEyeLocation().getDirection().normalize(), 5, entity -> !entity.equals((Entity) p)).getHitEntity();
                    le.setVelocity(p.getLocation().getDirection().normalize().multiply(-1));
                }, 30, p);
            } else if (i.equals(EarthSword.getFullItem().getItem()) && hasEarth) {
                if (e.getClickedBlock() != null && e.getClickedBlock().getType().equals(Material.BEDROCK)) return;
                if (e.getClickedBlock() != null && e.getClickedBlock().getType().equals(Material.END_PORTAL)) return;
                if (e.getClickedBlock() != null && e.getClickedBlock().getType().equals(Material.END_PORTAL_FRAME))
                    return;
                if (e.getClickedBlock() != null && e.getClickedBlock().getType().equals(Material.END_GATEWAY)) return;
                if (e.getClickedBlock() != null && e.getClickedBlock().getType().equals(Material.NETHER_PORTAL)) return;
                if (e.getClickedBlock() != null && e.getClickedBlock().getType().toString().contains("SHULKER_BOX"))
                    return;
                if (!earthLeftInUse.contains(p.getUniqueId())) {

                    if (!earthLeft.containsKey(p.getUniqueId())) {
                        FallingBlock fb = p.getWorld().spawnFallingBlock(p.getEyeLocation().add(p.getEyeLocation().getDirection().normalize().multiply(3)), e.getClickedBlock().getType().createBlockData());
                        fb.setHurtEntities(true);
                        fb.setDamagePerBlock(8);
                        fb.setMaxDamage(8);
                        fb.setGravity(false);
                        e.getClickedBlock().setType(Material.AIR);

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
                            e.getClickedBlock().setType(Material.AIR);

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
                        earthLeftFallingBlocks.get(uuid).setVelocity(p.getEyeLocation().getDirection().normalize().multiply(2));
                        earthLeftFallingBlocks.get(uuid).setGravity(true);
                        earthLeftFallingBlocks.remove(uuid);
                        earthLeftInUse.remove(uuid);

                    }, 60, p);
                }

            } else if (i.equals(AdvancedFireSword.getFullItem().getItem()) && hasFire) {
                new AbilityWithCoolDown(fireLeft, () -> {
                    RayTraceResult le = p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getLocation().getDirection().normalize(), 20, entity -> !entity.equals((Entity) p));
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
                    ((LivingEntity) le.getHitEntity()).setHealth(((LivingEntity) le.getHitEntity()).getHealth() - 12);
                }, 60, p);
            } else if (i.equals(AdvancedWaterSword.getFullItem().getItem()) && hasWater) {
                new AbilityWithCoolDown(waterLeft, () -> {
                    RayTraceResult le = p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getLocation().getDirection().normalize(), 20, entity -> !entity.equals((Entity) p));
                    for (int j = 0; j < 10; j++) {
                        p.spawnParticle(Particle.NAUTILUS,
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
                    ((LivingEntity) le.getHitEntity()).setHealth(((LivingEntity) le.getHitEntity()).getHealth() - 12);
                }, 60, p);
            } else if (i.equals(AdvancedAirSword.getFullItem().getItem()) && hasAir) {
                new AbilityWithCoolDown(airLeft, () -> {
                    LivingEntity le = (LivingEntity) p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getEyeLocation().getDirection().normalize(), 5, entity -> !entity.equals((Entity) p)).getHitEntity();
                    le.setVelocity(p.getLocation().getDirection().normalize().multiply(-4));
                    le.damage(6);
                }, 120, p);
            } else if (i.equals(AdvancedEarthSword.getFullItem().getItem()) && hasEarth) {
                if (e.getClickedBlock() != null && e.getClickedBlock().getType().equals(Material.BEDROCK)) return;
                if (e.getClickedBlock() != null && e.getClickedBlock().getType().equals(Material.END_PORTAL)) return;
                if (e.getClickedBlock() != null && e.getClickedBlock().getType().equals(Material.END_PORTAL_FRAME))
                    return;
                if (e.getClickedBlock() != null && e.getClickedBlock().getType().equals(Material.END_GATEWAY)) return;
                if (e.getClickedBlock() != null && e.getClickedBlock().getType().equals(Material.NETHER_PORTAL)) return;
                if (e.getClickedBlock() != null && e.getClickedBlock().getType().toString().contains("SHULKER_BOX"))
                    return;

                if (!earthLeftInUse.contains(p.getUniqueId())) {
                    if (!earthLeft.containsKey(p.getUniqueId())) {
                        FallingBlock fb = p.getWorld().spawnFallingBlock(p.getEyeLocation().add(p.getEyeLocation().getDirection().normalize().multiply(3)), e.getClickedBlock().getType().createBlockData());
                        fb.setHurtEntities(true);
                        fb.setDamagePerBlock(8);
                        fb.setMaxDamage(8);
                        fb.setGravity(false);
                        e.getClickedBlock().setType(Material.AIR);

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
                            e.getClickedBlock().setType(Material.AIR);

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
            } else if (i.equals(EndSword.getFullItem().getItem())) {
                new AbilityWithCoolDown(endRight, () -> {
                    DragonFireball df = (DragonFireball) p.getWorld().spawn(p.getEyeLocation().add(p.getEyeLocation().getDirection().normalize()), DragonFireball.class);
                    df.setVelocity(p.getEyeLocation().getDirection().normalize());
                }, 30, p);
            } else if (i.equals(FirePickaxe.getFullItem().getItem())) {
                new AbilityWithCoolDown(firePickaxeRight, () -> {

                } , 60, p);
            }


        //SHIFT RIGHT CLICK ABILITIES

        } else if (p.isSneaking() && (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)) {
            if (i.equals(FireSword.getFullItem().getItem()) && hasFire) {
                new AbilityWithCoolDown(fireRight, () -> {
                    for (int j = (int) p.getLocation().getX() - 2; j < (int) p.getLocation().getX() + 2; j++) {
                        for (int k = (int) p.getLocation().getZ() - 2; k < (int) p.getLocation().getZ() + 2; k++) {
                            if (p.getWorld().getBlockAt(new Location(p.getWorld(), j, p.getLocation().getY(), k)).getType().equals(Material.AIR))
                                p.getWorld().setBlockData(new Location(p.getWorld(), j, p.getLocation().getY(), k), Material.FIRE.createBlockData());
                        }
                    }
                }, 30, p);
            } else if (i.equals(WaterSword.getFullItem().getItem()) && p.getWorld().getBlockAt(p.getLocation()).getType().equals(Material.WATER) && hasWater) {
                new AbilityWithCoolDown(waterRight, () -> {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 5, 2));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20 * 5, 2));
                }, 120, p);
            } else if (i.equals(AirSword.getFullItem().getItem()) && hasAir) {
                new AbilityWithCoolDown(airRight, () -> {
                    p.sendMessage("You can now fly for 5 seconds");
                    p.setAllowFlight(true);
                    getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), () -> p.sendMessage("3"), 2 * 20);
                    getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), () -> p.sendMessage("2"), 3 * 20);
                    getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), () -> p.sendMessage("1"), 4 * 20);
                    getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), () -> {
                        p.sendMessage("0");
                        p.setAllowFlight(false);
                    }, 5 * 20);
                }, 60, p);
            } else if (i.equals(EarthSword.getFullItem().getItem()) && hasEarth) {
                // Ability activation based on item clicked
                new AbilityWithCoolDown(earthRight, () -> {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10 * 20, 1));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 10 * 20, 1));
                }, 40, p);
            } else if (i.equals(ShadowSword.getFullItem().getItem()) && hasShadow) {
                new AbilityWithCoolDown(shadowShiftRight, () -> {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20 * 20, 1, true, false));
                    for (Player player : getServer().getOnlinePlayers()) {
                        player.hidePlayer(getPlugin(SpriteSMP.class), p);
                    }
                    invisPlayers.add(p);
                    getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), () -> {
                        for (Player player : getServer().getOnlinePlayers()) {
                            player.showPlayer(getPlugin(SpriteSMP.class), p);
                        }
                        invisPlayers.remove(p);
                    }, 20 * 20);
                }, 120, p);
            } else if (i.equals(GlowSword.getFullItem().getItem()) && hasGlow) {
                new AbilityWithCoolDown(glowShiftRight, () -> {
                    p.setHealth(p.getHealth() + 10);
                    p.getWorld().spawnParticle(Particle.REDSTONE, p.getLocation(), 10);
                }, 120, p);
            } else if (i.equals(AdvancedFireSword.getFullItem().getItem()) && hasFire) {
                new AbilityWithCoolDown(fireRight, () -> {
                    p.getWorld().spawnFallingBlock(p.getLocation().add(new Random().nextInt(51) - 25, 10, new Random().nextInt(51) - 25), Material.MAGMA_BLOCK.createBlockData());
                    p.getWorld().spawnFallingBlock(p.getLocation().add(new Random().nextInt(51) - 25, 10, new Random().nextInt(51) - 25), Material.MAGMA_BLOCK.createBlockData());
                    p.getWorld().spawnFallingBlock(p.getLocation().add(new Random().nextInt(51) - 25, 10, new Random().nextInt(51) - 25), Material.MAGMA_BLOCK.createBlockData());
                    p.getWorld().spawnFallingBlock(p.getLocation().add(new Random().nextInt(51) - 25, 10, new Random().nextInt(51) - 25), Material.MAGMA_BLOCK.createBlockData());
                }, 120, p);
            } else if (i.equals(AdvancedAirSword.getFullItem().getItem()) && hasAir) {
                new AbilityWithCoolDown(airRight, () -> {
                    LivingEntity entity = (LivingEntity) p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getEyeLocation().getDirection().normalize(), 20, en -> !en.equals((Entity) p)).getHitEntity();
                    entity.getWorld().strikeLightning(entity.getLocation());
                    entity.damage(16);
                }, 180, p);
            } else if (i.equals(AdvancedEarthSword.getFullItem().getItem()) && hasEarth) {
                new AbilityWithCoolDown(earthRight, () -> {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 20, 1));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 15 * 20, 1));
                }, 60, p);
            } else if (i.equals(EndSword.getFullItem().getItem())) {
                new AbilityWithCoolDown(endShiftRight, () -> {
                    p.setVelocity(p.getVelocity().add(new Vector(0, 5, 0)));
                    p.setGliding(true);
                }, 240, p);
            } else if (i.equals(AdvancedShadowSword.getFullItem().getItem()) && hasShadow) {
                new AbilityWithCoolDown(shadowShiftRight, () -> {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20 * 30, 1, true, false));
                    for (Player player : getServer().getOnlinePlayers()) {
                        player.hidePlayer(getPlugin(SpriteSMP.class), p);
                    }
                    invisPlayers.add(p);
                    getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), () -> {
                        for (Player player : getServer().getOnlinePlayers()) {
                            player.showPlayer(getPlugin(SpriteSMP.class), p);
                        }
                        invisPlayers.remove(p);
                    }, 20 * 20);
                }, 120, p);
            } else if (i.equals(AdvancedGlowSword.getFullItem().getItem()) && hasGlow) {
                new AbilityWithCoolDown(glowShiftRight, () -> {
                    p.setHealth(p.getHealth() + 20);
                    p.getWorld().spawnParticle(Particle.REDSTONE, p.getLocation(), 20);
                }, 120, p);
            }

            // Other item interactions
            if (e.getItem().isSimilar(RevivalSprite.getFullItem().getItem())) {
                // Clear inventory and display banned players' heads
                inv.clear();
                for (OfflinePlayer op : getServer().getBannedPlayers()) {
                    ItemStack head = new ItemStack(Material.PLAYER_HEAD);
                    SkullMeta hm = (SkullMeta) head.getItemMeta();
                    hm.setOwningPlayer(op);
                    hm.setDisplayName(op.getName());
                    head.setItemMeta(hm);
                    inv.addItem(head);
                }
                e.getItem().setAmount(e.getItem().getAmount() - 1);
            }

            if (e.getItem().isSimilar(RerollSprite.getFullItem().getItem())) {
                // Reroll sprite ability
                ps.rerollSprite(p);
                e.getItem().setAmount(e.getItem().getAmount() - 1);
            }

            if (e.getItem().isSimilar(FireSprite.getFullItem().getItem()) && psc.getCount(p) != 6) {
                // Increment player sprite count and consume item
                psc.updatePlayer(p, 1);
                e.getItem().setAmount(e.getItem().getAmount() - 1);
            }

            if (e.getItem().isSimilar(WaterSprite.getFullItem().getItem()) && psc.getCount(p) != 6) {
                // Increment player sprite count and consume item
                psc.updatePlayer(p, 1);
                e.getItem().setAmount(e.getItem().getAmount() - 1);
            }

            if (e.getItem().isSimilar(AirSprite.getFullItem().getItem()) && psc.getCount(p) != 6) {
                // Increment player sprite count and consume item
                psc.updatePlayer(p, 1);
                e.getItem().setAmount(e.getItem().getAmount() - 1);
            }

            if (e.getItem().isSimilar(EarthSprite.getFullItem().getItem()) && psc.getCount(p) != 6) {
                // Increment player sprite count and consume item
                psc.updatePlayer(p, 1);
                e.getItem().setAmount(e.getItem().getAmount() - 1);
            }

            if (e.getItem().isSimilar(ShadowSprite.getFullItem().getItem()) && psc.getCount(p) != 6) {
                getServer().getConsoleSender().sendMessage("test one passed");
                // Increment player sprite count and consume item
                psc.updatePlayer(p, 1);
                e.getItem().setAmount(e.getItem().getAmount() - 1);
            }

            if (e.getItem().equals(TomeOfArcanes.getFullItem().getItem())) {
                // Handle Tome of Arcanes actions
                Action a = e.getAction();
                boolean lc = a.equals(Action.LEFT_CLICK_AIR) || a.equals(Action.LEFT_CLICK_BLOCK);
                boolean rc = a.equals(Action.RIGHT_CLICK_AIR) || a.equals(Action.RIGHT_CLICK_BLOCK);

                if (lc && !p.isSneaking()) {
                    new AbilityWithCoolDown(BOALeft, () -> {
                        LivingEntity le = (LivingEntity) p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getEyeLocation().getDirection().normalize(), 5, entity -> !entity.equals((Entity) p)).getHitEntity();
                        PotionEffect slow = new PotionEffect(PotionEffectType.SLOW, 10 * 20, 255);
                        PotionEffect jump = new PotionEffect(PotionEffectType.JUMP, 10 * 20, 255);
                        PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, 10 * 20, 1);
                        PotionEffect strength = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 10 * 20, 1);
                        le.addPotionEffect(slow);
                        le.addPotionEffect(jump);
                        e.getPlayer().addPotionEffect(speed);
                        e.getPlayer().addPotionEffect(strength);
                    }, 120, p);
                } else if (lc && p.isSneaking()) {
                    new AbilityWithCoolDown(BOAShiftLeft, () -> {
                        for (int j = 0; j < 8; j++) {
                            p.getWorld().spawnFallingBlock(p.getLocation().add(new Random().nextInt(51) - 25, 10, new Random().nextInt(51) - 25), Material.MAGMA_BLOCK.createBlockData());
                        }
                    }, 120, p);
                } else if (rc && !p.isSneaking()) {
                    new AbilityWithCoolDown(BOARight, () -> {
                        LivingEntity le = (LivingEntity) p.getWorld().rayTraceEntities(p.getEyeLocation(), p.getEyeLocation().getDirection().normalize(), 5, entity -> !entity.equals((Entity) p)).getHitEntity();
                        le.setVelocity(p.getLocation().getDirection().normalize().multiply(2));
                    }, 120, p);
                } else if (rc && p.isSneaking()) {
                    new AbilityWithCoolDown(BOAShiftRight, () -> {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 25, 1));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 15 * 20, 1));

                        List<FallingBlock> fallingBlocks = new ArrayList<>();

                        int id = getScheduler().scheduleSyncRepeatingTask(getPlugin(SpriteSMP.class), new Runnable() {
                            double angle = 0;

                            @Override
                            public void run() {
                                Location center = p.getEyeLocation();
                                double radius = 5; // Change this to adjust the circle's radius

                                for (int i = 0; i < 3; i++) {
                                    if (fallingBlocks.size() <= i) {
                                        fallingBlocks.add(center.getWorld().spawnFallingBlock(p.getEyeLocation(), Material.GRASS_BLOCK.createBlockData()));
                                    }

                                    FallingBlock fallingBlock = fallingBlocks.get(i);
                                    fallingBlock.setGravity(false);
                                    double x = center.getX() + radius * Math.cos(angle + i * ((2 * Math.PI) / 3)); // Adjust this to change the horizontal spacing
                                    double z = center.getZ() + radius * Math.sin(angle + i * ((2 * Math.PI) / 3)); // Adjust this to change the horizontal spacing
                                    fallingBlock.teleport(new Location(center.getWorld(), x, center.getY(), z));
                                }

                                angle += 1.5 * Math.PI / 180; // Change this to adjust the circle's speed
                                if (angle > 2 * Math.PI) {
                                    angle = 0;
                                }
                            }
                        }, 0, 1);

                        getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> {
                            getScheduler().cancelTask(id);
                            for (FallingBlock fallingBlock : fallingBlocks) {
                                fallingBlock.remove();
                            }
                        }, 25 * 20);
                    }, 120, p);
                }
            }
        }
    }
}

