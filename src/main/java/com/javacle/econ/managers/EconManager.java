package com.javacle.econ.managers;

import com.javacle.econ.Econ;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.IOException;

public class EconManager {

    private Econ econ;

    public EconManager(Econ econ){
        this.econ = econ;
    }

    public void setChips(Player p, int chips){
        File s = econ.getFile();
        YamlConfiguration conf = YamlConfiguration.loadConfiguration(s);
        conf.set(p.getUniqueId().toString() + ".chips", chips);
    }

    public int getChips(Player p){
        File s = econ.getFile();
        YamlConfiguration conf = YamlConfiguration.loadConfiguration(s);
        return (int) conf.get(p.getUniqueId().toString() + ".chips");
    }

    public void registerPlayer(Player p){
        File s = econ.getFile();
        YamlConfiguration conf = YamlConfiguration.loadConfiguration(s);
        if(conf.get(p.getUniqueId().toString()) != null) return;
        conf.set(p.getUniqueId().toString(), "");
        conf.set(p.getUniqueId().toString() + ".chips", 100);
        try {
            conf.save(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
