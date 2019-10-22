package me.refrac.staff.menu;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.*;

import me.refrac.staff.inv.*;
import me.refrac.staff.utils.*;

public class Event implements Listener
{
    int killed;
    String prefix;
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
        this.DoubleArrow = String.valueOf ( ChatColor.DARK_GRAY ) + ChatColor.BOLD + " >> ";
        this.prefix = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Prefix"));
        this.Creative = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Creative"));
        this.Survival = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Survival"));
        this.Spectator = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Spectator"));
        this.Adventure = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Adventure"));
        this.Heal = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Heal"));
        this.Feed = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Feed"));
        this.WhitelistON = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.WhitelistON"));
        this.WhitelistOFF = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.WhitelistOFF"));
        this.WeatherRain = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.WeatherRain"));
        this.WeatherClear = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.WeatherClear"));
        this.TimeSixAM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeSixAM"));
        this.TimeSevenAM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeSevenAM"));
        this.TimeEightAM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeEightAM"));
        this.TimeNineAM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeNineAM"));
        this.TimeTenAM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeTenAM"));
        this.TimeElevenAM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeElevenAM"));
        this.TimeTwelvePM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeTwelvePM"));
        this.TimeOnePM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeOnePM"));
        this.TimeTwoPM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeTwoPM"));
        this.TimeThreePM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeThreePM"));
        this.TimeFourPM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeFourPM"));
        this.TimeFivePM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeFivePM"));
        this.TimeSixPM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeSixPM"));
        this.TimeSevenPM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeSevenPM"));
        this.TimeEightPM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeEightPM"));
        this.TimeNinePM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeNinePM"));
        this.TimeTenPM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeTenPM"));
        this.TimeElevenPM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeElevenPM"));
        this.TimeTwelveAM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeTwelveAM"));
        this.TimeOneAM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeOneAM"));
        this.TimeTwoAM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeTwoAM"));
        this.TimeThreeAM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeThreeAM"));
        this.TimeFourAM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeFourAM"));
        this.TimeFiveAM = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeFiveAM"));
        this.MainMenu = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.MainMenu"));
        this.FlyON = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.FlyON"));
        this.FlyOFF = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.FlyOFF"));
        this.ClearInv = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.ClearInv"));
        this.SpeedMenu = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpeedMenu"));
        this.JumpMenu = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.JumpMenu"));
        this.Speed1 = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Speed1"));
        this.Speed2 = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Speed2"));
        this.Speed3 = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Speed3"));
        this.Speed4 = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Speed4"));
        this.Speed5 = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Speed5"));
        this.Speed6 = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Speed6"));
        this.Speed7 = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Speed7"));
        this.Speed8 = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Speed8"));
        this.Jump1 = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Jump1"));
        this.Jump2 = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Jump2"));
        this.Jump3 = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Jump3"));
        this.Jump4 = Utils.chat(me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Jump4"));
        this.Jump5 = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Jump5"));
        this.Jump6 = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Jump6"));
        this.Jump7 = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Jump7"));
        this.Jump8 = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Jump8"));
        this.EffectsClear = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.EffectsClear"));
        this.MobMenu = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.MobMenu"));
        this.ExtraMobMenu = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.ExtraMobMenu"));
        this.SpawnCreeper = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnCreeper"));
        this.SpawnSkeleton = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnSkeleton"));
        this.SpawnSpider = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnSpider"));
        this.SpawnZombie = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnZombie"));
        this.SpawnSlime = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnGhast"));
        this.SpawnZombiePig = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnZombiePig"));
        this.SpawnCaveSpider = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnCaveSpider"));
        this.SpawnSilverfish = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnSilverfish"));
        this.SpawnBlaze = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnBlaze"));
        this.SpawnMagmaCube = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnMagmaCube"));
        this.SpawnBat = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnBat"));
        this.SpawnWitch = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnWitch"));
        this.SpawnPig = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnPig"));
        this.SpawnSheep = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnSheep"));
        this.SpawnCow = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnCow"));
        this.SpawnChicken = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnChicken"));
        this.SpawnSquid = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnSquid"));
        this.SpawnWolf = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnWolf"));
        this.SpawnMushroom = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnMushroom"));
        this.SpawnOcelot = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnOcelot"));
        this.SpawnHorse = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnHorse"));
        this.SpawnVillager = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnVillager"));
        this.SpawnIronGolem = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnIronGolem"));
        this.SpawnSnowGolem = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnSnowGolem"));
        this.SpawnGiant = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnGiant"));
        this.SpawnWither = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnWither"));
        this.SpawnEnderDragon = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnEnderDragon"));
        this.Invisibility = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Invisibility"));
        this.WatherBreathing = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.WatherBreathing"));
        this.NightVision = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.NightVision"));
        this.Slowness = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Slowness"));
        this.StrengthMenu = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.StrengthMenu"));
        this.Strength1 = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Strength1"));
        this.Strength2 = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Strength2"));
        this.Strength3 = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Strength3"));
        this.Strength4 = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Strength4"));
        this.Strength5 = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Strength5"));
        this.Strength6 = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Strength6"));
        this.Strength7 = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Strength7"));
        this.Strength8 = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.Strength8"));
        this.VanishON = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.VanishON"));
        this.VanishOFF = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.VanishOFF"));
        this.ServerManagerMenu = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.ServerManagerMenu"));
        this.SpawnRabbit = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnRabbit"));
        this.SpawnGuardian = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SpawnGuardian"));
        this.AdminSword = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.AdminSword"));
        this.AdminBow = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.AdminBow"));
        this.AdminStick = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.AdminStick"));
        this.AdminItemMenu = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.AdminItemMenu"));
        this.DifficultyPeace = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.DifficultyPeace"));
        this.DifficultyEasy = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.DifficultyEasy"));
        this.DifficultyNormal = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.DifficultyNormal"));
        this.DifficultyHard = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.DifficultyHard"));
        this.DifficultyMenu = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.DifficultyMenu"));
        this.GamemodeMenu = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.GamemodeMenu"));
        this.TimeMenu = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TimeMenu"));
        this.ToolsMenu = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.ToolsMenu"));
        this.EffectsMenu = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.EffectsMenu"));
        this.ClearChat = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.ClearChat"));
        this.CowTroll = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.CowTroll"));
        this.TrollMenu = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.TrollMenu"));
        this.CowTrollPlayer = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.CowTrollPlayer"));
        this.LightningTrollPlayer = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.LightningTrollPlayer"));
        this.LightningTroll = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.LightningTroll"));
        this.BlindnessTroll = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.BlindnessTroll"));
        this.BlindnessTrollPlayer = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.BlindnessTrollPlayer"));
        this.SlownessTroll = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SlownessTroll"));
        this.SlownessTrollPlayer = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.SlownessTrollPlayer"));
        this.NauseaTroll = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.NauseaTroll"));
        this.NauseaTrollPlayer = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.NauseaTrollPlayer"));
        this.JumpTroll = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.JumpTroll"));
        this.JumpTrollPlayer = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.JumpTrollPlayer"));
        this.WeaknessTroll = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.WeaknessTroll"));
        this.WeaknessTrollPlayer = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.WeaknessTrollPlayer"));
        this.MobManagerMenu = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.MobManagerMenu"));
        this.MobClear = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.MobClear"));
        this.FlyMenu = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.FlyMenu"));
        this.VanishMenu = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.VanishMenu"));
        this.FeedAndHealMenu = Utils.chat( me.refrac.staff.Main.getPlugin().getConfig().getString("Messages.FeedAndHealMenu"));

    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getView().getTitle().equals(InvNames.invname) || e.getView().getTitle().equals(InvNames.secInv) || e.getView().getTitle().equals(InvNames.timeset) || e.getView().getTitle().equals(InvNames.whitelist) || e.getView().getTitle().equals(InvNames.weather) || e.getView().getTitle().equals(InvNames.effects) || e.getView().getTitle().equals(InvNames.speed) || e.getView().getTitle().equals(InvNames.jumpboost) || e.getView().getTitle().equals(InvNames.tools) || e.getView().getTitle().equals(InvNames.extramobs) || e.getView().getTitle().equals(InvNames.mobs) || e.getView().getTitle().equals(InvNames.difficulty) || e.getView().getTitle().equals(InvNames.strength) || e.getView().getTitle().equals(InvNames.servermanager) || e.getView().getTitle().equals(InvNames.adminitems) || e.getView().getTitle().equals(InvNames.troll) || e.getView().getTitle().equals(InvNames.mobmanager) || e.getView().getTitle().equals(InvNames.flymenu) || e.getView().getTitle().equals(InvNames.vanishmenu) || e.getView().getTitle().equals(InvNames.feedandhealmenu) || e.getView().getTitle().equals(InvNames.bInv)) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }
        }
        Player p = (Player)e.getWhoClicked();
        if (e.getCurrentItem() == null)
            return;
        if (e.getCurrentItem().equals( Items.stone(p) )) {
            p.setGameMode(GameMode.CREATIVE);
            p.sendMessage( this.prefix + this.DoubleArrow + this.Creative );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.dirt(p) )) {
            p.setGameMode(GameMode.SURVIVAL);
            p.sendMessage( this.prefix + this.DoubleArrow + this.Survival );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Grass(p) )) {
            p.setGameMode(GameMode.SPECTATOR);
            p.sendMessage( this.prefix + this.DoubleArrow + this.Spectator );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.CobbleStone(p) )) {
            p.setGameMode(GameMode.ADVENTURE);
            p.sendMessage( this.prefix + this.DoubleArrow + this.Adventure );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Blaze(p) )) {
            if(!p.hasPermission("ustaffmode.gamemode")) return;
            p.openInventory(InvCreator.secInv);
            p.sendMessage(prefix + DoubleArrow + GamemodeMenu);
        }
        if (e.getCurrentItem().equals( Items.Barrier(p) )) {
            if(!p.hasPermission("ustaffmode.time")) return;
            p.openInventory(InvCreator.timeset);
            p.sendMessage(prefix + DoubleArrow + TimeMenu);
        }
        if (e.getCurrentItem().equals( Items.Sponge(p) )) {
            p.setHealth(20.0);
            p.sendMessage( this.prefix + this.DoubleArrow + this.Heal );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Bread(p) )) {
            p.setFoodLevel(20);
            p.sendMessage( this.prefix + this.DoubleArrow + this.Feed );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.WhitelistON(p) )) {
            Bukkit.getServer().setWhitelist(true);
            p.sendMessage( this.prefix + this.DoubleArrow + this.WhitelistON );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.WhitelistOFF(p) )) {
            Bukkit.getServer().setWhitelist(false);
            p.sendMessage( this.prefix + this.DoubleArrow + this.WhitelistOFF );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.WeatherRain(p) )) {
            World world = p.getWorld();
            world.setStorm(true);
            p.sendMessage( this.prefix + this.DoubleArrow + this.WeatherRain );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.WeatherClear(p) )) {
            World world = p.getWorld();
            world.setStorm(false);
            p.sendMessage( this.prefix + this.DoubleArrow + this.WeatherClear );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.SIXAM(p) )) {
            p.getWorld().setTime(24000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeSixAM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.SEVENAM(p) )) {
            p.getWorld().setTime(1000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeSevenAM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.EIGHTAM(p) )) {
            p.getWorld().setTime(2000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeEightAM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.NINEAM(p) )) {
            p.getWorld().setTime(3000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeNineAM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.TENAM(p) )) {
            p.getWorld().setTime(4000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeTenAM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.ELEVENAM(p) )) {
            p.getWorld().setTime(5000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeElevenAM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.TWELVEPM(p) )) {
            p.getWorld().setTime(6000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeTwelvePM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.ONEPM(p) )) {
            p.getWorld().setTime(7000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeOnePM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.TWOPM(p) )) {
            p.getWorld().setTime(8000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeTwoPM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.THREEPM(p) )) {
            p.getWorld().setTime(9000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeThreePM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.FOURPM(p) )) {
            p.getWorld().setTime(10000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeFourPM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.FIVEPM(p) )) {
            p.getWorld().setTime(11000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeFivePM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.SIXPM(p) )) {
            p.getWorld().setTime(12000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeSixPM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.SEVENPM(p) )) {
            p.getWorld().setTime(13000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeSevenPM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.EIGHTPM(p) )) {
            p.getWorld().setTime(14000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeEightPM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.NINEPM(p) )) {
            p.getWorld().setTime(15000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeNinePM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.TENPM(p) )) {
            p.getWorld().setTime(16000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeTenPM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.ELEVENPM(p) )) {
            p.getWorld().setTime(17000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeElevenPM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.TWELVEAM(p) )) {
            p.getWorld().setTime(18000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeTwelveAM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.ONEAM(p) )) {
            p.getWorld().setTime(19000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeOneAM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.TWOAM(p) )) {
            p.getWorld().setTime(18000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeTwoAM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.THREEAM(p) )) {
            p.getWorld().setTime(21000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeThreeAM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.FOURAM(p) )) {
            p.getWorld().setTime(22000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeFourAM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.FIVEAM(p) )) {
            p.getWorld().setTime(22000L);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TimeFiveAM );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.BACK(p) )) {
            p.sendMessage( this.prefix + this.DoubleArrow + this.MainMenu );
            p.openInventory(InvCreator.StaffGui);
        }
        if (e.getCurrentItem().equals( Items.TOOLS(p) )) {
            if(!p.hasPermission("ustaffmode.tools")) return;
            p.openInventory(InvCreator.tools);
            p.sendMessage(prefix + DoubleArrow + ToolsMenu);
        }
        if (e.getCurrentItem().equals( Items.FlyOn(p) )) {
            p.setAllowFlight(true);
            p.setFlying(true);
            p.sendMessage( this.prefix + this.DoubleArrow + this.FlyON );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.FlyOff(p) )) {
            p.setAllowFlight(false);
            p.setFlying(false);
            p.sendMessage( this.prefix + this.DoubleArrow + this.FlyOFF );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.InvClear(p) )) {
            p.getInventory().clear();
            p.sendMessage( this.prefix + this.DoubleArrow + this.ClearInv );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Speed(p) )) {
            p.openInventory(InvCreator.speed);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpeedMenu );
        }
        if (e.getCurrentItem().equals( Items.JumpBoost(p) )) {
            p.openInventory(InvCreator.jumpboost);
            p.sendMessage( this.prefix + this.DoubleArrow + this.JumpMenu );
        }
        if (e.getCurrentItem().equals( Items.EFFECTS(p) )) {
            if(!p.hasPermission("ustaffmode.effects")) return;
            p.openInventory(InvCreator.effects);
            p.sendMessage( this.prefix + this.DoubleArrow + this.EffectsMenu );
        }
        if (e.getCurrentItem().equals( Items.Speed1(p) )) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 1));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Speed1 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.RemoveEffects(p) )) {
            p.getActivePotionEffects().clear();
            for (PotionEffect pe : p.getActivePotionEffects()) {
                p.removePotionEffect(pe.getType());
            }
            p.sendMessage( this.prefix + this.DoubleArrow + this.EffectsClear );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Speed2(p) )) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 2));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Speed2 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Speed3(p) )) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 3));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Speed3 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Speed4(p) )) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 4));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Speed4 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Speed5(p) )) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 5));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Speed5 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Speed6(p) )) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 6));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Speed6 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Speed7(p) )) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 7));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Speed7 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Speed8(p) )) {
            p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 180000000, 8));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Speed8 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Jumpboost1(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 1));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Jump1 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Jumpboost2(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 2));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Jump2 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Jumpboost3(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 3));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Jump3 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Jumpboost4(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 4));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Jump4 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Jumpboost5(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 5));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Jump5 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Jumpboost6(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 6));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Jump6 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Jumpboost7(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 7));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Jump7 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Jumpboost8(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 180000000, 8));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Jump8 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobMenu(p) )) {
            if(!p.hasPermission("uultimatestaffmodemode.mobs")) return;
            p.openInventory(InvCreator.mobs);
            p.sendMessage( this.prefix + this.DoubleArrow + this.MobMenu );
        }
        if (e.getCurrentItem().equals( Items.MobCreeper(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.CREEPER);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnCreeper );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobSkeleton(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.SKELETON);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnSkeleton );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobSpider(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.SPIDER);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnSpider );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobZombie(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.ZOMBIE);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnZombie );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobSlime(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.SLIME);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnSlime );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobGhast(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.GHAST);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnGhast );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobZombiePig(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.PIG_ZOMBIE);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnZombiePig );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobEnderman(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.ENDERMAN);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnEnderman );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobCaveSpider(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.CAVE_SPIDER);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnCaveSpider );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobSilverFish(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.SILVERFISH);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnSilverfish );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobBlaze(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.BLAZE);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnBlaze );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.PotionNight(p) )) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 10000000, 0));
            p.sendMessage( this.prefix + this.DoubleArrow + this.NightVision );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobMagmaCube(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.MAGMA_CUBE);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnMagmaCube );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobBat(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.BAT);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnBat );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobWitch(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.WITCH);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnWitch );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobPig(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.PIG);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnPig );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobSheep(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.SHEEP);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnSheep );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobCow(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.COW);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnCow );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobChicken(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.CHICKEN);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnChicken );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobSquid(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.SQUID);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnSquid );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobWolf(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.WOLF);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnWolf );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobMooshroom(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.MUSHROOM_COW);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnMushroom );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobOcelot(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.OCELOT);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnOcelot );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobHorse(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.HORSE);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnHorse );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobVillager(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.VILLAGER);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnVillager );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.ExtraMobs(p) )) {
            p.openInventory(InvCreator.extramobs);
            p.sendMessage( this.prefix + this.DoubleArrow + this.ExtraMobMenu );
        }
        if (e.getCurrentItem().equals( Items.MobIron(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.IRON_GOLEM);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnIronGolem );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobSnow(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.SNOWMAN);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnSnowGolem );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobGiant(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.GIANT);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnGiant );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobWither(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.WITHER);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnWither );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobDragon(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.ENDER_DRAGON);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnEnderDragon );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobRabbit(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.RABBIT);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnRabbit );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.MobGuardian(p) )) {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.GUARDIAN);
            p.sendMessage( this.prefix + this.DoubleArrow + this.SpawnGuardian );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Invis(p) )) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 10000000, 0));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Invisibility );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.PotionWater(p) )) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 10000000, 0));
            p.sendMessage( this.prefix + this.DoubleArrow + this.WatherBreathing );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.StrengthMenu(p) )) {
            p.openInventory(InvCreator.strength);
            p.sendMessage( this.prefix + this.DoubleArrow + this.StrengthMenu );
        }
        if (e.getCurrentItem().equals( Items.Strength1(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 1));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Strength1 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Strength2(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 2));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Strength2 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Strength3(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 3));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Strength3 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Strength4(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 4));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Strength4 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Strength5(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 5));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Strength5 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Strength6(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 6));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Strength6 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Strength7(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 7));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Strength7 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Strength8(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 180000000, 8));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Strength8 );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Slowness(p) )) {
            p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 180000000, 0));
            p.sendMessage( this.prefix + this.DoubleArrow + this.Slowness );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.Support(p) )) {
            p.sendMessage( this.prefix + this.DoubleArrow + ChatColor.GRAY + "Support:" + ChatColor.RED + " https://discord.io/RefracDev");
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.ServerManager(p) )) {
            if(!p.hasPermission("ustaffmode.servermanager")) return;
            p.openInventory(InvCreator.servermanager);
            p.sendMessage( this.prefix + this.DoubleArrow + this.ServerManagerMenu );
        }
        if (e.getCurrentItem().equals( Items.AdminSword(p) )) {
            ItemStack is = new ItemStack(Material.DIAMOND_SWORD, 1);
            ItemMeta isMeta = is.getItemMeta();
            isMeta.addEnchant(Enchantment.DAMAGE_ALL, 1000, true);
            isMeta.addEnchant(Enchantment.DURABILITY, 1000, true);
            isMeta.setDisplayName(new StringBuilder().append(ChatColor.RED).append(ChatColor.BOLD).append(ChatColor.UNDERLINE).append("Admin Sword").toString());
            is.setItemMeta(isMeta);
            p.getInventory().addItem( is );
            p.sendMessage( this.prefix + this.DoubleArrow + this.AdminSword );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.AdminStick(p) )) {
            ItemStack is = new ItemStack(Material.STICK, 1);
            ItemMeta isMeta = is.getItemMeta();
            isMeta.addEnchant(Enchantment.KNOCKBACK, 15, true);
            isMeta.addEnchant(Enchantment.DURABILITY, 1000, true);
            isMeta.setDisplayName(new StringBuilder().append(ChatColor.RED).append(ChatColor.BOLD).append(ChatColor.UNDERLINE).append("Admin Stick").toString());
            is.setItemMeta(isMeta);
            p.getInventory().addItem( is );
            p.sendMessage( this.prefix + this.DoubleArrow + this.AdminStick );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.AdminBow(p) )) {
            ItemStack is = new ItemStack(Material.BOW, 1);
            ItemStack is2 = new ItemStack(Material.ARROW, 1);
            ItemMeta isMeta2 = is.getItemMeta();
            isMeta2.addEnchant(Enchantment.ARROW_INFINITE, 1000, true);
            isMeta2.addEnchant(Enchantment.DURABILITY, 1000, true);
            isMeta2.addEnchant(Enchantment.ARROW_KNOCKBACK, 1000, true);
            isMeta2.addEnchant(Enchantment.ARROW_FIRE, 1000, true);
            isMeta2.addEnchant(Enchantment.ARROW_DAMAGE, 1000, true);
            isMeta2.setDisplayName( String.valueOf ( ChatColor.RED ) + ChatColor.BOLD + ChatColor.UNDERLINE + "Admin Bow" );
            is.setItemMeta(isMeta2);
            ItemMeta is2Meta = is2.getItemMeta();
            is2Meta.addEnchant(Enchantment.DURABILITY, 1000, true);
            is2Meta.setDisplayName( String.valueOf ( ChatColor.RED ) + ChatColor.BOLD + ChatColor.UNDERLINE + "Admin Arrow" );
            is2.setItemMeta(is2Meta);
            p.getInventory().addItem( is );
            p.getInventory().addItem( is2 );
            p.sendMessage( this.prefix + this.DoubleArrow + this.AdminBow );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.AdminItemMenu(p) )) {
            if(!p.hasPermission("ustaffmode.adminItems")) return;
            p.openInventory(InvCreator.adminitems);
            p.sendMessage( this.prefix + this.DoubleArrow + this.AdminItemMenu );
        }
        if (e.getCurrentItem().equals( Items.DifficultyPeace(p) )) {
            Bukkit.getServer().dispatchCommand( Bukkit.getConsoleSender() , "difficulty 0");
            p.sendMessage( this.prefix + this.DoubleArrow + this.DifficultyPeace );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.DifficultyEasy(p) )) {
            Bukkit.getServer().dispatchCommand( Bukkit.getConsoleSender() , "difficulty 1");
            p.sendMessage( this.prefix + this.DoubleArrow + this.DifficultyEasy );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.DifficultyNormal(p) )) {
            Bukkit.getServer().dispatchCommand( Bukkit.getConsoleSender() , "difficulty 2");
            p.sendMessage( this.prefix + this.DoubleArrow + this.DifficultyNormal );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.DifficultyHard(p) )) {
            Bukkit.getServer().dispatchCommand( Bukkit.getConsoleSender() , "difficulty 3");
            p.sendMessage( this.prefix + this.DoubleArrow + this.DifficultyHard );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.DifficultyMenu(p) )) {
            if(!p.hasPermission("ustaffmode.difficulty")) return;
            p.openInventory(InvCreator.difficulty);
            p.sendMessage( this.prefix + this.DoubleArrow + this.DifficultyMenu );
        }
        if (e.getCurrentItem().equals( Items.TrollMenu(p) )) {
            if(!p.hasPermission("ustaffmode.trolls")) return;
            p.openInventory(InvCreator.troll);
            p.sendMessage( this.prefix + this.DoubleArrow + this.TrollMenu );
        }
        if (e.getCurrentItem().equals( Items.MobManagerMenu(p) )) {
            if(!p.hasPermission("ustaffmode.mobmanager")) return;
            p.openInventory(InvCreator.mobmanager);
            p.sendMessage( this.prefix + this.DoubleArrow + this.MobManagerMenu );
        }
        if (e.getCurrentItem().equals( Items.FlyMenu(p) )) {
            p.openInventory(InvCreator.flymenu);
            p.sendMessage( this.prefix + this.DoubleArrow + this.FlyMenu );
        }
        if (e.getCurrentItem().equals( Items.VanishMenu(p) )) {
            p.openInventory(InvCreator.vanishmenu);
            p.sendMessage( this.prefix + this.DoubleArrow + this.VanishMenu );
        }
        if (e.getCurrentItem().equals( Items.FeedAndHealMenu(p) )) {
            p.openInventory(InvCreator.feedandhealmenu);
            p.sendMessage( this.prefix + this.DoubleArrow + this.FeedAndHealMenu );
        }
        if (e.getCurrentItem().equals( Items.MobClear(p) )) {
            p.sendMessage( this.prefix + this.DoubleArrow + this.MobClear );
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
        if (e.getCurrentItem().equals( Items.LightningTroll(p) ))  {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.getWorld().strikeLightningEffect(players.getLocation());
                players.getWorld().strikeLightningEffect(players.getLocation());
                players.getWorld().strikeLightningEffect(players.getLocation());
                players.sendMessage( this.prefix + this.DoubleArrow + this.LightningTrollPlayer );
                p.sendMessage( this.prefix + this.DoubleArrow + this.LightningTroll );
                e.getWhoClicked().closeInventory();
            }
        }
        if (e.getCurrentItem().equals( Items.SlownessTroll(p) ))  {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20000, 4));
                players.sendMessage( this.prefix + this.DoubleArrow + this.SlownessTrollPlayer );
                p.sendMessage( this.prefix + this.DoubleArrow + this.SlownessTroll );
                e.getWhoClicked().closeInventory();
            }
        }
        if (e.getCurrentItem().equals( Items.JumpTroll(p) ))  {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20000, 4));
                players.sendMessage( this.prefix + this.DoubleArrow + this.JumpTrollPlayer );
                p.sendMessage( this.prefix + this.DoubleArrow + this.JumpTroll );
                e.getWhoClicked().closeInventory();
            }
        }
        if (e.getCurrentItem().equals( Items.WeaknessTroll(p) ))  {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 20000, 4));
                players.sendMessage( this.prefix + this.DoubleArrow + this.WeaknessTrollPlayer );
                p.sendMessage( this.prefix + this.DoubleArrow + this.WeaknessTroll );
                e.getWhoClicked().closeInventory();
            }
        }
        if (e.getCurrentItem().equals( Items.NauseaTroll(p) ))  {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 20000, 4));
                players.sendMessage( this.prefix + this.DoubleArrow + this.NauseaTrollPlayer );
                p.sendMessage( this.prefix + this.DoubleArrow + this.NauseaTroll );
                e.getWhoClicked().closeInventory();
            }
        }
        if (e.getCurrentItem().equals( Items.BlindnessTroll(p) ))  {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20000, 4));
                players.sendMessage( this.prefix + this.DoubleArrow + this.SlownessTrollPlayer );
                p.sendMessage( this.prefix + this.DoubleArrow + this.SlownessTroll );
                e.getWhoClicked().closeInventory();
            }
        }
        if (e.getCurrentItem().equals( Items.CowTroll(p) ))  {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.getWorld().spawnEntity(players.getLocation(), EntityType.COW);
                p.sendMessage( this.prefix + this.DoubleArrow + this.CowTroll );
                players.sendMessage( this.prefix + this.DoubleArrow + this.CowTrollPlayer );
                e.getWhoClicked().closeInventory();
            }
        }
        if (e.getCurrentItem().equals( Items.ClearChat(p) ))  {
            for (Player players : Bukkit.getOnlinePlayers()) {
                for (int i = 0; i < 600; ++i) {
                    players.sendMessage("");
                }
            }
            Bukkit.broadcastMessage( this.prefix + this.DoubleArrow + this.ClearChat );
            Bukkit.broadcastMessage(" ");
            e.getWhoClicked().closeInventory();
        }

        if (e.getCurrentItem().equals( Items.VanishON(p) )) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.hidePlayer(p);
                p.setAllowFlight(true);
                p.setFlying(true);
            }
            p.sendMessage( this.prefix + this.DoubleArrow + this.VanishON );
            e.getWhoClicked().closeInventory();
        }
        if (e.getCurrentItem().equals( Items.VanishOFF(p) )) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.showPlayer(p);
                p.setAllowFlight(false);
                p.setFlying(false);
            }
            p.sendMessage( this.prefix + this.DoubleArrow + this.VanishOFF );
            e.getWhoClicked().closeInventory();
        }
        e.getCurrentItem().equals( Items.Glass(p) );
        if (e.getCurrentItem().equals( Items.Blaze(p) )) {
            InvCreator.secInv.setItem(5, Items.stone(p));
            InvCreator.secInv.setItem(3, Items.dirt(p));
            InvCreator.secInv.setItem(1, Items.CobbleStone(p));
            InvCreator.secInv.setItem(7, Items.Grass(p));
            InvCreator.secInv.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.secInv.getItem(i) == null) {
                    InvCreator.secInv.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.secInv);
            }
        }
        if (e.getCurrentItem().equals( Items.Gravel(p) )) {
            InvCreator.bInv.setItem(4, Items.Sponge(p));
            InvCreator.bInv.setItem(3, Items.Bread(p));
            InvCreator.bInv.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.bInv.getItem(i) == null) {
                    InvCreator.bInv.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.bInv);
            }
        }
        if (e.getCurrentItem().equals( Items.Barrier(p) )) {
            InvCreator.timeset.setItem(4, Items.FOURAM(p));
            InvCreator.timeset.setItem(3, Items.THREEAM(p));
            InvCreator.timeset.setItem(0, Items.TWELVEAM(p));
            InvCreator.timeset.setItem(1, Items.ONEAM(p));
            InvCreator.timeset.setItem(2, Items.TWOAM(p));
            InvCreator.timeset.setItem(6, Items.SIXAM(p));
            InvCreator.timeset.setItem(7, Items.SEVENAM(p));
            InvCreator.timeset.setItem(5, Items.FIVEAM(p));
            InvCreator.timeset.setItem(8, Items.EIGHTAM(p));
            InvCreator.timeset.setItem(9, Items.NINEAM(p));
            InvCreator.timeset.setItem(10, Items.TENAM(p));
            InvCreator.timeset.setItem(11, Items.ELEVENAM(p));
            InvCreator.timeset.setItem(12, Items.TWELVEPM(p));
            InvCreator.timeset.setItem(13, Items.ONEPM(p));
            InvCreator.timeset.setItem(14, Items.TWOPM(p));
            InvCreator.timeset.setItem(15, Items.THREEPM(p));
            InvCreator.timeset.setItem(16, Items.FOURPM(p));
            InvCreator.timeset.setItem(17, Items.FIVEPM(p));
            InvCreator.timeset.setItem(18, Items.SIXPM(p));
            InvCreator.timeset.setItem(19, Items.SEVENPM(p));
            InvCreator.timeset.setItem(20, Items.EIGHTPM(p));
            InvCreator.timeset.setItem(21, Items.NINEPM(p));
            InvCreator.timeset.setItem(22, Items.TENPM(p));
            InvCreator.timeset.setItem(23, Items.ELEVENPM(p));
            InvCreator.timeset.setItem(24, Items.Glass(p));
            InvCreator.timeset.setItem(25, Items.Glass(p));
            InvCreator.timeset.setItem(26, Items.BACK(p));
            for (int i = 0; i < 27; ++i) {
                if (InvCreator.timeset.getItem(i) == null) {
                    InvCreator.timeset.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.timeset);
            }
        }
        if (e.getCurrentItem().equals( Items.Whitelist(p) )) {
            InvCreator.whitelist.setItem(3, Items.WhitelistON(p));
            InvCreator.whitelist.setItem(5, Items.WhitelistOFF(p));
            InvCreator.whitelist.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.whitelist.getItem(i) == null) {
                    InvCreator.whitelist.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.whitelist);
            }
        }
        if (e.getCurrentItem().equals( Items.FlyMenu(p) )) {
            InvCreator.flymenu.setItem(3, Items.FlyOn(p));
            InvCreator.flymenu.setItem(5, Items.FlyOff(p));
            InvCreator.flymenu.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.flymenu.getItem(i) == null) {
                    InvCreator.flymenu.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.flymenu);
            }
        }
        if (e.getCurrentItem().equals( Items.VanishMenu(p) )) {
            InvCreator.vanishmenu.setItem(3, Items.VanishON(p));
            InvCreator.vanishmenu.setItem(5, Items.VanishOFF(p));
            InvCreator.vanishmenu.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.vanishmenu.getItem(i) == null) {
                    InvCreator.vanishmenu.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.vanishmenu);
            }
        }
        if (e.getCurrentItem().equals( Items.FeedAndHealMenu(p) )) {
            InvCreator.feedandhealmenu.setItem(3, Items.Bread(p));
            InvCreator.feedandhealmenu.setItem(5, Items.Sponge(p));
            InvCreator.feedandhealmenu.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.feedandhealmenu.getItem(i) == null) {
                    InvCreator.feedandhealmenu.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.feedandhealmenu);
            }
        }


        if (e.getCurrentItem().equals( Items.Weather(p) )) {
            InvCreator.weather.setItem(3, Items.WeatherRain(p));
            InvCreator.weather.setItem(5, Items.WeatherClear(p));
            InvCreator.weather.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.weather.getItem(i) == null) {
                    InvCreator.weather.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.weather);
            }
        }
        if (e.getCurrentItem().equals( Items.TOOLS(p) )) {
            InvCreator.tools.setItem(1, Items.FeedAndHealMenu(p));
            InvCreator.tools.setItem(6, Items.InvClear(p));
            InvCreator.tools.setItem(0, Items.FlyMenu(p));
            InvCreator.tools.setItem(7, Items.ClearChat(p));
            InvCreator.tools.setItem(2, Items.VanishMenu(p));
            InvCreator.tools.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.tools.getItem(i) == null) {
                    InvCreator.tools.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.tools);
            }
        }
        if (e.getCurrentItem().equals( Items.EFFECTS(p) )) {
            InvCreator.effects.setItem(4, Items.PotionWater(p));
            InvCreator.effects.setItem(3, Items.Invis(p));
            InvCreator.effects.setItem(0, Items.JumpBoost(p));
            InvCreator.effects.setItem(1, Items.Speed(p));
            InvCreator.effects.setItem(2, Items.StrengthMenu(p));
            InvCreator.effects.setItem(6, Items.Slowness(p));
            InvCreator.effects.setItem(7, Items.RemoveEffects(p));
            InvCreator.effects.setItem(5, Items.PotionNight(p));
            InvCreator.effects.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.effects.getItem(i) == null) {
                    InvCreator.effects.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.effects);
            }
        }
        if (e.getCurrentItem().equals( Items.Speed(p) )) {
            InvCreator.speed.setItem(4, Items.Speed5(p));
            InvCreator.speed.setItem(3, Items.Speed4(p));
            InvCreator.speed.setItem(0, Items.Speed1(p));
            InvCreator.speed.setItem(1, Items.Speed2(p));
            InvCreator.speed.setItem(2, Items.Speed3(p));
            InvCreator.speed.setItem(6, Items.Speed7(p));
            InvCreator.speed.setItem(7, Items.Speed8(p));
            InvCreator.speed.setItem(5, Items.Speed6(p));
            InvCreator.speed.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.speed.getItem(i) == null) {
                    InvCreator.speed.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.speed);
            }
        }
        if (e.getCurrentItem().equals( Items.JumpBoost(p) )) {
            InvCreator.jumpboost.setItem(4, Items.Jumpboost5(p));
            InvCreator.jumpboost.setItem(3, Items.Jumpboost4(p));
            InvCreator.jumpboost.setItem(0, Items.Jumpboost1(p));
            InvCreator.jumpboost.setItem(1, Items.Jumpboost2(p));
            InvCreator.jumpboost.setItem(2, Items.Jumpboost3(p));
            InvCreator.jumpboost.setItem(6, Items.Jumpboost7(p));
            InvCreator.jumpboost.setItem(7, Items.Jumpboost8(p));
            InvCreator.jumpboost.setItem(5, Items.Jumpboost6(p));
            InvCreator.jumpboost.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.jumpboost.getItem(i) == null) {
                    InvCreator.jumpboost.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.jumpboost);
            }
        }
        if (e.getCurrentItem().equals( Items.MobMenu(p) )) {
            InvCreator.mobs.setItem(4, Items.MobSlime(p));
            InvCreator.mobs.setItem(3, Items.MobZombie(p));
            InvCreator.mobs.setItem(0, Items.MobCreeper(p));
            InvCreator.mobs.setItem(1, Items.MobSkeleton(p));
            InvCreator.mobs.setItem(2, Items.MobSpider(p));
            InvCreator.mobs.setItem(6, Items.MobZombiePig(p));
            InvCreator.mobs.setItem(7, Items.MobEnderman(p));
            InvCreator.mobs.setItem(5, Items.MobGhast(p));
            InvCreator.mobs.setItem(8, Items.MobCaveSpider(p));
            InvCreator.mobs.setItem(9, Items.MobSilverFish(p));
            InvCreator.mobs.setItem(10, Items.MobBlaze(p));
            InvCreator.mobs.setItem(11, Items.MobMagmaCube(p));
            InvCreator.mobs.setItem(12, Items.MobBat(p));
            InvCreator.mobs.setItem(13, Items.MobWitch(p));
            InvCreator.mobs.setItem(14, Items.MobPig(p));
            InvCreator.mobs.setItem(15, Items.MobSheep(p));
            InvCreator.mobs.setItem(16, Items.MobCow(p));
            InvCreator.mobs.setItem(17, Items.MobChicken(p));
            InvCreator.mobs.setItem(18, Items.MobSquid(p));
            InvCreator.mobs.setItem(19, Items.MobWolf(p));
            InvCreator.mobs.setItem(20, Items.MobMooshroom(p));
            InvCreator.mobs.setItem(21, Items.MobOcelot(p));
            InvCreator.mobs.setItem(22, Items.MobHorse(p));
            InvCreator.mobs.setItem(23, Items.MobVillager(p));
            InvCreator.mobs.setItem(24, Items.MobRabbit(p));
            InvCreator.mobs.setItem(25, Items.ExtraMobs(p));
            InvCreator.mobs.setItem(26, Items.BACK(p));
            for (int i = 0; i < 27; ++i) {
                if (InvCreator.mobs.getItem(i) == null) {
                    InvCreator.mobs.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.mobs);
            }
        }
        if (e.getCurrentItem().equals( Items.ExtraMobs(p) )) {
            InvCreator.extramobs.setItem(4, Items.MobWither(p));
            InvCreator.extramobs.setItem(3, Items.MobGiant(p));
            InvCreator.extramobs.setItem(0, Items.MobIron(p));
            InvCreator.extramobs.setItem(1, Items.MobSnow(p));
            InvCreator.extramobs.setItem(2, Items.MobGuardian(p));
            InvCreator.extramobs.setItem(5, Items.MobDragon(p));
            InvCreator.extramobs.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.extramobs.getItem(i) == null) {
                    InvCreator.extramobs.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.extramobs);
            }
        }
        if (e.getCurrentItem().equals( Items.DifficultyMenu(p) )) {
            InvCreator.difficulty.setItem(3, Items.DifficultyEasy(p));
            InvCreator.difficulty.setItem(1, Items.DifficultyPeace(p));
            InvCreator.difficulty.setItem(7, Items.DifficultyHard(p));
            InvCreator.difficulty.setItem(5, Items.DifficultyNormal(p));
            InvCreator.difficulty.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.difficulty.getItem(i) == null) {
                    InvCreator.difficulty.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.difficulty);
            }
        }
        if (e.getCurrentItem().equals( Items.StrengthMenu(p) )) {
            InvCreator.strength.setItem(4, Items.Strength5(p));
            InvCreator.strength.setItem(3, Items.Strength4(p));
            InvCreator.strength.setItem(0, Items.Strength1(p));
            InvCreator.strength.setItem(1, Items.Strength2(p));
            InvCreator.strength.setItem(2, Items.Strength3(p));
            InvCreator.strength.setItem(6, Items.Strength7(p));
            InvCreator.strength.setItem(7, Items.Strength8(p));
            InvCreator.strength.setItem(5, Items.Strength6(p));
            InvCreator.strength.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.strength.getItem(i) == null) {
                    InvCreator.strength.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.strength);
            }
        }
        if (e.getCurrentItem().equals( Items.ServerManager(p) )) {
            InvCreator.servermanager.setItem(1, Items.MobManagerMenu(p));
            InvCreator.servermanager.setItem(3, Items.Weather(p));
            InvCreator.servermanager.setItem(5, Items.Whitelist(p));
            InvCreator.servermanager.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.servermanager.getItem(i) == null) {
                    InvCreator.servermanager.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.servermanager);
            }
        }
        if (e.getCurrentItem().equals( Items.AdminItemMenu(p) )) {
            InvCreator.adminitems.setItem(5, Items.AdminBow(p));
            InvCreator.adminitems.setItem(3, Items.AdminSword(p));
            InvCreator.adminitems.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.adminitems.getItem(i) == null) {
                    InvCreator.adminitems.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.adminitems);
            }
        }
        if (e.getCurrentItem().equals( Items.TrollMenu(p) )) {
            InvCreator.troll.setItem(4, Items.NauseaTroll(p));
            InvCreator.troll.setItem(3, Items.SlownessTroll(p));
            InvCreator.troll.setItem(0, Items.CowTroll(p));
            InvCreator.troll.setItem(1, Items.LightningTroll(p));
            InvCreator.troll.setItem(2, Items.BlindnessTroll(p));
            InvCreator.troll.setItem(5, Items.JumpTroll(p));
            InvCreator.troll.setItem(6, Items.WeaknessTroll(p));
            InvCreator.troll.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.troll.getItem(i) == null) {
                    InvCreator.troll.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.troll);
            }
        }
        if (e.getCurrentItem().equals( Items.MobManagerMenu(p) )) {
            InvCreator.mobmanager.setItem(4, Items.MobClear(p));
            InvCreator.mobmanager.setItem(8, Items.BACK(p));
            for (int i = 0; i < 9; ++i) {
                if (InvCreator.mobmanager.getItem(i) == null) {
                    InvCreator.mobmanager.setItem(i, Items.Glass(p));
                }
                p.openInventory(InvCreator.mobmanager);
            }
        }


    }
}
