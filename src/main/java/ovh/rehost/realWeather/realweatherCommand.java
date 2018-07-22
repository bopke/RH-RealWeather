package ovh.rehost.realWeather;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class realweatherCommand implements CommandExecutor {

    private final RealWeather plugin;

    realweatherCommand(RealWeather plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender.hasPermission("rh.realweather.reload")) {
            if (strings != null && strings.length == 1) {
                if (strings[0].toLowerCase().equals("reload")) {
                    this.plugin.getLogger().info("Reloading config.");
                    this.plugin.reloadPluginConfig();
                    return true;
                }
            }
        }
        return false;
    }
}
