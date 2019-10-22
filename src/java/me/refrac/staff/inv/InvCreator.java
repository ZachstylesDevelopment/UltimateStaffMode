package me.refrac.staff.inv;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import me.refrac.staff.Main;

public class InvCreator
{
    public static Inventory StaffGui;
    public static Inventory secInv;
    public static Inventory bInv;
    public static Inventory timeset;
    public static Inventory whitelist;
    public static Inventory weather;
    public static Inventory tools;
    public static Inventory effects;
    public static Inventory jumpboost;
    public static Inventory speed;
    public static Inventory mobs;
    public static Inventory extramobs;
    public static Inventory difficulty;
    public static Inventory strength;
    public static Inventory servermanager;
    public static Inventory adminitems;
    public static Inventory troll;
    public static Inventory mobmanager;
    public static Inventory flymenu;
    public static Inventory feedandhealmenu;
    public static Inventory vanishmenu;
    public static Main plugin;

    static {
        InvCreator.StaffGui = Bukkit.createInventory(null, 54, InvNames.invname);
        InvCreator.secInv = Bukkit.createInventory(null, 9, InvNames.secInv);
        InvCreator.bInv = Bukkit.createInventory(null, 9, InvNames.bInv);
        InvCreator.timeset = Bukkit.createInventory(null, 27, InvNames.timeset);
        InvCreator.whitelist = Bukkit.createInventory(null, 9, InvNames.whitelist);
        InvCreator.weather = Bukkit.createInventory(null, 9, InvNames.weather);
        InvCreator.tools = Bukkit.createInventory(null, 9, InvNames.tools);
        InvCreator.effects = Bukkit.createInventory(null, 9, InvNames.effects);
        InvCreator.speed = Bukkit.createInventory(null, 9, InvNames.speed);
        InvCreator.jumpboost = Bukkit.createInventory(null, 9, InvNames.jumpboost);
        InvCreator.mobs = Bukkit.createInventory(null, 27, InvNames.mobs);
        InvCreator.extramobs = Bukkit.createInventory(null, 9, InvNames.extramobs);
        InvCreator.difficulty = Bukkit.createInventory(null, 9, InvNames.difficulty);
        InvCreator.strength = Bukkit.createInventory(null, 9, InvNames.strength);
        InvCreator.servermanager = Bukkit.createInventory(null, 9, InvNames.servermanager);
        InvCreator.adminitems = Bukkit.createInventory(null, 9, InvNames.adminitems);
        InvCreator.troll = Bukkit.createInventory(null, 9, InvNames.troll);
        InvCreator.mobmanager = Bukkit.createInventory(null, 9, InvNames.mobmanager);
        InvCreator.flymenu = Bukkit.createInventory(null, 9, InvNames.flymenu);
        InvCreator.vanishmenu = Bukkit.createInventory(null, 9, InvNames.vanishmenu);
        InvCreator.feedandhealmenu = Bukkit.createInventory(null, 9, InvNames.feedandhealmenu);
    }
}
