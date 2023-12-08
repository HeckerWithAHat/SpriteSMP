package gmail.aryanj1010.spritesmp.files;

import gmail.aryanj1010.spritesmp.Items.items;
import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.entity.Player;

import java.util.Random;

import static gmail.aryanj1010.spritesmp.SpriteSMP.sprites;

public class PlayerSprites extends AbstractFile{
    public PlayerSprites (SpriteSMP main) {
        super(main, "playerSprites.yml");
    }

    public boolean containsPlayer (Player p) {
        return config.contains(p.getUniqueId().toString());
    }

    public void addSprite (Player p, items sprite) {
        config.set(p.getUniqueId().toString(), sprite.toString());
    }

    public items rerollSprite (Player p) {
        while (true) {
            items i = sprites[new Random().nextInt(sprites.length)];
            if (!i.toString().equals(config.get(p.getUniqueId().toString()))) {addSprite(p, i);return i;}
        }
    }

    public items getSprite (Player p) {
        switch (config.get(p.getUniqueId().toString()).toString()) {
            case "FireSprite": return items.FireSprite;
            case "WaterSprite": return items.WaterSprite;
            case "AirSprite": return items.AirSprite;
            case "EarthSprite": return items.EarthSprite;
            case "ShadowSprite": return items.ShadowSprite;
            case "GlowSprite": return items.GlowSprite;

            default:return null;
        }
    }
}
