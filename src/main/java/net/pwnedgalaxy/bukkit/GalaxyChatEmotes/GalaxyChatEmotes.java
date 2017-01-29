package net.pwnedgalaxy.bukkit.GalaxyChatEmotes;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class GalaxyChatEmotes extends JavaPlugin
{
    public void onEnable()
    {
        // register commands
        getCommand("shrug").setExecutor(new GalaxyEmoteCommand("¯\\_(ツ)_/¯"));
        getCommand("lenny").setExecutor(new GalaxyEmoteCommand("( ͡° ͜ʖ ͡°)"));
        getCommand("disapprove").setExecutor(new GalaxyEmoteCommand("ಠ_ಠ"));
        PluginDescriptionFile pdfFile = this.getDescription();
        getLogger().info(pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!");
    }

    public void onDisable()
    {
        PluginDescriptionFile pdfFile = this.getDescription();
        getLogger().info(pdfFile.getName() + " version " + pdfFile.getVersion() + " is disabled!");
    }
}
