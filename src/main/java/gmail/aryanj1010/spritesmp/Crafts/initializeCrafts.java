package gmail.aryanj1010.spritesmp.Crafts;

import gmail.aryanj1010.spritesmp.API.CraftingTableCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.RecipeChoice.ExactChoice;
import org.bukkit.inventory.RecipeChoice.MaterialChoice;
import org.bukkit.inventory.ShapedRecipe;

import java.util.Arrays;
import java.util.List;

import static gmail.aryanj1010.spritesmp.Items.items.*;

public class initializeCrafts {

    static List<ItemStack> sprites = Arrays.asList(FireSprite.getFullItem().getItem(), WaterSprite.getFullItem().getItem(), AirSprite.getFullItem().getItem(), EarthSprite.getFullItem().getItem());

    public static CraftingTableCraft fireSword = new CraftingTableCraft(FireSword.getFullItem().getItem(), new RecipeChoice[]{
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(FireSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.GOLD_BLOCK),
            new ExactChoice(FireSprite.getFullItem().getItem()),
            new MaterialChoice(Material.GOLD_BLOCK)}, "firesword");
    public static CraftingTableCraft waterSword = new CraftingTableCraft(WaterSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(WaterSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.GOLD_BLOCK),
            new ExactChoice(WaterSprite.getFullItem().getItem()),
            new MaterialChoice(Material.GOLD_BLOCK)}, "watersword");
    public static CraftingTableCraft airSword = new CraftingTableCraft(AirSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(AirSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.GOLD_BLOCK),
            new ExactChoice(AirSprite.getFullItem().getItem()),
            new MaterialChoice(Material.GOLD_BLOCK)}, "airsword");
    public static CraftingTableCraft earthSword = new CraftingTableCraft(EarthSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(EarthSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.GOLD_BLOCK),
            new ExactChoice(EarthSprite.getFullItem().getItem()),
            new MaterialChoice(Material.GOLD_BLOCK)}, "earthsword");



    public static CraftingTableCraft advancedFireSword = new CraftingTableCraft(AdvancedFireSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(FireSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(FireSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(FireSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(FireSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT)}, "advancedfiresword");
    public static CraftingTableCraft advancedWaterSword = new CraftingTableCraft(AdvancedWaterSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(WaterSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(WaterSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(WaterSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(WaterSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT)}, "advancedwatersword");
    public static CraftingTableCraft advancedAirSword = new CraftingTableCraft(AdvancedAirSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(AirSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(AirSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(AirSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(AirSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT)}, "advancedairsword");
    public static CraftingTableCraft advancedEarthSword = new CraftingTableCraft(AdvancedEarthSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(EarthSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(EarthSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(EarthSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(EarthSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT)}, "advancedearthsword");



    public static CraftingTableCraft revivalSprite = new CraftingTableCraft(RevivalSprite.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(sprites),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(sprites),
            new MaterialChoice(Material.NETHER_STAR),
            new ExactChoice(sprites),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(sprites),
            new MaterialChoice(Material.DIAMOND_BLOCK)}, "revivalsprite");
     public static CraftingTableCraft rerollSprite = new CraftingTableCraft(RerollSprite.getFullItem().getItem(),new RecipeChoice[]{
             new MaterialChoice(Material.EMERALD_BLOCK),
             new MaterialChoice(Material.NETHERITE_INGOT),
             new MaterialChoice(Material.GOLD_BLOCK),
             new ExactChoice(sprites),
             new MaterialChoice(Material.TOTEM_OF_UNDYING),
             new ExactChoice(sprites),
             new MaterialChoice(Material.GOLD_BLOCK),
             new MaterialChoice(Material.NETHERITE_INGOT),
             new MaterialChoice(Material.EMERALD_BLOCK)}, "rerollsprite");


}
