package com.ominecraftbot.ominecraftbot;

import com.ominecraftbot.ominecraftbot.commands.HelloWorld;
import org.bukkit.plugin.java.JavaPlugin;

public final class OMinecraft_Bot extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("HelloWorld").setExecutor(new HelloWorld());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
