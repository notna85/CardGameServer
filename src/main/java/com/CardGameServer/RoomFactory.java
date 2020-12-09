package com.CardGameServer;

public class RoomFactory {

    public Room createRoom(String roomName, Player player){

        return new Room(roomName, player);


    }
}
