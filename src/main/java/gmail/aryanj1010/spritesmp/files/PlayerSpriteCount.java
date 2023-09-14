package gmail.aryanj1010.spritesmp.files;

import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.entity.Player;

public class PlayerSpriteCount extends AbstractFile{
    public PlayerSpriteCount(SpriteSMP main) {
        super(main, "playerSpriteCount.yml");
    }

    public void addPlayer (Player p) {
        if (config.contains(p.getUniqueId().toString())) return;
        config.set(p.getUniqueId().toString(), 0);
    }

    public int updatePlayer (Player p, int i) {
        config.set(p.getUniqueId().toString(), config.getInt(p.getUniqueId().toString()) + i);
        return config.getInt(p.getUniqueId().toString());
    }
    public int getCount (Player p) {
        return config.getInt(p.getUniqueId().toString());
    }
}
