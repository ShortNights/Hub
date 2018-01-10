package ares.core.Compass;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.event.block.Action;

import net.md_5.bungee.api.ChatColor;

public class CompassJoin implements Listener {
	
	  @EventHandler
	  public void onJoin(PlayerJoinEvent event)
	  {
	    Player p = event.getPlayer();
	    ItemStack compass = configuratedCompass();
	      if ((!p.getInventory().contains(compass)) && 0 >= 0)
	      {
	        p.getInventory().setItem(4, compass);
	        System.out.println("[Compass] " + p.getName() + " does not have a compass. Giving it now.");
	      }
	    }
	  
	  public ItemStack configuratedCompass()
	  {
	    ItemStack compass = new ItemStack(Material.NETHER_STAR);
	    ItemMeta compassMeta = compass.getItemMeta();
	    compassMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aServer Selector"));
	    compass.setItemMeta(compassMeta);
	    return compass;
	  }
	  
	  @EventHandler
	  public void onClick(PlayerInteractEvent event)
	  {
	    if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) || (event.getAction() == Action.RIGHT_CLICK_AIR))
	    {
	      Player p = event.getPlayer();
	      try
	      {
	        if ((p.getInventory().getItemInHand().getType() == Material.NETHER_STAR && (p.getInventory().getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&aServer Selector")))))
	        {
	          event.setCancelled(true);
	          p.openInventory(CompassGUI.OpenMore(p));
	        }
	      }
	      catch (Exception var3_3)
	      {
	        System.out.println("[Compass] A open-compass error has been thrown. Please check your config or contact a developer if the problem persist.");
	      }
	    }
	  }
	  
	  }

