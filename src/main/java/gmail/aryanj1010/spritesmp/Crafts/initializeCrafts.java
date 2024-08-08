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
    public static CraftingTableCraft thunderSword = new CraftingTableCraft(ThunderSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(ThunderSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.GOLD_BLOCK),
            new ExactChoice(ThunderSprite.getFullItem().getItem()),
            new MaterialChoice(Material.GOLD_BLOCK)}, "thundersword");
    public static CraftingTableCraft frostSword = new CraftingTableCraft(FrostSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(FrostSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.GOLD_BLOCK),
            new ExactChoice(FrostSprite.getFullItem().getItem()),
            new MaterialChoice(Material.GOLD_BLOCK)}, "frostsword");
    public static CraftingTableCraft lightSword = new CraftingTableCraft(LightSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(LightSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.GOLD_BLOCK),
            new ExactChoice(LightSprite.getFullItem().getItem()),
            new MaterialChoice(Material.GOLD_BLOCK)}, "lightsword");
    public static CraftingTableCraft darkSword = new CraftingTableCraft(DarkSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(DarkSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.GOLD_BLOCK),
            new ExactChoice(DarkSprite.getFullItem().getItem()),
            new MaterialChoice(Material.GOLD_BLOCK)}, "darksword");



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
    public static CraftingTableCraft advancedThunderSword = new CraftingTableCraft(AdvancedThunderSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(ThunderSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(ThunderSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(ThunderSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(ThunderSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT)}, "advancedthundersword");
    public static CraftingTableCraft advancedFrostSword = new CraftingTableCraft(AdvancedFrostSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(FrostSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(FrostSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(FrostSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(FrostSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT)}, "advancedfrostsword");
    public static CraftingTableCraft advancedLightSword = new CraftingTableCraft(AdvancedLightSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(LightSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(LightSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(LightSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(LightSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT)}, "advancedlightsword");
    public static CraftingTableCraft advancedDarkSword = new CraftingTableCraft(AdvancedDarkSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(DarkSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(DarkSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(DarkSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(DarkSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT)}, "advanceddarksword");


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
    public static CraftingTableCraft fireSprite = new CraftingTableCraft(FireSprite.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.LAVA_BUCKET),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT)}, "firesprite");
    public static CraftingTableCraft waterSprite = new CraftingTableCraft(WaterSprite.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.WATER_BUCKET),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT)}, "watersprite");
    public static CraftingTableCraft earthSprite = new CraftingTableCraft(EarthSprite.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.OBSIDIAN),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT)}, "earthsprite");
    public static CraftingTableCraft airSprite = new CraftingTableCraft(AirSprite.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.GLASS),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT)}, "airsprite");
    public static CraftingTableCraft thunderSprite = new CraftingTableCraft(ThunderSprite.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.COPPER_BLOCK),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT)}, "thundersprite");
    public static CraftingTableCraft frostSprite = new CraftingTableCraft(FrostSprite.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.ICE),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT)}, "frostsprite");
    public static CraftingTableCraft lightSprite = new CraftingTableCraft(LightSprite.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.GLOWSTONE),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT)}, "lightsprite");
    public static CraftingTableCraft darkSprite = new CraftingTableCraft(DarkSprite.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.TINTED_GLASS),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT)}, "darksprite");




}
