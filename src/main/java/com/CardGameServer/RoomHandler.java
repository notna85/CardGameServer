package com.CardGameServer;

import java.util.ArrayList;

public class RoomHandler {
    static ArrayList<Room> rooms = new ArrayList<>();


    public boolean addNewRoom(String roomName){
        RoomFactory roomFactory = new RoomFactory();

        if(verifyRoomName(roomName) && !roomName.equals("")){
            rooms.add(roomFactory.createRoom(roomName));
            return true;
        }
        else
            return false;
    }

    public boolean verifyRoomName(String roomName){
        for(Room room : rooms){
            if(room.getRoomName().equals(roomName))
                return false;
        }
        return true;
    }

    public void setRoomOwner(Player player, Room room ){

    }
}
