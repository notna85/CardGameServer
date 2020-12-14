package com.CardGameServer;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private String roomName;
    private List<Player> players = new ArrayList<>();
    private Player roomOwner;

    public String getRoomName() {
        return roomName;
    }
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<Player> getPlayers() {
        return players;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getRoomOwner() {
        return roomOwner;
    }
    public void setRoomOwner(Player roomOwner) {
        this.roomOwner = roomOwner;
    }

    //Constructor
    public Room(String roomName){
        setRoomName(roomName);
        setPlayers(new ArrayList<>());
    }
}
