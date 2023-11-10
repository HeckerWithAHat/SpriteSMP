package gmail.aryanj1010.spritesmp.Items;

import gmail.aryanj1010.spritesmp.API.CraftingTableCraft;
import gmail.aryanj1010.spritesmp.API.FullItem;
import gmail.aryanj1010.spritesmp.Crafts.initializeCrafts;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;

import gmail.aryanj1010.spritesmp.Crafts.initializeCrafts.*;

import static gmail.aryanj1010.spritesmp.Crafts.initializeCrafts.*;


public enum items {
    FireSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.DARK_RED + "Fire Sprite", new String[]{}, true, 1)),
    WaterSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.AQUA + "Water Sprite", new String[]{}, true, 2)),
    AirSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.GRAY + "Air Sprite", new String[]{}, true, 3)),
    EarthSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.DARK_GREEN + "Earth Sprite", new String[]{}, true, 4)),

    FireSword(Type.Weapon, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.DARK_RED + "Basic Fire Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Shoots a red beam of fire at your enemy",
            ChatColor.WHITE+"dealing 4 hearts of damage",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Right Click:",
            ChatColor.WHITE+"Forms a fire field around you",
            ChatColor.WHITE+"with a 4x4 radius",
            ChatColor.WHITE+"30 second cooldown"}, true, 1)),
    WaterSword(Type.Weapon, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.AQUA + "Basic Water Sword", new String[]{ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Shoots a stream of bubbles at your enemy (only visible in water)",
            ChatColor.WHITE+"dealing 3 hearts of damage",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Right click:",
            ChatColor.WHITE+"The user will receive speed 3 and strength 3",
            ChatColor.WHITE+"when in water",
            ChatColor.WHITE+"120 second cooldown"}, true, 2)),
    AirSword(Type.Weapon, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.GRAY + "Basic Air Sword", new String[]{ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Sends your enemies",
            ChatColor.WHITE+"flying backwards",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Right click:",
            ChatColor.WHITE+"Gives the user flight",
            ChatColor.WHITE+"for 5 seconds",
            ChatColor.WHITE+"120 second cooldown"}, true, 3)),
    EarthSword(Type.Weapon, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.DARK_GREEN + "Basic Earth Sword", new String[]{ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Click on a block to pick up and aim",
            ChatColor.WHITE+"click again to fire",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Right click:",
            ChatColor.WHITE+"Gives the player",
            ChatColor.WHITE+"Strength 2 and Speed 2",
            ChatColor.WHITE+"120 second cooldown"}, true, 4)),

    AdvancedFireSword(Type.AdvancedWeapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.DARK_RED + "Advanced Fire Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+" Shoots a large red beam of fire at your enemy",
            ChatColor.WHITE+" dealing 6 hearts of damage",
            ChatColor.WHITE+"60 second cooldwon",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Right click:",
            ChatColor.WHITE+" Summons a meteor strike which drops",
            ChatColor.WHITE+"4 meteors from the sky ",
            ChatColor.WHITE+"120 second cooldown"}, true, 1)),
    AdvancedWaterSword(Type.AdvancedWeapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.AQUA + "Advanced Water Sword", new String[]{ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Shoots a stream of bubbles at your enemy (only visible in water)",
            ChatColor.WHITE+"dealing 5 hearts of damage",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Right click:",
            ChatColor.WHITE+"Freezes the clicked player for 10 seconds",
            ChatColor.WHITE+"and gives speed and strength 2",
            ChatColor.WHITE+"120 second cooldown"}, true, 2)),
    AdvancedAirSword(Type.AdvancedWeapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.GRAY + "Advanced Air Sword", new String[]{ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Sends your enemies",
            ChatColor.WHITE+"flying backwards",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Right click:",
            ChatColor.WHITE+"Strike down a bolt of lightning",
            ChatColor.WHITE+"Useful with Mobs",
            ChatColor.WHITE+"180 second cooldown"}, true, 3)),
    AdvancedEarthSword(Type.AdvancedWeapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.DARK_GREEN + "Advanced Earth Sword", new String[]{ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Click on a block to pick up and aim",
            ChatColor.WHITE+"click again to fire",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Right click:",
            ChatColor.WHITE+"Gives the player",
            ChatColor.WHITE+"Strength 2 and Speed 2",
            ChatColor.WHITE+"120 second cooldown"}, true, 4)),

    EndSword(Type.Weapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.BLACK + "" + ChatColor.BOLD + "End Sword", new String[] {ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Shoot Dragon's Breath",
            ChatColor.WHITE+"5 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Right click:",
            ChatColor.WHITE+"Launches the User into the Air",
            ChatColor.WHITE+"And allows temporary Gliding",
            ChatColor.WHITE+"240 second cooldown"}, true, 5)),

    RevivalSprite(Type.Miscellaneous, new FullItem(Material.IRON_INGOT, 1, ChatColor.YELLOW + "Revival Sprite", new String[]{}, true, 1)),
    RerollSprite(Type.Miscellaneous, new FullItem(Material.IRON_INGOT, 1, "Reroll Sprite", new String[]{"This mythic item will swap your sprite ","and replace it with a brand new one"}, true, 2));

    final Type type;
    final FullItem item;

    items(Type type, FullItem item) {
        this.type = type;
        this.item = item;
    }
    enum Type {Sprite, Weapon, AdvancedWeapon, Miscellaneous}

    public Type getType() {
        return type;
    }

    public FullItem getFullItem() {
        return item;
    }


}
