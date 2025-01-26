package wennera.foxsquad.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class SquidGamePlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("SquidGamePlugin включен!");
    }

    @Override
    public void onDisable() {
        getLogger().info("SquidGamePlugin выключен!");
    }

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
        if (event.getMessage().startsWith("/speed")) {
            event.getPlayer().sendMessage(ChatColor.RED + "Эффекты скорости отключены в этой игре!");
            event.setCancelled(true);
        }
    }
}