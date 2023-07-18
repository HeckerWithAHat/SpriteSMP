package gmail.aryanj1010.spritesmp.API;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static gmail.aryanj1010.spritesmp.SpriteSMP.plugin;

public class CraftingTableCraft  {
    ShapedRecipe sp;
    public CraftingTableCraft (ItemStack result, RecipeChoice.ExactChoice[] ingredients) {
        sp = new ShapedRecipe(new NamespacedKey(plugin, result.getItemMeta().getDisplayName() + plugin.getName()), result);
        sp.shape("abc", "def", "ghi");
        sp.setIngredient('a', ingredients[0]);
        sp.setIngredient('b', ingredients[1]);
        sp.setIngredient('c', ingredients[2]);
        sp.setIngredient('d', ingredients[3]);
        sp.setIngredient('e', ingredients[4]);
        sp.setIngredient('f', ingredients[5]);
        sp.setIngredient('g', ingredients[6]);
        sp.setIngredient('h', ingredients[7]);
        sp.setIngredient('i', ingredients[8]);
        plugin.getServer().addRecipe(sp);
    }

    public ShapedRecipe getRecipe() {
        return sp;
    }
}
