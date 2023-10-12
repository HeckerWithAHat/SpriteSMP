package gmail.aryanj1010.spritesmp.API;

import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;


public class CraftingTableCraft  {
    ShapedRecipe sp;
    public CraftingTableCraft(ItemStack result, RecipeChoice[] ingredients, String name) {
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(SpriteSMP.getPlugin(SpriteSMP.class), name + SpriteSMP.getPlugin(SpriteSMP.class).getName()), result);
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
        SpriteSMP.getPlugin(SpriteSMP.class).getServer().addRecipe(shapedRecipe);
        sp = shapedRecipe;
        SpriteSMP.getPlugin(SpriteSMP.class).getServer().getConsoleSender().sendMessage(shapedRecipe.getChoiceMap().toString());
        SpriteSMP.getPlugin(SpriteSMP.class).getServer().getConsoleSender().sendMessage(shapedRecipe.getShape());
        SpriteSMP.getPlugin(SpriteSMP.class).getServer().getConsoleSender().sendMessage(shapedRecipe.getResult().getItemMeta().getDisplayName());
        SpriteSMP.getPlugin(SpriteSMP.class).getServer().getConsoleSender().sendMessage(shapedRecipe.getKey().toString());
    }

    public ShapedRecipe getRecipe() {
        return sp;
    }
}
