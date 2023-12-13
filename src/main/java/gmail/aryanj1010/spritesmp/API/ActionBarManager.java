package gmail.aryanj1010.spritesmp.API;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.entity.Player;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import static gmail.aryanj1010.spritesmp.Listeners.OnClick.*;
import static gmail.aryanj1010.spritesmp.Listeners.OnClickEntity.*;
import static gmail.aryanj1010.spritesmp.SpriteSMP.*;
import static org.bukkit.plugin.java.JavaPlugin.getPlugin;


public class ActionBarManager {

    public static HashMap<Player, Integer> playerActionBars = new HashMap<>();

    public static void addActionBar(Player p) {

        if (playerActionBars.containsKey(p)) {
            return;
        }
        int i = getPlugin(SpriteSMP.class).getServer().getScheduler().scheduleSyncRepeatingTask(getPlugin(SpriteSMP.class), () -> {
            String playerSprite = ps.getSprite(p).toString().replaceAll("(?<=[a-z])(?=[A-Z])", " ");
            String playerSpriteCount = psc.getCount(p) + " Sprites";
            String swordRight;
            String swordShiftRight;
            String pickaxeRight;
            String shovelRight;


            switch (ps.getSprite(p).toString()) {
                case "FireSprite": {
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - fireRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - fireShiftRight.get(p.getUniqueId()))) / 1000))));
                    pickaxeRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - firePickaxeRight.get(p.getUniqueId()))) / 1000))));
                    shovelRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - fireShovelRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "WaterSprite": {
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - waterRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - waterShiftRight.get(p.getUniqueId()))) / 1000))));
                    pickaxeRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - waterPickaxeRight.get(p.getUniqueId()))) / 1000))));
                    shovelRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - waterShovelRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "AirSprite": {
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - airRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - airShiftRight.get(p.getUniqueId()))) / 1000))));
                    pickaxeRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - airPickaxeRight.get(p.getUniqueId()))) / 1000))));
                    shovelRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - airShovelRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "EarthSprite": {
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - earthRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - earthShiftRight.get(p.getUniqueId()))) / 1000))));
                    pickaxeRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - earthPickaxeRight.get(p.getUniqueId()))) / 1000))));
                    shovelRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - earthShovelRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "ShadowSprite": {
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - shadowRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - shadowShiftRight.get(p.getUniqueId()))) / 1000))));
                    pickaxeRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - shadowPickaxeRight.get(p.getUniqueId()))) / 1000))));
                    shovelRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - shadowShovelRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "GlowSprite": {
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - glowRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - glowShiftRight.get(p.getUniqueId()))) / 1000))));
                    pickaxeRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - glowPickaxeRight.get(p.getUniqueId()))) / 1000))));
                    shovelRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - glowShovelRight.get(p.getUniqueId()))) / 1000))));
                }
                break;

                default: {
                    swordRight = "0";
                    swordShiftRight = "0";
                    pickaxeRight = "0";
                    shovelRight = "0";
                }
            }


            String actionBarText = playerSprite + "  |  " + playerSpriteCount + "  |  " + "Sword Right Click: " + swordRight + "s" + "  |  " + "Sword Shift Right Click: " + swordShiftRight + "s" + "  |  " + "Pickaxe: " + pickaxeRight + "s" + "  |  " + "Shovel: " + shovelRight + "s";
            PacketContainer packet = manager.createPacket(PacketType.Play.Server.SET_ACTION_BAR_TEXT);
            packet.getChatComponents().write(0, WrappedChatComponent.fromText(actionBarText));

            try {
                manager.sendServerPacket(p, packet);
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

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
