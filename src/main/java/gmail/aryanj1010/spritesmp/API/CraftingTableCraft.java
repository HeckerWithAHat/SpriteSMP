package gmail.aryanj1010.spritesmp.API;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static gmail.aryanj1010.spritesmp.SpriteSMP.plugin;

public class CraftingTableCraft  {
    ShapedRecipe sp;
    public CraftingTableCraft(ItemStack result, RecipeChoice.ExactChoice[] ingredients) {
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, result.getItemMeta().getDisplayName() + plugin.getName()), result);
        shapedRecipe.shape("abc", "def", "ghi");
        shapedRecipe.setIngredient('a', ingredients[0]);
        shapedRecipe.setIngredient('b', ingredients[1]);
        shapedRecipe.setIngredient('c', ingredients[2]);
        shapedRecipe.setIngredient('d', ingredients[3]);
        shapedRecipe.setIngredient('e', ingredients[4]);
        shapedRecipe.setIngredient('f', ingredients[5]);
        shapedRecipe.setIngredient('g', ingredients[6]);
        shapedRecipe.setIngredient('h', ingredients[7]);
        shapedRecipe.setIngredient('i', ingredients[8]);
        plugin.getServer().addRecipe(shapedRecipe);
        sp = shapedRecipe;
    }

    public ShapedRecipe getRecipe() {
        return sp;
    }
}
