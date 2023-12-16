
package gmail.aryanj1010.spritesmp.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static gmail.aryanj1010.spritesmp.SpriteSMP.ps;
import static gmail.aryanj1010.spritesmp.SpriteSMP.psc;

public class AdminCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        if (args[0].equalsIgnoreCase("sprite")) {
            ((Player) sender).sendMessage("You have the " + ps.getSprite((Player) sender).toString() + " Sprite");

        } else if (args[0].equalsIgnoreCase("spritecount")) {
            ((Player) sender).sendMessage("You have " + psc.getCount((Player) sender) + " Sprites");
        } else if (args[0].equalsIgnoreCase("withdraw")) {
            if (!(psc.getCount((Player) sender) <=-5)) {
                ((Player) sender).sendMessage("You now have " + psc.getCount((Player) sender) + " Sprites");
                psc.updatePlayer((Player) sender, -1);
                ((Player) sender).getInventory().addItem(ps.getSprite((Player) sender).getFullItem().getItem());
            } else {
                ((Player) sender).sendMessage("You have " + psc.getCount((Player) sender) + " Sprites. Please get more before withdrawing");
            }
        } else if (args[0].equalsIgnoreCase("admin")) {
            if (args[1].equalsIgnoreCase("add")) {

            } else if (args[1].equalsIgnoreCase("itemgive")) {

            } else if (args[1].equalsIgnoreCase("sprite")) {

            } else if (args[1].equalsIgnoreCase("spritecount")) {

            }
        }

        return true;
    }
}
