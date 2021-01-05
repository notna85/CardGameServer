package com.DeckFactory;

import com.AbstractFactory.Createable;

public class DeckFactory implements Createable {

    Deck getDeck(boolean shuffled){
        return new Deck(shuffled);
    }

    @Override
    public Createable create() {
        return null;
    }
}
