package gmail.aryanj1010.spritesmp.API;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.entity.Player;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import static gmail.aryanj1010.spritesmp.Listeners.OnClick.*;
import static gmail.aryanj1010.spritesmp.SpriteSMP.*;
import static org.bukkit.plugin.java.JavaPlugin.getPlugin;


public class ActionBarManager {

    public static HashMap<Player, Integer> playerActionBars = new HashMap<>();

    public static void addActionBar(Player p) {

        if (playerActionBars.containsKey(p)) {
            return;
        }
        int i = getPlugin(SpriteSMP.class).getServer().getScheduler().scheduleSyncRepeatingTask(getPlugin(SpriteSMP.class), () -> {
            String playerSprite = ps.getSprite(p).toString().replaceAll("Sprite", " Sprite");
            String playerSpriteCount = psc.getCount(p) + " Sprites";
            String swordRight;
            String swordShiftRight;



            switch (ps.getSprite(p).toString()) {
                case "FireSprite": {
                    if (fireRight.get(p.getUniqueId()) == null) fireRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (fireShiftRight.get(p.getUniqueId()) == null) fireShiftRight.put(p.getUniqueId(), System.currentTimeMillis());
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - fireRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - fireShiftRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "WaterSprite": {
                    if (waterRight.get(p.getUniqueId()) == null) waterRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (waterShiftRight.get(p.getUniqueId()) == null) waterShiftRight.put(p.getUniqueId(), System.currentTimeMillis());
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - waterRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - waterShiftRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "AirSprite": {
                    if (airRight.get(p.getUniqueId()) == null) airRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (airShiftRight.get(p.getUniqueId()) == null) airShiftRight.put(p.getUniqueId(), System.currentTimeMillis());
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - airRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - airShiftRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "EarthSprite": {
                    if (earthRight.get(p.getUniqueId()) == null) earthRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (earthShiftRight.get(p.getUniqueId()) == null) earthShiftRight.put(p.getUniqueId(), System.currentTimeMillis());
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - earthRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - earthShiftRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "ThunderSprite": {
                    if (thunderRight.get(p.getUniqueId()) == null) thunderRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (thunderShiftRight.get(p.getUniqueId()) == null) thunderShiftRight.put(p.getUniqueId(), System.currentTimeMillis());
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - thunderRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - thunderShiftRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "FrostSprite": {
                    if (frostRight.get(p.getUniqueId()) == null) frostRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (frostShiftRight.get(p.getUniqueId()) == null) frostShiftRight.put(p.getUniqueId(), System.currentTimeMillis());
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - frostRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - frostShiftRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "LightSprite": {
                    if (lightRight.get(p.getUniqueId()) == null) lightRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (lightShiftRight.get(p.getUniqueId()) == null) lightShiftRight.put(p.getUniqueId(), System.currentTimeMillis());
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - lightRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - lightShiftRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "DarkSprite": {
                    if (darkRight.get(p.getUniqueId()) == null) darkRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (darkShiftRight.get(p.getUniqueId()) == null) darkShiftRight.put(p.getUniqueId(), System.currentTimeMillis());
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - darkRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - darkShiftRight.get(p.getUniqueId()))) / 1000))));
                }
                break;

                default: {
                    swordRight = "0";
                    swordShiftRight = "0";
                }
            }


            String actionBarText = playerSprite + "  |  " + playerSpriteCount + "  |  " + "Sword Right Click: " + swordRight + "s" + "  |  " + "Sword Shift Right Click: " + swordShiftRight + "s";
            PacketContainer packet = manager.createPacket(PacketType.Play.Server.SET_ACTION_BAR_TEXT);
            packet.getChatComponents().write(0, WrappedChatComponent.fromText(actionBarText));

            manager.sendServerPacket(p, packet);

        }, 0, 20);
        playerActionBars.put(p, i);

    }

    public static void removeActionBar(Player p) {
        if (!playerActionBars.containsKey(p)) {
            return;
        }
        getPlugin(SpriteSMP.class).getServer().getScheduler().cancelTask(playerActionBars.get(p));
        playerActionBars.remove(p);
    }
}
