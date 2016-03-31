package net.mctk.pub.kbpt

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class PluginMain : JavaPlugin(), Listener {
    override fun onEnable() {
        super.onEnable()
        println("Enable");
        server.pluginManager.registerEvents(this, this);
    }

    override fun onDisable() {
        super.onDisable()
    }

    @EventHandler
    fun onJoinListener(event: PlayerJoinEvent) {
        println(event.player);
    }
}