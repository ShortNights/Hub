package ares.core.Basic;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

public class Hubs implements Listener {
	  
	  @EventHandler
	  public void onFoodLevelChange(FoodLevelChangeEvent event)
	  {
	    event.setFoodLevel(20);
	  }
	  
	  @EventHandler
	  public void onWeather(WeatherChangeEvent event)
	  {
	    event.setCancelled(true);
	  }
	  
	  @EventHandler
	  public void onDamage(EntityDamageEvent event)
	  {
	    event.setCancelled(true);
	  }
	  
	  @EventHandler
	  public void onDrop(PlayerDropItemEvent event)
	  {
	    event.setCancelled(true);
	  }
	  
	  @EventHandler
	  public void onBlockBreak(BlockBreakEvent event)
	  {
	    Player player = event.getPlayer();
         event.setCancelled(true);
	      if ((player.hasPermission("AresCore.Admin")) && (player.getGameMode() == GameMode.CREATIVE)) {
	          event.setCancelled(false);
	      }
	    }
	  
	  @EventHandler
	  public void onPlace(BlockPlaceEvent event)
	  {
		    Player player = event.getPlayer();
	         event.setCancelled(true);
		      if ((player.hasPermission("AresCore.Admin")) && (player.getGameMode() == GameMode.CREATIVE)) {
		          event.setCancelled(false);
		      }
		    }

}
