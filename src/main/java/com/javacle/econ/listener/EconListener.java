package com.javacle.econ.listener;

import com.javacle.econ.Econ;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EconListener implements Listener {

    private Econ econ;

    public EconListener(Econ econ){
        this.econ = econ;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        econ.getEconManager().registerPlayer(e.getPlayer());
    }

}
