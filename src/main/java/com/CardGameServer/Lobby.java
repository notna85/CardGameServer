package com.CardGameServer;

import com.Serialization.Message;
import com.Serialization.SerializationHandler;

import java.io.IOException;

public class Lobby {

    public String handleMessage(String playerID, String message) throws IOException {
        SerializationHandler serializeHandler = new SerializationHandler();

        Message messageOBJ = serializeHandler.deformatMessage(playerID, message);

        switch(messageOBJ.getCommand()){
            case CreateRoom:
                if(addNewRoom(messageOBJ.getRoomName()))
                    return "True";
            case CreatePlayer:
                if(addNewPlayer(playerID, messageOBJ.getPlayerName()))
                    return "True";
            default:
                return "False";
        }
    }

    public boolean addNewPlayer(String playerID, String playerName){
        PlayerHandler playerHandler = new PlayerHandler();
        return playerHandler.addNewPlayer(playerID, playerName);
    }

    public boolean addNewRoom(String roomName){
        RoomHandler roomHandler = new RoomHandler();
        return roomHandler.addNewRoom(roomName);
    }

    public void addPlayerToRoom(String playerID, String roomName){

    }
    public void assignOwnerToRoom(String playerID, String roomName){

    }
}
