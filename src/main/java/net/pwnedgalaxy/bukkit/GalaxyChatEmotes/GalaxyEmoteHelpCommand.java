package net.pwnedgalaxy.bukkit.GalaxyChatEmotes;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class GalaxyEmoteHelpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Bukkit.dispatchCommand(sender, "help GalaxyChatEmotes " + String.join(" ", args));
        return true;
    }
}
