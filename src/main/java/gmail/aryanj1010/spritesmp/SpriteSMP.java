package gmail.aryanj1010.spritesmp;


import com.comphenix.protocol.ProtocolLibrary;
import gmail.aryanj1010.spritesmp.Crafts.initializeCrafts;
import com.comphenix.protocol.ProtocolManager;
import gmail.aryanj1010.spritesmp.Items.items;
import gmail.aryanj1010.spritesmp.files.PlayerSpriteCount;
import gmail.aryanj1010.spritesmp.files.PlayerSprites;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;

/**
 * The main class of the SpriteSMP plugin.
 * This class extends the JavaPlugin class and handles the plugin's initialization, shutdown, and commands.
 */
public final class SpriteSMP extends JavaPlugin {
    public static PlayerSprites ps;
    public static PlayerSpriteCount psc;
    public static initializeCrafts ic;

    public static ProtocolManager manager;

    public static items[] sprites = new items[]{
            items.FireSprite,
            items.WaterSprite,
            items.AirSprite,
            items.EarthSprite,
            items.ThunderSprite,
            items.FrostSprite,
            items.LightSprite,
            items.DarkSprite

    };


    @Override
    public void onEnable() {
        manager = ProtocolLibrary.getProtocolManager();
        ic = new initializeCrafts();
        // Plugin startup logic
        if (!getDataFolder().exists()) getDataFolder().mkdirs();
        ps = new PlayerSprites(this);
        psc = new PlayerSpriteCount(this);
        getServer().getScheduler().runTaskTimer(this, this::save, 0, 20*20);

        for (Class<?> clazz:
             new Reflections(getClass().getPackage().getName() + ".Listeners").getSubTypesOf(Listener.class)) {
            try {
                Listener listener = (Listener) clazz.getDeclaredConstructor().newInstance();
                Bukkit.getServer().getConsoleSender().sendMessage(clazz.getName());

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
        save();
    }

    public void save() {
        ps.save();
        psc.save();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("spritecount")) {
            if (sender instanceof Player) {
                ((Player) sender).sendMessage("You have " + psc.getCount((Player) sender) + " Sprites");
            }
        }
        if (command.getName().equalsIgnoreCase("sprite")) {
            if (sender instanceof Player) {
                String sprite = ps.getSprite((Player) sender).toString().replace("Sprite", " Sprite");
                ((Player) sender).sendMessage("You have the " + sprite);
            }
        }
        if (command.getName().equalsIgnoreCase("withdraw")) {
            if (sender instanceof Player) {
                if (!(psc.getCount((Player) sender) <=-5))
                {((Player) sender).sendMessage("You now have " + psc.getCount((Player) sender) + " Sprites");
                psc.updatePlayer((Player) sender, -1);
                ((Player) sender).getInventory().addItem(ps.getSprite((Player) sender).getFullItem().getItem());}
                else {
                    ((Player) sender).sendMessage("You have " + psc.getCount((Player) sender) + " Sprites. Please get more before withdrawing");
                }
            }
        }
        return true;
    }
}
