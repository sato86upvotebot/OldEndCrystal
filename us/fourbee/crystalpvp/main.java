package us.fourbee.crystalpvp;

import org.bukkit.Material;
import org.bukkit.World.Environment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener {
	
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		this.saveDefaultConfig();
		System.out.println("OldEndCrystal successfully enabled");
	}
	@Override
	public void onDisable() {
		System.out.println("OldEndCrystal successfully disabled");
	}
	@EventHandler
	public void onCrystal(PlayerInteractEvent e) {
		System.out.println(e.getMaterial().name());
		if (e.getMaterial() == Material.END_CRYSTAL && e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (e.getPlayer().getWorld().getEnvironment() != Environment.THE_END) {
				e.setCancelled(true);
			}
		}
	}
}
