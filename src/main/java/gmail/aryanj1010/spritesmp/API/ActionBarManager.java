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
                    if (fireRight.get(p.getUniqueId()) == null) fireRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (fireShiftRight.get(p.getUniqueId()) == null) fireShiftRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (firePickaxeRight.get(p.getUniqueId()) == null) firePickaxeRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (fireShovelRight.get(p.getUniqueId()) == null) fireShovelRight.put(p.getUniqueId(), System.currentTimeMillis());
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - fireRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - fireShiftRight.get(p.getUniqueId()))) / 1000))));
                    pickaxeRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - firePickaxeRight.get(p.getUniqueId()))) / 1000))));
                    shovelRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - fireShovelRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "WaterSprite": {
                    if (waterRight.get(p.getUniqueId()) == null) waterRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (waterShiftRight.get(p.getUniqueId()) == null) waterShiftRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (waterPickaxeRight.get(p.getUniqueId()) == null) waterPickaxeRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (waterShovelRight.get(p.getUniqueId()) == null) waterShovelRight.put(p.getUniqueId(), System.currentTimeMillis());
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - waterRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - waterShiftRight.get(p.getUniqueId()))) / 1000))));
                    pickaxeRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - waterPickaxeRight.get(p.getUniqueId()))) / 1000))));
                    shovelRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - waterShovelRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "AirSprite": {
                    if (airRight.get(p.getUniqueId()) == null) airRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (airShiftRight.get(p.getUniqueId()) == null) airShiftRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (airPickaxeRight.get(p.getUniqueId()) == null) airPickaxeRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (airShovelRight.get(p.getUniqueId()) == null) airShovelRight.put(p.getUniqueId(), System.currentTimeMillis());
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - airRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - airShiftRight.get(p.getUniqueId()))) / 1000))));
                    pickaxeRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - airPickaxeRight.get(p.getUniqueId()))) / 1000))));
                    shovelRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - airShovelRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "EarthSprite": {
                    if (earthRight.get(p.getUniqueId()) == null) earthRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (earthShiftRight.get(p.getUniqueId()) == null) earthShiftRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (earthPickaxeRight.get(p.getUniqueId()) == null) earthPickaxeRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (earthShovelRight.get(p.getUniqueId()) == null) earthShovelRight.put(p.getUniqueId(), System.currentTimeMillis());
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - earthRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - earthShiftRight.get(p.getUniqueId()))) / 1000))));
                    pickaxeRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - earthPickaxeRight.get(p.getUniqueId()))) / 1000))));
                    shovelRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - earthShovelRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "ShadowSprite": {
                    if (shadowRight.get(p.getUniqueId()) == null) shadowRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (shadowShiftRight.get(p.getUniqueId()) == null) shadowShiftRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (shadowPickaxeRight.get(p.getUniqueId()) == null) shadowPickaxeRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (shadowShovelRight.get(p.getUniqueId()) == null) shadowShovelRight.put(p.getUniqueId(), System.currentTimeMillis());
                    swordRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - shadowRight.get(p.getUniqueId()))) / 1000))));
                    swordShiftRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - shadowShiftRight.get(p.getUniqueId()))) / 1000))));
                    pickaxeRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - shadowPickaxeRight.get(p.getUniqueId()))) / 1000))));
                    shovelRight = String.valueOf(Math.max(0, Math.round((float) (((60 * 1000L) - (System.currentTimeMillis() - shadowShovelRight.get(p.getUniqueId()))) / 1000))));
                }
                break;
                case "GlowSprite": {
                    if (glowRight.get(p.getUniqueId()) == null) glowRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (glowShiftRight.get(p.getUniqueId()) == null) glowShiftRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (glowPickaxeRight.get(p.getUniqueId()) == null) glowPickaxeRight.put(p.getUniqueId(), System.currentTimeMillis());
                    if (glowShovelRight.get(p.getUniqueId()) == null) glowShovelRight.put(p.getUniqueId(), System.currentTimeMillis());
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