package gmail.aryanj1010.spritesmp.Listeners;

import gmail.aryanj1010.spritesmp.API.AbilityWithCoolDown;
import gmail.aryanj1010.spritesmp.Items.items;
import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Block;
import org.bukkit.block.data.type.Light;
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
import org.bukkit.potion.PotionEffectTypeCategory;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.util.Vector;
import org.checkerframework.checker.units.qual.A;

import java.util.*;

import static gmail.aryanj1010.spritesmp.Items.items.*;
import static gmail.aryanj1010.spritesmp.SpriteSMP.*;
import static org.bukkit.Bukkit.*;


/**
 * This class represents a listener for player click events.
 * It handles various abilities based on the item the player is holding.
 */
public class OnClick implements Listener {
    public static final HashMap<UUID, Long> fireRight = new HashMap<>();
    public static final HashMap<UUID, Long> fireShiftRight = new HashMap<>();

    public static final HashMap<UUID, Long> waterRight = new HashMap<>();
    public static final HashMap<UUID, Long> waterShiftRight = new HashMap<>();

    public static final HashMap<UUID, Long> airRight = new HashMap<>();
    public static final HashMap<UUID, Long> airShiftRight = new HashMap<>();

    public static final HashMap<UUID, Long> earthRight = new HashMap<>();
    public static final HashMap<UUID, Long> earthShiftRight = new HashMap<>();

    public static final HashMap<UUID, Long> thunderRight = new HashMap<>();
    public static final HashMap<UUID, Long> thunderShiftRight = new HashMap<>();

    public static final HashMap<UUID, Long> frostRight = new HashMap<>();
    public static final HashMap<UUID, Long> frostShiftRight = new HashMap<>();

    public static final HashMap<UUID, Long> lightRight = new HashMap<>();
    public static final HashMap<UUID, Long> lightShiftRight = new HashMap<>();

    public static final HashMap<UUID, Long> darkRight = new HashMap<>();
    public static final HashMap<UUID, Long> darkShiftRight = new HashMap<>();


    public static final HashMap<UUID, Long> advancedFireRight = new HashMap<>();
    public static final HashMap<UUID, Long> advancedFireShiftRight = new HashMap<>();

    public static final HashMap<UUID, Long> advancedWaterRight = new HashMap<>();
    public static final HashMap<UUID, Long> advancedWaterShiftRight = new HashMap<>();

    public static final HashMap<UUID, Long> advancedAirRight = new HashMap<>();
    public static final HashMap<UUID, Long> advancedAirShiftRight = new HashMap<>();

    public static final HashMap<UUID, Long> advancedEarthRight = new HashMap<>();
    public static final HashMap<UUID, Long> advancedEarthShiftRight = new HashMap<>();

    public static final HashMap<UUID, Long> advancedThunderRight = new HashMap<>();
    public static final HashMap<UUID, Long> advancedThunderShiftRight = new HashMap<>();

    public static final HashMap<UUID, Long> advancedFrostRight = new HashMap<>();
    public static final HashMap<UUID, Long> advancedFrostShiftRight = new HashMap<>();

    public static final HashMap<UUID, Long> advancedLightRight = new HashMap<>();
    public static final HashMap<UUID, Long> advancedLightShiftRight = new HashMap<>();

    public static final HashMap<UUID, Long> advancedDarkRight = new HashMap<>();
    public static final HashMap<UUID, Long> advancedDarkShiftRight = new HashMap<>();


    public static Inventory inv = getServer().createInventory(null, 36, "Revival Screen");


    @EventHandler
    public void onClick(PlayerInteractEvent e) {
        if (e.getHand() != EquipmentSlot.HAND) return;

        items it = ps.getSprite(e.getPlayer());
        boolean hasEarth = true;//it == EarthSprite;
        boolean hasAir = true;//it == AirSprite;
        boolean hasWater = true;//it == WaterSprite;
        boolean hasFire = true;//it == FireSprite;
        boolean hasThunder = true;//it == ThunderSprite;
        boolean hasFrost = true;//it == FrostSprite;
        boolean hasLight = true;//it == LightSprite;
        boolean hasDark = true;//it == DarkSprite;

        Player p = e.getPlayer();
        UUID uuid = p.getUniqueId();
        Action a = e.getAction();
        if (e.getItem() == null) return;
        ItemStack i = e.getItem().clone();
        for (Map.Entry<Enchantment, Integer> entry : i.getEnchantments().entrySet())
            i.removeEnchantment(entry.getKey());


        if ((!p.isSneaking()) && (a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK)) {
            if (i.equals(FireSword.getFullItem().getItem()) && hasFire) {
                new AbilityWithCoolDown(fireRight, () -> {
                    for (Player visPlayer : getAllVisiblePlayers(p)) {
                        visPlayer.damage(4 * (1 - Math.min(20, Math.max(visPlayer.getAttribute(Attribute.GENERIC_ARMOR).getValue() / 5, visPlayer.getAttribute(Attribute.GENERIC_ARMOR).getValue() - 4 / (2 + visPlayer.getAttribute(Attribute.GENERIC_ARMOR_TOUGHNESS).getValue() / 4))) / 25));
                        visPlayer.setFireTicks(20 * 5);
                    }
                }, 60, p);
            } else if (i.equals(WaterSword.getFullItem().getItem()) && hasWater) {
                new AbilityWithCoolDown(waterRight, () -> {
                    for (Player visPlayer : getAllVisiblePlayers(p)) {

                        BukkitTask task = new BukkitRunnable() {
                            public void run() {
                                visPlayer.damage(1);
                            }
                        }.runTaskTimer(getPlugin(SpriteSMP.class), 0, 20);
                        getServer().getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), task::cancel
                        , 20 * 6);
                    }
                }, 60, p);

            } else if (i.equals(AirSword.getFullItem().getItem()) && hasAir) {
                new AbilityWithCoolDown(airRight, () -> {

                    p.setVelocity(p.getLocation().getDirection().normalize().multiply(2));

                }, 60, p);
            } else if (i.equals(EarthSword.getFullItem().getItem()) && hasEarth) {
                new AbilityWithCoolDown(earthRight, () -> {
                    Material[] blocksConsideredEarth = {Material.DIRT, Material.GRASS_BLOCK, Material.STONE, Material.SAND, Material.SANDSTONE, Material.GRAVEL, Material.CLAY, Material.COBBLESTONE, Material.COAL_ORE, Material.IRON_ORE, Material.GOLD_ORE, Material.DIAMOND_ORE, Material.EMERALD_ORE, Material.REDSTONE_ORE, Material.LAPIS_ORE, Material.NETHER_QUARTZ_ORE, Material.NETHERRACK, Material.END_STONE, Material.BASALT, Material.GRANITE, Material.DIORITE, Material.ANDESITE, Material.RED_SAND, Material.RED_SANDSTONE, Material.BLACKSTONE};
                    int amtOfBlocks = 0;
                    for (int x = 5; x > 0; x--) {
                        for (int y = 3; y > 0; y--) {
                            for (int z = 5; z > 0; z--) {
                                if (Arrays.asList(blocksConsideredEarth).contains(p.getWorld().getBlockAt(p.getLocation().add(x - 3, y - 2, z - 3)).getType())) {
                                    p.getWorld().getBlockAt(p.getLocation().add(x-3, y-2, z-3)).setType(Material.AIR);
                                    amtOfBlocks++;
                                }
                            }
                        }
                    }
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 5, Math.clamp(amtOfBlocks / 10, 0, 3)));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 20 * 5, Math.clamp(amtOfBlocks / 10, 0, 3)));
                }, 60, p);
            } else if (i.equals(ThunderSword.getFullItem().getItem()) && hasThunder) {
                new AbilityWithCoolDown(thunderRight, () -> {
                    p.getWorld().setThundering(true);
                    getServer().getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), () -> {
                        boolean raining = p.getWorld().hasStorm();
                        p.getWorld().setThundering(false);
                        if (!raining) p.getWorld().setStorm(false);
                    }, 20*10);
                    }, 60, p);
            } else if (i.equals(FrostSword.getFullItem().getItem()) && hasFrost) {
                new AbilityWithCoolDown(frostRight, () -> {
                    int taskNum = getServer().getScheduler().runTaskTimer(getPlugin(SpriteSMP.class), () -> {
                        Arrow arrowFired = p.launchProjectile(Arrow.class, p.getLocation().getDirection());
                        arrowFired.setPickupStatus(AbstractArrow.PickupStatus.CREATIVE_ONLY);
                        arrowFired.addCustomEffect(new PotionEffect(PotionEffectType.SLOWNESS, 20 * 5, 2), true);
                        arrowFired.setColor(Color.BLUE);

                    }, 0, 10).getTaskId();
                    getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> getServer().getScheduler().cancelTask(taskNum), 10 * 20);
                }, 60, p);
            } else if (i.equals(LightSword.getFullItem().getItem()) && hasLight) {
                new AbilityWithCoolDown(lightRight, () -> {
                    for (PotionEffectType pet : PotionEffectType.values()) {
                        if (pet.getCategory().equals(PotionEffectTypeCategory.HARMFUL)) {
                            p.removePotionEffect(pet);
                        }
                    }
                    }, 60, p);
            } else if (i.equals(DarkSword.getFullItem().getItem()) && hasDark) {
                new AbilityWithCoolDown(darkRight, () -> {
                    p.getNearbyEntities(5, 5, 5).forEach(entity -> {
                        if (entity instanceof Player) {
                            ((Player)entity).addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * 20, 4));
                        }
                    });
                }, 60, p);
            } else if (i.equals(AdvancedFireSword.getFullItem().getItem()) && hasFire) {
                new AbilityWithCoolDown(advancedFireRight, () -> {
                    for (Player visPlayer : getAllVisiblePlayers(p)) {
                        visPlayer.damage(6 * (1 - Math.min(20, Math.max(visPlayer.getAttribute(Attribute.GENERIC_ARMOR).getValue() / 5, visPlayer.getAttribute(Attribute.GENERIC_ARMOR).getValue() - 6 / (2 + visPlayer.getAttribute(Attribute.GENERIC_ARMOR_TOUGHNESS).getValue() / 4))) / 25));
                        visPlayer.setFireTicks(20 * 8);
                    }
                }, 60, p);
            } else if (i.equals(AdvancedWaterSword.getFullItem().getItem()) && hasWater) {
                new AbilityWithCoolDown(advancedWaterRight, () -> {
                    for (Player visPlayer : getAllVisiblePlayers(p)) {
                        BukkitTask task = new BukkitRunnable() {
                            public void run() {
                                visPlayer.damage(2);
                            }
                        }.runTaskTimer(getPlugin(SpriteSMP.class), 0, 20);
                        getServer().getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), () -> {
                            task.cancel();
                        }, 20 * 6);
                    }
                }, 60, p);
            } else if (i.equals(AdvancedAirSword.getFullItem().getItem()) && hasAir) {
                new AbilityWithCoolDown(advancedAirRight, () -> {

                    p.setVelocity(p.getLocation().getDirection().normalize().multiply(4));

                }, 60, p);
            } else if (i.equals(AdvancedEarthSword.getFullItem().getItem()) && hasEarth) {
                new AbilityWithCoolDown(advancedEarthRight, () -> {
                    Material[] blocksConsideredEarth = {Material.DIRT, Material.GRASS_BLOCK, Material.STONE, Material.SAND, Material.SANDSTONE, Material.GRAVEL, Material.CLAY, Material.COBBLESTONE, Material.COAL_ORE, Material.IRON_ORE, Material.GOLD_ORE, Material.DIAMOND_ORE, Material.EMERALD_ORE, Material.REDSTONE_ORE, Material.LAPIS_ORE, Material.NETHER_QUARTZ_ORE, Material.NETHERRACK, Material.END_STONE, Material.BASALT, Material.GRANITE, Material.DIORITE, Material.ANDESITE, Material.RED_SAND, Material.RED_SANDSTONE, Material.BLACKSTONE};
                    int amtOfBlocks = 0;
                    for (int x = 7; x > 0; x--) {
                        for (int y = 5; y > 0; y--) {
                            for (int z = 7; z > 0; z--) {
                                if (Arrays.asList(blocksConsideredEarth).contains(p.getWorld().getBlockAt(p.getLocation().add(x - 4, y - 3, z - 4)).getType())) {
                                    p.getWorld().getBlockAt(p.getLocation().add(x-4, y-3, z-4)).setType(Material.AIR);
                                    amtOfBlocks++;
                                }
                            }
                        }
                    }
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 10, Math.clamp(amtOfBlocks / 10, 0, 3)));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 20 * 10, Math.clamp(amtOfBlocks / 10, 0, 3)));
                }, 60, p);
            }
        } else if (i.equals(AdvancedThunderSword.getFullItem().getItem()) && hasThunder) {
            new AbilityWithCoolDown(advancedThunderRight, () -> {
                boolean raining = p.getWorld().hasStorm();
                p.getWorld().setThundering(true);
                getServer().getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), () -> {
                    p.getWorld().setThundering(false);
                    if (!raining) p.getWorld().setStorm(false);
                }, 20*20);
            }, 60, p);
        } else if (i.equals(AdvancedFrostSword.getFullItem().getItem()) && hasFrost) {
            new AbilityWithCoolDown(advancedFrostRight, () -> {
                int taskNum = getServer().getScheduler().runTaskTimer(getPlugin(SpriteSMP.class), () -> {
                    Arrow arrowFired = p.launchProjectile(Arrow.class, p.getLocation().getDirection());
                    arrowFired.setPickupStatus(AbstractArrow.PickupStatus.CREATIVE_ONLY);
                    arrowFired.addCustomEffect(new PotionEffect(PotionEffectType.SLOWNESS, 20 * 5, 2), true);
                    arrowFired.addCustomEffect(new PotionEffect(PotionEffectType.WEAKNESS, 20 * 5, 0), true);
                    arrowFired.addCustomEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * 5, 0), true);
                    arrowFired.setColor(Color.BLUE);
                }, 0, 8).getTaskId();
                getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> getServer().getScheduler().cancelTask(taskNum), 8 * 25);
            }, 60, p);
        } else if (i.equals(AdvancedLightSword.getFullItem().getItem()) && hasLight) {
            new AbilityWithCoolDown(advancedLightRight, () -> {
                for (PotionEffectType pet : PotionEffectType.values()) {
                    if (pet.getCategory().equals(PotionEffectTypeCategory.HARMFUL)) {
                        p.removePotionEffect(pet);
                    }
                }
            }, 60, p);
        } else if (i.equals(AdvancedDarkSword.getFullItem().getItem()) && hasDark) {
            new AbilityWithCoolDown(advancedDarkRight, () -> {
                p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 * 20, 0));
                p.getNearbyEntities(7, 7, 7).forEach(entity -> {
                    if (entity instanceof Player) {
                        ((Player)entity).addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * 20, 4));
                    }
                });
            }, 60, p);
        }
        /*


            SHIFT RIGHT CLICK ABILITIES


        */
        if (p.isSneaking() && (a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK)) {
            if (i.equals(FireSword.getFullItem().getItem()) && hasFire) {
                new AbilityWithCoolDown(fireShiftRight, () -> {
                    int tn = getServer().getScheduler().runTaskTimer(getPlugin(SpriteSMP.class), () -> {p.getNearbyEntities(5,5,5).forEach(entity -> {
                        if (entity instanceof Player) {
                            ((Player)entity).setFireTicks(20 * 3);
                        }
                    });}, 0, 10).getTaskId();
                    getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> getServer().getScheduler().cancelTask(tn), 20 * 10);
                }, 120, p);
            } else if (i.equals(WaterSword.getFullItem().getItem()) && p.getWorld().getBlockAt(p.getLocation()).getType().equals(Material.WATER) && hasWater) {
                new AbilityWithCoolDown(waterShiftRight, () -> {
                    Location center = p.getLocation();
                    p.getNearbyEntities(5, 5, 5).forEach(entity -> {
                        if (entity.getLocation().subtract(center).length() <= 5) {
                            int taskNum = getServer().getScheduler().runTaskTimer(getPlugin(SpriteSMP.class), () -> {
                                entity.setVelocity(center.subtract(entity.getLocation()).toVector().normalize());
                            }, 0, 5).getTaskId();
                            getServer().getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), () -> getServer().getScheduler().cancelTask(taskNum),20*5);
                        }
                    });
                }, 120, p);
            } else if (i.equals(AirSword.getFullItem().getItem()) && hasAir) {
                new AbilityWithCoolDown(airShiftRight, () -> {
                    p.getNearbyEntities(5, 5, 5).forEach(entity -> {
                        if (entity instanceof Player) {
                            entity.setVelocity(entity.getLocation().toVector().subtract(p.getLocation().toVector()).normalize().add(new Vector(0, 1, 0)));
                        }
                    });
                }, 120, p);
            } else if (i.equals(EarthSword.getFullItem().getItem()) && hasEarth) {
                // Ability activation based on item clicked
                new AbilityWithCoolDown(earthShiftRight, () -> {
                    int tn = getServer().getScheduler().runTaskTimer(getPlugin(SpriteSMP.class), () -> {p.getNearbyEntities(5,5,5).forEach(entity -> {
                        if (entity instanceof Player) {
                            ((Player)entity).addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20 * 3, 0));
                        }
                    });}, 0, 10).getTaskId();
                    getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> getServer().getScheduler().cancelTask(tn), 20 * 10);
                }, 120, p);
            } else if (i.equals(ThunderSword.getFullItem().getItem()) && hasThunder) {
                new AbilityWithCoolDown(thunderShiftRight, () -> {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 20 * 5, 255));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP_BOOST, 20 * 5, 255));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 20 * 5, 0));
                    getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> {
                        p.getNearbyEntities(5, 5, 5).forEach(entity -> {
                            if (entity instanceof Player) {
                                ((Player)entity).damage(4);
                                p.getWorld().strikeLightning(entity.getLocation());
                            }
                        });
                    }, 20 * 5);
                }, 120, p);
            } else if (i.equals(FrostSword.getFullItem().getItem()) && hasFrost) {
                new AbilityWithCoolDown(frostShiftRight, () -> {
                    bounceIce(p);

                }, 120, p);
            } else if (i.equals(LightSword.getFullItem().getItem()) && hasLight) {
                new AbilityWithCoolDown(lightShiftRight, () -> {
                    int lightLevel = p.getWorld().getBlockAt(p.getLocation()).getLightLevel();
                    switch (lightLevel) {
                        case 0:
                            break;
                        case 1,2,3:
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 5, 0));
                            break;
                        case 4,5,6:
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 5, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 20 * 5, 0));
                            break;
                        case 7,8,9:
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 5, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 20 * 5, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20 * 5, 0));
                            break;
                        case 10,11,12:
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 5, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 20 * 5, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20 * 5, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.RESISTANCE, 20 * 5, 0));
                            break;
                        case 13,14,15:
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 5, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 20 * 5, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20 * 5, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.RESISTANCE, 20 * 5, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 20 * 5, 0));
                            break;
                    }
                }, 120, p);
            } else if (i.equals(DarkSword.getFullItem().getItem()) && hasDark) {
            } else if (i.equals(AdvancedFireSword.getFullItem().getItem()) && hasFire) {
                new AbilityWithCoolDown(advancedFireShiftRight, () -> {
                    int tn = getServer().getScheduler().runTaskTimer(getPlugin(SpriteSMP.class), () -> {p.getNearbyEntities(7,7,7).forEach(entity -> {
                        if (entity instanceof Player) {
                            ((Player)entity).setFireTicks(20 * 5);
                        }
                    });}, 0, 10).getTaskId();
                    getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> getServer().getScheduler().cancelTask(tn), 20 * 15);
                }, 120, p);
            } else if (i.equals(AdvancedWaterSword.getFullItem().getItem()) && hasWater) {
                new AbilityWithCoolDown(advancedWaterShiftRight, () -> {
                    Location center = p.getLocation();
                    p.getNearbyEntities(7, 7, 7).forEach(entity -> {
                        if (entity.getLocation().subtract(center).length() <= 7) {
                            int taskNum = getServer().getScheduler().runTaskTimer(getPlugin(SpriteSMP.class), () -> {
                                entity.setVelocity(center.subtract(entity.getLocation()).toVector().normalize().multiply(1.1));
                            }, 0, 5).getTaskId();
                            getServer().getScheduler().runTaskLater(SpriteSMP.getPlugin(SpriteSMP.class), () -> getServer().getScheduler().cancelTask(taskNum),20*7);
                        }
                    });
                }, 120, p);
            } else if (i.equals(AdvancedAirSword.getFullItem().getItem()) && hasAir) {
                new AbilityWithCoolDown(advancedAirShiftRight, () -> {
                    p.getNearbyEntities(9, 9, 9).forEach(entity -> {
                        if (entity instanceof Player) {
                            entity.setVelocity(entity.getLocation().toVector().subtract(p.getLocation().toVector()).normalize().multiply(1.2).add(new Vector(0, 2, 0)));
                        }
                    });
                }, 120, p);
            } else if (i.equals(AdvancedEarthSword.getFullItem().getItem()) && hasEarth) {
                new AbilityWithCoolDown(advancedEarthShiftRight, () -> {
                    int tn = getServer().getScheduler().runTaskTimer(getPlugin(SpriteSMP.class), () -> {p.getNearbyEntities(7,7,7).forEach(entity -> {
                        if (entity instanceof Player) {
                            ((Player)entity).addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20 * 5, 0));
                        }
                    });}, 0, 10).getTaskId();
                    getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> getServer().getScheduler().cancelTask(tn), 20 * 15);
                }, 120, p);
            } else if (i.equals(AdvancedThunderSword.getFullItem().getItem()) && hasThunder) {
                new AbilityWithCoolDown(advancedThunderShiftRight, () -> {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 20 * 3, 255));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP_BOOST, 20 * 3, 255));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 20 * 3, 0));
                    getServer().getScheduler().runTaskLater(getPlugin(SpriteSMP.class), () -> {
                        p.getNearbyEntities(7, 7, 7).forEach(entity -> {
                            if (entity instanceof Player) {
                                ((Player)entity).damage(8);
                                p.getWorld().strikeLightning(entity.getLocation());
                            }
                        });
                    }, 20 * 5);
                }, 120, p);
            } else if (i.equals(AdvancedFrostSword.getFullItem().getItem()) && hasFrost) {
                new AbilityWithCoolDown(advancedFrostShiftRight, () -> {
                    bounceIce(p);
                }, 120, p);
            } else if (i.equals(AdvancedLightSword.getFullItem().getItem()) && hasLight) {
                new AbilityWithCoolDown(advancedLightShiftRight, () -> {
                    int lightLevel = p.getWorld().getBlockAt(p.getLocation()).getLightLevel();
                    switch (lightLevel) {
                        case 0:
                            break;
                        case 1,2,3:
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 10, 0));
                            break;
                        case 4,5,6:
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 10, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 20 * 10, 0));
                            break;
                        case 7,8,9:
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 10, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 20 * 10, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20 * 10, 0));
                            break;
                        case 10,11,12:
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 10, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 20 * 10, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20 * 10, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.RESISTANCE, 20 * 10, 0));
                            break;
                        case 13,14,15:
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 10, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 20 * 10, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20 * 10, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.RESISTANCE, 20 * 10, 0));
                            p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 20 * 10, 0));
                            break;
                    };
                }, 120, p);
            } else if (i.equals(AdvancedDarkSword.getFullItem().getItem()) && hasDark) {
            } else if (i.isSimilar(RevivalSprite.getFullItem().getItem())) {
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
            } else if (i.isSimilar(RerollSprite.getFullItem().getItem())) {
                // Reroll sprite ability
                ps.rerollSprite(p);
                e.getItem().setAmount(e.getItem().getAmount() - 1);
            } else if (i.isSimilar(FireSprite.getFullItem().getItem()) && psc.getCount(p) != 6) {
                // Increment player sprite count and consume item
                psc.updatePlayer(p, 1);
                e.getItem().setAmount(e.getItem().getAmount() - 1);
            } else if (i.isSimilar(WaterSprite.getFullItem().getItem()) && psc.getCount(p) != 6) {
                // Increment player sprite count and consume item
                psc.updatePlayer(p, 1);
                e.getItem().setAmount(e.getItem().getAmount() - 1);
            } else if (i.isSimilar(AirSprite.getFullItem().getItem()) && psc.getCount(p) != 6) {
                // Increment player sprite count and consume item
                psc.updatePlayer(p, 1);
                e.getItem().setAmount(e.getItem().getAmount() - 1);
            } else if (i.isSimilar(EarthSprite.getFullItem().getItem()) && psc.getCount(p) != 6) {
                // Increment player sprite count and consume item
                psc.updatePlayer(p, 1);
                e.getItem().setAmount(e.getItem().getAmount() - 1);
            }
        }
    }


    public List<Player> getAllVisiblePlayers(Player observer) {
        List<Player> visiblePlayers = new ArrayList<>();
        for (Player player : getOnlinePlayers()) {
            if (isWithinUnobstructedFieldOfView(observer, player, 90)) {
                visiblePlayers.add(player);
            }
        }
        return visiblePlayers;
    }

    public void bounceIce(Player p) {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                for (int z = 0; z < 9; z++) {
                    if (!p.getWorld().getBlockAt(p.getLocation().add(x - 4, y - 4, z - 4)).getType().equals(Material.AIR)) {
                        p.getWorld().getBlockAt(p.getLocation().add(x - 4, y - 4, z - 4)).setType(Material.ICE);
                    }
                }
            }
        }
        p.getNearbyEntities(5, 5, 5).forEach(entity -> {
            if (entity instanceof Player) {
                ((Player) entity).addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 20 * 5, 2));
                bounceIce((Player) entity);
            }
        });
    }

    public void bounceIceAdvanced(Player p) {
        for (int x = 0; x < 11; x++) {
            for (int y = 0; y < 11; y++) {
                for (int z = 0; z < 11; z++) {
                    if (!p.getWorld().getBlockAt(p.getLocation().add(x - 5, y - 5, z - 5)).getType().equals(Material.AIR)) {
                        p.getWorld().getBlockAt(p.getLocation().add(x - 5, y - 5, z - 5)).setType(Material.ICE);
                    }
                }
            }
        }
        p.getNearbyEntities(6, 6, 6).forEach(entity -> {
            if (entity instanceof Player) {
                ((Player) entity).addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 20 * 10, 2));
                bounceIce((Player) entity);
            }
        });
    }

    public boolean isWithinUnobstructedFieldOfView(Player observerPlayer, Player observedPlayer, double maxAngleDegrees) {
        double maxAngle = Math.toRadians(maxAngleDegrees); // Convert max angle to radians

        // Calculate the direction vector of the observer
        Location observerLoc = observerPlayer.getLocation();
        Location observerDir = observerPlayer.getLocation().setDirection(observerPlayer.getLocation().getDirection()).add(0, 0, 1);
        double dxObserver = observerDir.getX() - observerLoc.getX();
        double dyObserver = observerDir.getY() - observerLoc.getY();
        double dzObserver = observerDir.getZ() - observerLoc.getZ();

        // Calculate the vector to the observed player
        Location observedLoc = observedPlayer.getLocation();
        double dxObserved = observedLoc.getX() - observerLoc.getX();
        double dyObserved = observedLoc.getY() - observerLoc.getY();
        double dzObserved = observedLoc.getZ() - observerLoc.getZ();

        // Calculate the angle between vectors
        double dotProduct = dxObserver * dxObserved + dyObserver * dyObserved + dzObserver * dzObserved;
        double magnitude = Math.sqrt(dxObserver * dxObserver + dyObserver * dyObserver + dzObserver * dzObserver) * Math.sqrt(dxObserved * dxObserved + dyObserved * dyObserved + dzObserved * dzObserved);
        double angle = Math.acos(dotProduct / magnitude);

        // Check if within field of view
        if (angle > maxAngle) {
            return false; // Observed player is outside the field of view
        }

        // Check for obstructions
        List<Block> sightBlocks = observerPlayer.getLineOfSight((Set<Material>) null, (int) observerLoc.distance(observedLoc));
        for (Block block : sightBlocks) {
            if (block.getType() != Material.AIR) {
                return false; // Obstruction detected
            }
        }

        return true; // No obstructions and within field of view
    }
}

