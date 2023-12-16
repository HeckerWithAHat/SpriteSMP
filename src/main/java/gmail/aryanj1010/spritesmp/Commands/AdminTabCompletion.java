package gmail.aryanj1010.spritesmp.Commands;

import static org.bukkit.Bukkit.getServer;

import gmail.aryanj1010.spritesmp.Items.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.BanEntry;
import org.bukkit.BanList;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.profile.PlayerProfile;

public class AdminTabCompletion implements TabCompleter {

    @Override
    public List<String> onTabComplete(
            CommandSender sender,
            Command command,
            String label,
            String[] args
    ) {

        if (args.length == 1) {
            return List.of("itemgive", "sprite", "spritecount", "unban");
        } else if (args.length == 2) {
           if (args[0].equalsIgnoreCase("itemgive")) {
               List<String> item = new ArrayList<>();
               for (items i : items.values()) {
                   item.add(i.toString());
               }
                return item;
            } else if (args[0].equalsIgnoreCase("sprite")) {
                return List.of("set", "get");
            } else if (args[0].equalsIgnoreCase("spritecount")) {
                return List.of("set", "get");
            } else if (args[0].equalsIgnoreCase("unban")) {
                List<String> players = new ArrayList<>();
               for (BanEntry be:
                       getServer().getBanList(BanList.Type.PROFILE).getEntries()) {
                   if (be.getReason().equalsIgnoreCase("Out of Sprites")) {
                       players.add(((PlayerProfile) be.getBanTarget()).getName());
                   }
               }
               return players;
            }
        } else if (args.length == 3) {
            List<String> players = new ArrayList<>();
            for (Player p : getServer().getOnlinePlayers()) {
                players.add(p.getName());
            }
            return players;
        } else if (args.length == 4) {
            if (args[0].equalsIgnoreCase("sprite")) {
                if (args[1].equalsIgnoreCase("set")) {
                    return List.of("fire", "water", "earth", "air", "shadow", "glow");
                }
            } else if (args[0].equalsIgnoreCase("spritecount")) {
                if (args[1].equalsIgnoreCase("set")) {
                    return List.of("-5", "-4", "-3", "-2", "-1", "0", "1", "2", "3", "4", "5", "6");
                }
            }
        }
        return null;
    }
}
