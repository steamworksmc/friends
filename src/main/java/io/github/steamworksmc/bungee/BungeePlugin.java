package io.github.steamworksmc.bungee;

import lombok.Getter;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * @author Steamworks (Steamworks#1127)
 * Saturday 05 2022 (9:20 PM)
 * friends (io.github.steamworksmc.bungee)
 */
public class BungeePlugin extends Plugin {

    @Getter
    private BungeePlugin instance;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {

    }
}
