package net.pwnedgalaxy.bukkit.GalaxyChatEmotes;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.TabExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GalaxyEmoteCommand implements TabExecutor
{
    private String output = "";

    public GalaxyEmoteCommand(String output)
    {
        this.output = output;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "You must be a player to emote! (for now... sorry)");
        } else {
            Player p = (Player) sender;
            
            String msg = String.join(" ", args);
            p.chat(this.output + " " + msg);
        }

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args)
    {
        List<String> autoComplete = new ArrayList<String>();

        for (Player p : Bukkit.getOnlinePlayers()) {
            autoComplete.add(p.getDisplayName());
        }

        return autoComplete;
    }
}
