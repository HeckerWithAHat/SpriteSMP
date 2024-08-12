package gmail.aryanj1010.spritesmp.Items;

import gmail.aryanj1010.spritesmp.API.FullItem;
import org.bukkit.ChatColor;
import org.bukkit.Material;


// TODO: change/balance timings and cooldowns
/*
*
* Fire Sprite
* Heat Seeking: Shoots a red beam of fire at all visible enemies
* 60 second cooldown
*
* DONE
*
* Explosion Manipulation: Forms a 9 block orb of fire around you
* 120 second cooldown
*
* DONE
*
*
*
* Water Sprite
* 60% Water: Cause all visible enemies to start bleeding
* 60 second cooldown
*
* DONE
*
* Whirlpool: Creates a whirlpool around you that pulls in all nearby enemies
* 120 second cooldown
*
* DONE
*
*
*
* Air Sprite
* Slash 'n Dash: Propel yourself forward with a gust of wind
* 60 second cooldown
*
* DONE
*
* Not-So-Small Breeze: Sends your enemies flying backwards
* 120 second cooldown
*
* DONE
*
*
*
* Earth Sprite
* Feels like home: Use the earth around you to fortify you.
* 60 second cooldown
*
* DONE
*
* Atmosphere Of Annihilation: Create a 5 block radius of Toxic Gas around you
* 120 second cooldown
*
* DONE
*
*
*
* Thunder Sprite
* Bottled Rain: Summon a short thunderstorm globally
* 60 second cooldown
*
* DONE
*
* ThunderStruck: Call upon the sky's rage to Strike lightning on everyone around you
* 120 second cooldown
*
* DONE
*
*
*
* Frost Sprite
* Tundra's Revenge: shoots a barrage of freezing arrows that slow your enemies and deal damage
* 60 second cooldown
*
* DONE
*
* Bouncing Brr: Slow all nearby entities and freeze the ground. Effects get extended by each person in the area
* 120 second cooldown
*
* DONE
*
* Light Sprite
* Light Heal: Clear yourself of all ailments
* 60 second cooldown
*
* DONE
*
* Photosynthesis: Absorb the light around you to reinforce yourself
* 120 second cooldown
*
*  DONE
*
*
*
* Dark Sprite
* Domain Expansion: Shrouds the player in darkness blinding all nearby players
* 60 second cooldown
*
* DONE
*
* Crippling Corruption: Corrupt the area near you, withering you but freezing your enemies
* 120 second cooldown
*
* DONE
*
*
* Revival Sprite
*
*
* Reroll Sprite
* This mythic item will swap your sprite and replace it with a brand new one
*
*/
public enum items {
    // Sprite Items
    FireSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.DARK_RED + "Fire Sprite", new String[]{}, true, 1)),
    WaterSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.AQUA + "Water Sprite", new String[]{}, true, 2)),
    AirSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.GRAY + "Air Sprite", new String[]{}, true, 3)),
    EarthSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.DARK_GREEN + "Earth Sprite", new String[]{}, true, 4)),
    ThunderSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.YELLOW + "Thunder Sprite", new String[]{}, true, 5)),
    FrostSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.BLUE + "Frost Sprite", new String[]{}, true, 6)),
    LightSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.WHITE + "Light Sprite", new String[]{}, true, 7)),
    DarkSprite(Type.Sprite, new FullItem(Material.DIAMOND, 1, ChatColor.DARK_GRAY + "Dark Sprite", new String[]{}, true, 8)),
    // Basic Weapons
    FireSword(Type.Weapon, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.DARK_RED + "Basic Fire Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Heat Seeking:",
            ChatColor.WHITE+"Shoots a red beam of fire at all visible enemies",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Explosion Manipulation:",
            ChatColor.WHITE+"Forms a 9 block orb of fire around you",
            ChatColor.WHITE+"120 second cooldown"
    }, true, 1)),
    WaterSword(Type.Weapon, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.AQUA + "Basic Water Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"60% Water:",
            ChatColor.WHITE+"Cause all visible enemies to start bleeding",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Whirlpool:",
            ChatColor.WHITE+"Creates a whirlpool around you that pulls in all nearby enemies",
            ChatColor.WHITE+"120 second cooldown"
    }, true, 2)),
    AirSword(Type.Weapon, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.GRAY + "Basic Air Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Slash 'n Dash:",
            ChatColor.WHITE+"Propel yourself forward with a gust of wind",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Not-So-Small Breeze:",
            ChatColor.WHITE+"Sends your enemies flying backwards",
            ChatColor.WHITE+"120 second cooldown"
    }, true, 3)),
    EarthSword(Type.Weapon, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.DARK_GREEN + "Basic Earth Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Feels like home:",
            ChatColor.WHITE+"Absorb the energy around you to heal yourself. Leaves a mark",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Atmosphere Of Annihilation:",
            ChatColor.WHITE+"Create a 5 block radius of Toxic Gas around you",
            ChatColor.WHITE+"120 second cooldown"
    }, true, 4)),
    ThunderSword(Type.Weapon, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.YELLOW + "Basic Thunder Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Bottled Rain:",
            ChatColor.WHITE+"Summon a short thunderstorm around you",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"ThunderStruck:",
            ChatColor.WHITE+"Call upon the sky's rage to strike lightning on everyone around you",
            ChatColor.WHITE+"120 second cooldown"
    }, true, 5)),
    FrostSword(Type.Weapon, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.BLUE + "Basic Frost Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Tundra's Revenge:",
            ChatColor.WHITE+"Shoots a barrage of freezing arrows that slow your enemies and deal damage",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Bouncing Brr:",
            ChatColor.WHITE+"Slow all nearby entities and freeze the ground. Effects get extended by each person in the area",
            ChatColor.WHITE+"120 second cooldown"
    }, true, 6)),
    LightSword(Type.Weapon, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.WHITE + "Basic Light Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Light Heal:",
            ChatColor.WHITE+"Clear yourself of all ailments",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"PhotoSynthesis:",
            ChatColor.WHITE+"Absorb the light around you to reinforce yourself",
            ChatColor.WHITE+"120 second cooldown"
    }, true, 7)),
    DarkSword(Type.Weapon, new FullItem(Material.DIAMOND_SWORD, 1, ChatColor.DARK_GRAY + "Basic Dark Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Domain Expansion:",
            ChatColor.WHITE+"Shrouds the player in darkness blinding all nearby players",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Crippling Corruption:",
            ChatColor.WHITE+"Corrupt the area near you, withering you but freezing your enemies",
            ChatColor.WHITE+"120 second cooldown"
    }, true, 8)),



    // Advanced Weapons
    AdvancedFireSword(Type.AdvancedWeapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.DARK_RED + "Advanced Fire Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Heat Seeking:",
            ChatColor.WHITE+"Shoots a red beam of fire at all visible enemies",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Explosion Manipulation:",
            ChatColor.WHITE+"Forms a 15 block orb of fire around you",
            ChatColor.WHITE+"120 second cooldown"
    }, true, 1)),
    AdvancedWaterSword(Type.AdvancedWeapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.AQUA + "Advanced Water Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"60% Water:",
            ChatColor.WHITE+"Cause all visible enemies to start bleeding",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Whirlpool:",
            ChatColor.WHITE+"Creates a whirlpool around you that pulls in all nearby enemies",
            ChatColor.WHITE+"120 second cooldown"
    }, true, 2)),
    AdvancedAirSword(Type.AdvancedWeapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.GRAY + "Advanced Air Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Slash 'n Dash:",
            ChatColor.WHITE+"Propel yourself forward with a gust of wind",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Not-So-Small Breeze:",
            ChatColor.WHITE+"Sends your enemies flying backwards",
            ChatColor.WHITE+"120 second cooldown"
    }, true, 3)),
    AdvancedEarthSword(Type.AdvancedWeapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.DARK_GREEN + "Advanced Earth Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Feels like home:",
            ChatColor.WHITE+"Absorb the energy around you to heal yourself. Leaves a mark",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Atmosphere Of Annihilation:",
            ChatColor.WHITE+"Create a 9 block radius of Toxic Gas around you",
            ChatColor.WHITE+"120 second cooldown"
    }, true, 4)),
    AdvancedThunderSword(Type.AdvancedWeapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.YELLOW + "Advanced Thunder Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Bottled Rain:",
            ChatColor.WHITE+"Summon a short thunderstorm around you",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"ThunderStruck:",
            ChatColor.WHITE+"Call upon the sky's rage to strike lightning on everyone around you",
            ChatColor.WHITE+"120 second cooldown"
    }, true, 5)),
    AdvancedFrostSword(Type.AdvancedWeapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.BLUE + "Advanced Frost Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Tundra's Revenge:",
            ChatColor.WHITE+"Shoots a barrage of freezing arrows that slow your enemies and deal damage",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"Bouncing Brr:",
            ChatColor.WHITE+"Slow all nearby entities and freeze the ground. Effects get extended by each person in the area",
            ChatColor.WHITE+"120 second cooldown"
    }, true, 6)),
    AdvancedLightSword(Type.AdvancedWeapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.WHITE + "Advanced Light Sword", new String[]{
            ChatColor.WHITE+""+ChatColor.BOLD+"Light Heal:",
            ChatColor.WHITE+"Clear yourself of all ailments",
            ChatColor.WHITE+"60 second cooldown",
            "",
            ChatColor.WHITE+""+ChatColor.BOLD+"PhotoSynthesis:",
            ChatColor.WHITE+"Absorb the light around you to reinforce yourself",
            ChatColor.WHITE+"120 second cooldown"
    }, true, 7)),
  AdvancedDarkSword(Type.AdvancedWeapon, new FullItem(Material.NETHERITE_SWORD, 1, ChatColor.DARK_GRAY + "Advanced Dark Sword", new String[]{
          ChatColor.WHITE+""+ChatColor.BOLD+"Domain Expansion:",
          ChatColor.WHITE+"Shrouds the player in darkness blinding all nearby players",
          ChatColor.WHITE+"60 second cooldown",
          "",
          ChatColor.WHITE+""+ChatColor.BOLD+"Crippling Corruption:",
          ChatColor.WHITE+"Corrupt the area near you, withering you but freezing your enemies",
          ChatColor.WHITE+"120 second cooldown"
  }, true, 8)),

    // Miscellaneous

    RevivalSprite(Type.Miscellaneous, new FullItem(Material.IRON_INGOT, 1, ChatColor.YELLOW + "Revival Sprite", new String[]{}, true, 1)),
    RerollSprite(Type.Miscellaneous, new FullItem(Material.IRON_INGOT, 1, "Reroll Sprite", new String[]{"This mythic item will swap your sprite ","and replace it with a brand new one"}, true, 2));


    //Event Items



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
