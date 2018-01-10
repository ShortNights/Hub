package ares.core.Basic;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Website implements CommandExecutor {
	
	  public boolean onCommand(CommandSender sender, Command cmd, String commmandLabel, String[] args) {
		  
		  if (!(sender instanceof Player))
		    {
		      sender.sendMessage("Only players can issue this command");
		      return true;
		    }  
	    if (cmd.getName().equalsIgnoreCase("Website"))

	        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cSocial &8» &6http://arespvp.us/"));
		return false;

	    }
       } 