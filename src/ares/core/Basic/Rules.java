package ares.core.Basic;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Rules implements CommandExecutor {
	
	  public boolean onCommand(CommandSender sender, Command cmd, String commmandLabel, String[] args) {
		  
		  if (!(sender instanceof Player))
		    {
		      sender.sendMessage("Only players can issue this command");
		      return true;
		    }  
	    if (cmd.getName().equalsIgnoreCase("Rules"))

	        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cRules &8» &6http://arespvp.us/threads/official-arespvp-rules.1/"));
		return false;

	    }
       } 