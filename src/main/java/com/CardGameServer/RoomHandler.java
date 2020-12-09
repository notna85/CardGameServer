package com.CardGameServer;

import java.util.ArrayList;
import java.util.List;

public class RoomHandler {
    List<Room> roomes = new ArrayList<Room>();

    public Room addNewRoom(String roomName, Player player){
        Room room = new Room(roomName, player);

        return room;
    }
    public void verifyRoomName(String roomName){
    }
    public void setRoomOwner(Player player, Room room ){

    }
}
