package io.github.steamworksmc.common.database.model;

import java.util.List;
import java.util.UUID;

/**
 * @author Steamworks (Steamworks#1127)
 * Saturday 05 2022 (9:40 PM)
 * friends (io.github.steamworksmc.common.database.model)
 */
public interface Database {

    void enable();
    void disable();

    void addPlayer(UUID uuid);
    void removePlayer(UUID uuid);

    void acceptRequest(UUID uuid, UUID toAccept);
    void declineRequest(UUID uuid, UUID toDecline);

    void sendRequest(UUID uuid, UUID toAdd);

    boolean toggleSetting(UUID uuid, String setting);
    boolean getSetting(UUID uuid, String setting);
    boolean doesExist(UUID uuid);
    boolean doesRequestExist(UUID uuid, UUID compareTo);
    boolean isFriend(UUID uuid, UUID compareTo);

    List<UUID> getFriends(UUID uuid);
    List<UUID> getRequests(UUID uuid);

}
