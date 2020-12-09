package com.CardGameServer;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String roomName;
    private List<Player> players = new ArrayList<>();
    private Player roomOwner;


    public Room(String roomName) {
        this.roomName = roomName;
    }
}
