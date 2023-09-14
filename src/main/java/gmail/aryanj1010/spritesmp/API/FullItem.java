package gmail.aryanj1010.spritesmp.API;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class FullItem {
    ItemStack is;
    ItemMeta im;
    public FullItem(Material material, int count, String name, String[] lore, boolean unbreakable, int cmd) {
        ItemStack itemstack = new ItemStack(material, count);
        ItemMeta itemmeta = itemstack.getItemMeta();
        itemmeta.setDisplayName(name);
        itemmeta.setLocalizedName(name);
        itemmeta.setLore(Arrays.asList(lore));
        itemmeta.setUnbreakable(unbreakable);
        itemmeta.setCustomModelData(cmd);
        itemstack.setItemMeta(itemmeta);
        is=itemstack;
        im=itemmeta;
    }

    public ItemStack getItem() {
        return is;
    }
    public ItemMeta getMeta() {
        return im;
    }
}
