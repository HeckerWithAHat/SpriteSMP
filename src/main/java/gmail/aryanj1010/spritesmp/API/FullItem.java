package gmail.aryanj1010.spritesmp.API;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class FullItem {
    ItemStack is;
    ItemMeta im;
    public FullItem(Material material, int count, String name, String[] lore, boolean unbreakable, int cmd) {
        is = new ItemStack(material, count);
        im = is.getItemMeta();
        im.setLocalizedName(name);
        im.setDisplayName(name);
        im.setLore(Arrays.asList(lore));
        im.setUnbreakable(unbreakable);
        im.setCustomModelData(cmd);
        is.setItemMeta(im);
    }

    public ItemStack getItem() {
        return is;
    }
    public ItemMeta getMeta() {
        return im;
    }
}
