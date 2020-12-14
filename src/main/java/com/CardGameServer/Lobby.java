package com.CardGameServer;

import com.Serialization.Message;
import com.Serialization.SerializationHandler;

import java.io.IOException;
import java.util.List;

public class Lobby {

    RoomHandler roomHandler = new RoomHandler();

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
            case JoinRoom:
                addPlayerToRoom(playerID, messageOBJ.getRoomName());
                return "True";
            default:
                return "False";
        }
    }
    //
    public boolean addNewPlayer(String playerID, String playerName){
        PlayerHandler playerHandler = new PlayerHandler();
        return playerHandler.addNewPlayer(playerID, playerName);
    }

    public boolean addNewRoom(String roomName){
        return roomHandler.addNewRoom(roomName);
    }

    public void addPlayerToRoom(String playerID, String roomName){
        PlayerHandler playerHandler = new PlayerHandler();
        Player playerToAdd = playerHandler.getPlayerByID(playerID);
        if(playerToAdd != null){
            for(Room room : RoomHandler.rooms){
                if(room.getRoomName().equals(roomName)){
                    room.getPlayers().add(playerToAdd);
                }
            }
        }

    }
    public void assignOwnerToRoom(String playerID, String roomName){

    }
    public void refreshLobby(){
        List<Room> rooms = roomHandler.returnLobby();
    }
}
