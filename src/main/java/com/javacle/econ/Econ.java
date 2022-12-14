package com.javacle.econ;

import com.javacle.econ.listener.EconListener;
import com.javacle.econ.managers.EconManager;
import com.javacle.econ.managers.FileManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class Econ extends JavaPlugin {

    EconManager econManager;
    FileManager fileManager;
    File file;
    @Override
    public void onEnable() {
        file = new File(getDataFolder(), "chips.yml");
        fileManager = new FileManager(this);
        econManager = new EconManager(this);
        fileManager.setup();
        Bukkit.getPluginManager().registerEvents(new EconListener(this), this);


    }

    @Override
    public void onDisable() {

    }

    public static Econ getInstance(){ return (Econ) Bukkit.getServer().getPluginManager().getPlugin("Econ"); }
    public File getFile() {return file;}
    public EconManager getEconManager() {return econManager;}

}
