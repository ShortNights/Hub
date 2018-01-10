package ares.core.Basic;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class WorldEditFix implements Listener {
	
	  @EventHandler
	  public void onPreCommand(PlayerCommandPreprocessEvent event)
	  {
	    Player player = event.getPlayer();
	    if (player.hasPermission("AresCore.Owner")) {
	      return;
	    }
	    if ((event.getMessage().startsWith("/worldedit:/calc")) || 
	      (event.getMessage().startsWith("/worldedit:/eval")) || 
	      (event.getMessage().startsWith("/worldedit:/solve")) || 
	      (event.getMessage().startsWith("//calc")) || 
	      (event.getMessage().startsWith("//eval")) || 
	      (event.getMessage().startsWith("//solve")))
	    {
	      event.setCancelled(true);
	    }
	  }

}
