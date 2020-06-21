package com.andan.resplaceholder.resplaceholder;

import org.bukkit.plugin.java.JavaPlugin;

public final class ResPlaceHolder extends JavaPlugin {

    @Override
    public void onEnable() {

        // Plugin startup logic
        if (getServer().getPluginManager().getPlugin("PlaceholderAPI")!=null){
            new papihook(this).register();
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
