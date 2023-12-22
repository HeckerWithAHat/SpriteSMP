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
    // Sprite Items
    FireSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.DARK_RED + "Fire Sprite", new String[]{}, true, 1)),
    WaterSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.AQUA + "Water Sprite", new String[]{}, true, 2)),
    AirSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.GRAY + "Air Sprite", new String[]{}, true, 3)),
    EarthSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.DARK_GREEN + "Earth Sprite", new String[]{}, true, 4)),
    ShadowSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.DARK_GRAY + "Shadow Sprite", new String[]{}, true, 5)),
    GlowSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.YELLOW + "Glow Sprite", new String[]{}, true, 6)),

    // Basic Weapons
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
            ChatColor.WHITE+"Shoots a stream of bubbles at your enemy",
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
    ShadowSword(Type.Weapon, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.DARK_GRAY + "Basic Shadow Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Click on a Player and Give them",
            ChatColor.WHITE+"Blindness for 10 seconds",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Right click:",
            ChatColor.WHITE+"Become a shadow and go completely invisible",
            ChatColor.WHITE+"for 20 seconds",
            ChatColor.WHITE+"120 second cooldown"}, true, 5)),
    GlowSword(Type.Weapon, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.YELLOW + "Basic Glow Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Click on a player to mark them",
            ChatColor.WHITE+"for 10 seconds",
            ChatColor.WHITE+"dealing 10% more damage from a glow sword",
            ChatColor.WHITE+"Only one player may be marked",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Right click:",
            ChatColor.WHITE+"Heals the Player",
            ChatColor.WHITE+"by 5 hearts",
            ChatColor.WHITE+"120 second cooldown"}, true, 6)),





    // Advanced Weapons
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
    AdvancedShadowSword(Type.AdvancedWeapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.DARK_GRAY + "Advanced Shadow Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Click on a Player and Give them",
            ChatColor.WHITE+"Blindness for 15 seconds",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Right click:",
            ChatColor.WHITE+"Become a shadow and go completely invisible",
            ChatColor.WHITE+"for 30 seconds",
            ChatColor.WHITE+"120 second cooldown"}, true, 5)),
    AdvancedGlowSword(Type.AdvancedWeapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.YELLOW + "Advanced Glow Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Click on a player to mark them",
            ChatColor.WHITE+"for 20 seconds",
            ChatColor.WHITE+"dealing 10% more damage from a glow sword",
            ChatColor.WHITE+"Only one player may be marked",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Right click:",
            ChatColor.WHITE+"Heals the Player",
            ChatColor.WHITE+"to full HP",
            ChatColor.WHITE+"120 second cooldown"}, true, 6)),


    // Pickaxes
    FirePickaxe(Type.Pickaxe, new FullItem(Material.DIAMOND_PICKAXE, 1, ChatColor.DARK_RED + "Fire Pickaxe", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Autosmelt anything you break",
            ChatColor.WHITE+"for 10 seconds",
            ChatColor.WHITE+"60 second cooldown"
    }, true, 1)),
    WaterPickaxe(Type.Pickaxe, new FullItem(Material.DIAMOND_PICKAXE, 1, ChatColor.AQUA + "Water Pickaxe", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Dig faster when in water",
            ChatColor.WHITE+"for 10 seconds",
            ChatColor.WHITE+"60 second cooldown"
    }, true, 2)),
    AirPickaxe(Type.Pickaxe, new FullItem(Material.DIAMOND_PICKAXE, 1, ChatColor.GRAY + "Air Pickaxe", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Temporarily increases digging speed",
            ChatColor.WHITE+"and jump height",
            ChatColor.WHITE+"for 10 seconds",
            ChatColor.WHITE+"60 second cooldown"
    }, true, 3)),
    EarthPickaxe(Type.Pickaxe, new FullItem(Material.DIAMOND_PICKAXE, 1, ChatColor.DARK_GREEN + "Earth Pickaxe", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Doubles all dropped items",
            ChatColor.WHITE+"for 10 seconds",
            ChatColor.WHITE+"60 second cooldown"
    }, true, 4)),
    ShadowPickaxe(Type.Pickaxe, new FullItem(Material.DIAMOND_PICKAXE, 1, ChatColor.DARK_GRAY + "Shadow Pickaxe", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Gives the player instant mining",
            ChatColor.WHITE+"for 5 seconds",
            ChatColor.WHITE+"60 second cooldown"
    }, true, 5)),
    GlowPickaxe(Type.Pickaxe, new FullItem(Material.DIAMOND_PICKAXE, 1, ChatColor.YELLOW + "Glow Pickaxe", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Allows the pickaxe to temporarily mine blocks in parallel universes",
            ChatColor.WHITE+"yielding additional resources with each block",
            ChatColor.WHITE+"for 10 seconds",
            ChatColor.WHITE+"60 second cooldown"
    }, true, 6)),

    // Shovels
    FireShovel(Type.Shovel, new FullItem(Material.DIAMOND_SHOVEL, 1, ChatColor.DARK_RED + "Fire Shovel", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Triggers a powerful eruption from the shovel",
            ChatColor.WHITE+"That clears blocks in a 5 block radius",
            ChatColor.WHITE+"60 second cooldown"
    }, true, 1)),
    WaterShovel(Type.Shovel, new FullItem(Material.DIAMOND_SHOVEL, 1, ChatColor.AQUA + "Water Shovel", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Has a chance to drop an item",
            ChatColor.WHITE+"when breaking a block",
            ChatColor.WHITE+"for 10 seconds",
            ChatColor.WHITE+"60 second cooldown"
    }, true, 2)),
    AirShovel(Type.Shovel, new FullItem(Material.DIAMOND_SHOVEL, 1, ChatColor.GRAY + "Air Shovel", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Teleports all items in a 10 block radius",
            ChatColor.WHITE+"into the player's inventory",
            ChatColor.WHITE+"60 second cooldown"
    }, true, 3)),
    EarthShovel(Type.Shovel, new FullItem(Material.DIAMOND_SHOVEL, 1, ChatColor.DARK_GREEN + "Earth Shovel", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Generates a sphere of dirt",
            ChatColor.WHITE+"at the clicked location",
            ChatColor.WHITE+"60 second cooldown"
    }, true, 4)),
    ShadowShovel(Type.Shovel, new FullItem(Material.DIAMOND_SHOVEL, 1, ChatColor.DARK_GRAY + "Shadow Shovel", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Mined blocks infect their neighbors",
            ChatColor.WHITE+"digging in a 3x3",
            ChatColor.WHITE+"for 20 seconds",
            ChatColor.WHITE+"60 second cooldown"
    }, true, 5)),
    GlowShovel(Type.Shovel, new FullItem(Material.DIAMOND_SHOVEL, 1, ChatColor.YELLOW + "Glow Shovel", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Increases the player's mining speed",
            ChatColor.WHITE+"for 20 seconds",
            ChatColor.WHITE+"60 second cooldown"
    }, true, 6)),

    // Blade Fragments
    FireBladeFragment(Type.BladeFragment, new FullItem(Material.GOLD_INGOT, 1, ChatColor.DARK_RED + "Fire Blade Fragment", new String[]{}, true, 1)),
    WaterBladeFragment(Type.BladeFragment, new FullItem(Material.GOLD_INGOT, 1, ChatColor.AQUA + "Water Blade Fragment", new String[]{}, true, 2)),
    AirBladeFragment(Type.BladeFragment, new FullItem(Material.GOLD_INGOT, 1, ChatColor.GRAY + "Air Blade Fragment", new String[]{}, true, 3)),
    EarthBladeFragment(Type.BladeFragment, new FullItem(Material.GOLD_INGOT, 1, ChatColor.DARK_GREEN + "Earth Blade Fragment", new String[]{}, true, 4)),
    ShadowBladeFragment(Type.BladeFragment, new FullItem(Material.GOLD_INGOT, 1, ChatColor.DARK_GRAY + "Shadow Blade Fragment", new String[]{}, true, 5)),
    GlowBladeFragment(Type.BladeFragment, new FullItem(Material.GOLD_INGOT, 1, ChatColor.YELLOW + "Glow Blade Fragment", new String[]{}, true, 6)),

    // Blades
    FireBlade(Type.Blade, new FullItem(Material.NETHERITE_SCRAP, 1, ChatColor.DARK_RED + "Fire Blade", new String[]{}, true, 1)),
    WaterBlade(Type.Blade, new FullItem(Material.NETHERITE_SCRAP, 1, ChatColor.AQUA + "Water Blade", new String[]{}, true, 2)),
    AirBlade(Type.Blade, new FullItem(Material.NETHERITE_SCRAP, 1, ChatColor.GRAY + "Air Blade", new String[]{}, true, 3)),
    EarthBlade(Type.Blade, new FullItem(Material.NETHERITE_SCRAP, 1, ChatColor.DARK_GREEN + "Earth Blade", new String[]{}, true, 4)),
    ShadowBlade(Type.Blade, new FullItem(Material.NETHERITE_SCRAP, 1, ChatColor.DARK_GRAY + "Shadow Blade", new String[]{}, true, 5)),
    GlowBlade(Type.Blade, new FullItem(Material.NETHERITE_SCRAP, 1, ChatColor.YELLOW + "Glow Blade", new String[]{}, true, 6)),


    EndSword(Type.Weapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.BLACK + "" + ChatColor.BOLD + "End Sword", new String[] {ChatColor.WHITE+""+ChatColor.BOLD+"Right Click:",
            ChatColor.WHITE+"Shoot Dragon's Breath",
            ChatColor.WHITE+"5 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Right click:",
            ChatColor.WHITE+"Launches the User into the Air",
            ChatColor.WHITE+"And allows temporary Gliding",
            ChatColor.WHITE+"240 second cooldown"}, true, 7)),

    // Miscellaneous

    RevivalSprite(Type.Miscellaneous, new FullItem(Material.IRON_INGOT, 1, ChatColor.YELLOW + "Revival Sprite", new String[]{}, true, 1)),
    RerollSprite(Type.Miscellaneous, new FullItem(Material.IRON_INGOT, 1, "Reroll Sprite", new String[]{"This mythic item will swap your sprite ","and replace it with a brand new one"}, true, 2)),


    //Event Items

    TomeOfArcanes(Type.AdvancedWeapon, new FullItem(Material.BOOK, 1, ChatColor.BOLD + "Tome of Arcanes", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Left Click:",
            ChatColor.WHITE+"Freezes the player you are looking at",
            ChatColor.WHITE+"and gives user speed and strength 2",
            ChatColor.WHITE+"120 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Left click:",
            ChatColor.WHITE+"Summons a meteor strike which drops",
            ChatColor.WHITE+"8 meteors from the sky",
            ChatColor.WHITE+"120 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Right click:",
            ChatColor.WHITE+"Sends your enemies",
            ChatColor.WHITE+"flying backwards",
            ChatColor.WHITE+"120 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Shift Right click:",
            ChatColor.WHITE+"Gives the player",
            ChatColor.WHITE+"Strength 2 and Speed 2",
            ChatColor.WHITE+"120 second cooldown"}, true, 1)),
    EightSidesOfChance(Type.AdvancedWeapon, new FullItem(Material.NETHER_STAR, 1, ChatColor.BOLD + "Eight Sides of Chance", new String[]{
            ChatColor.WHITE+"Throw and Take a Gamble",
            ChatColor.WHITE+""+ChatColor.BOLD+"Outcomes:",
            ChatColor.WHITE+"120 second cooldown",
            ChatColor.WHITE+"120 second cooldown",
            ChatColor.WHITE+"120 second cooldown",
            ChatColor.WHITE+"120 second cooldown",
            ChatColor.WHITE+"120 second cooldown",
            ChatColor.WHITE+"120 second cooldown",
            ChatColor.WHITE+"120 second cooldown",
            ChatColor.WHITE+"120 second cooldown",
            "",
            ChatColor.WHITE+"PRESS Q TO USE",
    },true, 1));

    final Type type;
    final FullItem item;

    items(Type type, FullItem item) {
        this.type = type;
        this.item = item;
    }
    enum Type {Sprite, Weapon, AdvancedWeapon, Miscellaneous, BladeFragment, Blade, Pickaxe, Shovel}

    public Type getType() {
        return type;
    }

    public FullItem getFullItem() {
        return item;
    }


}
