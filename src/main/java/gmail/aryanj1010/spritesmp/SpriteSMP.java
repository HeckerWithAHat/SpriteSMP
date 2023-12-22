package gmail.aryanj1010.spritesmp;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import gmail.aryanj1010.spritesmp.Commands.AdminCommand;
import gmail.aryanj1010.spritesmp.Commands.AdminTabCompletion;
import gmail.aryanj1010.spritesmp.Crafts.initializeCrafts;
import gmail.aryanj1010.spritesmp.Items.items;
import gmail.aryanj1010.spritesmp.files.PlayerSpriteCount;
import gmail.aryanj1010.spritesmp.files.PlayerSprites;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.reflections.Reflections;

import static gmail.aryanj1010.spritesmp.API.ActionBarManager.*;
import static gmail.aryanj1010.spritesmp.Items.items.AirPickaxe;
import static gmail.aryanj1010.spritesmp.Items.items.WaterPickaxe;

/**
 * The main class of the SpriteSMP plugin.
 * This class extends the JavaPlugin class and handles the plugin's initialization, shutdown, and commands.
 */
public final class SpriteSMP extends JavaPlugin {

  public static PlayerSprites ps;
  public static PlayerSpriteCount psc;
  public static initializeCrafts ic;
  public static items[] sprites = new items[] {
    items.FireSprite,
    items.WaterSprite,
    items.AirSprite,
    items.EarthSprite,
  };
  public static ProtocolManager manager;
  public static HashMap<Player, Player> markedPlayer = new HashMap<>();
  public static List<Player> invisPlayers = new ArrayList<>();

  @Override
  public void onEnable() {
    manager = ProtocolLibrary.getProtocolManager();
    ps = new PlayerSprites(this);
    psc = new PlayerSpriteCount(this);
    ic = new initializeCrafts();
    // Plugin startup logic
    if (!getDataFolder().exists()) getDataFolder().mkdirs();

    getServer()
      .getScheduler()
      .runTaskTimer(
        this,
        () -> {
          for (Player p : getServer().getOnlinePlayers()) {
            updateEffects(p);
          }
        },
        0,
        20 * 20
      );

    for (Class<?> clazz : new Reflections(
      getClass().getPackage().getName() + ".Listeners"
    )
      .getSubTypesOf(Listener.class)) {
      try {
        Listener listener = (Listener) clazz
          .getDeclaredConstructor()
          .newInstance();
        Bukkit.getServer().getConsoleSender().sendMessage(clazz.getName());

        getServer().getPluginManager().registerEvents(listener, this);
      } catch (
        InstantiationException
        | IllegalAccessException
        | InvocationTargetException
        | NoSuchMethodException e
      ) {
        throw new RuntimeException(e);
      }
    }
    getCommand("admin").setExecutor(new AdminCommand());
    getCommand("admin").setTabCompleter(new AdminTabCompletion());
  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
    ps.save();
    psc.save();
  }

  public void updateEffects(Player p) {
    if (p.getInventory().getItemInMainHand().equals(AirPickaxe.getFullItem().getItem()) && ps.getSprite(p).equals(items.AirSprite)) {
      p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 20 * 21, 1));
      p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20 * 21, 1));
    } else if (p.getInventory().getItemInMainHand().equals(WaterPickaxe.getFullItem().getItem()) && ps.getSprite(p).equals(items.WaterSprite)) {
      if (p.getLocation().getBlock().getType() == Material.WATER) {
        p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 20 * 21, 1));
      }
    }
    ps.save();
    psc.save();
  }

  @Override
  public boolean onCommand(
    CommandSender sender,
    Command command,
    String label,
    String[] args
  ) {
    if (command.getName().equalsIgnoreCase("spritecount")) {
      if (sender instanceof Player) {
        ((Player) sender).sendMessage(
            "You have " + psc.getCount((Player) sender) + " Sprites"
          );
      }
    }
    if (command.getName().equalsIgnoreCase("sprite")) {
      if (sender instanceof Player) {
        ((Player) sender).sendMessage(
            "You have the " +
            ps.getSprite((Player) sender).toString() +
            " Sprite"
          );
      }
    }
    if (command.getName().equalsIgnoreCase("withdraw")) {
      if (sender instanceof Player) {
        if (!(psc.getCount((Player) sender) <= -5)) {
          ((Player) sender).sendMessage(
              "You now have " + psc.getCount((Player) sender) + " Sprites"
            );
          psc.updatePlayer((Player) sender, -1);
          ((Player) sender).getInventory()
            .addItem(ps.getSprite((Player) sender).getFullItem().getItem());
        } else {
          ((Player) sender).sendMessage(
              "You have " +
              psc.getCount((Player) sender) +
              " Sprites. Please get more before withdrawing"
            );
        }
      }
    }
    if (command.getName().equalsIgnoreCase("toggleSpriteDisplay")) {
      if (sender instanceof Player) {
        if (playerActionBars.containsKey((Player)sender)) {
          removeActionBar((Player)sender);
        } else {
          addActionBar((Player)sender);
        }
      }
    }
    return true;
  }
}
