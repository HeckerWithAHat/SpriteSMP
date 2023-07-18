package gmail.aryanj1010.spritesmp.Crafts;

import gmail.aryanj1010.spritesmp.API.CraftingTableCraft;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice.ExactChoice;
import org.bukkit.inventory.ShapedRecipe;

import java.util.Arrays;
import java.util.List;

import static gmail.aryanj1010.spritesmp.Items.items.*;

public class initializeCrafts {

    static List<ItemStack> sprites = Arrays.asList(FireSprite.getItem().getItem(), WaterSprite.getItem().getItem(), AirSprite.getItem().getItem(), EarthSprite.getItem().getItem());

    public static ShapedRecipe fireSword = new CraftingTableCraft(FireSword.getItem().getItem(), new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(FireSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK)),
            new ExactChoice(FireSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK))}).getRecipe();
    public static ShapedRecipe waterSword = new CraftingTableCraft(WaterSword.getItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(WaterSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK)),
            new ExactChoice(WaterSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK))}).getRecipe();
    public static ShapedRecipe airSword = new CraftingTableCraft(AirSword.getItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(AirSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK)),
            new ExactChoice(AirSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK))}).getRecipe();
    public static ShapedRecipe earthSword = new CraftingTableCraft(EarthSword.getItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(EarthSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK)),
            new ExactChoice(EarthSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK))}).getRecipe();



    public static ShapedRecipe advancedFireSword = new CraftingTableCraft(AdvancedFireSword.getItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(FireSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(FireSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(FireSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(FireSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT))}).getRecipe();
    public static ShapedRecipe advancedWaterSword = new CraftingTableCraft(AdvancedWaterSword.getItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(WaterSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(WaterSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(WaterSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(WaterSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT))}).getRecipe();
    public static ShapedRecipe advancedAirSword = new CraftingTableCraft(AdvancedAirSword.getItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(AirSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(AirSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(AirSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(AirSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT))}).getRecipe();
    public static ShapedRecipe advancedEarthSword = new CraftingTableCraft(AdvancedEarthSword.getItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(EarthSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(EarthSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(EarthSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(EarthSprite.getItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT))}).getRecipe();



    public static ShapedRecipe revivalSprite = new CraftingTableCraft(RevivalSprite.getItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(sprites),
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(sprites),
            new ExactChoice(new ItemStack(Material.NETHER_STAR)),
            new ExactChoice(sprites),
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(sprites),
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK))}).getRecipe();
     public static ShapedRecipe rerollSprite = new CraftingTableCraft(RerollSprite.getItem().getItem(),new ExactChoice[]{
             new ExactChoice(sprites),
             new ExactChoice(sprites),
             new ExactChoice(sprites),
             new ExactChoice(sprites),
             new ExactChoice(sprites),
             new ExactChoice(sprites),
             new ExactChoice(sprites),
             new ExactChoice(sprites),
             new ExactChoice(sprites)}).getRecipe();


}
