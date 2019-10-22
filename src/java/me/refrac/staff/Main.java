package me.refrac.staff;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import me.refrac.staff.commands.*;
import me.refrac.staff.menu.*;
import me.refrac.staff.utils.*;

public class Main extends JavaPlugin {

    public static Main plugin;

    public void onEnable()
    {
        // Plugin startup logic
        UpdateChecker checker;

        Logger.log(Logger.LogLevel.OUTLINE,  "********************");
        Logger.log(Logger.LogLevel.INFO, "Initializing UltimateStaffMode Version: " + Settings.VERSION);
        Logger.log(Logger.LogLevel.INFO, "Created by: " + Settings.DEVELOPER_NAME);
        Logger.log(Logger.LogLevel.INFO, "Spigot Link: " + Settings.PLUGIN_URL);
        Logger.log(Logger.LogLevel.INFO, "Support Link: " + Settings.SUPPORT_DISCORD_URL);
        Logger.log(Logger.LogLevel.OUTLINE,  "********************");
        plugin = this;

        Logger.log(Logger.LogLevel.INFO, "Plugin Loading...");
        Logger.log(Logger.LogLevel.INFO, "Registering Managers...");
        register();
        MetricsLite metrics = new MetricsLite (this);
        Logger.log(Logger.LogLevel.INFO, "Managers Registered!");

        Logger.log(Logger.LogLevel.INFO, "Registering Commands...");
        registerCommands();
        Logger.log(Logger.LogLevel.INFO, "Commands Registered!");

        Logger.log(Logger.LogLevel.INFO, "Loading Config's...");
        saveDefaultConfig();
        Logger.log(Logger.LogLevel.INFO, "Config's Registered!");
        Logger.log(Logger.LogLevel.SUCCESS, "UltimateStaffMode Version: " + Settings.VERSION + " Loaded.");
        Logger.log(Logger.LogLevel.OUTLINE,  "********************");

        Logger.log(Logger.LogLevel.INFO, "UltimateStaffMode Version: " + Settings.VERSION + " checking for updates...");
        checker = new UpdateChecker(plugin);
        if (checker.isConnected())
        {
            if (checker.hasUpdate())
            {
                Logger.log(Logger.LogLevel.OUTLINE, "********************");
                Logger.log(Logger.LogLevel.INFO, "UltimateStaffMode is outdated!");
                Logger.log(Logger.LogLevel.INFO, "Newest version: " + checker.getLatestVersion());
                Logger.log(Logger.LogLevel.INFO, "Your version: " + plugin.getDescription ().getVersion ());
                Logger.log(Logger.LogLevel.INFO, "Download: " + Settings.PLUGIN_URL);
                Logger.log(Logger.LogLevel.OUTLINE, "********************");
            }
        }
    }

    public void onDisable() {
        // Plugin shutdown logic
        plugin = null;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static Main getPlugin() {
        return (Main) getPlugin((Class) Main.class);
    }

    public static Plugin getPlugin2() {
        return plugin;
    }

    public void registerCommands() {
        this.getCommand("staffmode").setExecutor(new MainCommand());
    }

    public void register() {
        this.getServer().getPluginManager().registerEvents(new Event(), this);
        this.getServer().getPluginManager().registerEvents(new JoinEvent(), this);
    }

    public static void registerEvents(final Plugin plugin, final Listener... listeners) {
        for (final Listener listener : listeners) {
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }
}
