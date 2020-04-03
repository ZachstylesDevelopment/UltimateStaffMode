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
        plugin = this;

        register();
        MetricsLite metrics = new MetricsLite (this);
        registerCommands();
        saveDefaultConfig();
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
