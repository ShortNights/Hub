package ares.core;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import ares.core.AntiAdv.AntiAdv;
import ares.core.AntiSpam.AntiSpam;
import ares.core.Basic.Discord;
import ares.core.Basic.Hubs;
import ares.core.Basic.Rules;
import ares.core.Basic.Website;
import ares.core.Basic.WorldEditFix;
import ares.core.Compass.CompassHandler;
import ares.core.Compass.CompassJoin;
import ares.core.DoubleJump.DoubleJump;
import ares.core.Filter.ChatFilter;
import ares.core.Fly.Fly;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	public static Main plugin;
    public static Main instance;
	
	public void onEnable() {    
		getLogger().info("AresCore-Hub enabled!");
		
		instance = this;
		registerCmds();
		registerEvents();
		loadConfig();

	}
	public void onDisable() {
		getLogger().info("AresCore-Hub disabled!");		
	}
	
	  public static Main getInstance() {
	    return instance;
	  }
	
	  private void registerCmds()
	  {
	   getCommand("discord").setExecutor(new Discord());
	   getCommand("rules").setExecutor(new Rules());
	   getCommand("website").setExecutor(new Website());
	   getCommand("fly").setExecutor(new Fly());
	  } 
	  
	public void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new AntiAdv(), this);
		pm.registerEvents(new AntiSpam(), this);
		pm.registerEvents(new Hubs(), this);
		pm.registerEvents(new WorldEditFix(), this);
		pm.registerEvents(new CompassHandler(), this);
		pm.registerEvents(new CompassJoin(), this);
		pm.registerEvents(new ChatFilter(), this);
		pm.registerEvents(new DoubleJump(), this);
	}
	
	  private void loadConfig()
	  {
	    if (!getDataFolder().exists()) {
	      getDataFolder().mkdirs();
	    }
	    
	    getConfig().addDefault("Extremely Sensitive", true); 
	    
	    List<String> allowed = new ArrayList<String>();
	    allowed.add(ChatColor.translateAlternateColorCodes('&', "arespvp.us"));
	    getConfig().addDefault("Allowed", allowed);
	    
	    List<String> chat = new ArrayList<String>();
	    chat.add(ChatColor.translateAlternateColorCodes('&', "nigger"));
	    chat.add(ChatColor.translateAlternateColorCodes('&', "nigga"));
	    chat.add(ChatColor.translateAlternateColorCodes('&', "sex"));
	    chat.add(ChatColor.translateAlternateColorCodes('&', "penis"));
	    chat.add(ChatColor.translateAlternateColorCodes('&', "vagina"));
	    chat.add(ChatColor.translateAlternateColorCodes('&', "dick"));
	    chat.add(ChatColor.translateAlternateColorCodes('&', "bbc"));
	    getConfig().addDefault("Blacklisted Words", chat);
	    
	    
	    
	    getConfig().options().copyDefaults(true);
	    saveConfig();

}

}
