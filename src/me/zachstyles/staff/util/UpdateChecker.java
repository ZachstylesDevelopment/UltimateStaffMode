package me.refrac.staff.util;

import java.net.*;
import java.io.*;

import me.zachstyles.staff.Main; 

public class UpdateChecker
{

    public Main plugin;
    public String version;
    
    public UpdateChecker(Main plugin) {
        this.plugin = plugin;
        this.version = this.getLatestVersion();
    }
    
    @SuppressWarnings("unused")
	public String getLatestVersion() {
        try {
            final int resource = 54528;
            final HttpURLConnection con = (HttpURLConnection)new URL("https://api.spigotmc.org/legacy/update.php?resource=54528").openConnection();
            con.setDoOutput(true);
            con.setRequestMethod("POST");
            con.getOutputStream().write("key=98BE0FE67F88AB82B4C197FAF1DC3B69206EFDCC4D3B80FC83A00037510B99B4&resource=54528".getBytes("UTF-8"));
            final String version = new BufferedReader(new InputStreamReader(con.getInputStream())).readLine();
            if (version.length() <= 7) {
                return version;
            }
        }
        catch (Exception ex) {
            System.out.println("---------------------------------");
            this.plugin.getLogger().info("Failed to check for a update!");
            System.out.println("---------------------------------");
        }
        return null;
    }
    
    public boolean isConnected() {
        return this.version != null;
    }
    
    public boolean hasUpdate() {
        return !this.version.equals(this.plugin.getDescription().getVersion());
    }
}
