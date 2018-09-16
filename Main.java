package me.zachstyles.staff;

import me.zachstyles.staff.maincommand.MainCmd;
import me.zachstyles.staff.menu.Event;
import me.zachstyles.staff.util.*;
import org.bukkit.Bukkit;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;

/**
 * 
 * @author Zachstyles
 *
 */

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
		this.registerGlow();
		this.setEnabled(true);
		getLogger().info("ULTIMATESTAFFMODE V" + VarUtilType.getVersion() + " started!");
		this.getLogger().info("ULTIMATESTAFFMODE V" + VarUtilType.getVersion() + " checking for updates...");
				getServer().getConsoleSender().sendMessage("------------------------");
				getServer().getConsoleSender().sendMessage("Your version: " + Main.plugin.getDescription().getVersion());
				getServer().getConsoleSender().sendMessage("------------------------");
	}
			{
	}
	private void registerGlow() throws IllegalArgumentException {
		try {
			Field f = Enchantment.class.getDeclaredField("acceptingNew");
			f.setAccessible(true);
			f.set(null, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Glow glow = new Glow(70);
			Enchantment.registerEnchantment(glow);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Main getPlugin() {
		return (Main) getPlugin((Class) Main.class);
	}

	private void register() {
		this.getCommand("staffmode").setExecutor(new MainCmd());
		this.getServer().getPluginManager().registerEvents(new Event(), this);}

    static {}}