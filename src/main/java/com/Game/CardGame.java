package com.Game;

import com.CardGameServer.Player;

import java.util.ArrayList;
import java.util.List;

public abstract class CardGame implements Playable{
    Deck deck;
    DeckFactory deckFactory;

    void getDeck(boolean shuffled){
        deck = deckFactory.getDeck(shuffled);
    }
    void dealCards(ArrayList<Player> players){

    }
}
