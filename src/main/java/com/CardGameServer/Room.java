package com.CardGameServer;

import java.util.ArrayList;

public class Room {

    private String roomName;
    private ArrayList<Player> players = new ArrayList<>();
    private Player roomOwner;

    public String getRoomName() {
        return roomName;
    }
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
    public void setPlayers(ArrayList<Player> players) {
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
