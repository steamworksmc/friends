package io.github.steamworksmc.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Steamworks (Steamworks#1127)
 * Saturday 05 2022 (9:26 PM)
 * friends (io.github.steamworksmc.common.model)
 */
@AllArgsConstructor
@Getter
public class Friend {

    private final UUID uuid;
    private final List<FriendData> friends;

    public Friend(UUID uuid) {
        this(uuid, new ArrayList<FriendData>());
    }

    @AllArgsConstructor
    @Getter
    public static class FriendData {
        private final Friend friend;
        private final long addedAt;
    }
}
