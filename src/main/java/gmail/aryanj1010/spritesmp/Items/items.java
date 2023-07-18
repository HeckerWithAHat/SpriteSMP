package gmail.aryanj1010.spritesmp.Items;

import gmail.aryanj1010.spritesmp.API.FullItem;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;

import static gmail.aryanj1010.spritesmp.Crafts.initializeCrafts.*;


public enum items {
    FireSprite(Type.Sprite, null, new FullItem(Material.DIAMOND, 1, ChatColor.DARK_RED + "Fire Sprite", new String[]{}, true, 1)),
    WaterSprite(Type.Sprite, null, new FullItem(Material.DIAMOND, 1, ChatColor.AQUA + "Water Sprite", new String[]{}, true, 2)),
    AirSprite(Type.Sprite, null, new FullItem(Material.DIAMOND, 1, ChatColor.GRAY + "Air Sprite", new String[]{}, true, 3)),
    EarthSprite(Type.Sprite, null, new FullItem(Material.DIAMOND, 1, ChatColor.DARK_GREEN + "Earth Sprite", new String[]{}, true, 4)),

    FireSword(Type.Weapon, fireSword, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.DARK_RED + "Fire Sword", new String[]{}, true, 1)),
    WaterSword(Type.Weapon, waterSword, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.AQUA + "Water Sword", new String[]{}, true, 2)),
    AirSword(Type.Weapon, airSword, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.GRAY + "Air Sword", new String[]{}, true, 3)),
    EarthSword(Type.Weapon, earthSword, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.DARK_GREEN + "Earth Sword", new String[]{}, true, 4)),

    AdvancedFireSword(Type.AdvancedWeapon, advancedFireSword, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.DARK_RED + "Advanced Fire Sword", new String[]{}, true, 1)),
    AdvancedWaterSword(Type.AdvancedWeapon, advancedWaterSword, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.AQUA + "Advanced Water Sword", new String[]{}, true, 2)),
    AdvancedAirSword(Type.AdvancedWeapon, advancedAirSword, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.GRAY + "Advanced Air Sword", new String[]{}, true, 3)),
    AdvancedEarthSword(Type.AdvancedWeapon, advancedEarthSword, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.DARK_GREEN + "Advanced Earth Sword", new String[]{}, true, 4)),

    RevivalSprite(Type.Miscellaneous, revivalSprite, new FullItem(Material.IRON_INGOT, 1, ChatColor.YELLOW + "Revival Sprite", new String[]{}, true, 1)),
    RerollSprite(Type.Miscellaneous, rerollSprite, new FullItem(Material.IRON_INGOT, 1, "Reroll Sprite", new String[]{"This mythic item will swap your sprite ","and replace it with a brand new one"}, true, 2));

    final Type type;
    final FullItem item;
    final Recipe recipe;

    items(Type type, ShapedRecipe recipe, FullItem item) {
        this.type = type;
        this.item = item;
        this.recipe = recipe;
    }
    enum Type {Sprite, Weapon, AdvancedWeapon, Miscellaneous}

    public Type getType() {
        return type;
    }

    public FullItem getItem() {
        return item;
    }

    public Recipe getRecipe() {
        return recipe;
    }
}
