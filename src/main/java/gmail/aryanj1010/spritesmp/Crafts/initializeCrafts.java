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

    static List<ItemStack> sprites = Arrays.asList(FireSprite.getFullItem().getItem(), WaterSprite.getFullItem().getItem(), AirSprite.getFullItem().getItem(), EarthSprite.getFullItem().getItem());

    public static CraftingTableCraft fireSword = new CraftingTableCraft(FireSword.getFullItem().getItem(), new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(FireSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK)),
            new ExactChoice(FireSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK))});
    public static CraftingTableCraft waterSword = new CraftingTableCraft(WaterSword.getFullItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(WaterSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK)),
            new ExactChoice(WaterSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK))});
    public static CraftingTableCraft airSword = new CraftingTableCraft(AirSword.getFullItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(AirSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK)),
            new ExactChoice(AirSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK))});
    public static CraftingTableCraft earthSword = new CraftingTableCraft(EarthSword.getFullItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(EarthSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK)),
            new ExactChoice(EarthSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.GOLD_BLOCK))});



    public static CraftingTableCraft advancedFireSword = new CraftingTableCraft(AdvancedFireSword.getFullItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(FireSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(FireSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(FireSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(FireSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT))});
    public static CraftingTableCraft advancedWaterSword = new CraftingTableCraft(AdvancedWaterSword.getFullItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(WaterSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(WaterSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(WaterSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(WaterSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT))});
    public static CraftingTableCraft advancedAirSword = new CraftingTableCraft(AdvancedAirSword.getFullItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(AirSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(AirSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(AirSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(AirSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT))});
    public static CraftingTableCraft advancedEarthSword = new CraftingTableCraft(AdvancedEarthSword.getFullItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(EarthSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(EarthSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.DIAMOND_SWORD)),
            new ExactChoice(EarthSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
            new ExactChoice(EarthSprite.getFullItem().getItem()),
            new ExactChoice(new ItemStack(Material.NETHERITE_INGOT))});



    public static CraftingTableCraft revivalSprite = new CraftingTableCraft(RevivalSprite.getFullItem().getItem(),new ExactChoice[]{
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(sprites),
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(sprites),
            new ExactChoice(new ItemStack(Material.NETHER_STAR)),
            new ExactChoice(sprites),
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)),
            new ExactChoice(sprites),
            new ExactChoice(new ItemStack(Material.DIAMOND_BLOCK))});
     public static CraftingTableCraft rerollSprite = new CraftingTableCraft(RerollSprite.getFullItem().getItem(),new ExactChoice[]{
             new ExactChoice(new ItemStack(Material.EMERALD_BLOCK)),
             new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
             new ExactChoice(new ItemStack(Material.GOLD_BLOCK)),
             new ExactChoice(sprites),
             new ExactChoice(new ItemStack(Material.TOTEM_OF_UNDYING)),
             new ExactChoice(sprites),
             new ExactChoice(new ItemStack(Material.GOLD_BLOCK)),
             new ExactChoice(new ItemStack(Material.NETHERITE_INGOT)),
             new ExactChoice(new ItemStack(Material.EMERALD_BLOCK))});


}
