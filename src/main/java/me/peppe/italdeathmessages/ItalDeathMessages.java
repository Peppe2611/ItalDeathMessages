package me.peppe.italdeathmessages;


import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public final class ItalDeathMessages extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("ItalDeathMessages is enabled!");
        getServer().getPluginManager().registerEvents(new PlayerDeathEvent(), this);
    }

}