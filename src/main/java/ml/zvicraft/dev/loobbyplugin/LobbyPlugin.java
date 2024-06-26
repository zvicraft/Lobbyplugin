package ml.zvicraft.dev.loobbyplugin;

import ml.zvicraft.dev.lobbyplugin.lisiners.guimngers;
import ml.zvicraft.dev.lobbyplugin.utils.ColorUtils;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class LobbyPlugin extends JavaPlugin {
    public static LobbyPlugin plugin;
    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        Bukkit.getConsoleSender().sendMessage(ColorUtils.color(this.getConfig().getString("prefix") + "&athe plugin is enabled"));

        this.getConfig().options().copyDefaults(false);
        this.saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new guimngers(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
