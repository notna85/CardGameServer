package com.Game;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    ArrayList<Card> deck;

    void setDeck(ArrayList<Card> deck) { this.deck = deck; }

    ArrayList<Card> getDeck() { return deck; }


    Deck(boolean shuffled){
        getCards();
        if(shuffled)
            shuffleDeck();
    }

    private void shuffleDeck(){

    }

    private void getCards(){

    }
}
