package ares.core.Compass;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import net.md_5.bungee.api.ChatColor;

public class CompassHandler implements Listener {
	
	@EventHandler
    public void moreoptionsGUI(InventoryClickEvent event)
    {
      if ((event.getClickedInventory() == null) || (event.getInventory() == null) || (event.getClickedInventory().getName() == null) || (event.getInventory().getName() == null)) {
        return;
      }
      if (event.getCurrentItem() == null) {
        return;
      }
      if (event.getCurrentItem().getItemMeta() == null) {
        return;
      }
      if (event.getCurrentItem().getItemMeta().getDisplayName() == null) {
        return;
      }
      if (!event.getInventory().getName().contains("Servers")) {
        return;
      }
      event.setCancelled(true);
      Player player = (Player)event.getWhoClicked();
      
      if ((event.getCurrentItem().getType() == Material.DIAMOND_SWORD) && (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Kingdoms"))) {
         player.performCommand("server Kingdoms-1");
        player.closeInventory();
      }
      
      if ((event.getCurrentItem().getType() == Material.IRON_SWORD) && (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Elemental Wars"))) {
          player.performCommand("server ElementWars-1");
         player.closeInventory();
       }
      
}


}
