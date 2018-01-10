package ares.core.Compass;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class CompassGUI {
	
	  public static Inventory OpenMore(Player player)  {
	    
	    Inventory inv = Bukkit.createInventory(player, 9, "Servers");
	    
	    ItemStack report = new ItemStack(Material.DIAMOND_SWORD);
	    ItemMeta reportim = report.getItemMeta();
	    reportim.setDisplayName(ChatColor.GREEN + "Kingdoms");
	    report.setItemMeta(reportim);
	    
	    ItemStack reports = new ItemStack(Material.IRON_SWORD);
	    ItemMeta reportsim = reports.getItemMeta();
	    reportsim.setDisplayName(ChatColor.GREEN + "Elemental Wars");
	    reports.setItemMeta(reportsim);
	    
	    inv.setItem(3, report);
	    inv.setItem(5, reports);
		return inv;
	    }

}
