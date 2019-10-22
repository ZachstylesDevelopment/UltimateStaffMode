package me.refrac.staff.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.refrac.staff.Main;

public class JoinEvent implements Listener
{
    public UpdateChecker checker;

    @EventHandler
    public void onJoin(final PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (p.hasPermission("ustaffmode.update")) {
            if (Main.getPlugin().getConfig().getBoolean("Update.Enabled") == true){
                this.checker = new UpdateChecker(Main.plugin);
                if (this.checker.isConnected()) {
                    if (this.checker.hasUpdate()) {
                        p.sendMessage(ChatColor.GRAY + "****************************************************");
                        p.sendMessage(ChatColor.RED + "UltimateStaffMode is outdated!");
                        p.sendMessage(ChatColor.GREEN + "Newest version: " + this.checker.getLatestVersion());
                        p.sendMessage(ChatColor.RED + "Your version: " + Main.plugin.getDescription().getVersion());
                        p.sendMessage(ChatColor.GOLD + "Download: " + Settings.PLUGIN_URL);
                        p.sendMessage(ChatColor.GRAY + "****************************************************");
                    }
                }
            }
        }
    }
}
