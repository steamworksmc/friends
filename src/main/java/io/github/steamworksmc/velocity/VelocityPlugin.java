package io.github.steamworksmc.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;

import java.util.logging.Logger;

/**
 * @author Steamworks (Steamworks#1127)
 * Saturday 05 2022 (9:16 PM)
 * friends (io.github.steamworksmc.velocity)
 */
@Plugin(
        id = "friends",
        name = "Friends",
        version = "1.0-SNAPSHOT",
        url = "https://www.steamsworld.com/",
        authors = { "Steamworks", "Bice8687" }
)
public class VelocityPlugin {

    private final ProxyServer server;
    private final Logger logger;

    @Inject
    public VelocityPlugin(ProxyServer server, Logger logger) {
        this.server = server;
        this.logger = logger;
    }

}
