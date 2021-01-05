package com.Game;

import com.CardGameServer.Player;
import com.DeckFactory.Deck;
import com.DeckFactory.DeckFactory;

import java.util.ArrayList;

public abstract class CardGame implements Playable{
    Deck deck;
    DeckFactory deckFactory;

    void getDeck(boolean shuffled){
        deck = deckFactory.getDeck(shuffled);
    }
    void dealCards(ArrayList<Player> players){

    }
}
