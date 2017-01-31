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
        getCommand("tableflip").setExecutor(new GalaxyEmoteCommand("(╯°□°）╯︵ ┻━┻"));
        getCommand("tablethrow").setExecutor(new GalaxyEmoteCommand("(ノಠ益ಠ)ノ彡┻━┻"));
        getCommand("ohwell").setExecutor(new GalaxyEmoteCommand("ᕕ( ᐛ )ᕗ"));
        getCommand("kawaii").setExecutor(new GalaxyEmoteCommand("ｶﾜ(・∀・)ｲｲ!!"));
        getCommand("fiteme").setExecutor(new GalaxyEmoteCommand("(ง ͠° ͟ل͜ ͡°)ง"));
        getCommand("jimmy").setExecutor(new GalaxyEmoteCommand("[̲̅$̲̅(̲̅ ͡° ͜ʖ ͡°̲̅)̲̅$̲̅]"));
        getCommand("goodshit").setExecutor(new GalaxyEmoteCommand("👌👀👌👀👌👀👌👀👌👀 good shit go౦ԁ sHit👌 thats ✔ some good👌👌shit right👌👌there👌👌👌 right✔there ✔✔if i do ƽaү so my self 💯 i say so 💯 thats what im talking about right there right there (chorus: ʳᶦᵍʰᵗ ᵗʰᵉʳᵉ) mMMMMᎷМ💯 👌👌 👌НO0ОଠOOOOOОଠଠOoooᵒᵒᵒᵒᵒᵒᵒᵒᵒ👌 👌👌 👌 💯 👌 👀 👀 👀 👌👌Good shit"));
        
        PluginDescriptionFile pdfFile = this.getDescription();
        getLogger().info(pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!");
    }

    public void onDisable()
    {
        PluginDescriptionFile pdfFile = this.getDescription();
        getLogger().info(pdfFile.getName() + " version " + pdfFile.getVersion() + " is disabled!");
    }
}
