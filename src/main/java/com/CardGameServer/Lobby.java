package com.CardGameServer;
import com.Serialization.Command;
import com.Serialization.Message;
import com.Serialization.Message.*;
import com.Serialization.SerializationHandler;

import java.io.IOException;

import static com.Serialization.Command.CreateRoom;

public class Lobby {

    public void addNewPlayer(String playerID){

    }
    public boolean addNewRoom(String roomName){
        RoomHandler roomHandler = new RoomHandler();
        return roomHandler.addNewRoom(roomName);
    }

    public String handleMessage(String playerID, String message) throws IOException {
        SerializationHandler serializeHandler = new SerializationHandler();

        Message messageOBJ = serializeHandler.deformatMessage(playerID, message);
        Command cmd = messageOBJ.getCommand();
        Message m = new Message();
        Command cm = m.getCommand();

        switch(messageOBJ.getCommand()){
            case CreateRoom:
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
