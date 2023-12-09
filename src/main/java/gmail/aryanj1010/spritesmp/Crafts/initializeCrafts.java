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
            new ExactChoice(FireBlade.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(FireSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(FireSprite.getFullItem().getItem()),
            new MaterialChoice(Material.GOLD_BLOCK),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.GOLD_BLOCK)}, "firesword");
    public static CraftingTableCraft waterSword = new CraftingTableCraft(WaterSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(WaterBlade.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(WaterSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(WaterSprite.getFullItem().getItem()),
            new MaterialChoice(Material.GOLD_BLOCK),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.GOLD_BLOCK)}, "watersword");
    public static CraftingTableCraft airSword = new CraftingTableCraft(AirSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(AirBlade.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(AirSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(AirSprite.getFullItem().getItem()),
            new MaterialChoice(Material.GOLD_BLOCK),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.GOLD_BLOCK)}, "airsword");
    public static CraftingTableCraft earthSword = new CraftingTableCraft(EarthSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(EarthBlade.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(EarthSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(EarthSprite.getFullItem().getItem()),
            new MaterialChoice(Material.GOLD_BLOCK),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.GOLD_BLOCK)}, "earthsword");
    public static CraftingTableCraft shadowSword = new CraftingTableCraft(ShadowSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(ShadowBlade.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(ShadowSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(ShadowSprite.getFullItem().getItem()),
            new MaterialChoice(Material.GOLD_BLOCK),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.GOLD_BLOCK)}, "shadowsword");
    public static CraftingTableCraft glowSword = new CraftingTableCraft(GlowSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(GlowBlade.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new ExactChoice(GlowSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(GlowSprite.getFullItem().getItem()),
            new MaterialChoice(Material.GOLD_BLOCK),
            new MaterialChoice(Material.EMERALD_BLOCK),
            new MaterialChoice(Material.GOLD_BLOCK)}, "glowsword");



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
    public static CraftingTableCraft advancedShadowSword = new CraftingTableCraft(AdvancedShadowSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(ShadowSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(ShadowSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(ShadowSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(ShadowSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT)}, "advancedshadowsword");
    public static CraftingTableCraft advancedGlowSword = new CraftingTableCraft(AdvancedGlowSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(GlowSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(GlowSprite.getFullItem().getItem()),
            new MaterialChoice(Material.DIAMOND_SWORD),
            new ExactChoice(GlowSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(GlowSprite.getFullItem().getItem()),
            new MaterialChoice(Material.NETHERITE_INGOT)}, "advancedglowsword");

    public static CraftingTableCraft endSword = new CraftingTableCraft(EndSword.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(sprites),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(sprites),
            new MaterialChoice(Material.DRAGON_EGG),
            new ExactChoice(sprites),
            new MaterialChoice(Material.NETHERITE_INGOT),
            new ExactChoice(sprites),
            new MaterialChoice(Material.NETHERITE_INGOT)}, "endsword");

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
            new MaterialChoice(Material.GRASS_BLOCK),
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
    public static CraftingTableCraft shadowSprite = new CraftingTableCraft(ShadowSprite.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.OBSIDIAN),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT)}, "shadowsprite");
    public static CraftingTableCraft glowSprite = new CraftingTableCraft(GlowSprite.getFullItem().getItem(),new RecipeChoice[]{
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.GLOWSTONE),
            new MaterialChoice(Material.DIAMOND_BLOCK),
            new MaterialChoice(Material.IRON_INGOT),
            new MaterialChoice(Material.WITHER_SKELETON_SKULL),
            new MaterialChoice(Material.IRON_INGOT)}, "glowsprite");
}
