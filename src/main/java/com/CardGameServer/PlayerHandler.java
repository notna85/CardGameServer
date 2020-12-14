package com.CardGameServer;

import java.util.ArrayList;
import java.util.List;

public class PlayerHandler {
    static List<Player> unassignedPlayers = new ArrayList<>();

    public boolean addNewPlayer(String playerID, String playerName){

        if(verifyPlayerName(playerName) && !playerName.equals("")){
            PlayerFactory playerFactory = new PlayerFactory();
            unassignedPlayers.add(playerFactory.createPlayer(playerName, playerID));
            return true;
        }
        else
            return false;

    }
    public boolean verifyPlayerName(String playerName){
        for(Player player : unassignedPlayers){
            if(player.getPlayerName().equals(playerName))
                return false;
        }
        return true;
    }

    public Player getPlayerByID(String playerID) {
        for(Player player : unassignedPlayers){
            if(player.getPlayerID().equals(playerID))
                return player;
        }
        return null;
    }
}
