package com.CardGameServer;

public class Player {

    private String playerName;
    private String playerID;

    //Getters og setters
    public String getPlayerName() {
        return playerName;
    }
    public String getPlayerID() {
        return playerID;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    //Constructor
    public Player(String playerName, String playerID) {
        this.playerName = playerName;
        this.playerID = playerID;
    }


}
