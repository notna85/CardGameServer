package com.CardGameServer;

import com.Serialization.Message;
import com.Serialization.SerializationHandler;

public class Lobby {

    public void addNewPlayer(String playerID){

    }
    public boolean addNewRoom(String roomName){
        RoomHandler roomHandler = new RoomHandler();
        return roomHandler.addNewRoom(roomName);
    }

    public String handleMessage(String playerID, String message){
        //SerializationHandler serializeHandler = new SerializationHandler();
        //serializeHandler.deformatMessage(playerID, message);
        Message messageOBJ = new Message();

        switch(messageOBJ.getRoomName()){
            case "CreateRoom":
                if(addNewRoom(messageOBJ.getRoomName()))
                    return "True";
            default:
                return "False";
        }
    }
    public void addPlayerToRoom(String playerID, String roomName){

    }
    public void assignOwnerToRoom(String playerID, String roomName){

    }
}
