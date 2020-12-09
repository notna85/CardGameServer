package com.CardGameServer;

enum Command {
    CreateRoom
}

public class Message {
    public Command getCommand() {
        return command;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getPlayerID() {
        return playerID;
    }

    private Command command;
    private String roomName;

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    private String playerID;

    public Message(Command command, String roomName, String playerID) {
        this.command = command;
        this.roomName = roomName;
        this.playerID = playerID;
    }
    public Message() {

    }
}
