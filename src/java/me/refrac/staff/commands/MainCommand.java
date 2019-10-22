package me.refrac.staff.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.event.Listener;

import me.refrac.staff.Main;
import me.refrac.staff.inv.InvCreator;
import me.refrac.staff.inv.Items;
import me.refrac.staff.utils.Settings;
import me.refrac.staff.utils.UpdateChecker;
import me.refrac.staff.utils.Utils;

public class MainCommand implements CommandExecutor, Listener {


    public static final String getLogger = null;
    public UpdateChecker checker;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getServer().getLogger().info("Only players can do this not the console!");
            return true;
        }
        Player p = (Player) sender;
        if (p.hasPermission("ustaffmode.open")) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.YELLOW + "****************************************************");
                sender.sendMessage(" ");
                sender.sendMessage(ChatColor.GRAY + " UltimateStaffMode 5.0 Help");
                sender.sendMessage(" ");
                sender.sendMessage(ChatColor.RED + "Commands:");
                sender.sendMessage(ChatColor.GOLD + "/staffmode open (opensgui)");
                sender.sendMessage(ChatColor.GOLD + "/staffmode perms (Lists all permissions)");
                sender.sendMessage(ChatColor.GOLD + "/staffmode update (Checks for a update)");
                sender.sendMessage(ChatColor.GOLD + "/staffmode about (Shows plugin info)");
                sender.sendMessage(" ");
                sender.sendMessage(ChatColor.RED + "Permssions:");
                sender.sendMessage(ChatColor.GOLD + "ustaffmode.update (Update message on-join)");
                sender.sendMessage(ChatColor.GOLD + "(If enabled in config.yml)");
                sender.sendMessage(ChatColor.GOLD + "ustaffmode.open (Main GUI)");
                sender.sendMessage(ChatColor.GOLD + "ustaffmode.help (All Help Menus)");
                sender.sendMessage(" ");
                sender.sendMessage(ChatColor.YELLOW + "****************************************************");
            }
            if(args.length == 1){
                if(args[0].equalsIgnoreCase("perms")){
                    sender.sendMessage(ChatColor.YELLOW + "****************************************************");
                    sender.sendMessage(" ");
                    sender.sendMessage(ChatColor.RED + "Menu Permssions:");
                    sender.sendMessage(ChatColor.GOLD + "ustaffmode.gamemode (Gamemodes Menu)");
                    sender.sendMessage(ChatColor.GOLD + "ustaffmode.tools (Tools Menu)");
                    sender.sendMessage(ChatColor.GOLD + "ustaffmode.mobs (Mobs Menu)");
                    sender.sendMessage(ChatColor.GOLD + "ustaffmode.time (Time Menu)");
                    sender.sendMessage(ChatColor.GOLD + "ustaffmode.difficulty (Difficulty Menu)");
                    sender.sendMessage(ChatColor.GOLD + "ustaffmode.effects (Effects Menu)");
                    sender.sendMessage(ChatColor.GOLD + "ustaffmode.servermanager (Server Manager Menu)");
                    sender.sendMessage(ChatColor.GOLD + "ustaffmode.adminitems (Admin Items Menu)");
                    sender.sendMessage(ChatColor.GOLD + "ustaffmode.trolls (Trolls Menu)");
                    sender.sendMessage(" ");
                    sender.sendMessage(ChatColor.YELLOW + "****************************************************");
                }
                if(args.length == 1){
                    if(args[0].equalsIgnoreCase("update")){
                        sender.sendMessage(ChatColor.RED + "Checking for updates...");
                        this.checker = new UpdateChecker(Main.plugin);
                        if (this.checker.isConnected()) {
                            if (this.checker.hasUpdate()) {
                                sender.sendMessage(ChatColor.GRAY + "****************************************************");
                                sender.sendMessage(" ");
                                sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "UltimateStaffMode is outdated!");
                                sender.sendMessage(ChatColor.GREEN + "Newest version: " + this.checker.getLatestVersion());
                                sender.sendMessage(ChatColor.RED + "Your version: " + Main.plugin.getDescription().getVersion());
                                sender.sendMessage(ChatColor.GOLD + "Download: " + Settings.PLUGIN_URL);
                                sender.sendMessage(" ");
                                sender.sendMessage(ChatColor.GRAY + "****************************************************");
                            }
                            else {
                                sender.sendMessage(ChatColor.GREEN + "UltimateStaffMode is up to date!");
                            }
                        }
                    }
                }
                if(args.length == 1){
                    if(args[0].equalsIgnoreCase("about")){
                        sender.sendMessage(ChatColor.YELLOW + "****************************************************");
                        sender.sendMessage(" ");
                        sender.sendMessage(ChatColor.GRAY + " UltimateStaffMode 5.0 Info");
                        sender.sendMessage(" ");
                        sender.sendMessage(ChatColor.RED + "Plugin Info:");
                        sender.sendMessage(ChatColor.GOLD + "Plugin made by Refrac");
                        sender.sendMessage(ChatColor.GOLD + "Original Author BGHDDevelopment/Noodles");
                        sender.sendMessage(ChatColor.GOLD + "Current plugin version " + ChatColor.GREEN + Main.plugin.getDescription().getVersion());
                        sender.sendMessage(ChatColor.RED + "Support:");
                        sender.sendMessage(ChatColor.GOLD + "https://discord.gg/acpxjpF");
                        sender.sendMessage(ChatColor.RED + "Get All Commands:");
                        sender.sendMessage(ChatColor.GOLD + "/staffmode");
                        sender.sendMessage(" ");
                        sender.sendMessage(ChatColor.YELLOW + "****************************************************");
                    }
                }
            }
            if(args.length == 1){
                if(args[0].equalsIgnoreCase("open")){
                    InvCreator.StaffGui.setItem(9, Items.Blaze(p));
                    InvCreator.StaffGui.setItem(11, Items.TOOLS(p));
                    InvCreator.StaffGui.setItem(13, Items.Barrier(p));
                    InvCreator.StaffGui.setItem(17, Items.EFFECTS(p));
                    InvCreator.StaffGui.setItem(15, Items.MobMenu(p));
                    InvCreator.StaffGui.setItem(28, Items.ServerManager(p));
                    InvCreator.StaffGui.setItem(30, Items.AdminItemMenu(p));
                    InvCreator.StaffGui.setItem(32, Items.DifficultyMenu(p));
                    InvCreator.StaffGui.setItem(34, Items.TrollMenu(p));
                    for (int i = 0; i < 54; ++i) {
                        if (InvCreator.StaffGui.getItem(i) == null) {
                            InvCreator.StaffGui.setItem(i, Items.Glass(p));
                        }
                    }

                    p.openInventory(InvCreator.StaffGui);
                    p.sendMessage(String.valueOf(Utils.chat(Main.plugin.getConfig().getString("Messages.Prefix")))+ ChatColor.DARK_GRAY + ChatColor.BOLD + " >> " + ChatColor.GRAY + "You have opened the"+ ChatColor.AQUA + " " + ChatColor.BOLD + "STAFFMODE-GUI");
                } else if (args.length >= 2) {
                    p.sendMessage(ChatColor.RED + "Too many arguments!" + " Use the command like" + ChatColor.DARK_AQUA+ " /staffmode");
                }
            }
        } else {
            sender.sendMessage(ChatColor.RED + "(!) Insufficent Permissions!");
        }
        return true;

    }
}
