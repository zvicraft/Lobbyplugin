package ml.zvicraft.dev.loobbyplugin.Commands;


import ml.zvicraft.dev.lobbyplugin.utils.ColorUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import static ml.zvicraft.dev.lobbyplugin.LobbyPlugin.plugin;


public class manucmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender,Command command, String s, String[] strings) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            Inventory dinv = Bukkit.createInventory(player, 9 , ColorUtils.color(plugin.getConfig().getString("GUI")));
            Inventory sinv = Bukkit.createInventory(player, 9 , ColorUtils.color(plugin.getConfig().getString("GUI")));

            player.openInventory(dinv);

        }


        return false;
    }
}
