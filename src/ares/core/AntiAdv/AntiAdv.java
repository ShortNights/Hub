package ares.core.AntiAdv;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import ares.core.Main;


public class AntiAdv implements Listener {
	
	  public static AntiAdv instance = null;
	  
	  Boolean filter = Boolean.valueOf(true);  
	  
	  @EventHandler
	  public void onAdvertiseChat(AsyncPlayerChatEvent e)
	  {
	    if (this.filter.booleanValue())
	    {
	      Player p = e.getPlayer();
	      if ((p.isOp()) || (p.hasPermission("AresCore.Staff"))) {
	        return;
	      }
	      for (String allowed : Main.getInstance().getConfig().getStringList("Allowed")) {
	        if (e.getMessage().contains(allowed)) {
	          return;
	        }
	      }
	      if (!Main.getInstance().getConfig().getBoolean("Extremely Sensitive"))
	      {
	        Pattern pattern = Pattern.compile("(?i)(((([a-zA-Z0-9-]+\\.)+(gs|ts|adv|no|uk|us|de|eu|com|net|noip|to|gs|me|info|biz|tv|au))+(\\:[0-9]{2,5})?))");
	        Pattern pattern2 = Pattern.compile("(?i)(((([0-9]{1,3}\\.){3}[0-9]{1,3})(\\:[0-9]{2,5})?))");
	        Matcher matcher = pattern.matcher(e.getMessage());
	        Matcher matcher2 = pattern2.matcher(e.getMessage());
	        if (matcher.find())
	        {
	          e.setCancelled(true);
	          p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPunish &8» &7You're not allowed to advertise!"));
	          for (Player p1 : Bukkit.getOnlinePlayers()) {
	            if (p1.hasPermission("AresCore.Staff")) {
	              p1.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "(!) " + ChatColor.RED + p.getName() + ChatColor.GRAY + " attempted to advertise! " + ChatColor.GOLD + "(" + e.getMessage() + ")");
	            }
	          }
	          return;
	        }
	        if (matcher2.find())
	        {
	          e.setCancelled(true);
	          p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPunish &8» &7You're not allowed to advertise!"));
	          for (Player p1 : Bukkit.getOnlinePlayers()) {
	            if (p1.hasPermission("AresCore.Staff")) {
	              p1.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "(!) " + ChatColor.RED + p.getName() + ChatColor.GRAY + " attempted to advertise! " + ChatColor.GOLD + "(" + e.getMessage() + ")");
	            }
	          }
	        }
	      }
	      else
	      {
	        Pattern pattern = Pattern.compile("(?i)(((([a-zA-Z0-9-]+\\.)+(gs|ts|adv|no|uk|us|de|eu|com|net|noip|to|gs|me|info|biz|tv|au))+(\\:[0-9]{2,5})?))");
	        Pattern pattern2 = Pattern.compile("(?i)(((([0-9]{1,3}\\.){3}[0-9]{1,3})(\\:[0-9]{2,5})?))");
	        Pattern pattern3 = Pattern.compile("([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:[0-9]{1,5})?");
	        Pattern pattern4 = Pattern.compile("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}(:[0-9]{1,5})?");
	        
	        Matcher matcher = pattern.matcher(e.getMessage());
	        Matcher matcher2 = pattern2.matcher(e.getMessage());
	        Matcher matcher3 = pattern3.matcher(e.getMessage());
	        Matcher matcher4 = pattern4.matcher(e.getMessage());
	        if (matcher.find())
	        {
	          e.setCancelled(true);
	          p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPunish &8» &7You're not allowed to advertise!"));
	          for (Player p1 : Bukkit.getOnlinePlayers()) {
	            if (p1.hasPermission("AresCore.Staff")) {
	              p1.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "(!) " + ChatColor.RED + p.getName() + ChatColor.GRAY + " attempted to advertise! " + ChatColor.GOLD + "(" + e.getMessage() + ")");
	            }
	          }
	          return;
	        }
	        if (matcher2.find())
	        {
	          e.setCancelled(true);
	          p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPunish &8» &7You're not allowed to advertise!"));
	          for (Player p1 : Bukkit.getOnlinePlayers()) {
	            if (p1.hasPermission("AresCore.Staff")) {
	              p1.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "(!) " + ChatColor.RED + p.getName() + ChatColor.GRAY + " attempted to advertise! " + ChatColor.GOLD + "(" + e.getMessage() + ")");
	            }
	          }
	          return;
	        }
	        if (matcher3.find())
	        {
	          e.setCancelled(true);
	          p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPunish &8» &7You're not allowed to advertise!"));
	          for (Player p1 : Bukkit.getOnlinePlayers()) {
	            if (p1.hasPermission("AresCore.Staff")) {
	              p1.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "(!) " + ChatColor.RED + p.getName() + ChatColor.GRAY + " attempted to advertise! " + ChatColor.GOLD + "(" + e.getMessage() + ")");
	            }
	          }
	          return;
	        }
	        if (matcher4.find())
	        {
	          e.setCancelled(true);
	          p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPunish &8» &7You're not allowed to advertise!"));
	          for (Player p1 : Bukkit.getOnlinePlayers()) {
	            if (p1.hasPermission("AresCore.Staff")) {
	              p1.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "(!) " + ChatColor.RED + p.getName() + ChatColor.GRAY + " attempted to advertise! " + ChatColor.GOLD + "(" + e.getMessage() + ")");
	            }
	          }
	        }
	      }
	    }
	    else {}
	  }
	}
