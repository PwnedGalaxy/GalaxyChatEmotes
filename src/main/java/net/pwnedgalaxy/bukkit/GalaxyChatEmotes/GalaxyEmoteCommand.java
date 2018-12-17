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
            ChatColor color = ChatColor.LIGHT_PURPLE;

            StringBuilder message = new StringBuilder();
            message.append(color).append("[Server] ");

            String msg = String.join(" ", args) + " " + this.output;
            message.append(msg.trim());

            Bukkit.broadcastMessage(message.toString().trim());

        } else {
            Player p = (Player) sender;
            
            String msg = String.join(" ", args) + " " + this.output;
            p.chat(msg.trim());
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
