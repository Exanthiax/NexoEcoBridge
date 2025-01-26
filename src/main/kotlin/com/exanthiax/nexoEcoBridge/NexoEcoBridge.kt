package com.exanthiax.nexoEcoBridge

import com.willfp.eco.core.EcoPlugin
import com.willfp.eco.internal.spigot.integrations.customitems.CustomItemsNexo
import org.bukkit.plugin.java.JavaPlugin

class NexoEcoBridgePlugin : JavaPlugin() {
    override fun onEnable() {
        // Ensure Eco is loaded
        val ecoPlugin = server.pluginManager.getPlugin("Eco") as? EcoPlugin
            ?: throw IllegalStateException("Eco plugin is required but not found!")

        // Register the Nexo integration
        val customItemsIntegration = CustomItemsNexo(ecoPlugin)
        customItemsIntegration.registerProvider()

        // Log successful initialization
        logger.info("CustomItemsNexo has been enabled!")

        // Register the listener
        server.pluginManager.registerEvents(CustomItemsNexo(ecoPlugin), this)
    }


    override fun onDisable() {
        logger.info("CustomItemsNexo has been disabled!")
    }
}
