package me.linckode.greentext;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static boolean needPermission;
    public static String permission;

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.saveDefaultConfig();

        this.getServer().getPluginManager().registerEvents( new Events(),this);
        needPermission = this.getConfig().getBoolean("EnablePermission");
        permission = this.getConfig().getString("Permission");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
