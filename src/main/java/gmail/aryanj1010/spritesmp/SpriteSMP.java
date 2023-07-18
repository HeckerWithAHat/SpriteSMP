package gmail.aryanj1010.spritesmp;


import gmail.aryanj1010.spritesmp.Items.items;
import gmail.aryanj1010.spritesmp.files.PlayerSprites;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpriteSMP extends JavaPlugin {
    public static PlayerSprites ps;
    public static items[] sprites = new items[]{items.FireSprite,items.WaterSprite,items.AirSprite,items.EarthSprite};
    public static Plugin plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        if (!getDataFolder().exists()) getDataFolder().mkdirs();
        ps = new PlayerSprites(this);
        plugin = getPlugin(this.getClass());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
