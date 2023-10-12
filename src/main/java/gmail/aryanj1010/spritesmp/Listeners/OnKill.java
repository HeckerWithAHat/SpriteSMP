package gmail.aryanj1010.spritesmp.Listeners;

import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.BanList;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.Objects;

import static gmail.aryanj1010.spritesmp.SpriteSMP.*;

public class OnKill implements Listener {
    @EventHandler
    public void onKillPlayer (PlayerDeathEvent e) {
        e.getDrops().add(ps.getSprite(Objects.requireNonNull(e.getEntity().getKiller())).getFullItem().getItem());


        psc.updatePlayer(e.getEntity(), -1);
        if (e.getEntity().getKiller() != null && psc.getCount(e.getEntity().getKiller()) != 6)psc.updatePlayer(e.getEntity().getKiller(), 1);
        if (psc.getCount(e.getEntity()) == -6) SpriteSMP.getPlugin(SpriteSMP.class).getServer().getBanList(BanList.Type.PROFILE).addBan(e.getEntity().getPlayer().getName(), "Out of Sprites", null, null);
    }
}
