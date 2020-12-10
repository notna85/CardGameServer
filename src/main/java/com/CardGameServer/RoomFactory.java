package com.CardGameServer;

public class RoomFactory {

    public Room createRoom(String roomName){
        return new Room(roomName);
    }
}
