package ares.core.Filter;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import ares.core.Main;
import net.md_5.bungee.api.ChatColor;

public class ChatFilter implements Listener {
	
	  @EventHandler
	  public void onPlayerCommandPreprocessEvent(AsyncPlayerChatEvent event)
	  {
	    Player p = event.getPlayer();
	    String message = event.getMessage().toLowerCase();
	    List<String> words = Main.getInstance().getConfig().getStringList("Blacklisted Words");
	      for (String blacklist : words) {
	        if ((message.startsWith(blacklist.toLowerCase())) || (message.equals(blacklist.toLowerCase()) || message.toLowerCase().contains(blacklist)))
	        {
	          event.setCancelled(true);
	          p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPunish &8» &7You're not allowed to swear!"));
	          break;
	        }
	      }
	    }
	}
