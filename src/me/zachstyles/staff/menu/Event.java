package me.zachstyles.staff.menu;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.zachstyles.staff.inv.InvCreator;
import me.zachstyles.staff.inv.InvNames;
import me.zachstyles.staff.items.items;

public class Event implements Listener
{
    int killed;
	String prefix;
    int SpigotDownloads;
    int varCharHashMap;
    String DoubleArrow;
    String Creative;
    String Survival;
    String Spectator;
    String Adventure;
    String Heal;
    String Feed;
    String WhitelistON;
    String WhitelistOFF;
    String WeatherRain;
    String WeatherClear;
    String TimeSixAM;
    String TimeSevenAM;
    String TimeEightAM;
    String TimeNineAM;
    String TimeTenAM;
    String TimeElevenAM;
    String TimeTwelvePM;
    String TimeOnePM;
    String TimeTwoPM;
    String TimeThreePM;
    String TimeFourPM;
    String TimeFivePM;
    String TimeSixPM;
    String TimeSevenPM;
    String TimeEightPM;
    String TimeNinePM;
    String TimeTenPM;
    String TimeElevenPM;
    String TimeTwelveAM;
    String TimeOneAM;
    String TimeTwoAM;
    String TimeThreeAM;
    String TimeFourAM;
    String TimeFiveAM;
    String MainMenu;
    String FlyON;
    String FlyOFF;
    String ClearInv;
    String SpeedMenu;
    String JumpMenu;
    String Speed1;
    String Speed2;
    String Speed3;
    String Speed4;
    String Speed5;
    String Speed6;
    String Speed7;
    String Speed8;
    String Jump1;
    String Jump2;
    String Jump3;
    String Jump4;
    String Jump5;
    String Jump6;
    String Jump7;
    String Jump8;
    String EffectsClear;
    String MobMenu;
    String ExtraMobMenu;
    String SpawnCreeper;
    String SpawnSpider;
    String SpawnSkeleton;
    String SpawnZombie;
    String SpawnSlime;
    String SpawnGhast;
    String SpawnZombiePig;
    String SpawnEnderman;
    String SpawnCaveSpider;
    String SpawnSilverfish;
    String SpawnBlaze;
    String SpawnMagmaCube;
    String SpawnBat;
    String SpawnWitch;
    String SpawnPig;
    String SpawnSheep;
    String SpawnCow;
    String SpawnChicken;
    String SpawnSquid;
    String SpawnWolf;
    String SpawnMushroom;
    String SpawnOcelot;
    String SpawnHorse;
    String SpawnVillager;
    String SpawnIronGolem;
    String SpawnSnowGolem;
    String SpawnGiant;
    String SpawnWither;
    String SpawnEnderDragon;
    String Invisibility;
    String WatherBreathing;
    String NightVision;
    String Slowness;
    String StrengthMenu;
    String Strength1;
    String Strength2;
    String Strength3;
    String Strength4;
    String Strength5;
    String Strength6;
    String Strength7;
    String Strength8;
    String VanishON;
    String VanishOFF;
    String servermanager;
    String ServerManagerMenu;
    String SpawnRabbit;
    String SpawnGuardian;
    String AdminSword;
    String AdminBow;
    String AdminStick;
    String AdminItemMenu;
    String DifficultyPeace;
    String DifficultyEasy;
    String DifficultyNormal;
    String DifficultyHard;
    String Difficutly;
    String DifficultyMenu;
    String GamemodeMenu;
    String TimeMenu;
    String ToolsMenu;
    String EffectsMenu;
    String ClearChat;
    String TrollMenu;
    String CowTroll;
    String CowTrollPlayer;
    String LightningTroll;
    String LightningTrollPlayer;
    String BlindnessTroll;
    String BlindnessTrollPlayer;
    String SlownessTroll;
    String SlownessTrollPlayer;
    String NauseaTroll;
    String NauseaTrollPlayer;
    String JumpTroll;
    String JumpTrollPlayer;
    String WeaknessTroll;
    String WeaknessTrollPlayer;
    String MobManagerMenu;
    String MobClear;
    String FlyMenu;
    String VanishMenu;
    String FeedAndHealMenu;

    
    public Event() {
        this.DoubleArrow = new StringBuilder().append(ChatColor.DARK_GRAY).append(ChatColor.BOLD).append(" >> ").toString();
        this.prefix = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Prefix"));
        this.Creative = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Creative"));
        this.Survival = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Survival"));
        this.Spectator = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Spectator"));
        this.Adventure = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Adventure"));
        this.Heal = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Heal"));
        this.Feed = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Feed"));
        this.WhitelistON = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.WhitelistON"));
        this.WhitelistOFF = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.WhitelistOFF"));
        this.WeatherRain = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.WeatherRain"));
        this.WeatherClear = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.WeatherClear"));
        this.TimeSixAM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeSixAM"));
        this.TimeSevenAM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeSevenAM"));
        this.TimeEightAM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeEightAM"));
        this.TimeNineAM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeNineAM"));
        this.TimeTenAM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeTenAM"));
        this.TimeElevenAM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeElevenAM"));
        this.TimeTwelvePM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeTwelvePM"));
        this.TimeOnePM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeOnePM"));
        this.TimeTwoPM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeTwoPM"));
        this.TimeThreePM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeThreePM"));
        this.TimeFourPM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeFourPM"));
        this.TimeFivePM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeFivePM"));
        this.TimeSixPM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeSixPM"));
        this.TimeSevenPM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeSevenPM"));
        this.TimeEightPM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeEightPM"));
        this.TimeNinePM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeNinePM"));
        this.TimeTenPM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeTenPM"));
        this.TimeElevenPM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeElevenPM"));
        this.TimeTwelveAM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeTwelveAM"));
        this.TimeOneAM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeOneAM"));
        this.TimeTwoAM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeTwoAM"));
        this.TimeThreeAM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeThreeAM"));
        this.TimeFourAM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeFourAM"));
        this.TimeFiveAM = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeFiveAM"));
        this.MainMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.MainMenu"));
        this.FlyON = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.FlyON"));
        this.FlyOFF = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.FlyOFF"));
        this.ClearInv = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.ClearInv"));
        this.SpeedMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpeedMenu"));
        this.JumpMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.JumpMenu"));
        this.Speed1 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Speed1"));
        this.Speed2 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Speed2"));
        this.Speed3 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Speed3"));
        this.Speed4 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Speed4"));
        this.Speed5 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Speed5"));
        this.Speed6 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Speed6"));
        this.Speed7 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Speed7"));
        this.Speed8 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Speed8"));
        this.Jump1 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Jump1"));
        this.Jump2 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Jump2"));
        this.Jump3 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Jump3"));
        this.Jump4 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Jump4"));
        this.Jump5 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Jump5"));
        this.Jump6 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Jump6"));
        this.Jump7 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Jump7"));
        this.Jump8 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Jump8"));
        this.EffectsClear = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.EffectsClear"));
        this.MobMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.MobMenu"));
        this.ExtraMobMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.ExtraMobMenu"));
        this.SpawnCreeper = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnCreeper"));
        this.SpawnSkeleton = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnSkeleton"));
        this.SpawnSpider = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnSpider"));
        this.SpawnZombie = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnZombie"));
        this.SpawnSlime = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnSlime"));
        this.SpawnGhast = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnGhast"));
        this.SpawnZombiePig = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnZombiePig"));
        this.SpawnCaveSpider = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnCaveSpider"));
        this.SpawnSilverfish = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnSilverfish"));
        this.SpawnBlaze = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnBlaze"));
        this.SpawnMagmaCube = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnMagmaCube"));
        this.SpawnBat = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnBat"));
        this.SpawnWitch = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnWitch"));
        this.SpawnPig = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnPig"));
        this.SpawnSheep = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnSheep"));
        this.SpawnCow = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnCow"));
        this.SpawnChicken = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnChicken"));
        this.SpawnSquid = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnSquid"));
        this.SpawnWolf = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnWolf"));
        this.SpawnMushroom = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnMushroom"));
        this.SpawnOcelot = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnOcelot"));
        this.SpawnHorse = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnHorse"));
        this.SpawnVillager = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnVillager"));
        this.SpawnIronGolem = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnIronGolem"));
        this.SpawnSnowGolem = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnSnowGolem"));
        this.SpawnGiant = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnGiant"));
        this.SpawnWither = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnWither"));
        this.SpawnEnderDragon = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnEnderDragon"));
        this.Invisibility = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Invisibility"));
        this.WatherBreathing = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.WatherBreathing"));
        this.NightVision = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.NightVision"));
        this.Slowness = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Slowness"));
        this.StrengthMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.StrengthMenu"));
        this.Strength1 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Strength1"));
        this.Strength2 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Strength2"));
        this.Strength3 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Strength3"));
        this.Strength4 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Strength4"));
        this.Strength5 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Strength5"));
        this.Strength6 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Strength6"));
        this.Strength7 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Strength7"));
        this.Strength8 = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.Strength8"));
        this.VanishON = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.VanishON"));
        this.VanishOFF = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.VanishOFF"));
        this.ServerManagerMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.ServerManagerMenu"));
        this.SpawnRabbit = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnRabbit"));
        this.SpawnGuardian = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SpawnGuardian"));
        this.AdminSword = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.AdminSword"));
        this.AdminBow = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.AdminBow"));
        this.AdminStick = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.AdminStick"));
        this.AdminItemMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.AdminItemMenu"));
        this.DifficultyPeace = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.DifficultyPeace"));
        this.DifficultyEasy = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.DifficultyEasy"));
        this.DifficultyNormal = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.DifficultyNormal"));
        this.DifficultyHard = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.DifficultyHard"));
        this.DifficultyMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.DifficultyMenu"));
        this.GamemodeMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.GamemodeMenu"));
        this.TimeMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TimeMenu"));
        this.ToolsMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.ToolsMenu"));
        this.EffectsMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.EffectsMenu"));
        this.ClearChat = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.ClearChat"));
        this.CowTroll = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.CowTroll"));
        this.TrollMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.TrollMenu"));
        this.CowTrollPlayer = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.CowTrollPlayer"));
        this.LightningTrollPlayer = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.LightningTrollPlayer"));
        this.LightningTroll = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.LightningTroll"));
        this.BlindnessTroll = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.BlindnessTroll"));
        this.BlindnessTrollPlayer = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.BlindnessTrollPlayer"));
        this.SlownessTroll = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SlownessTroll"));
        this.SlownessTrollPlayer = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.SlownessTrollPlayer"));
        this.NauseaTroll = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.NauseaTroll"));
        this.NauseaTrollPlayer = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.NauseaTrollPlayer"));
        this.JumpTroll = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.JumpTroll"));
        this.JumpTrollPlayer = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.JumpTrollPlayer"));
        this.WeaknessTroll = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.WeaknessTroll"));
        this.WeaknessTrollPlayer = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.WeaknessTrollPlayer"));
        this.MobManagerMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.MobManagerMenu"));
        this.MobClear = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.MobClear"));
        this.FlyMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.FlyMenu"));
        this.VanishMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.VanishMenu"));
        this.FeedAndHealMenu = ChatColor.translateAlternateColorCodes('&', me.zachstyles.staff.Main.getPlugin().getConfig().getString("Messages.FeedAndHealMenu"));



        this.SpigotDownloads = 1024;
        this.varCharHashMap = 512;
        this.killed = 0;
    }
    
    
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getInventory().getName().equals(InvNames.invname) || e.getInventory().getName().equals(InvNames.secInv) || e.getInventory().getName().equals(InvNames.timeset) || e.getInventory().getName().equals(InvNames.whitelist) || e.getInventory().getName().equals(InvNames.weather) || e.getInventory().getName().equals(InvNames.effects) || e.getInventory().getName().equals(InvNames.speed) || e.getInventory().getName().equals(InvNames.jumpboost) || e.getInventory().getName().equals(InvNames.tools) || e.getInventory().getName().equals(InvNames.extramobs) || e.getInventory().getName().equals(InvNames.mobs) || e.getInventory().getName().equals(InvNames.difficulty) || e.getInventory().getName().equals(InvNames.strength) || e.getInventory().getName().equals(InvNames.servermanager) || e.getInventory().getName().equals(InvNames.adminitems) || e.getInventory().getName().equals(InvNames.troll) || e.getInventory().getName().equals(InvNames.mobmanager) || e.getInventory().getName().equals(InvNames.flymenu) || e.getInventory().getName().equals(InvNames.vanishmenu) || e.getInventory().getName().equals(InvNames.feedandhealmenu) || e.getInventory().getName().equals(InvNames.bInv)) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }
        }
        Player p = (Player)e.getWhoClicked();
        if (e.getCurrentItem() == null)
        	return;
        if (e.getCurrentItem().equals((Object)items.stone(p))) {
            p.setGameMode(GameMode.CREATIVE);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Creative));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.dirt(p))) {
            p.setGameMode(GameMode.SURVIVAL);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Survival));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Grass(p))) {
            p.setGameMode(GameMode.SPECTATOR);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Spectator));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.CobbleStone(p))) {
            p.setGameMode(GameMode.ADVENTURE);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Adventure));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Blaze(p))) {
        	if(!p.hasPermission("ustaffmode.gamemode")) return;
        	p.openInventory(InvCreator.secInv);
            p.sendMessage(prefix + DoubleArrow + GamemodeMenu);
        }
        if (e.getCurrentItem().equals((Object)items.Barrier(p))) {
        	if(!p.hasPermission("ustaffmode.gamemode")) return;
        	p.openInventory(InvCreator.timeset);
            p.sendMessage(prefix + DoubleArrow + TimeMenu);
        }   
        if (e.getCurrentItem().equals((Object)items.Sponge(p))) {
            p.setHealth(20.0);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Heal));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Bread(p))) {
            p.setFoodLevel(20);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Feed));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.WhitelistON(p))) {
            Bukkit.getServer().setWhitelist(true);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.WhitelistON));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.WhitelistOFF(p))) {
            Bukkit.getServer().setWhitelist(false);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.WhitelistOFF));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.WeatherRain(p))) {
            World world = p.getWorld();
            world.setStorm(true);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.WeatherRain));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.WeatherClear(p))) {
            World world = p.getWorld();
            world.setStorm(false);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.WeatherClear));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.SIXAM(p))) {
            p.getWorld().setTime(24000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeSixAM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.SEVENAM(p))) {
            p.getWorld().setTime(1000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeSevenAM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.EIGHTAM(p))) {
            p.getWorld().setTime(2000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeEightAM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.NINEAM(p))) {
            p.getWorld().setTime(3000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeNineAM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.TENAM(p))) {
            p.getWorld().setTime(4000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeTenAM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.ELEVENAM(p))) {
            p.getWorld().setTime(5000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeElevenAM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.TWELVEPM(p))) {
            p.getWorld().setTime(6000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeTwelvePM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.ONEPM(p))) {
            p.getWorld().setTime(7000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeOnePM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.TWOPM(p))) {
            p.getWorld().setTime(8000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeTwoPM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.THREEPM(p))) {
            p.getWorld().setTime(9000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeThreePM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.FOURPM(p))) {
            p.getWorld().setTime(10000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeFourPM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.FIVEPM(p))) {
            p.getWorld().setTime(11000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeFivePM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.SIXPM(p))) {
            p.getWorld().setTime(12000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeSixPM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.SEVENPM(p))) {
            p.getWorld().setTime(13000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeSevenPM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.EIGHTPM(p))) {
            p.getWorld().setTime(14000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeEightPM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.NINEPM(p))) {
            p.getWorld().setTime(15000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeNinePM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.TENPM(p))) {
            p.getWorld().setTime(16000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeTenPM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.ELEVENPM(p))) {
            p.getWorld().setTime(17000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeElevenPM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.TWELVEAM(p))) {
            p.getWorld().setTime(18000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeTwelveAM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.ONEAM(p))) {
            p.getWorld().setTime(19000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeOneAM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.TWOAM(p))) {
            p.getWorld().setTime(18000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeTwoAM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.THREEAM(p))) {
            p.getWorld().setTime(21000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeThreeAM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.FOURAM(p))) {
            p.getWorld().setTime(22000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeFourAM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.FIVEAM(p))) {
            p.getWorld().setTime(22000L);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TimeFiveAM));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.BACK(p))) {
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.MainMenu));
            p.openInventory(InvCreator.StaffGui);
        }
        if (e.getCurrentItem().equals((Object)items.TOOLS(p))) {
        	if(!p.hasPermission("ustaffmode.tools")) return;
        	p.openInventory(InvCreator.tools);
            p.sendMessage(prefix + DoubleArrow + ToolsMenu);
        }   
        if (e.getCurrentItem().equals((Object)items.FlyOn(p))) {
            p.setAllowFlight(true);
            p.setFlying(true);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.FlyON));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.FlyOff(p))) {
            p.setAllowFlight(false);
            p.setFlying(false);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.FlyOFF));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.InvClear(p))) {
            p.getInventory().clear();
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.ClearInv));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Speed(p))) {
        	p.openInventory(InvCreator.speed);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpeedMenu));
        }
        if (e.getCurrentItem().equals((Object)items.JumpBoost(p))) {
            p.openInventory(InvCreator.jumpboost);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.JumpMenu));
        }
        if (e.getCurrentItem().equals((Object)items.EFFECTS(p))) {
        	if(!p.hasPermission("ustaffmode.effects")) return;
        	p.openInventory(InvCreator.effects);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.EffectsMenu));
        }     
        if (e.getCurrentItem().equals((Object)items.Speed1(p))) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 1));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Speed1));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.RemoveEffects(p))) {
            p.getActivePotionEffects().clear();
            for (PotionEffect pe : p.getActivePotionEffects()) {
                p.removePotionEffect(pe.getType());
            }
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.EffectsClear));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Speed2(p))) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 2));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Speed2));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Speed3(p))) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 3));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Speed3));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Speed4(p))) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 4));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Speed4));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Speed5(p))) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 5));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Speed5));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Speed6(p))) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 6));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Speed6));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Speed7(p))) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 7));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Speed7));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Speed8(p))) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 8));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Speed8));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Jumpboost1(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 1));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Jump1));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Jumpboost2(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 2));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Jump2));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Jumpboost3(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 3));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Jump3));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Jumpboost4(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 4));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Jump4));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Jumpboost5(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 5));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Jump5));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Jumpboost6(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 6));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Jump6));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Jumpboost7(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 7));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Jump7));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Jumpboost8(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 8));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Jump8));
            e.getWhoClicked().closeInventory();
        }  
        if (e.getCurrentItem().equals((Object)items.MobMenu(p))) {
        	if(!p.hasPermission("ustaffmode.mobs")) return;
        	p.openInventory(InvCreator.mobs);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.MobMenu));
        }
        if (e.getCurrentItem().equals((Object)items.MobCreeper(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.CREEPER);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnCreeper));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobSkeleton(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.SKELETON);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnSkeleton));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobSpider(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.SPIDER);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnSpider));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobZombie(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.ZOMBIE);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnZombie));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobSlime(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.SLIME);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnSlime));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobGhast(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.GHAST);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnGhast));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobZombiePig(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.PIG_ZOMBIE);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnZombiePig));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobEnderman(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.ENDERMAN);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnEnderman));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobCaveSpider(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.CAVE_SPIDER);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnCaveSpider));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobSilverFish(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.SILVERFISH);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnSilverfish));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobBlaze(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.BLAZE);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnBlaze));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.PotionNight(p))) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 10000000, 0));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.NightVision));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobMagmaCube(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.MAGMA_CUBE);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnMagmaCube));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobBat(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.BAT);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnBat));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobWitch(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.WITCH);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnWitch));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobPig(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.PIG);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnPig));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobSheep(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.SHEEP);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnSheep));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobCow(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.COW);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnCow));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobChicken(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.CHICKEN);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnChicken));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobSquid(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.SQUID);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnSquid));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobWolf(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.WOLF);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnWolf));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobMooshroom(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.MUSHROOM_COW);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnMushroom));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobOcelot(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.OCELOT);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnOcelot));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobHorse(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.HORSE);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnHorse));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobVillager(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.VILLAGER);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnVillager));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.ExtraMobs(p))) {
            p.openInventory(InvCreator.extramobs);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.ExtraMobMenu));
        }
        if (e.getCurrentItem().equals((Object)items.MobIron(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.IRON_GOLEM);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnIronGolem));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobSnow(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.SNOWMAN);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnSnowGolem));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobGiant(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.GIANT);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnGiant));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobWither(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.WITHER);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnWither));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobDragon(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.ENDER_DRAGON);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnEnderDragon));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobRabbit(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.RABBIT);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnRabbit));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.MobGuardian(p))) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.GUARDIAN);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SpawnGuardian));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Invis(p))) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 10000000, 0));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Invisibility));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.PotionWater(p))) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 10000000, 0));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.WatherBreathing));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.StrengthMenu(p))) {
            p.openInventory(InvCreator.strength);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.StrengthMenu));
        }
        if (e.getCurrentItem().equals((Object)items.Strength1(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 1));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Strength1));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Strength2(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 2));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Strength2));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Strength3(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 3));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Strength3));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Strength4(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 4));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Strength4));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Strength5(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 5));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Strength5));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Strength6(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 6));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Strength6));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Strength7(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 7));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Strength7));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Strength8(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 8));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Strength8));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Slowness(p))) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 180000000, 0));
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.Slowness));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.Support(p))) {
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + ChatColor.GRAY + "Support:" + ChatColor.RED + " http://support.bghdnetwork.net");
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.ServerManager(p))) {
        	if(!p.hasPermission("ustaffmode.servermanager")) return;
        	p.openInventory(InvCreator.servermanager);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.ServerManagerMenu));
        }
        if (e.getCurrentItem().equals((Object)items.AdminSword(p))) {
            ItemStack is = new ItemStack(Material.DIAMOND_SWORD, 1);
            ItemMeta isMeta = is.getItemMeta();
            isMeta.addEnchant(Enchantment.DAMAGE_ALL, 1000, true);
            isMeta.addEnchant(Enchantment.DURABILITY, 1000, true);
            isMeta.setDisplayName(new StringBuilder().append(ChatColor.RED).append(ChatColor.BOLD).append(ChatColor.UNDERLINE).append("Admin Sword").toString());
            is.setItemMeta(isMeta);
            p.getInventory().addItem(new ItemStack[] { is });
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.AdminSword));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.AdminStick(p))) {
            ItemStack is = new ItemStack(Material.STICK, 1);
            ItemMeta isMeta = is.getItemMeta();
            isMeta.addEnchant(Enchantment.KNOCKBACK, 15, true);
            isMeta.addEnchant(Enchantment.DURABILITY, 1000, true);
            isMeta.setDisplayName(new StringBuilder().append(ChatColor.RED).append(ChatColor.BOLD).append(ChatColor.UNDERLINE).append("Admin Stick").toString());
            is.setItemMeta(isMeta);
            p.getInventory().addItem(new ItemStack[] { is });
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.AdminStick));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.AdminBow(p))) {
            ItemStack is = new ItemStack(Material.BOW, 1);
            ItemStack is2 = new ItemStack(Material.ARROW, 1);
            ItemMeta isMeta2 = is.getItemMeta();
            isMeta2.addEnchant(Enchantment.ARROW_INFINITE, 1000, true);
            isMeta2.addEnchant(Enchantment.DURABILITY, 1000, true);
            isMeta2.addEnchant(Enchantment.ARROW_KNOCKBACK, 1000, true);
            isMeta2.addEnchant(Enchantment.ARROW_FIRE, 1000, true);
            isMeta2.addEnchant(Enchantment.ARROW_DAMAGE, 1000, true);
            isMeta2.setDisplayName(new StringBuilder().append(ChatColor.RED).append(ChatColor.BOLD).append(ChatColor.UNDERLINE).append("Admin Bow").toString());
            is.setItemMeta(isMeta2);
            ItemMeta is2Meta = is2.getItemMeta();
            is2Meta.addEnchant(Enchantment.DURABILITY, 1000, true);
            is2Meta.setDisplayName(new StringBuilder().append(ChatColor.RED).append(ChatColor.BOLD).append(ChatColor.UNDERLINE).append("Admin Arrow").toString());
            is2.setItemMeta(is2Meta);
            p.getInventory().addItem(new ItemStack[] { is });
            p.getInventory().addItem(new ItemStack[] { is2 });
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.AdminBow));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.AdminItemMenu(p))) {
        	if(!p.hasPermission("ustaffmode.adminitems")) return;
        	p.openInventory(InvCreator.adminitems);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.AdminItemMenu));
        }
        if (e.getCurrentItem().equals((Object)items.DifficultyPeace(p))) {
            Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "difficulty 0");
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.DifficultyPeace));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.DifficultyEasy(p))) {
            Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "difficulty 1");
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.DifficultyEasy));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.DifficultyNormal(p))) {
            Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "difficulty 2");
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.DifficultyNormal));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.DifficultyHard(p))) {
            Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "difficulty 3");
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.DifficultyHard));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.DifficultyMenu(p))) {
        	if(!p.hasPermission("ustaffmode.difficulty")) return;
        	p.openInventory(InvCreator.difficulty);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.DifficultyMenu));
        }
        if (e.getCurrentItem().equals((Object)items.TrollMenu(p))) {
        	if(!p.hasPermission("ustaffmode.trolls")) return;
        	p.openInventory(InvCreator.troll);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.TrollMenu));
        }
        if (e.getCurrentItem().equals((Object)items.MobManagerMenu(p))) {
        	if(!p.hasPermission("ustaffmode.mobmanager")) return;
        	p.openInventory(InvCreator.mobmanager);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.MobManagerMenu));
        }
        if (e.getCurrentItem().equals((Object)items.FlyMenu(p))) {
        	p.openInventory(InvCreator.flymenu);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.FlyMenu));
        }
        if (e.getCurrentItem().equals((Object)items.VanishMenu(p))) {
        	p.openInventory(InvCreator.vanishmenu);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.VanishMenu));
        }
        if (e.getCurrentItem().equals((Object)items.FeedAndHealMenu(p))) {
        	p.openInventory(InvCreator.feedandhealmenu);
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.FeedAndHealMenu));
        }
        if (e.getCurrentItem().equals((Object)items.MobClear(p))) {
              p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.MobClear));
        	  World[] array;
  	        for (int length = (array = Bukkit.getServer().getWorlds().toArray(new World[0])).length, i = 0; i < length; ++i) {
  	            final World world = array[i];
  	            for (final LivingEntity mobs : world.getLivingEntities()) {
  	                if (!(mobs instanceof Player)) {
  	                    mobs.remove();
  	                    ++this.killed;
        }
  	              e.getWhoClicked().closeInventory();
  	            }
  	        }
        }
  	            
        
        
        
        
     // PUT ABOVE
        if (e.getCurrentItem().equals((Object)items.LightningTroll(p)))  {
        	for (Player players : Bukkit.getOnlinePlayers()) {
        		players.getWorld().strikeLightningEffect(players.getLocation());
        		players.getWorld().strikeLightningEffect(players.getLocation());
        		players.getWorld().strikeLightningEffect(players.getLocation());
        		players.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.LightningTrollPlayer));
                p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.LightningTroll));
                e.getWhoClicked().closeInventory();
            }
        	}
        if (e.getCurrentItem().equals((Object)items.SlownessTroll(p)))  {
        	for (Player players : Bukkit.getOnlinePlayers()) {
        		players.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20000, 4));
        		players.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SlownessTrollPlayer));
                p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SlownessTroll));
                e.getWhoClicked().closeInventory();
            }
        	}
        if (e.getCurrentItem().equals((Object)items.JumpTroll(p)))  {
        	for (Player players : Bukkit.getOnlinePlayers()) {
        		players.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20000, 4));
        		players.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.JumpTrollPlayer));
                p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.JumpTroll));
                e.getWhoClicked().closeInventory();
            }
        	}
        if (e.getCurrentItem().equals((Object)items.WeaknessTroll(p)))  {
        	for (Player players : Bukkit.getOnlinePlayers()) {
        		players.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 20000, 4));
        		players.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.WeaknessTrollPlayer));
                p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.WeaknessTroll));
                e.getWhoClicked().closeInventory();
            }
        	}
        if (e.getCurrentItem().equals((Object)items.NauseaTroll(p)))  {
        	for (Player players : Bukkit.getOnlinePlayers()) {
        		players.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 20000, 4));
        		players.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.NauseaTrollPlayer));
                p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.NauseaTroll));
                e.getWhoClicked().closeInventory();
            }
        	}
        if (e.getCurrentItem().equals((Object)items.BlindnessTroll(p)))  {
        	for (Player players : Bukkit.getOnlinePlayers()) {
        		players.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20000, 4));
        		players.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SlownessTrollPlayer));
                p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.SlownessTroll));
                e.getWhoClicked().closeInventory();
            }
        	}
        if (e.getCurrentItem().equals((Object)items.CowTroll(p)))  {
        	for (Player players : Bukkit.getOnlinePlayers()) {
        		players.getWorld().spawnEntity(players.getLocation(), EntityType.COW);
                p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.CowTroll));
                players.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.CowTrollPlayer));
                e.getWhoClicked().closeInventory();
            }
        	}
        if (e.getCurrentItem().equals((Object)items.ClearChat(p)))  {
        	for (Player players : Bukkit.getOnlinePlayers()) {
                for (int i = 0; i < 600; ++i) {
                    players.sendMessage("");
            }
        	}
        Bukkit.broadcastMessage(String.valueOf(this.prefix) + this.DoubleArrow + String.valueOf(this.ClearChat));
        Bukkit.broadcastMessage(" ");
        e.getWhoClicked().closeInventory();
    }
    
        if (e.getCurrentItem().equals((Object)items.VanishON(p))) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.hidePlayer(p);
                p.setAllowFlight(true);
                p.setFlying(true);
            }
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.VanishON));
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals((Object)items.VanishOFF(p))) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.showPlayer(p);
                p.setAllowFlight(false);
                p.setFlying(false);
            }
            p.sendMessage(String.valueOf(String.valueOf(this.prefix)) + this.DoubleArrow + String.valueOf(this.VanishOFF));
            e.getWhoClicked().closeInventory();
        }
        e.getCurrentItem().equals((Object)items.Glass(p));
        if (e.getCurrentItem().equals((Object)items.Blaze(p))) {
            InvCreator.secInv.setItem(5, items.stone(p));
            InvCreator.secInv.setItem(3, items.dirt(p));
            InvCreator.secInv.setItem(1, items.CobbleStone(p));
            InvCreator.secInv.setItem(7, items.Grass(p));
            InvCreator.secInv.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.secInv.getItem(i) == null) {
                    InvCreator.secInv.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.secInv);
        }
      }
        if (e.getCurrentItem().equals((Object)items.Gravel(p))) {
            InvCreator.bInv.setItem(4, items.Sponge(p));
            InvCreator.bInv.setItem(3, items.Bread(p));
            InvCreator.bInv.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.bInv.getItem(i) == null) {
                    InvCreator.bInv.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.bInv);
        }
      }
        if (e.getCurrentItem().equals((Object)items.Barrier(p))) {
            InvCreator.timeset.setItem(4, items.FOURAM(p));
            InvCreator.timeset.setItem(3, items.THREEAM(p));
            InvCreator.timeset.setItem(0, items.TWELVEAM(p));
            InvCreator.timeset.setItem(1, items.ONEAM(p));
            InvCreator.timeset.setItem(2, items.TWOAM(p));
            InvCreator.timeset.setItem(6, items.SIXAM(p));
            InvCreator.timeset.setItem(7, items.SEVENAM(p));
            InvCreator.timeset.setItem(5, items.FIVEAM(p));
            InvCreator.timeset.setItem(8, items.EIGHTAM(p));
            InvCreator.timeset.setItem(9, items.NINEAM(p));
            InvCreator.timeset.setItem(10, items.TENAM(p));
            InvCreator.timeset.setItem(11, items.ELEVENAM(p));
            InvCreator.timeset.setItem(12, items.TWELVEPM(p));
            InvCreator.timeset.setItem(13, items.ONEPM(p));
            InvCreator.timeset.setItem(14, items.TWOPM(p));
            InvCreator.timeset.setItem(15, items.THREEPM(p));
            InvCreator.timeset.setItem(16, items.FOURPM(p));
            InvCreator.timeset.setItem(17, items.FIVEPM(p));
            InvCreator.timeset.setItem(18, items.SIXPM(p));
            InvCreator.timeset.setItem(19, items.SEVENPM(p));
            InvCreator.timeset.setItem(20, items.EIGHTPM(p));
            InvCreator.timeset.setItem(21, items.NINEPM(p));
            InvCreator.timeset.setItem(22, items.TENPM(p));
            InvCreator.timeset.setItem(23, items.ELEVENPM(p));
            InvCreator.timeset.setItem(24, items.Glass(p));
            InvCreator.timeset.setItem(25, items.Glass(p));
            InvCreator.timeset.setItem(26, items.BACK(p));
            for (int i = 0; i < 27; ++i) {
                if (InvCreator.timeset.getItem(i) == null) {
                    InvCreator.timeset.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.timeset);
        }
     }
        if (e.getCurrentItem().equals((Object)items.Whitelist(p))) {
            InvCreator.whitelist.setItem(3, items.WhitelistON(p));
            InvCreator.whitelist.setItem(5, items.WhitelistOFF(p));
            InvCreator.whitelist.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.whitelist.getItem(i) == null) {
                    InvCreator.whitelist.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.whitelist);
        }
      }
        if (e.getCurrentItem().equals((Object)items.FlyMenu(p))) {
            InvCreator.flymenu.setItem(3, items.FlyOn(p));
            InvCreator.flymenu.setItem(5, items.FlyOff(p));
            InvCreator.flymenu.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.flymenu.getItem(i) == null) {
                    InvCreator.flymenu.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.flymenu);
        }
      }
        if (e.getCurrentItem().equals((Object)items.VanishMenu(p))) {
            InvCreator.vanishmenu.setItem(3, items.VanishON(p));
            InvCreator.vanishmenu.setItem(5, items.VanishOFF(p));
            InvCreator.vanishmenu.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.vanishmenu.getItem(i) == null) {
                    InvCreator.vanishmenu.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.vanishmenu);
        }
      }
        if (e.getCurrentItem().equals((Object)items.FeedAndHealMenu(p))) {
            InvCreator.feedandhealmenu.setItem(3, items.Bread(p));
            InvCreator.feedandhealmenu.setItem(5, items.Sponge(p));
            InvCreator.feedandhealmenu.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.feedandhealmenu.getItem(i) == null) {
                    InvCreator.feedandhealmenu.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.feedandhealmenu);
        }
      }
        
        
        if (e.getCurrentItem().equals((Object)items.Weather(p))) {
            InvCreator.weather.setItem(3, items.WeatherRain(p));
            InvCreator.weather.setItem(5, items.WeatherClear(p));
            InvCreator.weather.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.weather.getItem(i) == null) {
                    InvCreator.weather.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.weather);
        }
      }
        if (e.getCurrentItem().equals((Object)items.TOOLS(p))) {
            InvCreator.tools.setItem(1, items.FeedAndHealMenu(p));
            InvCreator.tools.setItem(6, items.InvClear(p));
            InvCreator.tools.setItem(0, items.FlyMenu(p));
            InvCreator.tools.setItem(7, items.ClearChat(p));
            InvCreator.tools.setItem(2, items.VanishMenu(p));
            InvCreator.tools.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.tools.getItem(i) == null) {
                    InvCreator.tools.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.tools);
        }
      }
        if (e.getCurrentItem().equals((Object)items.EFFECTS(p))) {
            InvCreator.effects.setItem(4, items.PotionWater(p));
            InvCreator.effects.setItem(3, items.Invis(p));
            InvCreator.effects.setItem(0, items.JumpBoost(p));
            InvCreator.effects.setItem(1, items.Speed(p));
            InvCreator.effects.setItem(2, items.StrengthMenu(p));
            InvCreator.effects.setItem(6, items.Slowness(p));
            InvCreator.effects.setItem(7, items.RemoveEffects(p));
            InvCreator.effects.setItem(5, items.PotionNight(p));
            InvCreator.effects.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.effects.getItem(i) == null) {
                    InvCreator.effects.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.effects);
        }
      }
        if (e.getCurrentItem().equals((Object)items.Speed(p))) {
            InvCreator.speed.setItem(4, items.Speed5(p));
            InvCreator.speed.setItem(3, items.Speed4(p));
            InvCreator.speed.setItem(0, items.Speed1(p));
            InvCreator.speed.setItem(1, items.Speed2(p));
            InvCreator.speed.setItem(2, items.Speed3(p));
            InvCreator.speed.setItem(6, items.Speed7(p));
            InvCreator.speed.setItem(7, items.Speed8(p));
            InvCreator.speed.setItem(5, items.Speed6(p));
            InvCreator.speed.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.speed.getItem(i) == null) {
                    InvCreator.speed.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.speed);
        }
      }
        if (e.getCurrentItem().equals((Object)items.JumpBoost(p))) {
            InvCreator.jumpboost.setItem(4, items.Jumpboost5(p));
            InvCreator.jumpboost.setItem(3, items.Jumpboost4(p));
            InvCreator.jumpboost.setItem(0, items.Jumpboost1(p));
            InvCreator.jumpboost.setItem(1, items.Jumpboost2(p));
            InvCreator.jumpboost.setItem(2, items.Jumpboost3(p));
            InvCreator.jumpboost.setItem(6, items.Jumpboost7(p));
            InvCreator.jumpboost.setItem(7, items.Jumpboost8(p));
            InvCreator.jumpboost.setItem(5, items.Jumpboost6(p));
            InvCreator.jumpboost.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.jumpboost.getItem(i) == null) {
                    InvCreator.jumpboost.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.jumpboost);
        }
      }
        if (e.getCurrentItem().equals((Object)items.MobMenu(p))) {
            InvCreator.mobs.setItem(4, items.MobSlime(p));
            InvCreator.mobs.setItem(3, items.MobZombie(p));
            InvCreator.mobs.setItem(0, items.MobCreeper(p));
            InvCreator.mobs.setItem(1, items.MobSkeleton(p));
            InvCreator.mobs.setItem(2, items.MobSpider(p));
            InvCreator.mobs.setItem(6, items.MobZombiePig(p));
            InvCreator.mobs.setItem(7, items.MobEnderman(p));
            InvCreator.mobs.setItem(5, items.MobGhast(p));
            InvCreator.mobs.setItem(8, items.MobCaveSpider(p));
            InvCreator.mobs.setItem(9, items.MobSilverFish(p));
            InvCreator.mobs.setItem(10, items.MobBlaze(p));
            InvCreator.mobs.setItem(11, items.MobMagmaCube(p));
            InvCreator.mobs.setItem(12, items.MobBat(p));
            InvCreator.mobs.setItem(13, items.MobWitch(p));
            InvCreator.mobs.setItem(14, items.MobPig(p));
            InvCreator.mobs.setItem(15, items.MobSheep(p));
            InvCreator.mobs.setItem(16, items.MobCow(p));
            InvCreator.mobs.setItem(17, items.MobChicken(p));
            InvCreator.mobs.setItem(18, items.MobSquid(p));
            InvCreator.mobs.setItem(19, items.MobWolf(p));
            InvCreator.mobs.setItem(20, items.MobMooshroom(p));
            InvCreator.mobs.setItem(21, items.MobOcelot(p));
            InvCreator.mobs.setItem(22, items.MobHorse(p));
            InvCreator.mobs.setItem(23, items.MobVillager(p));
            InvCreator.mobs.setItem(24, items.MobRabbit(p));
            InvCreator.mobs.setItem(25, items.ExtraMobs(p));
            InvCreator.mobs.setItem(26, items.BACK(p));
            for (int i = 0; i < 27; ++i) {
                if (InvCreator.mobs.getItem(i) == null) {
                    InvCreator.mobs.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.mobs);
        }
      }
        if (e.getCurrentItem().equals((Object)items.ExtraMobs(p))) {
            InvCreator.extramobs.setItem(4, items.MobWither(p));
            InvCreator.extramobs.setItem(3, items.MobGiant(p));
            InvCreator.extramobs.setItem(0, items.MobIron(p));
            InvCreator.extramobs.setItem(1, items.MobSnow(p));
            InvCreator.extramobs.setItem(2, items.MobGuardian(p));
            InvCreator.extramobs.setItem(5, items.MobDragon(p));
            InvCreator.extramobs.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.extramobs.getItem(i) == null) {
                    InvCreator.extramobs.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.extramobs);
        }
     }
        if (e.getCurrentItem().equals((Object)items.DifficultyMenu(p))) {
            InvCreator.difficulty.setItem(3, items.DifficultyEasy(p));
            InvCreator.difficulty.setItem(1, items.DifficultyPeace(p));
            InvCreator.difficulty.setItem(7, items.DifficultyHard(p));
            InvCreator.difficulty.setItem(5, items.DifficultyNormal(p));
            InvCreator.difficulty.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.difficulty.getItem(i) == null) {
                    InvCreator.difficulty.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.difficulty);
        }
      }
        if (e.getCurrentItem().equals((Object)items.StrengthMenu(p))) {
            InvCreator.strength.setItem(4, items.Strength5(p));
            InvCreator.strength.setItem(3, items.Strength4(p));
            InvCreator.strength.setItem(0, items.Strength1(p));
            InvCreator.strength.setItem(1, items.Strength2(p));
            InvCreator.strength.setItem(2, items.Strength3(p));
            InvCreator.strength.setItem(6, items.Strength7(p));
            InvCreator.strength.setItem(7, items.Strength8(p));
            InvCreator.strength.setItem(5, items.Strength6(p));
            InvCreator.strength.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.strength.getItem(i) == null) {
                    InvCreator.strength.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.strength);
        }
       }
        if (e.getCurrentItem().equals((Object)items.ServerManager(p))) {
        	InvCreator.servermanager.setItem(1, items.MobManagerMenu(p));
        	InvCreator.servermanager.setItem(3, items.Weather(p));
            InvCreator.servermanager.setItem(5, items.Whitelist(p));
            InvCreator.servermanager.setItem(8, items.BACK(p));          
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.servermanager.getItem(i) == null) {
                    InvCreator.servermanager.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.servermanager);
        }
       }
        if (e.getCurrentItem().equals((Object)items.AdminItemMenu(p))) {
            InvCreator.adminitems.setItem(5, items.AdminBow(p));
            InvCreator.adminitems.setItem(3, items.AdminSword(p));
            InvCreator.adminitems.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.adminitems.getItem(i) == null) {
                    InvCreator.adminitems.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.adminitems);
        }
      }
        if (e.getCurrentItem().equals((Object)items.TrollMenu(p))) {
            InvCreator.troll.setItem(4, items.NauseaTroll(p));
            InvCreator.troll.setItem(3, items.SlownessTroll(p));
            InvCreator.troll.setItem(0, items.CowTroll(p));
            InvCreator.troll.setItem(1, items.LightningTroll(p));
            InvCreator.troll.setItem(2, items.BlindnessTroll(p));
            InvCreator.troll.setItem(5, items.JumpTroll(p));
            InvCreator.troll.setItem(6, items.WeaknessTroll(p));
            InvCreator.troll.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.troll.getItem(i) == null) {
                    InvCreator.troll.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.troll);
        }
      }
        if (e.getCurrentItem().equals((Object)items.MobManagerMenu(p))) {
            InvCreator.mobmanager.setItem(4, items.MobClear(p));
            InvCreator.mobmanager.setItem(8, items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.mobmanager.getItem(i) == null) {
                    InvCreator.mobmanager.setItem(i, items.Glass(p));
                }
            p.openInventory(InvCreator.mobmanager);
        }
      }
        
        
    }
}
