package com.CardGameServer;

public class PlayerFactory {

    public Player createPlayer(String playerName, String playerID){
        return new Player(playerName, playerID);
    }
}
