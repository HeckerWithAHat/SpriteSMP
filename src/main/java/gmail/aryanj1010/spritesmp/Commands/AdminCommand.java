
package gmail.aryanj1010.spritesmp.Commands;

import gmail.aryanj1010.spritesmp.Items.items;
import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static gmail.aryanj1010.spritesmp.SpriteSMP.ps;
import static gmail.aryanj1010.spritesmp.SpriteSMP.psc;
import static org.bukkit.Bukkit.getServer;
import static org.bukkit.plugin.java.JavaPlugin.getPlugin;

public class AdminCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) ((Player) sender).sendMessage("Usage: /admin <itemgive|sprite|spritecount|unban>");


        if (args[0].equalsIgnoreCase("itemgive")) {
            getServer().getPlayer(args[2]).getInventory().addItem(items.valueOf(args[1]).getFullItem().getItem());
        } else if (args[0].equalsIgnoreCase("sprite")) {
            if (args[1].equalsIgnoreCase("set")) {

                switch (args[3]) {
                    case "fire":
                        ps.setSprite(getServer().getPlayer(args[2]), items.FireSprite);
                        break;
                    case "earth":
                        ps.setSprite(getServer().getPlayer(args[2]), items.EarthSprite);
                        break;
                    case "water":
                        ps.setSprite(getServer().getPlayer(args[2]), items.WaterSprite);
                        break;
                    case "air":
                        ps.setSprite(getServer().getPlayer(args[2]), items.AirSprite);
                        break;
                    case "shadow":
                        ps.setSprite(getServer().getPlayer(args[2]), items.ShadowSprite);
                        break;
                    case "glow":
                        ps.setSprite(getServer().getPlayer(args[2]), items.GlowSprite);
                        break;
                }
            } else if (args[1].equalsIgnoreCase("get")) {
                sender.sendMessage(args[2] + "has the" + ps.getSprite(getServer().getPlayer(args[2])));
            }

        } else if (args[0].equalsIgnoreCase("spritecount")) {
            if (args[1].equalsIgnoreCase("set")) {
                psc.setPlayer(getServer().getPlayer(args[2]), Integer.parseInt(args[3]));
            } else if (args[1].equalsIgnoreCase("get")) {
                sender.sendMessage(args[2] + "has " + psc.getCount(getServer().getPlayer(args[2])) + " Sprites");
            }
        } else if (args[0].equalsIgnoreCase("unban")) {
            getPlugin(SpriteSMP.class)
                    .getServer()
                    .dispatchCommand(
                            getPlugin(SpriteSMP.class).getServer().getConsoleSender(),
                            "pardon " + args[1]
                    );
        }

        return true;
    }
}
