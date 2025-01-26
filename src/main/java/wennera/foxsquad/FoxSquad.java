package wennera.foxsquad;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import wennera.foxsquad.Commands.SquidGamePlugin;

public final class FoxSquad extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("squid").setExecutor(new CommandExecutor() {
            @Override
            public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
                return true;
            }
        });

        // Plugin startup logic
    }
}
