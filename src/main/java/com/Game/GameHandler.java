package com.Game;

import com.CardGameServer.Player;

import java.util.ArrayList;
import java.util.List;

public class GameHandler {

    ArrayList<Player> players;
    GameFactory gameFactory;


    private void createGame(){
        gameFactory = new GameFactory();

        SkitGubbeGame game = gameFactory.getSkitGubbeGame();
    }

    public void startGame(){

    }
}
