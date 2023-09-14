package gmail.aryanj1010.spritesmp;


import gmail.aryanj1010.spritesmp.Items.items;
import gmail.aryanj1010.spritesmp.files.PlayerSpriteCount;
import gmail.aryanj1010.spritesmp.files.PlayerSprites;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public final class SpriteSMP extends JavaPlugin {
    public static PlayerSprites ps;
    public static PlayerSpriteCount psc;
    public static items[] sprites = new items[]{
            items.FireSprite,
            items.WaterSprite,
            items.AirSprite,
            items.EarthSprite};
    public static Plugin plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        if (!getDataFolder().exists()) getDataFolder().mkdirs();
        ps = new PlayerSprites(this);
        psc = new PlayerSpriteCount(this);
        plugin = getPlugin(this.getClass());
        getServer().getScheduler().runTaskTimer(this, ()-> {
            for (Player p:
                 getServer().getOnlinePlayers()) {
                updateEffects(p);
            }
        }, 0, 20*20);

        for (Class<?> clazz:
             new Reflections(getClass().getPackage().getName() + ".Listeners").getSubTypesOf(Listener.class)) {
            try {
                Listener listener = (Listener) clazz.getDeclaredConstructor().newInstance();
                getServer().getPluginManager().registerEvents(listener, this);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                     NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        ps.save();
    }

    public void updateEffects(Player p) {
        p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
        p.removePotionEffect(PotionEffectType.REGENERATION);
        p.removePotionEffect(PotionEffectType.WATER_BREATHING);
        PotionEffect fire = new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE, 1, true, true);
        PotionEffect earth = new PotionEffect(PotionEffectType.REGENERATION, Integer.MAX_VALUE, 1, true, true);
        PotionEffect water = new PotionEffect(PotionEffectType.WATER_BREATHING, Integer.MAX_VALUE, 1, true, true);

        switch (ps.getSprite(p)) {
            case FireSprite:p.addPotionEffect(fire);break;
            case EarthSprite:p.addPotionEffect(earth);break;
            case WaterSprite:p.addPotionEffect(water);break;
        }
        ps.save();
    }
}
