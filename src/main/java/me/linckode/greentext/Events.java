package me.linckode.greentext;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Events implements Listener {


    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        if (Main.needPermission) {
            if (event.getPlayer().hasPermission(Main.permission)) {
                char firstChar = event.getMessage().charAt(0);
                String charr = String.valueOf(firstChar);
                if (charr.equalsIgnoreCase(">")) {
                    event.setMessage(ChatColor.GREEN + event.getMessage());

                } else
                    event.setMessage(event.getMessage());
            } else
                event.setMessage(event.getMessage());
        } else {
            char firstChar = event.getMessage().charAt(0);
            String charr = String.valueOf(firstChar);
            if (charr.equalsIgnoreCase(">")) {
                event.setMessage(ChatColor.GREEN + event.getMessage());
            } else
                event.setMessage(event.getMessage());

        }
    }
}
