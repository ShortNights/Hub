package ares.core.DoubleJump;

import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;

import ares.core.Fly.Fly;

public class DoubleJump implements Listener {
	  @EventHandler
	  public void onPlayerToggleFlight(PlayerToggleFlightEvent event)
	  {
	    Player player = event.getPlayer();
	    if (player.getGameMode() == GameMode.CREATIVE || (Fly.fly.contains(player.getName()))) {
	      return;
	    }
	    event.setCancelled(true);
	    player.setAllowFlight(false);
	    player.setFlying(false);
	    player.playSound(player.getLocation(), Sound.BAT_TAKEOFF, 10.0F, 10.0F);
	    player.getWorld().playEffect(player.getLocation(), Effect.FLAME, 15);
	    player.setVelocity(player.getLocation().getDirection().multiply(2.5D).setY(1));
	  }
	  
	  @EventHandler
	  public void onPlayerMove(PlayerMoveEvent event)
	  {
	    Player player = event.getPlayer();
	    if ((player.getGameMode() != GameMode.CREATIVE) && (player.getLocation().subtract(0.0D, 1.0D, 0.0D).getBlock().getType() != Material.AIR) && (!player.isFlying() && (!Fly.fly.contains(player.getName())))) {
	      player.setAllowFlight(true);
	    }
	  }

}
