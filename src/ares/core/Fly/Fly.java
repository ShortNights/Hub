package ares.core.Fly;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Fly implements CommandExecutor {
	
	public static ArrayList<String> fly = new ArrayList<String>();
	
	  public boolean onCommand(CommandSender sender, Command cmd, String commmandLabel, String[] args) {
		  
		  if (!(sender instanceof Player))
		    {
		      sender.sendMessage("Only players can issue this command");
		      return true;
		    }  
	    Player player = (Player)sender;
	    if (cmd.getName().equalsIgnoreCase("fly"))
	    {
	      if (!sender.hasPermission("AresCore.Fly"))
	      {
	        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPermissions &8» &7You do not have permission!"));
	        return true;
	      }
	      
	      
	      if (Fly.fly.contains(player.getName()))
	      {
	        Fly.fly.remove(player.getName());
	        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cFly &8» &7Flight has been &c&lDISABLED &7for " + ChatColor.GRAY + player.getName()));
			player.setAllowFlight(false);
			player.setFlying(false);
	        return true;
	      }
	      Fly.fly.add(player.getName());
	        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cFly &8» &7Flight has been &c&lENABLED &7for " + ChatColor.GRAY + player.getName()));
			player.setAllowFlight(true);
			player.setFlying(true);
	    }
	    
		return false;
}

}
