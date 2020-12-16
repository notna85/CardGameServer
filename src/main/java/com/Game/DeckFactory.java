package com.Game;

public class DeckFactory {

    Deck getDeck(boolean shuffled){
        return new Deck(shuffled);
    }
}
