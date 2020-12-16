package com.Serialization;


import com.Command.Command;

public class Message {

    public Command getCommand() { return command; }
    public String getRoomName() { return roomName; }
    public String getPlayerID() { return playerID; }
    public String getPlayerName() { return playerName; }

    public void setPlayerID(String playerID) { this.playerID = playerID; }

    private Command command;
    private String roomName;
    private String playerID;
    private String playerName;


    //Used for method in test class
    public Message(Command command, String roomName, String playerID) {
        this.command = command;
        this.roomName = roomName;
        this.playerID = playerID;
    }

    public Message() {
    }
}
