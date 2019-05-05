package me.refrac.staff;

import me.refrac.staff.maincommand.MainCmd;
import me.refrac.staff.menu.Event;
import me.refrac.staff.util.*;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;

public class Main extends JavaPlugin {
	public static Main plugin;

	public void onEnable() {
		Main.plugin = this;
		Bukkit.getPluginManager().registerEvents(new MainCmd(), this);
		PluginDescriptionFile VarUtilType = this.getDescription();
		this.getLogger().info("ULTIMATESTAFFMODE V" + VarUtilType.getVersion() + " starting...");
		this.getLogger().info("ULTIMATESTAFFMODE V" + VarUtilType.getVersion() + " loading commands...");
		this.getCommand("staffmode").setExecutor(new MainCmd());
		this.getLogger().info("ULTIMATESTAFFMODE V" + VarUtilType.getVersion() + " loading your configuration...");
		this.saveDefaultConfig();
		this.reloadConfig();
		this.register();
		this.setEnabled(true);
		getLogger().info("ULTIMATESTAFFMODE V" + VarUtilType.getVersion() + " started!");
		this.getLogger().info("ULTIMATESTAFFMODE V" + VarUtilType.getVersion() + " checking for updates...");
				getServer().getConsoleSender().sendMessage("------------------------");
				getServer().getConsoleSender().sendMessage("Your version: " + Main.plugin.getDescription().getVersion());
				getServer().getConsoleSender().sendMessage("------------------------");
	}
			{
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Main getPlugin() {
		return (Main) getPlugin((Class) Main.class);
	}

	public static Plugin getPlugin2() {
		return Main.plugin;
	}

	public void register() {
		this.getCommand("staffmode").setExecutor((CommandExecutor) new MainCmd());
		this.getServer().getPluginManager().registerEvents((Listener) new Event(), (Plugin) this);
	}

	public static void registerEvents(final Plugin plugin, final Listener... listeners) {
		for (final Listener listener : listeners) {
			Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
		}
	}
}