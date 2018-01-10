package ares.core.AntiSpam;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import net.md_5.bungee.api.ChatColor;

public class AntiSpam implements Listener {
	
	public static HashMap<UUID, Long> cooldown;
	
	  @EventHandler
	  public void onChat(AsyncPlayerChatEvent e)
	  {
	    UUID uuid = e.getPlayer().getUniqueId();
	    Player p = e.getPlayer();
	    if (!p.hasPermission("AresCore.Donator")) {
	      if (AntiSpam.cooldown.containsKey(uuid))
	      {
	        float time = (float)((System.currentTimeMillis() - ((Long)AntiSpam.cooldown.get(uuid)).longValue()) / 1000L);
	        if (time < 1.0F)
	        {
	          e.setCancelled(true);
	          p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPunish &8» &7You are not allowed to spam!"));
	        }
	        else
	        {
	          AntiSpam.cooldown.put(uuid, Long.valueOf(System.currentTimeMillis()));
	        }
	      }
	      else
	      {
	        AntiSpam.cooldown.put(uuid, Long.valueOf(System.currentTimeMillis()));
	      }
	    }
	  }
	  
	  @EventHandler
	  public void onLeave(PlayerQuitEvent e)
	  {
	    AntiSpam.cooldown.remove(e.getPlayer().getUniqueId());
	  }

}
