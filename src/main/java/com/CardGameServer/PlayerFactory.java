package com.CardGameServer;

public class PlayerFactory {

    public Player createPlayer(String name, String id){
        return new Player(name, id);
        
    }
}
